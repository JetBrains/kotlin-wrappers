@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package kotlinx.js

sealed external interface Symbol {
    val description: String?
        get() = definedExternally

    object asyncIterator : Symbol
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
