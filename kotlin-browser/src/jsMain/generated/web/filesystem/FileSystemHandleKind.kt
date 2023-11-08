// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.filesystem

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface FileSystemHandleKind {
    companion object {
        @JsValue("directory")
        val directory: FileSystemHandleKind

        @JsValue("file")
        val file: FileSystemHandleKind
    }
}
