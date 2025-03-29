package js.core

actual object JsPrimitives {
    actual fun JsBoolean.toBoolean(): Boolean = this
    actual fun Boolean.toJsBoolean(): JsBoolean = this

    actual fun String.toJsString(): JsString = this

    actual fun JsFloat.toFloat(): Float = this
    actual fun Float.toJsFloat(): JsFloat = this

    actual fun JsDouble.toDouble(): Double = this
    actual fun Double.toJsDouble(): JsDouble = this

    actual fun JsByte.toByte(): Byte = this
    actual fun Byte.toJsByte(): JsByte = this

    actual fun JsShort.toShort(): Short = this
    actual fun Short.toJsShort(): JsShort = this

    actual fun JsInt.toInt(): Int = this
    actual fun Int.toJsInt(): JsInt = this
}
