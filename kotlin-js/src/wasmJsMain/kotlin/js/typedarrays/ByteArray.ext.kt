package js.typedarrays

import js.buffer.ArrayBuffer
import js.core.JsPrimitives.toJsByte

actual fun ByteArray.toInt8Array(): Int8Array<ArrayBuffer> =
    Int8Array<ArrayBuffer>(length = size)
        .fill { this[it].toJsByte() }

actual fun ByteArray.toUint8Array(): Uint8Array<ArrayBuffer> =
    toUByteArray().toUint8Array()
