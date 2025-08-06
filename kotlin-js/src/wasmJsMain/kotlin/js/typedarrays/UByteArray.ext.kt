package js.typedarrays

import js.buffer.ArrayBuffer
import js.core.JsPrimitives.toJsUByte

actual fun UByteArray.toInt8Array(): Int8Array<ArrayBuffer> =
    toByteArray().toInt8Array()

actual fun UByteArray.toUint8Array(): Uint8Array<ArrayBuffer> =
    Uint8Array<ArrayBuffer>(length = size)
        .fill { this[it].toJsUByte() }
