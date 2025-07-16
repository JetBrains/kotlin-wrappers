@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.symbol

import kotlin.js.definedExternally

external interface ToStringSymbolHolder {
    operator fun get(
        key: Symbol.toStringTag,
    ): ToString = definedExternally
}
