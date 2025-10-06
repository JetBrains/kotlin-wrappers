// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

package web.assembly

import js.array.ReadonlyArray
import kotlin.js.JsAny
import kotlin.js.JsQualifier
import kotlin.js.definedExternally

/**
 * The **`WebAssembly.Exception`** object represents a runtime exception thrown from WebAssembly to JavaScript, or thrown from JavaScript to a WebAssembly exception handler.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/Exception)
 */
open external class Exception(
    exceptionTag: Tag,
    payload: ReadonlyArray<*>,
    options: ExceptionOptions = definedExternally,
) {
    /**
     * The read-only **`stack`** property of an object instance of type `WebAssembly.Exception` _may_ contain a stack trace.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/Exception/stack)
     */
    val stack: String?

    /**
     * The **`getArg()`** prototype method of the `Exception` object can be used to get the value of a specified item in the exception's data arguments.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/Exception/getArg)
     */
    fun getArg(index: Int): JsAny

    /**
     * The **`is()`** prototype method of the `Exception` object can be used to test if the `Exception` matches a given tag.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/Exception/is)
     */
    fun `is`(exceptionTag: Tag): Boolean
}
