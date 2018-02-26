package css

const val UNIT = 8
private const val ZERO_CONST = "0"

class LinearDimension(val value: String) {
    companion object {
        val auto = LinearDimension("auto")
        val initial = LinearDimension("initial")
    }

    private val valueCalcSafe: String
        get() = if (value == ZERO_CONST) "0px" else value

    override fun toString() = value

    operator fun unaryMinus() = LinearDimension(when {
        value.startsWith('-') -> value.substring(1)
        value.startsWith("calc") -> "calc(0px - $value)"
        value == ZERO_CONST -> value
        else -> "-$value"
    })

    operator fun plus(other: LinearDimension) = LinearDimension("calc($valueCalcSafe + ${other.valueCalcSafe})")
    operator fun minus(other: LinearDimension) = LinearDimension("calc($valueCalcSafe - ${other.valueCalcSafe})")
    operator fun times(times: Number) = LinearDimension("calc($valueCalcSafe * $times)")
    operator fun div(times: Number) = LinearDimension("calc($valueCalcSafe / $times)")
}

private fun value(number: Number, unit: String): String {
    return if (number == 0)
        ZERO_CONST
    else
        number.toString() + unit
}

val Number.em: LinearDimension get() = LinearDimension(value(this, "em"))
val Number.pct: LinearDimension get() = LinearDimension(value(this, "%"))
val Number.px: LinearDimension get() = LinearDimension(value(this, "px"))
val Number.vw: LinearDimension get() = LinearDimension(value(this, "vw"))
val Number.vh: LinearDimension get() = LinearDimension(value(this, "vh"))

val Int.unit get() = (this * UNIT).px
val Double.unit get() = (this * UNIT).px
