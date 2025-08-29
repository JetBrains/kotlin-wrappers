package web.http

import js.buffer.internal.convertToByteArray

suspend fun Body.byteArray(): ByteArray =
    convertToByteArray(arrayBuffer())
