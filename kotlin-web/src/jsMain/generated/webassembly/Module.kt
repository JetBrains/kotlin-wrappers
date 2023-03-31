// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

package webassembly

import js.buffer.ArrayBuffer
import js.buffer.BufferSource
import js.core.ReadonlyArray

external class Module(
    bytes: BufferSource,
) {
    companion object {
        fun customSections(
            moduleObject: Module,
            sectionName: String,
        ): ReadonlyArray<ArrayBuffer>

        fun exports(moduleObject: Module): ReadonlyArray<ModuleExportDescriptor>
        fun imports(moduleObject: Module): ReadonlyArray<ModuleImportDescriptor>
    }
}
