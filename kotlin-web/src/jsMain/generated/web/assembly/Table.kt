// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

package web.assembly

import js.import.JsQualifier

/**
 * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/JavaScript_interface/Table)
 */
open external class Table(
    descriptor: TableDescriptor,
    value: Any? = definedExternally,
) {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/JavaScript_interface/Table/length)
     */
    val length: UInt

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/JavaScript_interface/Table/get)
     */
    operator fun get(index: UInt): Any

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/JavaScript_interface/Table/grow)
     */
    fun grow(
        delta: UInt,
        value: Any? = definedExternally,
    ): UInt

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/JavaScript_interface/Table/set)
     */
    fun set(
        index: UInt,
        value: Any? = definedExternally,
    )
}
