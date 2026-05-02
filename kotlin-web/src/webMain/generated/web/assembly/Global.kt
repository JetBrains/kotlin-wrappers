// Automatically generated - do not modify!

package web.assembly

import kotlin.js.JsAny
import kotlin.js.JsQualifier
import kotlin.js.definedExternally

/**
 * A **`WebAssembly.Global`** object represents a global variable instance, accessible from both JavaScript and importable/exportable across one or more WebAssembly.Module instances. This allows dynamic linking of multiple modules.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/Global)
 */
@JsQualifier("WebAssembly")
open external class Global<T : JsAny?>(
    descriptor: GlobalDescriptor<T>,
    v: T = definedExternally,
) {
    /**
     * The **`value`** property of the WebAssembly.Global object prototype returns the value contained inside the global variable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/Global/value)
     */
    var value: T

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/Global/valueOf)
     */
    fun valueOf(): T
}
