// Automatically generated - do not modify!

package web.fs

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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
