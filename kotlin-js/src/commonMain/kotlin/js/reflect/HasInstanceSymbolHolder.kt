@file:Suppress(
    "WRONG_JS_INTEROP_TYPE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.reflect

import js.symbol.Symbol
import kotlin.js.definedExternally
import seskar.js.JsNativeGetter

external interface HasInstanceSymbolHolder {
    @JsNativeGetter
    operator fun get(
        key: Symbol.hasInstance,
    ): HasInstance = definedExternally
}
