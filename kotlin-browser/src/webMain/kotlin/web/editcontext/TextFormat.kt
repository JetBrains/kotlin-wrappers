package web.editcontext

import web.experimental.ExperimentalWebApi

@ExperimentalWebApi
open external class TextFormat(
    options: TextFormatInit,
) {
    val rangeStart: Int
    val rangeEnd: Int
    val underlineStyle: UnderlineStyle
    val underlineThickness: UnderlineThickness
}
