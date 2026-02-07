package emotion.styled

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface StyledOptions {
    val label: String?
    val shouldForwardProp: ((propName: String) -> Boolean)?
    val target: String?
}
