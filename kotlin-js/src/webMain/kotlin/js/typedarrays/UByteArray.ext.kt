package js.typedarrays

import js.buffer.ArrayBuffer

inline fun UByteArray.toInt8Array(): Int8Array<ArrayBuffer> =
    asByteArray().toInt8Array()

inline fun UByteArray.toUint8Array(): Uint8Array<ArrayBuffer> =
    asByteArray().toUint8Array()
