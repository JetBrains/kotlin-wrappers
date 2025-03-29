package js.core

import kotlin.js.toBoolean as toKotlinBoolean
import kotlin.js.toDouble as toKotlinDouble
import kotlin.js.toInt as toKotlinInt
import kotlin.js.toJsBoolean as ktToJsBoolean
import kotlin.js.toJsString as ktToJsString

actual object JsPrimitives {
    actual fun JsBoolean.toBoolean(): Boolean =
        toKotlinBoolean()

    actual fun Boolean.toJsBoolean(): JsBoolean =
        ktToJsBoolean()

    actual fun String.toJsString(): JsString =
        ktToJsString()

    actual fun JsFloat.toFloat(): Float =
        toKotlinDouble().toFloat()

    actual fun Float.toJsFloat(): JsFloat =
        toDouble().toJsNumber()

    actual fun JsDouble.toDouble(): Double =
        toKotlinDouble()

    actual fun Double.toJsDouble(): JsDouble =
        toJsNumber()

    actual fun JsByte.toByte(): Byte =
        toKotlinInt().toByte()

    actual fun Byte.toJsByte(): JsByte =
        toInt().toJsNumber()

    actual fun JsShort.toShort(): Short =
        toKotlinInt().toShort()

    actual fun Short.toJsShort(): JsShort =
        toInt().toJsNumber()

    actual fun JsInt.toInt(): Int =
        toKotlinInt()

    actual fun Int.toJsInt(): JsInt =
        toJsNumber()
}
