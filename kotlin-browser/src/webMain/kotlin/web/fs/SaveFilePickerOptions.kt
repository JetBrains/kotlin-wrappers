package web.fs

import js.objects.JsPlainObject
import web.experimental.ExperimentalWebApi

@JsPlainObject
@ExperimentalWebApi
external interface SaveFilePickerOptions :
    FilePickerOptions {
    var suggestedName: String?
}
