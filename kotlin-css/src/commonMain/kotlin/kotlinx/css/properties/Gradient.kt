package kotlinx.css.properties

import kotlinx.css.Color
import kotlinx.css.Image
import kotlinx.css.LinearDimension
import kotlinx.css.RelativePosition

fun linearGradient(repeat: Boolean = false, init: LinearGradientBuilder.() -> Unit): Image {
    return LinearGradientBuilder().apply(init).build(null, repeat)
}

fun linearGradient(angle: Angle, repeat: Boolean = false, init: LinearGradientBuilder.() -> Unit): Image {
    return LinearGradientBuilder().apply(init).build(angle.value, repeat)
}

fun linearGradient(sideOrCorner: GradientSideOrCorner, repeat: Boolean = false, init: LinearGradientBuilder.() -> Unit): Image {
    return LinearGradientBuilder().apply(init).build(sideOrCorner.value, repeat)
}

fun radialGradient(repeat: Boolean = false, init: RadialGradientBuilder.() -> Unit): Image {
    return RadialGradientBuilder().apply(init).build(repeat)
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

    fun build(start: String?, repeat: Boolean): Image {
        return Image(
            buildString {
                if (repeat) {
                    append("repeating-linear-gradient(")
                } else {
                    append("linear-gradient(")
                }
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

sealed class RadialGradientShape {
    class Circle(val length: LinearDimension?) : RadialGradientShape()
    class Shape() : RadialGradientShape()
}

enum class RadialGradientExtent(val value: String) {
    closestCorner("closest-corner"),
    closestSide("closest-side"),
    farthestCorner("farthest-corner"),
    farthestSide("farthest-side"),
}

class RadialGradientBuilder {
    private var shape: String? = null
    private var at: RelativePosition? = null
    private val stops = mutableListOf<ColorStop>()

    fun circle() {
        shape = "circle"
    }

    fun circle(radius: LinearDimension) {
        shape = "circle ${radius.value}"
    }

    fun circle(extent: RadialGradientExtent) {
        shape = "circle ${extent.value}"
    }

    fun ellipse() {
        shape = "ellipse"
    }

    fun ellipse(xAxis: LinearDimension, yAxis: LinearDimension) {
        shape = "ellipse ${xAxis.value} ${yAxis.value}"
    }

    fun ellipse(extent: RadialGradientExtent) {
        shape = "ellipse ${extent.value}"
    }

    fun at(position: RelativePosition) {
        at = position
    }

    fun colorStop(color: Color) = stops.add(ColorStop(color, start = null, mid = null))
    fun colorStop(color: Color, start: LinearDimension) = stops.add(ColorStop(color, start, mid = null))

    fun build(repeat: Boolean): Image {
        return Image(
            buildString {
                if (repeat) {
                    append("repeating-radial-gradient(")
                } else {
                    append("radial-gradient(")
                }
                when {
                    shape != null && at != null -> append(shape).append(" at ").append(at)
                    shape != null -> append(shape)
                    at != null -> append("at ").append(at)
                }
                stops.forEachIndexed { index, stop ->
                    if (index > 0 || shape != null || at != null) {
                        append(", ")
                    }
                    appendColorStop(stop)
                }
                append(")")
            }
        )
    }
}
