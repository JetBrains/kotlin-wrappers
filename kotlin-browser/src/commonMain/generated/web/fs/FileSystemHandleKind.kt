// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.fs

import seskar.js.JsValue

sealed external interface FileSystemHandleKind {
    companion object {
        @JsValue("directory")
        val directory: directory

        @JsValue("file")
        val file: file
    }

    sealed interface directory : FileSystemHandleKind
    sealed interface file : FileSystemHandleKind
}
