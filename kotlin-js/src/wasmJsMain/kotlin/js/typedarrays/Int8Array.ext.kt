package js.typedarrays

import js.numbers.JsNumbers.toKotlinByte

actual fun Int8Array<*>.toByteArray(): ByteArray =
    ByteArray(size = length) { index ->
        get(index).toKotlinByte()
    }
