package js.typedarrays

import js.reflect.unsafeCast

inline fun UByteArray.asUint8Array(): Uint8Array<*> =
    unsafeCast(this)
