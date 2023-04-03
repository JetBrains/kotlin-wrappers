// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

package webassembly

external class Table(
    descriptor: TableDescriptor,
    value: Any? = definedExternally,
) {
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
