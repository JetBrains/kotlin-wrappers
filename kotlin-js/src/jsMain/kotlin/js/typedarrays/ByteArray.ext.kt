package js.typedarrays

import js.buffer.ArrayBuffer
import js.reflect.unsafeCast

inline fun ByteArray.asInt8Array(): Int8Array<ArrayBuffer> =
    unsafeCast(this)
