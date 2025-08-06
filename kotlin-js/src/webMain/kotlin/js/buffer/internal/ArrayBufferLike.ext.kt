package js.buffer.internal

import js.buffer.ArrayBufferLike
import js.typedarrays.Int8Array
import js.typedarrays.internal.castOrConvertToByteArray

fun convertToByteArray(
    buffer: ArrayBufferLike,
): ByteArray =
    Int8Array(buffer)
        .castOrConvertToByteArray()
