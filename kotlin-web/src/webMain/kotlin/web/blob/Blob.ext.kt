package web.blob

import js.buffer.internal.convertToByteArray

suspend fun Blob.byteArray(): ByteArray =
    convertToByteArray(arrayBuffer())
