@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.iterable

import js.iterable.internal.flowFromAsyncIterable
import js.symbol.Symbol
import kotlinx.coroutines.flow.Flow
import kotlin.js.JsAny
import kotlin.js.definedExternally

external interface AsyncIterable<out T : JsAny?> {
    operator fun get(
        key: Symbol.asyncIterator,
    ): () -> AsyncIterator<T> = definedExternally
}

inline fun <T : JsAny?> AsyncIterable<T>.asFlow(): Flow<T> =
    flowFromAsyncIterable(this[Symbol.asyncIterator]())
