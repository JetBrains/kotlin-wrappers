// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

package web.assembly

import kotlin.js.JsAny
import kotlin.js.JsQualifier
import kotlin.js.definedExternally

/**
 * The **`WebAssembly.Table`** object is a JavaScript wrapper object — an array-like structure representing a WebAssembly table, which stores homogeneous references.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/Table)
 */
open external class Table(
    descriptor: TableDescriptor,
    value: JsAny? = definedExternally,
) {
    /**
     * The read-only **`length`** prototype property of the `WebAssembly.Table` object returns the length of the table, i.e., the number of elements in the table.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/Table/length)
     */
    val length: Int /* AddressValue */

    /**
     * The **`get()`** prototype method of the `WebAssembly.Table()` object retrieves the element stored at a given index.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/Table/get)
     */
    fun get(index: Int /* AddressValue */): JsAny

    /**
     * The **`grow()`** prototype method of the `WebAssembly.Table` object increases the size of the `Table` instance by a specified number of elements, filled with the provided value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/Table/grow)
     */
    fun grow(
        delta: Int, /* AddressValue */
        value: JsAny? = definedExternally,
    ): Int /* AddressValue */

    /**
     * The **`set()`** prototype method of the `WebAssembly.Table` object mutates a reference stored at a given index to a different value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/Table/set)
     */
    fun set(
        index: Int, /* AddressValue */
        value: JsAny? = definedExternally,
    )
}
