package js.core

import kotlin.js.toDouble as toKotlinDouble
import kotlin.js.toInt as toKotlinInt

actual object JsPrimitives {
    actual inline fun JsString.toKotlinString(): String =
        toString()

    actual inline fun JsFloat.toFloat(): Float =
        toKotlinDouble().toFloat()

    actual inline fun Float.toJsFloat(): JsFloat =
        toDouble().toJsNumber()

    actual inline fun JsDouble.toDouble(): Double =
        toKotlinDouble()

    actual inline fun Double.toJsDouble(): JsDouble =
        toJsNumber()

    actual inline fun JsByte.toByte(): Byte =
        toKotlinInt().toByte()

    actual inline fun Byte.toJsByte(): JsByte =
        toInt().toJsNumber()

    actual inline fun JsUByte.toUByte(): UByte =
        toKotlinInt().toUByte()

    actual inline fun UByte.toJsUByte(): JsUByte =
        toInt().toJsNumber()

    actual inline fun JsShort.toShort(): Short =
        toKotlinInt().toShort()

    actual inline fun Short.toJsShort(): JsShort =
        toInt().toJsNumber()

    actual inline fun JsInt.toInt(): Int =
        toKotlinInt()

    actual inline fun Int.toJsInt(): JsInt =
        toJsNumber()
}
