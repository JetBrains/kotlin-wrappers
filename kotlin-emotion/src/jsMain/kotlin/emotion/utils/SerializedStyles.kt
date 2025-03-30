package emotion.utils

import js.objects.JsPlainObject

@JsPlainObject
external interface SerializedStyles {
    val name: String
    val styles: String
    val map: String?
    val next: SerializedStyles?
}
