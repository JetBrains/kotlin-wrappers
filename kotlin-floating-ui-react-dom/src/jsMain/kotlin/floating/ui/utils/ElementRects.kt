package floating.ui.utils

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface ElementRects {
    val reference: Rect
    val floating: Rect
}
