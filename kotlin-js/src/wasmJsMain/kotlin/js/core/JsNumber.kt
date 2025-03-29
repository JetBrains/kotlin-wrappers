package js.core

import kotlin.js.toDouble as ktToDouble
import kotlin.js.toInt as ktToInt
import kotlin.js.toJsNumber as ktToJsNumber

actual fun JsNumber.toDouble(): Double {
    return this.unsafeCast<kotlin.js.JsNumber>().ktToDouble()
}

actual fun JsNumber.toFloat(): Float {
    return this.unsafeCast<kotlin.js.JsNumber>().ktToDouble().toFloat()
}

actual fun JsNumber.toLong(): Long {
    return this.unsafeCast<kotlin.js.JsNumber>().ktToDouble().toLong()
}

actual fun JsNumber.toInt(): Int {
    return this.unsafeCast<kotlin.js.JsNumber>().ktToInt()
}

actual fun JsNumber.toByte(): Byte {
    return this.unsafeCast<kotlin.js.JsNumber>().ktToInt().toByte()
}

actual fun JsNumber.toShort(): Short {
    return this.unsafeCast<kotlin.js.JsNumber>().ktToInt().toShort()
}

actual fun Double.toJsNumber(): JsNumber {
    return this.ktToJsNumber().unsafeCast()
}

actual fun Float.toJsNumber(): JsNumber {
    return this.toDouble().ktToJsNumber().unsafeCast()
}

actual fun Long.toJsNumber(): JsNumber {
    return this.toDouble().ktToJsNumber().unsafeCast()
}

actual fun Int.toJsNumber(): JsNumber {
    return this.ktToJsNumber().unsafeCast()
}

actual fun Byte.toJsNumber(): JsNumber {
    return this.toInt().ktToJsNumber().unsafeCast()
}

actual fun Short.toJsNumber(): JsNumber {
    return this.toInt().ktToJsNumber().unsafeCast()
}
