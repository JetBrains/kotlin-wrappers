package js.typedarrays

import js.buffer.ArrayBuffer
import js.reflect.unsafeCast

@PublishedApi
internal inline fun UByteArray.asInt8Array(): Int8Array<*> =
    unsafeCast(this)

actual inline fun UByteArray.toInt8Array(): Int8Array<ArrayBuffer> =
    Int8Array(asInt8Array())

actual inline fun UByteArray.toUint8Array(): Uint8Array<ArrayBuffer> =
    asByteArray().toUint8Array()
