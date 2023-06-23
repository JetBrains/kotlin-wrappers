// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

package webassembly

import js.buffer.ArrayBuffer
import js.buffer.BufferSource
import js.core.ReadonlyArray

/** [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Module) */
external class Module(
    bytes: BufferSource,
) {
    companion object {
        /** [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Module/customSections) */
        fun customSections(
            moduleObject: Module,
            sectionName: String,
        ): ReadonlyArray<ArrayBuffer>

        /** [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Module/exports) */
        fun exports(moduleObject: Module): ReadonlyArray<ModuleExportDescriptor>

        /** [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Module/imports) */
        fun imports(moduleObject: Module): ReadonlyArray<ModuleImportDescriptor>
    }
}
