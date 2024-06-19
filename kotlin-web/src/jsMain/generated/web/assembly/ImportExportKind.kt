// Automatically generated - do not modify!

package web.assembly

import seskar.js.JsValue

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
