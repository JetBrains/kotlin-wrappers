package web.http

import js.buffer.internal.convertToByteArray
import web.blob.Blob
import web.blob.arrayBuffer

suspend fun Blob.byteArray(): ByteArray =
    convertToByteArray(arrayBuffer())
