@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.iterable

import js.core.Symbol
import seskar.js.JsNative

sealed external interface AsyncIteratorSymbolHolder<out V : Function<AsyncIterator<*>>> {
    @JsNative
    operator fun get(
        key: Symbol.asyncIterator,
    ): V = definedExternally
}
