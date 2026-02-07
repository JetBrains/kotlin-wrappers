package web.fs

import kotlinx.js.JsPlainObject
import web.experimental.ExperimentalWebApi

@JsPlainObject
@ExperimentalWebApi
external interface DirectoryPickerOptions {
    var id: String?
    var startIn: StartInDirectory?
    var mode: FileSystemPermissionMode?
}
