package js.typedarrays

import js.buffer.ArrayBuffer
import js.reflect.unsafeCast

inline fun ByteArray.asInt8Array(): Int8Array<*> =
    unsafeCast(this)

actual inline fun ByteArray.toInt8Array(): Int8Array<ArrayBuffer> =
    Int8Array(asInt8Array())
