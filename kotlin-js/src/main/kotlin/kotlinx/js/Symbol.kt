@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package kotlinx.js

sealed external interface Symbol {
    val description: String?

    companion object {
        val asyncIterator: Symbol
        val hasInstance: Symbol
        val isConcatSpreadable: Symbol
        val iterator: Symbol
        val match: Symbol
        val matchAll: Symbol
        val replace: Symbol
        val search: Symbol
        val species: Symbol
        val split: Symbol
        val toPrimitive: Symbol
        val toStringTag: Symbol
        val unscopables: Symbol

        fun `for`(key: String): Symbol

        fun keyFor(symbol: Symbol): String?
    }
}

external fun Symbol(
    description: String = definedExternally,
): Symbol
