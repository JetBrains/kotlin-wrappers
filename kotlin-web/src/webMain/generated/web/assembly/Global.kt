// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

package web.assembly

import kotlin.js.JsAny
import kotlin.js.JsQualifier
import kotlin.js.definedExternally

/**
 * A **`WebAssembly.Global`** object represents a global variable instance, accessible from both JavaScript and importable/exportable across one or more `WebAssembly.Module` instances.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/Global)
 */
open external class Global<T : JsAny?>(
    descriptor: GlobalDescriptor<T>,
    v: T = definedExternally,
) {
    var value: T
    fun valueOf(): T
}
