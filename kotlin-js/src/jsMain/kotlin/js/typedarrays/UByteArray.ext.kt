@file:Suppress("NOTHING_TO_INLINE")

package js.typedarrays

import js.buffer.ArrayBuffer

inline fun UByteArray.asInt8Array(): Int8Array<ArrayBuffer> =
    asByteArray().asInt8Array()

inline fun UByteArray.toUint8Array(): Uint8Array<ArrayBuffer> =
    asByteArray().toUint8Array()
