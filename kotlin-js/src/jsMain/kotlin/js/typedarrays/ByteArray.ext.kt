@file:Suppress("NOTHING_TO_INLINE")

package js.typedarrays

inline fun ByteArray.asInt8Array(): Int8Array =
    unsafeCast<Int8Array>()

inline fun ByteArray.toUint8Array(): Uint8Array {
    val array = asInt8Array()
    return Uint8Array(
        buffer = array.buffer,
        byteOffset = array.byteOffset,
        length = array.length,
    )
}
