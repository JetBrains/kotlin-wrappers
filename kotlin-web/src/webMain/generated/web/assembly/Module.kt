// Automatically generated - do not modify!

package web.assembly

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.BufferSource
import kotlin.js.JsQualifier
import kotlin.js.definedExternally

/**
 * A **`WebAssembly.Module`** object contains stateless WebAssembly code that has already been compiled by the browser — this can be efficiently shared with Workers, and instantiated multiple times.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/Module)
 */
@JsQualifier("WebAssembly")
open external class Module(
    bytes: BufferSource,
    options: WebAssemblyCompileOptions = definedExternally,
) {
    companion object {
        /**
         * The WebAssembly.**`Module.customSections()`** static method returns a copy of the contents of all custom sections in the given module with the given string name.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/Module/customSections_static)
         */
        fun customSections(
            moduleObject: Module,
            sectionName: String,
        ): ReadonlyArray<ArrayBuffer>

        /**
         * The WebAssembly.**`Module.exports()`** static method returns an array containing descriptions of all the declared exports of the given Module.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/Module/exports_static)
         */
        fun exports(moduleObject: Module): ReadonlyArray<ModuleExportDescriptor>

        /**
         * The WebAssembly.**`Module.imports()`** static method returns an array containing descriptions of all the declared imports of the given Module.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/Module/imports_static)
         */
        fun imports(moduleObject: Module): ReadonlyArray<ModuleImportDescriptor>
    }
}
