package emotion.utils

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface SerializedStyles {
    val name: String
    val styles: String
    val map: String?
    val next: SerializedStyles?
}
