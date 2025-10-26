package web.editcontext

import js.objects.JsPlainObject
import web.events.EventInit
import web.experimental.ExperimentalWebApi

@JsPlainObject
@ExperimentalWebApi
external interface TextUpdateEventInit :
    EventInit {
    var updateRangeStart: Int
    var updateRangeEnd: Int
    var text: String
    var selectionStart: Int
    var selectionEnd: Int
    var compositionStart: Int
    var compositionEnd: Int
}
