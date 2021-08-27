package kotlinx.css.properties

import kotlinx.css.Color
import kotlinx.css.Image
import kotlinx.css.LinearDimension

fun linearGradient(init: LinearGradientBuilder.() -> Unit): Image {
    return LinearGradientBuilder().apply(init).build(null)
}

fun linearGradient(angle: Angle, init: LinearGradientBuilder.() -> Unit): Image {
    return LinearGradientBuilder().apply(init).build(angle.value)
}

fun linearGradient(sideOrCorner: GradientSideOrCorner, init: LinearGradientBuilder.() -> Unit): Image {
    return LinearGradientBuilder().apply(init).build(sideOrCorner.value)
}

enum class GradientSideOrCorner(val value: String) {
    ToLeft("to left"),
    ToLeftTop("to left top"),
    ToLeftBottom("to left bottom"),
    ToRight("to right"),
    ToRightTop("to right top"),
    ToRightBottom("to right bottom"),
    ToTop("to top"),
    ToBottom("to bottom"),
}

class LinearGradientBuilder {
    private val stops = mutableListOf<ColorStop>()

    fun colorStop(color: Color) = stops.add(ColorStop(color, start = null, mid = null))
    fun colorStop(color: Color, start: LinearDimension) = stops.add(ColorStop(color, start, mid = null))
    fun colorStop(color: Color, start: LinearDimension, mid: LinearDimension) = stops.add(ColorStop(color, start, mid))

    fun build(start: String?): Image {
        return Image(
            buildString {
                append("linear-gradient(")
                if (start != null) {
                    append(start).append(", ")
                }
                stops.forEachIndexed { index, colorStop ->
                    if (index > 0) {
                        append(", ")
                    }
                    appendColorStop(colorStop)
                }
                append(")")
            }
        )
    }
}

class ColorStop(val color: Color, val start: LinearDimension?, val mid: LinearDimension?) {
    val value: String = buildString {
        append(color.value)
        if (start != null) {
            append(" ").append(start.value)
        }
        if (mid != null) {
            append(" ").append(mid.value)
        }
    }
}

fun Appendable.appendColorStop(colorStop: ColorStop) {
    append(colorStop.color.value)
    colorStop.start?.let { start ->
        append(" ").append(start.value)
    }
    colorStop.mid?.let { mid ->
        append(" ").append(mid.value)
    }
}
