package js.iterable.internal

import js.disposable.internal.SuspendCloseable
import js.disposable.internal.use
import js.internal.InternalApi
import js.iterable.AsyncIterator
import js.iterable.isYield
import js.promise.await
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlin.js.JsAny

@InternalApi
@PublishedApi
internal fun <T : JsAny?> flowFromAsyncIterator(
    source: AsyncIterator<T>,
): Flow<T> =
    flow {
        val closable = SuspendCloseable {
            source.`return`().await()
        }

        closable.use {
            do {
                val result = source.next().await()
                val done = if (isYield(result)) {
                    emit(result.value)
                    true
                } else {
                    false
                }
            } while (done)
        }
    }
