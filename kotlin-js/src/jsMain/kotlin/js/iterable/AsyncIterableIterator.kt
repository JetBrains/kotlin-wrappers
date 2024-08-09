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

sealed external interface AsyncIterableIterator<out T> :
    AsyncIterable<T>,
    AsyncIterator<T> {
    @JsNative
    override operator fun get(
        key: Symbol.asyncIterator,
    ): () -> AsyncIterableIterator<T> = definedExternally

    override inline fun iterator(): SuspendableIterator<T> =
        iteratorFromAsyncIterator(this)
}
