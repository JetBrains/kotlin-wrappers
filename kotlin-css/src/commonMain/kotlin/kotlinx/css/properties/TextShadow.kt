package kotlinx.css.properties

import kotlinx.css.*

open class TextShadow(
    color: Color = Color.currentColor,
    offsetX: LinearDimension = 0.px,
    offsetY: LinearDimension = 0.px,
    blurRadius: LinearDimension = 0.px,
    spreadRadius: LinearDimension = 0.px,
) : CssValue("$offsetX $offsetY $blurRadius $spreadRadius $color")

class TextShadows : StyleList<TextShadow>(", ") {
    companion object {
        val none = TextShadows()
    }
}
