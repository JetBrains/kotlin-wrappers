package web.fs

import js.reflect.unsafeCast
import js.union.JsUnion
import web.experimental.ExperimentalWebApi

@JsUnion
@ExperimentalWebApi
sealed /* union */
external interface FileSystemPermissionMode

@ExperimentalWebApi
inline val FileSystemPermissionMode.Companion.read: FileSystemPermissionMode
    get() = unsafeCast("read")

@ExperimentalWebApi
inline val FileSystemPermissionMode.Companion.readwrite: FileSystemPermissionMode
    get() = unsafeCast("readwrite")
