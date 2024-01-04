@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.reflect

import js.symbol.Symbol
import seskar.js.JsNative

external interface HasInstanceSymbolHolder {
    @JsNative
    operator fun get(
        key: Symbol.hasInstance,
    ): HasInstance = definedExternally
}
