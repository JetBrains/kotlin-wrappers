package js.core

expect object JsPrimitives {
    inline fun JsFloat.toFloat(): Float
    inline fun Float.toJsFloat(): JsFloat

    inline fun JsDouble.toDouble(): Double
    inline fun Double.toJsDouble(): JsDouble

    inline fun JsByte.toByte(): Byte
    inline fun Byte.toJsByte(): JsByte

    inline fun JsUByte.toUByte(): UByte
    inline fun UByte.toJsUByte(): JsUByte

    inline fun JsShort.toShort(): Short
    inline fun Short.toJsShort(): JsShort

    inline fun JsInt.toInt(): Int
    inline fun Int.toJsInt(): JsInt
}
