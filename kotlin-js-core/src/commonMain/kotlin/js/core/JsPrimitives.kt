package js.core

expect object JsPrimitives {
    fun JsBoolean.toBoolean(): Boolean
    fun Boolean.toJsBoolean(): JsBoolean

    fun String.toJsString(): JsString

    fun JsFloat.toFloat(): Float
    fun Float.toJsFloat(): JsFloat

    fun JsDouble.toDouble(): Double
    fun Double.toJsDouble(): JsDouble

    fun JsByte.toByte(): Byte
    fun Byte.toJsByte(): JsByte

    fun JsShort.toShort(): Short
    fun Short.toJsShort(): JsShort

    fun JsInt.toInt(): Int
    fun Int.toJsInt(): JsInt
}
