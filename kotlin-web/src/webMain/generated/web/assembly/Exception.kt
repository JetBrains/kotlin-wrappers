// Automatically generated - do not modify!

package web.assembly

import js.array.ReadonlyArray

/**
 * The **`WebAssembly.Exception`** object represents a runtime exception thrown in a Wasm module.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/Exception)
 */
@JsQualifier("WebAssembly")
open external class Exception(
    exceptionTag: Tag,
    payload: ReadonlyArray<*>,
    options: ExceptionOptions = definedExternally,
) {
    /**
     * The **`stack`** read-only property of the WebAssembly.Exception object may contain a stack trace.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/Exception/stack)
     */
    open val stack: String?

    /**
     * The **`getArg()`** method of the Exception object can be used to get the value of a specified item in the exception's data arguments.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/Exception/getArg)
     */
    open fun getArg(
        exceptionTag: Tag,
        index: Int,
    ): JsAny?

    /**
     * The **`is()`** method of the Exception object can be used to test if the Exception matches a given tag.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/Exception/is)
     */
    open fun `is`(exceptionTag: Tag): Boolean
}
