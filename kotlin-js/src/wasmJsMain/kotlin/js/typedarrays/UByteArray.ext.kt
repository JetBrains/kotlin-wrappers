package js.typedarrays

import js.buffer.ArrayBuffer
import js.core.JsPrimitives.toJsUByte

actual fun UByteArray.toUint8Array(): Uint8Array<ArrayBuffer> =
    Uint8Array<ArrayBuffer>(length = size)
        .fill { this[it].toJsUByte() }
