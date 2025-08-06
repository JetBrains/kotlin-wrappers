package js.typedarrays

import js.buffer.ArrayBuffer

expect fun UByteArray.toInt8Array(): Int8Array<ArrayBuffer>

expect fun UByteArray.toUint8Array(): Uint8Array<ArrayBuffer>
