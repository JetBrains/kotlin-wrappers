package js.typedarrays

import js.buffer.ArrayBuffer

inline fun Int8Array<*>.toInt8Array(): Int8Array<ArrayBuffer> =
    Int8Array(this)

expect fun Int8Array<*>.toByteArray(): ByteArray
