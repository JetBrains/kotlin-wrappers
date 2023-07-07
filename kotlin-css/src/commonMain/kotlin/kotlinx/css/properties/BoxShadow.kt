package kotlinx.css.properties

import kotlinx.css.Color
import kotlinx.css.LinearDimension
import kotlinx.css.StyleList
import kotlinx.css.px

open class BoxShadow(
    private val color: Color = Color.currentColor,
    private val offsetX: LinearDimension = 0.px,
    private val offsetY: LinearDimension = 0.px,
    private val blurRadius: LinearDimension = 0.px,
    private val spreadRadius: LinearDimension = 0.px,
) {
    override fun toString() = "$offsetX $offsetY $blurRadius $spreadRadius $color"
}

class BoxShadowInset(
    private val color: Color = Color.currentColor,
    private val offsetX: LinearDimension = 0.px,
    private val offsetY: LinearDimension = 0.px,
    private val blurRadius: LinearDimension = 0.px,
    private val spreadRadius: LinearDimension = 0.px,
) : BoxShadow(color, offsetX, offsetY, blurRadius, spreadRadius) {
    override fun toString() = "inset $offsetX $offsetY $blurRadius $spreadRadius $color"
}

class BoxShadows : StyleList<BoxShadow>(", ") {
    companion object {
        val none = BoxShadows()
    }
}
