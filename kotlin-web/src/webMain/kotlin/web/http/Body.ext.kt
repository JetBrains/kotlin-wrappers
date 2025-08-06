package web.http

import js.typedarrays.Int8Array
import js.typedarrays.internal.castOrConvertToByteArray
import web.blob.Blob
import web.blob.arrayBuffer

suspend fun Blob.byteArray(): ByteArray {
    return Int8Array(arrayBuffer())
        .castOrConvertToByteArray()
}
