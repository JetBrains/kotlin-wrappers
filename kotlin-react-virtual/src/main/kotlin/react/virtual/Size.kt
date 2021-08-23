package react.virtual

import kotlinext.js.jsObject

external interface Size {
    var width: Int
    var height: Int
}

fun Size(
    width: Int,
    height: Int,
): Size =
    jsObject {
        this.width = width
        this.height = height
    }
