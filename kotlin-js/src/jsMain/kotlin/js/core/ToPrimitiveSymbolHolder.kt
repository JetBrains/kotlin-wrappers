@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.core

import seskar.js.JsNative

external interface ToPrimitiveSymbolHolder {
    @JsNative
    operator fun get(
        key: Symbol.toPrimitive,
    ): ToPrimitive = definedExternally
}
