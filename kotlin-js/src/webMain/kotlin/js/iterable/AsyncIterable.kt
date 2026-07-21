package js.iterable

import js.disposable.internal.SuspendCloseable
import js.disposable.internal.awaitFirst
import js.disposable.internal.use
import js.hacks.safeCall
import js.internal.InternalApi
import js.objects.PropertyKey
import js.promise.await
import js.symbol.Symbol
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

/**
 * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols#the_async_iterator_and_async_iterable_protocols)
 */
external interface AsyncIterable<out T : JsAny?> {

    @SubclassOptInRequired(InternalApi::class)
    interface Mixin<out T : JsAny?>
}

fun <T : JsAny?> AsyncIterable<T>.`[@@asyncIterator]`(): AsyncIterator<T> =
    safeCall(Symbol.asyncIterator)

fun <T : JsAny?> AsyncIterable<T>.asFlow(): Flow<T> =
    flow {
        val iterator = this@asFlow.`[@@asyncIterator]`()

        val closeable = SuspendCloseable {
            iterator.awaitFirst(
                PropertyKey("return"),
                Symbol.asyncDispose,
            )
        }

        closeable.use {
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
