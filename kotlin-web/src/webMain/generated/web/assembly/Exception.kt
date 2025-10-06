@file:JsQualifier("WebAssembly")

package web.assembly

import js.array.ReadonlyArray
import kotlin.js.JsAny
import kotlin.js.JsQualifier
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/Exception)
 */
open external class Exception(
    tag: Tag,
    payload: ReadonlyArray<JsAny?>,
    options: ExceptionOptions = definedExternally,
) {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/Exception/stack)
     */
    val stack: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/Exception/is)
     */
    fun `is`(tag: Tag): Boolean
}
