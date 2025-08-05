package js.core

actual object JsPrimitives {
    actual inline fun JsBoolean.toBoolean(): Boolean = this
    actual inline fun Boolean.toJsBoolean(): JsBoolean = this

    actual inline fun String.toJsString(): JsString = this

    actual inline fun JsFloat.toFloat(): Float = this
    actual inline fun Float.toJsFloat(): JsFloat = this

    actual inline fun JsDouble.toDouble(): Double = this
    actual inline fun Double.toJsDouble(): JsDouble = this

    actual inline fun JsByte.toByte(): Byte = this
    actual inline fun Byte.toJsByte(): JsByte = this

    actual inline fun JsUByte.toUByte(): Short = this
    actual inline fun Short.toJsUByte(): JsUByte = this

    actual inline fun JsShort.toShort(): Short = this
    actual inline fun Short.toJsShort(): JsShort = this

    actual inline fun JsInt.toInt(): Int = this
    actual inline fun Int.toJsInt(): JsInt = this
}
