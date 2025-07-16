@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.symbol

import kotlin.js.definedExternally

external interface ToPrimitiveSymbolHolder {
    operator fun get(
        key: Symbol.toPrimitive,
    ): ToPrimitive = definedExternally
}
