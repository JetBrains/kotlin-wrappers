package web.blob

import js.typedarrays.Int8Array
import js.typedarrays.internal.castOrConvertToByteArray

suspend fun Blob.byteArray(): ByteArray {
    return Int8Array(arrayBuffer())
        .castOrConvertToByteArray()
}
