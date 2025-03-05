@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.reflect

import js.symbol.Symbol
import seskar.js.JsNativeGetter
import kotlin.js.definedExternally

external interface HasInstanceSymbolHolder {
    @JsNativeGetter
    operator fun get(
        key: Symbol.hasInstance,
    ): HasInstance = definedExternally
}
