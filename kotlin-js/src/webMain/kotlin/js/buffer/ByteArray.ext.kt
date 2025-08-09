package js.buffer

import js.typedarrays.toInt8Array

fun ByteArray.toArrayBuffer(): ArrayBuffer =
    toInt8Array().buffer
