@file:Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")

package kotlinext.js

external interface Symbol {
    val description: String?

    companion object {
        fun `for`(key: String): Symbol

        fun keyFor(symbol: Symbol): String?
    }
}

external fun Symbol(
    description: String = definedExternally,
): Symbol
