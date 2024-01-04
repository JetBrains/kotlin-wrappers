@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.iterable

import js.symbol.Symbol
import seskar.js.JsNative

sealed external interface IteratorSymbolHolder<out V : Function<JsIterator<*>>> {
    @JsNative
    operator fun get(
        key: Symbol.iterator,
    ): V = definedExternally
}
