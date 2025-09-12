@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.iterable

import js.disposable.internal.SuspendCloseable
import js.disposable.internal.use
import js.promise.await
import js.symbol.Symbol
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlin.js.JsAny
import kotlin.js.definedExternally

external interface AsyncIterable<out T : JsAny?> {
    operator fun get(
        key: Symbol.asyncIterator,
    ): () -> AsyncIterator<T> = definedExternally
}

fun <T : JsAny?> AsyncIterable<T>.asFlow(): Flow<T> =
    flow {
        val iterator = this@asFlow[Symbol.asyncIterator]()

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
