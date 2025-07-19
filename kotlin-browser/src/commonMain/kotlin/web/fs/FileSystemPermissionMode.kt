@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.fs

import js.reflect.unsafeCast
import web.experimental.ExperimentalWebApi

@ExperimentalWebApi
sealed external interface FileSystemPermissionMode {
    companion object
}

@ExperimentalWebApi
inline val FileSystemPermissionMode.Companion.read: FileSystemPermissionMode
    get() = unsafeCast("read")

@ExperimentalWebApi
inline val FileSystemPermissionMode.Companion.readwrite: FileSystemPermissionMode
    get() = unsafeCast("readwrite")
