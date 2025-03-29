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

    actual fun JsFloat.toFloat(): Float = this.unsafeCast<JsNumber>().ktToDouble().toFloat()
    actual fun Float.toJsFloat(): JsFloat = this.toDouble().ktToJsNumber().unsafeCast()

    actual fun JsDouble.toDouble(): Double = this.unsafeCast<JsNumber>().ktToDouble()
    actual fun Double.toJsDouble(): JsDouble = this.ktToJsNumber().unsafeCast()

    actual fun JsByte.toByte(): Byte = this.unsafeCast<JsNumber>().ktToInt().toByte()
    actual fun Byte.toJsByte(): JsByte = this.toInt().ktToJsNumber().unsafeCast()

    actual fun JsShort.toShort(): Short = this.unsafeCast<JsNumber>().ktToInt().toShort()
    actual fun Short.toJsShort(): JsShort = this.toInt().ktToJsNumber().unsafeCast()

    actual fun JsInt.toInt(): Int = this.unsafeCast<JsNumber>().ktToInt()
    actual fun Int.toJsInt(): JsInt = this.ktToJsNumber().unsafeCast()
}
