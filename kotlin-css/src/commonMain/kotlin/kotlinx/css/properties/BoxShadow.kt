package kotlinx.css.properties

import kotlinx.css.*

class BoxShadow(
    private var inset: Boolean = false,
    private var offsetX: LinearDimension = 0.px,
    private var offsetY: LinearDimension = 0.px,
    private var blurRadius: LinearDimension = 0.px,
    private var spreadRadius: LinearDimension = 0.px,
    var color: Color = Color.currentColor,
) {
    override fun toString() = buildString {
        if (inset) append("inset ")
        append("$offsetX $offsetY $blurRadius $spreadRadius $color")
    }
}

class BoxShadows : StyleList<BoxShadow>(", ") {
    companion object {
        val none = BoxShadows()
    }
}

fun StyledElement.boxShadow(
    color: Color = Color.currentColor,
    offsetX: LinearDimension = 0.px,
    offsetY: LinearDimension = 0.px,
    blurRadius: LinearDimension = 0.px,
    spreadRadius: LinearDimension = 0.px,
) {
    boxShadow += BoxShadow(false, offsetX, offsetY, blurRadius, spreadRadius, color)
}

fun StyledElement.boxShadowInset(
    color: Color = Color.currentColor,
    offsetX: LinearDimension = 0.px,
    offsetY: LinearDimension = 0.px,
    blurRadius: LinearDimension = 0.px,
    spreadRadius: LinearDimension = 0.px,
) {
    boxShadow += BoxShadow(true, offsetX, offsetY, blurRadius, spreadRadius, color)
}
