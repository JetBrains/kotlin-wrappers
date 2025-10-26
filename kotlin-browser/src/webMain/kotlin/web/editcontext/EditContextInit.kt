package web.editcontext

import js.objects.JsPlainObject
import web.experimental.ExperimentalWebApi

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EditContext/EditContext#options)
 */
@JsPlainObject
@ExperimentalWebApi
external interface EditContextInit {
    var text: String
    var selectionStart: Int
    var selectionEnd: Int
}
