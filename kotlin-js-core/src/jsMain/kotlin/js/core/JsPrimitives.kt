package js.core

actual object JsPrimitives {
    actual inline fun JsString.toKotlinString(): String = this

    actual inline fun JsFloat.toKotlinFloat(): Float = this
    actual inline fun Float.toJsFloat(): JsFloat = this

    actual inline fun JsDouble.toKotlinDouble(): Double = this
    actual inline fun Double.toJsDouble(): JsDouble = this

    actual inline fun JsByte.toKotlinByte(): Byte = this
    actual inline fun Byte.toJsByte(): JsByte = this

    actual inline fun JsUByte.toKotlinUByte(): UByte = toUByte()
    actual inline fun UByte.toJsUByte(): JsUByte = toShort()

    actual inline fun JsShort.toKotlinShort(): Short = this
    actual inline fun Short.toJsShort(): JsShort = this

    actual inline fun JsInt.toKotlinInt(): Int = this
    actual inline fun Int.toJsInt(): JsInt = this
}
