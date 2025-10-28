package js.core

import kotlin.js.JsString

expect object JsPrimitives {
    inline fun JsString.toKotlinString(): String

    inline fun JsFloat.toKotlinFloat(): Float
    inline fun Float.toJsFloat(): JsFloat

    inline fun JsDouble.toKotlinDouble(): Double
    inline fun Double.toJsDouble(): JsDouble

    inline fun JsByte.toKotlinByte(): Byte
    inline fun Byte.toJsByte(): JsByte

    inline fun JsUByte.toKotlinUByte(): UByte
    inline fun UByte.toJsUByte(): JsUByte

    inline fun JsShort.toKotlinShort(): Short
    inline fun Short.toJsShort(): JsShort

    inline fun JsInt.toKotlinInt(): Int
    inline fun Int.toJsInt(): JsInt
}
