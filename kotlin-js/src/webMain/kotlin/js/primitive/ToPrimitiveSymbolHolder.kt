@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.primitive

import js.symbol.Symbol

external interface ToPrimitiveSymbolHolder {
    operator fun get(
        key: Symbol.toPrimitive,
    ): ToPrimitive = definedExternally
}
