package js.typedarrays

import js.buffer.ArrayBuffer

expect fun ByteArray.toInt8Array(): Int8Array<ArrayBuffer>

expect fun ByteArray.toUint8Array(): Uint8Array<ArrayBuffer>
