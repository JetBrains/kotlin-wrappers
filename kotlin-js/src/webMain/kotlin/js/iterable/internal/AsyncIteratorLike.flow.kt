package js.iterable.internal

import js.core.Void
import js.internal.InternalApi
import js.iterable.AsyncIteratorLike
import js.iterable.isYield
import js.promise.Promise
import js.promise.await
import js.reflect.unsafeCast
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onCompletion
import kotlin.coroutines.cancellation.CancellationException
import kotlin.js.JsAny

@InternalApi
@PublishedApi
internal fun <T : JsAny?> flowFromAsyncIteratorLike(
    source: AsyncIteratorLike<T>,
): Flow<T> =
    flow {
        do {
            val result = source.next().await()
            val done = if (isYield(result)) {
                emit(result.value)
                true
            } else {
                false
            }
        } while (done)
    }.onCompletion { cause ->
        if (cause is CancellationException) {
            val dispose = unsafeCast<HasReturn>(source).`return`
            if (dispose != null) {
                dispose().await()
            }
        }
    }

private external interface HasReturn {
    val `return`: (() -> Promise<Void>)?
}
