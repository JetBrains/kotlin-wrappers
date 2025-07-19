package web.fs

import js.objects.JsPlainObject
import web.experimental.ExperimentalWebApi

@JsPlainObject
@ExperimentalWebApi
external interface DirectoryPickerOptions {
    var id: String?
    var startIn: StartInDirectory?
    var mode: FileSystemPermissionMode?
}
