package web.fs

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import web.experimental.ExperimentalWebApi

@JsPlainObject
@ExperimentalWebApi
external interface FilePickerOptions {
    var types: ReadonlyArray<FilePickerAcceptType>?
    var excludeAcceptAllOption: Boolean?
    var id: String?
    var startIn: StartInDirectory?
}
