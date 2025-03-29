package js.core

actual fun JsNumber.toDouble(): Double {
    return this.unsafeCast<Number>().toDouble()
}

actual fun JsNumber.toFloat(): Float {
    return this.unsafeCast<Number>().toFloat()
}

actual fun JsNumber.toLong(): Long {
    return this.unsafeCast<Number>().toLong()
}

actual fun JsNumber.toInt(): Int {
    return this.unsafeCast<Number>().toInt()
}

actual fun JsNumber.toByte(): Byte {
    return this.unsafeCast<Number>().toByte()
}

actual fun JsNumber.toShort(): Short {
    return this.unsafeCast<Number>().toShort()
}

actual fun Double.toJsNumber(): JsNumber {
    return this.unsafeCast<JsNumber>()
}

actual fun Float.toJsNumber(): JsNumber {
    return this.unsafeCast<JsNumber>()
}

actual fun Long.toJsNumber(): JsNumber {
    return this.toDouble().unsafeCast<JsNumber>()
}

actual fun Int.toJsNumber(): JsNumber {
    return this.unsafeCast<JsNumber>()
}

actual fun Byte.toJsNumber(): JsNumber {
    return this.unsafeCast<JsNumber>()
}

actual fun Short.toJsNumber(): JsNumber {
    return this.unsafeCast<JsNumber>()
}
