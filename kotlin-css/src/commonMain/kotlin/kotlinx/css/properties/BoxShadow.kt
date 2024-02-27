package kotlinx.css.properties

import kotlinx.css.*

open class BoxShadow(
    color: Color = Color.currentColor,
    offsetX: LinearDimension = 0.px,
    offsetY: LinearDimension = 0.px,
    blurRadius: LinearDimension = 0.px,
    spreadRadius: LinearDimension = 0.px,
) : CssValue("$offsetX $offsetY $blurRadius $spreadRadius $color")

data class BoxShadowInset(
    val color: Color = Color.currentColor,
    val offsetX: LinearDimension = 0.px,
    val offsetY: LinearDimension = 0.px,
    val blurRadius: LinearDimension = 0.px,
    val spreadRadius: LinearDimension = 0.px,
) : BoxShadow(color, offsetX, offsetY, blurRadius, spreadRadius) {
    override fun toString() = value

    override val value = "inset $offsetX $offsetY $blurRadius $spreadRadius $color"
}

class BoxShadows : StyleList<BoxShadow>(", ") {
    companion object {
        val none = BoxShadows()
    }
}
