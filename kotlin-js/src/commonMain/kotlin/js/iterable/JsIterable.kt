@file:Suppress(
    "WRONG_JS_INTEROP_TYPE",
    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
    "INLINE_EXTERNAL_DECLARATION",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "DECLARATION_CANT_BE_INLINED",
)

package js.iterable

import js.core.JsAny
import js.iterable.internal.iteratorFromJsIterable
import js.symbol.Symbol
import kotlin.js.definedExternally as definedExternally_
import seskar.js.JsNativeGetter

external interface JsIterable<out T : JsAny?> {
    @JsNativeGetter
    operator fun get(
        key: Symbol.iterator,
    ): () -> JsIterator<T> = definedExternally_

    inline operator fun iterator(): Iterator<T> =
        iteratorFromJsIterable(this)
}
