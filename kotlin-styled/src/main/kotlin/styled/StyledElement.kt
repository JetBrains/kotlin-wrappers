package styled

import css.*

fun StyledElement.url(url: String): Image {
    val resolvedUrl = kotlinext.js.require("static/$url")
    return Image("url($resolvedUrl)")
}
