// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

package webassembly

/** [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Table) */
external class Table(
    descriptor: TableDescriptor,
    value: Any? = definedExternally,
) {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Table/length) */
    val length: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Table/get) */
    operator fun get(index: Int): Any

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Table/grow) */
    fun grow(
        delta: Number,
        value: Any? = definedExternally,
    ): Number

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Table/set) */
    fun set(
        index: Int,
        value: Any? = definedExternally,
    )
}
