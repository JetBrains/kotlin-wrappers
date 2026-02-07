package web.editcontext

import kotlinx.js.JsPlainObject
import web.events.EventInit
import web.experimental.ExperimentalWebApi

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextUpdateEventInit/TextUpdateEventInit#options)
 */
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
