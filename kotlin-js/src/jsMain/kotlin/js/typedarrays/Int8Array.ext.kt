package js.typedarrays

import js.reflect.unsafeCast

inline fun Int8Array<*>.asByteArray(): ByteArray =
    unsafeCast(this)
