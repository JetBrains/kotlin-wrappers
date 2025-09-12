package js.iterable.internal

import js.disposable.internal.SuspendCloseable
import js.disposable.internal.use
import js.internal.InternalApi
import js.iterable.AsyncIterable
import js.iterable.isYield
import js.promise.await
import js.symbol.Symbol
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlin.js.JsAny

@InternalApi
@PublishedApi
internal fun <T : JsAny?> flowFromAsyncIterable(
    source: AsyncIterable<T>,
): Flow<T> =
    flow {
        val iterator = source[Symbol.asyncIterator]()

        val closable = SuspendCloseable {
            iterator.`return`().await()
        }

        closable.use {
            do {
                val result = iterator.next().await()
                val done = if (isYield(result)) {
                    emit(result.value)
                    true
                } else {
                    false
                }
            } while (done)
        }
    }
