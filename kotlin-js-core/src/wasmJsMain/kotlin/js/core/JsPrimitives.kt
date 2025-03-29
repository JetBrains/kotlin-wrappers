package js.core

import kotlin.js.toBoolean as ktToBoolean
import kotlin.js.toJsBoolean as ktToJsBoolean
import kotlin.js.toJsString as ktToJsString
import kotlin.js.toDouble as ktToDouble
import kotlin.js.toInt as ktToInt
import kotlin.js.toJsNumber as ktToJsNumber

actual object JsPrimitives {
    actual fun JsBoolean.toBoolean(): Boolean = this.ktToBoolean()
    actual fun Boolean.toJsBoolean(): JsBoolean = this.ktToJsBoolean()

    actual fun String.toJsString(): JsString = this.ktToJsString()

    actual fun JsFloat.toFloat(): Float = this.ktToDouble().toFloat()
    actual fun Float.toJsFloat(): JsFloat = this.toDouble().ktToJsNumber()

    actual fun JsDouble.toDouble(): Double = this.ktToDouble()
    actual fun Double.toJsDouble(): JsDouble = this.ktToJsNumber()

    actual fun JsByte.toByte(): Byte = this.ktToInt().toByte()
    actual fun Byte.toJsByte(): JsByte = this.toInt().ktToJsNumber()

    actual fun JsShort.toShort(): Short = this.ktToInt().toShort()
    actual fun Short.toJsShort(): JsShort = this.toInt().ktToJsNumber()

    actual fun JsInt.toInt(): Int = this.ktToInt()
    actual fun Int.toJsInt(): JsInt = this.ktToJsNumber()
}
