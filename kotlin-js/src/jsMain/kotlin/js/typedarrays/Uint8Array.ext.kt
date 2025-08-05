package js.typedarrays

import js.reflect.unsafeCast

inline fun Uint8Array<*>.asUByteArray(): UByteArray =
    unsafeCast(this)
