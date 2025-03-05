package js.core

import kotlin.js.definedExternally as definedExternally_
import kotlin.js.JsName

@JsName("Number")
external class JsNumber {
    internal constructor(value: Int)
    internal constructor(value: Double)
    internal constructor(value: String)

    fun toExponential(fractionDigits: Int = definedExternally_): String

    companion object {
        val MAX_SAFE_INTEGER: Double
        val MIN_SAFE_INTEGER: Double

        fun isFinite(number: JsAny?): Boolean
        fun isInteger(number: JsAny?): Boolean
        fun isNaN(number: JsAny?): Boolean
        fun isSafeInteger(number: JsAny?): Boolean
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
