package web.fs

import kotlinx.js.JsPlainObject
import web.experimental.ExperimentalWebApi

@JsPlainObject
@ExperimentalWebApi
external interface SaveFilePickerOptions :
    FilePickerOptions {
    var suggestedName: String?
}
