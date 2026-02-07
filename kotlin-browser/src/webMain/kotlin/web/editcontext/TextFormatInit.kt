package web.editcontext

import kotlinx.js.JsPlainObject
import web.experimental.ExperimentalWebApi

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextFormat/TextFormat#options)
 */
@JsPlainObject
@ExperimentalWebApi
external interface TextFormatInit {
    var rangeStart: Int
    var rangeEnd: Int
    var underlineStyle: UnderlineStyle
    var underlineThickness: UnderlineThickness
}
