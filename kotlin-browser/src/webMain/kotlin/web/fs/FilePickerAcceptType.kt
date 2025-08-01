package web.fs

import js.array.ReadonlyArray
import js.core.JsString
import js.objects.JsPlainObject
import js.objects.ReadonlyRecord
import web.experimental.ExperimentalWebApi

@JsPlainObject
@ExperimentalWebApi
external interface FilePickerAcceptType {
    var description: String?
    var accept: ReadonlyRecord<JsString, ReadonlyArray<JsString>>?
}
