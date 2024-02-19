package js.symbol

import seskar.js.JsPrimitive

@JsPrimitive
@JsExternalInheritorsOnly
open external class Symbol {
    val description: String?

    object asyncDispose : Symbol
    object asyncIterator : Symbol
    object dispose : Symbol
    object hasInstance : Symbol
    object isConcatSpreadable : Symbol
    object iterator : Symbol
    object match : Symbol
    object matchAll : Symbol
    object replace : Symbol
    object search : Symbol
    object species : Symbol
    object split : Symbol
    object toPrimitive : Symbol
    object toStringTag : Symbol
    object unscopables : Symbol

    companion object {
        fun `for`(key: String): Symbol

        fun keyFor(symbol: Symbol): String?
    }
}

external fun Symbol(
    description: String = definedExternally,
): Symbol
