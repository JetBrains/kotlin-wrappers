package react.virtual

import kotlinext.js.jso

external interface Size {
    var width: Int
    var height: Int
}

fun Size(
    width: Int,
    height: Int,
): Size =
    jso {
        this.width = width
        this.height = height
    }
