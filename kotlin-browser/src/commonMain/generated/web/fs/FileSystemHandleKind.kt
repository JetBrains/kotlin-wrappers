// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.fs

import js.reflect.unsafeCast

sealed external interface FileSystemHandleKind {
    sealed interface directory : FileSystemHandleKind
    sealed interface file : FileSystemHandleKind

    companion object
}

inline val FileSystemHandleKind.Companion.directory: FileSystemHandleKind.directory
    get() = unsafeCast("directory")

inline val FileSystemHandleKind.Companion.file: FileSystemHandleKind.file
    get() = unsafeCast("file")
