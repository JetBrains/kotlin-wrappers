package js.iterable

import js.disposable.internal.SuspendCloseable
import js.disposable.internal.awaitFirst
import js.disposable.internal.use
import js.hacks.safeFactory
import js.objects.PropertyKey
import js.promise.await
import js.symbol.Symbol
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlin.js.JsAny

external interface AsyncIterable<out T : JsAny?>

operator fun <T : JsAny?> AsyncIterable<T>.get(
    key: Symbol.asyncIterator,
): () -> AsyncIterator<T> =
    safeFactory(Symbol.asyncIterator)

fun <T : JsAny?> AsyncIterable<T>.asFlow(): Flow<T> =
    flow {
        val iterator = this@asFlow[Symbol.asyncIterator]()

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
