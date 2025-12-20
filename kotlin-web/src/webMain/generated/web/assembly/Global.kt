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
    var value: T
    fun valueOf(): T
}
