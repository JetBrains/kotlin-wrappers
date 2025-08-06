package js.typedarrays

import js.reflect.unsafeCast

inline fun Uint8Array<*>.asUByteArray(): UByteArray =
    unsafeCast(this)

actual inline fun Uint8Array<*>.toUByteArray(): UByteArray =
    Uint8Array.from(this).asUByteArray()
