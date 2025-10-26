package web.editcontext

import web.experimental.ExperimentalWebApi

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextFormat)
 */
@ExperimentalWebApi
open external class TextFormat(
    options: TextFormatInit,
) {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextFormat/rangeStart)
     */
    val rangeStart: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextFormat/rangeEnd)
     */
    val rangeEnd: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextFormat/underlineStyle)
     */
    val underlineStyle: UnderlineStyle

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextFormat/underlineThickness)
     */
    val underlineThickness: UnderlineThickness
}
