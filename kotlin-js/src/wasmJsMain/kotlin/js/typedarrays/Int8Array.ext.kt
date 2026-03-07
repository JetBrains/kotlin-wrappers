package js.typedarrays

import js.core.JsNumbers.toKotlinByte

actual fun Int8Array<*>.toByteArray(): ByteArray =
    ByteArray(size = length) { index ->
        get(index).toKotlinByte()
    }
