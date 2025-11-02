// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

package web.assembly

import kotlin.js.JsQualifier
import kotlin.js.definedExternally

/**
 * A **`WebAssembly.Instance`** object is a stateful, executable instance of a WebAssembly.Module. Instance objects contain all the Exported WebAssembly functions that allow calling into WebAssembly code from JavaScript.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/Instance)
 */
open external class Instance(
    module: Module,
    importObject: Imports = definedExternally,
) {
    /**
     * The **`exports`** read-only property of the WebAssembly.Instance object prototype returns an object containing as its members all the functions exported from the WebAssembly module instance, to allow them to be accessed and used by JavaScript.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/Instance/exports)
     */
    val exports: Exports
}
