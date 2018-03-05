package css.properties

import css.*

class BoxShadow(
    private var inset: Boolean,
    private var offsetX: LinearDimension,
    private var offsetY: LinearDimension,
    private var blurRadius: LinearDimension,
    private var spreadRadius: LinearDimension,
    var color: Color
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
    color: Color,
    offsetX: LinearDimension = 0.px,
    offsetY: LinearDimension = 0.px,
    blurRadius: LinearDimension = 0.px,
    spreadRadius: LinearDimension = 0.px
) {
    boxShadow += BoxShadow(false, offsetX, offsetY, blurRadius, spreadRadius, color)
}

fun StyledElement.boxShadowInset(
    color: Color,
    offsetX: LinearDimension = 0.px,
    offsetY: LinearDimension = 0.px,
    blurRadius: LinearDimension = 0.px,
    spreadRadius: LinearDimension = 0.px
) {
    boxShadow += BoxShadow(true, offsetX, offsetY, blurRadius, spreadRadius, color)
}
