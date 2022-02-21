package kotlinx.js

@JsName("Number")
external class JsNumber {
    internal constructor(value: Int)
    internal constructor(value: Double)
    internal constructor(value: String)

    fun toExponential(fractionDigits: Int = definedExternally): String

    companion object {
        fun isFinite(number: Any?): Boolean
        fun isInteger(number: Any?): Boolean
        fun isNaN(number: Any?): Boolean
        fun isSafeInteger(number: Any?): Boolean
        val MAX_SAFE_INTEGER: Number
        val MIN_SAFE_INTEGER: Number
    }
}

fun Int.toExponential(): String =
    JsNumber(this).toExponential()

fun Int.toExponential(fractionDigits: Int): String =
    JsNumber(this).toExponential(fractionDigits)

fun Double.toExponential(): String =
    JsNumber(this).toExponential()

fun Double.toExponential(fractionDigits: Int): String =
    JsNumber(this).toExponential(fractionDigits)
