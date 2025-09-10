package web.fs

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import js.objects.ReadonlyRecord
import web.experimental.ExperimentalWebApi
import kotlin.js.JsString

@JsPlainObject
@ExperimentalWebApi
external interface FilePickerAcceptType {
    var description: String?
    var accept: ReadonlyRecord<JsString, ReadonlyArray<JsString>>?
}
