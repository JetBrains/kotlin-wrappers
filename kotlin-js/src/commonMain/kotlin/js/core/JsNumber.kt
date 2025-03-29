package js.core

import kotlin.js.JsName
import kotlin.js.definedExternally

@JsName("Number")
external class JsNumber : JsAny {
    internal constructor(value: Int)
    internal constructor(value: Double)
    internal constructor(value: String)

    fun toExponential(fractionDigits: Int = definedExternally): String

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

expect fun JsNumber.toDouble(): Double
expect fun JsNumber.toFloat(): Float
expect fun JsNumber.toLong(): Long
expect fun JsNumber.toInt(): Int
expect fun JsNumber.toByte(): Byte
expect fun JsNumber.toShort(): Short

expect fun Double.toJsNumber(): JsNumber
expect fun Float.toJsNumber(): JsNumber
expect fun Long.toJsNumber(): JsNumber
expect fun Int.toJsNumber(): JsNumber
expect fun Byte.toJsNumber(): JsNumber
expect fun Short.toJsNumber(): JsNumber
