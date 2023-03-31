// Automatically generated - do not modify!

package webassembly

sealed external interface Table {
    val length: Int
    operator fun get(index: Int): Any
    fun grow(
        delta: Number,
        value: Any? = definedExternally,
    ): Number

    fun set(
        index: Int,
        value: Any? = definedExternally,
    )
}
