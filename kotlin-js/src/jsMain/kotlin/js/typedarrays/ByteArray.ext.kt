@file:Suppress("NOTHING_TO_INLINE")

package js.typedarrays

import js.buffer.ArrayBuffer
import js.reflect.unsafeCast

inline fun ByteArray.asInt8Array(): Int8Array<ArrayBuffer> =
    unsafeCast(this)

inline fun ByteArray.toUint8Array(): Uint8Array<ArrayBuffer> {
    val array = asInt8Array()
    return Uint8Array(
        buffer = array.buffer,
        byteOffset = array.byteOffset,
        length = array.length,
    )
}
