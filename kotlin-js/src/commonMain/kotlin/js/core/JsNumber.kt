@file:Suppress(
    "WRONG_JS_INTEROP_TYPE",
)

package js.core

import kotlin.js.definedExternally
import kotlin.js.JsName

@JsName("Number")
external class JsNumber {
    internal constructor(value: Int)
    internal constructor(value: Double)
    internal constructor(value: String)

    fun toExponential(fractionDigits: Int = definedExternally): String

    companion object {
        val MAX_SAFE_INTEGER: Double
        val MIN_SAFE_INTEGER: Double

        fun isFinite(number: Any?): Boolean
        fun isInteger(number: Any?): Boolean
        fun isNaN(number: Any?): Boolean
        fun isSafeInteger(number: Any?): Boolean
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
