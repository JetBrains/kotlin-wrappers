// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

package webassembly

/** [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/JavaScript_interface/Table) */
external class Table(
    descriptor: TableDescriptor,
    value: Any? = definedExternally,
) {
    /** [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/JavaScript_interface/Table/length) */
    val length: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/JavaScript_interface/Table/get) */
    operator fun get(index: Int): Any

    /** [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/JavaScript_interface/Table/grow) */
    fun grow(
        delta: Number,
        value: Any? = definedExternally,
    ): Number

    /** [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/JavaScript_interface/Table/set) */
    fun set(
        index: Int,
        value: Any? = definedExternally,
    )
}
