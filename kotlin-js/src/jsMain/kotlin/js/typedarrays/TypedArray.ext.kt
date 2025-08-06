package js.typedarrays

import js.typedarrays.internal.castOrConvertToByteArray
import js.typedarrays.internal.castOrConvertToUByteArray

actual fun <A : TypedArray<*, *, *, *>> A.toByteArray(): ByteArray =
    toInt8Array().castOrConvertToByteArray()

actual fun <A : TypedArray<*, *, *, *>> A.toUByteArray(): UByteArray =
    toUint8Array().castOrConvertToUByteArray()
