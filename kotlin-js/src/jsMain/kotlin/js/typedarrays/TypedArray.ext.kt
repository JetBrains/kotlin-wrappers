package js.typedarrays

actual fun <A : TypedArray<*, *, *, *>> A.toByteArray(): ByteArray =
    toInt8Array().asByteArray()

actual fun <A : TypedArray<*, *, *, *>> A.toUByteArray(): UByteArray =
    toUint8Array().castOrConvertToUByteArray()
