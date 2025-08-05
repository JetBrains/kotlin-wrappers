package js.typedarrays

import js.buffer.ArrayBuffer
import js.reflect.unsafeCast

inline fun UByteArray.asUint8Array(): Uint8Array<*> =
    unsafeCast(this)

actual inline fun UByteArray.toUint8Array(): Uint8Array<ArrayBuffer> =
    Uint8Array(asUint8Array())
