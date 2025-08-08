package js.buffer.internal

import js.buffer.ArrayBufferLike
import js.internal.InternalApi
import js.typedarrays.Int8Array
import js.typedarrays.internal.castOrConvertToByteArray

@InternalApi
fun convertToByteArray(
    buffer: ArrayBufferLike,
): ByteArray =
    Int8Array(buffer)
        .castOrConvertToByteArray()
