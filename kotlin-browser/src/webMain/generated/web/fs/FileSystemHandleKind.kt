// Automatically generated - do not modify!

package web.fs

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface FileSystemHandleKind {
    sealed interface directory : FileSystemHandleKind
    sealed interface file : FileSystemHandleKind
}

inline val FileSystemHandleKind.Companion.directory: FileSystemHandleKind.directory
    get() = unsafeCast("directory")

inline val FileSystemHandleKind.Companion.file: FileSystemHandleKind.file
    get() = unsafeCast("file")
