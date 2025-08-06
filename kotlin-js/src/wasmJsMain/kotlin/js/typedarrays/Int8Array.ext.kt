package js.typedarrays

import js.core.JsPrimitives.toByte

actual fun Int8Array<*>.asByteArray(): ByteArray =
    toByteArray()

actual fun Int8Array<*>.toByteArray(): ByteArray =
    ByteArray(size = length) { index ->
        get(index).toByte()
    }
