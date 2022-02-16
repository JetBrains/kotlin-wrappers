package kotlinx.css

private const val ZERO = "0"

open class LinearDimension(override val value: String) : CssValue(value) {
    companion object {
        val none = LinearDimension("none")
        val auto = LinearDimension("auto")
        val initial = LinearDimension("initial")
        val inherit = LinearDimension("inherit")
        val available = LinearDimension("available") // old name
        val fillAvailable = LinearDimension("fill-available") // new name
        val borderBox = LinearDimension("border-box")
        val contentBox = LinearDimension("content-box")
        val maxContent = LinearDimension("max-content")
        val minContent = LinearDimension("min-content")
        val fitContent = LinearDimension("fit-content")
    }

    private val valueCalcSafe: String
        get() = if (value == ZERO) "0px" else value

    operator fun unaryMinus() = LinearDimension(
        when {
            value.startsWith('-') -> value.substring(1)
            value.startsWith("calc") -> "calc(0px - $value)"
            value == ZERO -> value
            else -> "-$value"
        }
    )

    operator fun plus(other: LinearDimension) = LinearDimension("calc($valueCalcSafe + ${other.valueCalcSafe})")
    operator fun minus(other: LinearDimension) = LinearDimension("calc($valueCalcSafe - ${other.valueCalcSafe})")
    operator fun times(times: Number) = LinearDimension("calc($valueCalcSafe * $times)")
    operator fun div(times: Number) = LinearDimension("calc($valueCalcSafe / $times)")

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as LinearDimension

        return value == other.value
    }

    override fun hashCode(): Int {
        return value.hashCode()
    }
}

class NumericLinearDimension(val number: Number, val unit: String) :
    LinearDimension(if (number == 0) ZERO else number.toString() + unit)

val Number.ch: LinearDimension get() = NumericLinearDimension(this, "ch")       // Width of "0" glyph
val Number.cm: LinearDimension get() = NumericLinearDimension(this, "cm")       // Centimeter
val Number.em: LinearDimension get() = NumericLinearDimension(this, "em")
val Number.ex: LinearDimension get() = NumericLinearDimension(this, "ex")
val Number.fr: LinearDimension get() = NumericLinearDimension(this, "fr")       // Fraction
val Number.mm: LinearDimension get() = NumericLinearDimension(this, "mm")       // Millimeter
val Number.pc: LinearDimension get() = NumericLinearDimension(this, "pc")       // Pica
val Number.pct: LinearDimension get() = NumericLinearDimension(this, "%")
val Number.pt: LinearDimension get() = NumericLinearDimension(this, "pt")       // Point
val Number.px: LinearDimension get() = NumericLinearDimension(this, "px")       // Pixel
val Number.rem: LinearDimension get() = NumericLinearDimension(this, "rem")     // Root em
val Number.vmin: LinearDimension get() = NumericLinearDimension(this, "vmin")   // 1/100th of the smallest side
val Number.vmax: LinearDimension get() = NumericLinearDimension(this, "vmax")   // 1/100th of the largest side
val Number.vh: LinearDimension get() = NumericLinearDimension(this, "vh")       // 1/100th of the viewport height
val Number.vw: LinearDimension get() = NumericLinearDimension(this, "vw")       // 1/100th of the viewport width
val Number.`in`: LinearDimension get() = NumericLinearDimension(this, "in")     // Inch
