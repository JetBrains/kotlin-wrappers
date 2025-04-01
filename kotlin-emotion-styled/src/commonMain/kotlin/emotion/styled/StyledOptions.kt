package emotion.styled

import js.objects.JsPlainObject

@JsPlainObject
external interface StyledOptions {
    val label: String?
    val shouldForwardProp: ((propName: String) -> Boolean)?
    val target: String?
}
