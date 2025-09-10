@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.iterable

import js.iterable.internal.iteratorFromJsIterable
import js.symbol.Symbol
import kotlin.js.JsAny
import kotlin.js.definedExternally

external interface JsIterable<out T : JsAny?> {
    operator fun get(
        key: Symbol.iterator,
    ): () -> JsIterator<T> = definedExternally
}

inline operator fun <T : JsAny?> JsIterable<T>.iterator(): Iterator<T> =
    iteratorFromJsIterable(this)
