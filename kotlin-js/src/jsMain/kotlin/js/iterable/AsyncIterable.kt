@file:Suppress(
    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
    "INLINE_EXTERNAL_DECLARATION",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "DECLARATION_CANT_BE_INLINED",
    "NOTHING_TO_INLINE",
)

package js.iterable

import js.symbol.Symbol
import seskar.js.JsNative

external interface AsyncIterable<out T> {
    @JsNative
    operator fun get(
        key: Symbol.asyncIterator,
    ): () -> AsyncIterator<T> = definedExternally

    inline operator fun iterator(): SuspendableIterator<T> =
        iteratorFromAsyncIterable(this)
}
