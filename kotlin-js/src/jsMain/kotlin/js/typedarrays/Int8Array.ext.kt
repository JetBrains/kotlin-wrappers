package js.typedarrays

import js.reflect.unsafeCast

actual inline fun Int8Array<*>.asByteArray(): ByteArray =
    unsafeCast(this)

actual inline fun Int8Array<*>.toByteArray(): ByteArray =
    Int8Array.from(this).asByteArray()
