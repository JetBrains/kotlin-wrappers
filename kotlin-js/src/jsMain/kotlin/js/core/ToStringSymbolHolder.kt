@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.core

import seskar.js.JsNative

external interface ToStringSymbolHolder {
    @JsNative
    operator fun get(
        key: Symbol.toStringTag,
    ): ToString = definedExternally
}
