package floating.ui.utils

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface SideObject :
    Padding {
    val top: Double
    val left: Double
    val right: Double
    val bottom: Double
}
