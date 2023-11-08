// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package webassembly

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface ImportExportKind {
    companion object {
        @JsValue("function")
        val function: ImportExportKind

        @JsValue("global")
        val global: ImportExportKind

        @JsValue("memory")
        val memory: ImportExportKind

        @JsValue("table")
        val table: ImportExportKind
    }
}
