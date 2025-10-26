package web.editcontext

import js.objects.JsPlainObject
import web.experimental.ExperimentalWebApi

@JsPlainObject
@ExperimentalWebApi
external interface TextFormatInit {
    var rangeStart: Int
    var rangeEnd: Int
    var underlineStyle: UnderlineStyle
    var underlineThickness: UnderlineThickness
}
