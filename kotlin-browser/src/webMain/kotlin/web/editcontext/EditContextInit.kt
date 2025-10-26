package web.editcontext

import js.objects.JsPlainObject
import web.experimental.ExperimentalWebApi

@JsPlainObject
@ExperimentalWebApi
external interface EditContextInit {
    var text: String
    var selectionStart: Int
    var selectionEnd: Int
}
