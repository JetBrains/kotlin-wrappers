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

val Number.ch: LinearDimension get() = NumericLinearDimension(this, "ch")           // Width of "0" glyph
val Number.cm: LinearDimension get() = NumericLinearDimension(this, "cm")           // Centimeter
val Number.dvb: LinearDimension get() = NumericLinearDimension(this, "dvb")         // https://www.w3.org/TR/css-values-4/#viewport-relative-lengths
val Number.dvh: LinearDimension get() = NumericLinearDimension(this, "dvh")         // https://www.w3.org/TR/css-values-4/#viewport-relative-lengths
val Number.dvi: LinearDimension get() = NumericLinearDimension(this, "dvi")         // https://www.w3.org/TR/css-values-4/#viewport-relative-lengths
val Number.dvmax: LinearDimension get() = NumericLinearDimension(this, "dvmax")     // https://www.w3.org/TR/css-values-4/#viewport-relative-lengths
val Number.dvmin: LinearDimension get() = NumericLinearDimension(this, "dvmin")     // https://www.w3.org/TR/css-values-4/#viewport-relative-lengths
val Number.dvw: LinearDimension get() = NumericLinearDimension(this, "dvw")         // https://www.w3.org/TR/css-values-4/#viewport-relative-lengths
val Number.em: LinearDimension get() = NumericLinearDimension(this, "em")           // Em
val Number.ex: LinearDimension get() = NumericLinearDimension(this, "ex")           // Ex
val Number.fr: LinearDimension get() = NumericLinearDimension(this, "fr")           // Fraction
val Number.lvb: LinearDimension get() = NumericLinearDimension(this, "lvb")         // https://www.w3.org/TR/css-values-4/#viewport-relative-lengths
val Number.lvh: LinearDimension get() = NumericLinearDimension(this, "lvh")         // https://www.w3.org/TR/css-values-4/#viewport-relative-lengths
val Number.lvi: LinearDimension get() = NumericLinearDimension(this, "lvi")         // https://www.w3.org/TR/css-values-4/#viewport-relative-lengths
val Number.lvmax: LinearDimension get() = NumericLinearDimension(this, "lvmax")     // https://www.w3.org/TR/css-values-4/#viewport-relative-lengths
val Number.lvmin: LinearDimension get() = NumericLinearDimension(this, "lvmin")     // https://www.w3.org/TR/css-values-4/#viewport-relative-lengths
val Number.lvw: LinearDimension get() = NumericLinearDimension(this, "lvw")         // https://www.w3.org/TR/css-values-4/#viewport-relative-lengths
val Number.mm: LinearDimension get() = NumericLinearDimension(this, "mm")           // Millimeter
val Number.pc: LinearDimension get() = NumericLinearDimension(this, "pc")           // Pica
val Number.pct: LinearDimension get() = NumericLinearDimension(this, "%")           // Percent
val Number.pt: LinearDimension get() = NumericLinearDimension(this, "pt")           // Point
val Number.px: LinearDimension get() = NumericLinearDimension(this, "px")           // Pixel
val Number.rem: LinearDimension get() = NumericLinearDimension(this, "rem")         // Root em
val Number.svb: LinearDimension get() = NumericLinearDimension(this, "svb")         // https://www.w3.org/TR/css-values-4/#viewport-relative-lengths
val Number.svh: LinearDimension get() = NumericLinearDimension(this, "svh")         // https://www.w3.org/TR/css-values-4/#viewport-relative-lengths
val Number.svi: LinearDimension get() = NumericLinearDimension(this, "svi")         // https://www.w3.org/TR/css-values-4/#viewport-relative-lengths
val Number.svmax: LinearDimension get() = NumericLinearDimension(this, "svmax")     // https://www.w3.org/TR/css-values-4/#viewport-relative-lengths
val Number.svmin: LinearDimension get() = NumericLinearDimension(this, "svmin")     // https://www.w3.org/TR/css-values-4/#viewport-relative-lengths
val Number.svw: LinearDimension get() = NumericLinearDimension(this, "svw")         // https://www.w3.org/TR/css-values-4/#viewport-relative-lengths
val Number.vb: LinearDimension get() = NumericLinearDimension(this, "vb")           // https://www.w3.org/TR/css-values-4/#viewport-relative-lengths
val Number.vh: LinearDimension get() = NumericLinearDimension(this, "vh")           // 1/100th of the viewport height
val Number.vi: LinearDimension get() = NumericLinearDimension(this, "vi")           // https://www.w3.org/TR/css-values-4/#viewport-relative-lengths
val Number.vmax: LinearDimension get() = NumericLinearDimension(this, "vmax")       // 1/100th of the largest side
val Number.vmin: LinearDimension get() = NumericLinearDimension(this, "vmin")       // 1/100th of the smallest side
val Number.vw: LinearDimension get() = NumericLinearDimension(this, "vw")           // 1/100th of the viewport width
val Number.`in`: LinearDimension get() = NumericLinearDimension(this, "in")         // Inch
