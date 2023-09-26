@file:Suppress("NOTHING_TO_INLINE")

package js.typedarrays

inline fun UByteArray.asInt8Array(): Int8Array =
    asByteArray().asInt8Array()

inline fun UByteArray.toUint8Array(): Uint8Array =
    asByteArray().toUint8Array()
