package js.typedarrays

import js.buffer.ArrayBuffer
import js.core.JsPrimitives.toJsByte

actual fun ByteArray.toInt8Array(): Int8Array<ArrayBuffer> =
    Int8Array<ArrayBuffer>(length = size)
        .fill { this[it].toJsByte() }
