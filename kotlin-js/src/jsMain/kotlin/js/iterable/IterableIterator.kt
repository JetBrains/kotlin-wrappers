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

@JsName("__HIDDEN_JS_CLASS__")
sealed external class IterableIterator<out T> :
    JsIterable<T>,
    JsIterator<T> {
    @JsNative
    override operator fun get(
        key: Symbol.iterator,
    ): () -> IterableIterator<T> = definedExternally

    override inline fun iterator(): Iterator<T> {
        val iterator: JsIterator<T> = this

        return iteratorFor(iterator)
    }
}
