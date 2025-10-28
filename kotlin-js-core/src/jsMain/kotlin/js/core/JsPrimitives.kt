package js.core

import kotlin.toUByte as toKotlinUByte

actual object JsPrimitives {
    actual inline fun JsString.toKotlinString(): String = this

    actual inline fun JsFloat.toFloat(): Float = this
    actual inline fun Float.toJsFloat(): JsFloat = this

    actual inline fun JsDouble.toDouble(): Double = this
    actual inline fun Double.toJsDouble(): JsDouble = this

    actual inline fun JsByte.toByte(): Byte = this
    actual inline fun Byte.toJsByte(): JsByte = this

    actual inline fun JsUByte.toUByte(): UByte = toKotlinUByte()
    actual inline fun UByte.toJsUByte(): JsUByte = toShort()

    actual inline fun JsShort.toShort(): Short = this
    actual inline fun Short.toJsShort(): JsShort = this

    actual inline fun JsInt.toInt(): Int = this
    actual inline fun Int.toJsInt(): JsInt = this
}
