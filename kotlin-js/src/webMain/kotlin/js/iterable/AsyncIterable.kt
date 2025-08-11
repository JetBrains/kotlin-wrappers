@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.iterable

import js.core.JsAny
import js.iterable.internal.iteratorFromAsyncIterable
import js.symbol.Symbol
import kotlin.js.definedExternally

external interface AsyncIterable<out T : JsAny?> {
    operator fun get(
        key: Symbol.asyncIterator,
    ): () -> AsyncIterator<T> = definedExternally
}

inline operator fun <T : JsAny?> AsyncIterable<T>.iterator(): SuspendIterator<T> =
    iteratorFromAsyncIterable(this)
