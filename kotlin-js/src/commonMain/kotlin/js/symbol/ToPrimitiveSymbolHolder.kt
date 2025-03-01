@file:Suppress(
    "WRONG_JS_INTEROP_TYPE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.symbol

import kotlin.js.definedExternally
import seskar.js.JsNativeGetter

external interface ToPrimitiveSymbolHolder {
    @JsNativeGetter
    operator fun get(
        key: Symbol.toPrimitive,
    ): ToPrimitive = definedExternally
}
