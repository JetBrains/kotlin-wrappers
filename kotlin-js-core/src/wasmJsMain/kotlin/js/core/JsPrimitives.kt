package js.core

actual object JsPrimitives {
    actual inline fun JsString.toKotlinString(): String =
        toString()

    actual inline fun JsFloat.toKotlinFloat(): Float =
        toKotlinDouble().toFloat()

    actual inline fun Float.toJsFloat(): JsFloat =
        toDouble().toJsNumber()

    actual inline fun JsDouble.toKotlinDouble(): Double =
        toDouble()

    actual inline fun Double.toJsDouble(): JsDouble =
        toJsNumber()

    actual inline fun JsByte.toKotlinByte(): Byte =
        toKotlinInt().toByte()

    actual inline fun Byte.toJsByte(): JsByte =
        toInt().toJsNumber()

    actual inline fun JsUByte.toKotlinUByte(): UByte =
        toKotlinInt().toUByte()

    actual inline fun UByte.toJsUByte(): JsUByte =
        toInt().toJsNumber()

    actual inline fun JsShort.toKotlinShort(): Short =
        toKotlinInt().toShort()

    actual inline fun Short.toJsShort(): JsShort =
        toInt().toJsNumber()

    actual inline fun JsInt.toKotlinInt(): Int =
        toInt()

    actual inline fun Int.toJsInt(): JsInt =
        toJsNumber()
}
