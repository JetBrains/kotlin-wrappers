// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

package web.assembly

import js.core.JsAny
import js.import.JsQualifier
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/Table)
 */
open external class Table(
    descriptor: TableDescriptor,
    value: JsAny? = definedExternally,
) {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/Table/length)
     */
    val length: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/Table/get)
     */
    operator fun get(index: Int): JsAny

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/Table/grow)
     */
    fun grow(
        delta: Int,
        value: JsAny? = definedExternally,
    ): Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/Table/set)
     */
    fun set(
        index: Int,
        value: JsAny? = definedExternally,
    )
}
