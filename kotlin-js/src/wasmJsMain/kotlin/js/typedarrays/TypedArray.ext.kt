package js.typedarrays

actual fun <A : TypedArray<*, *, *, *>> A.toByteArray(): ByteArray =
    toInt8Array().toByteArray()

actual fun <A : TypedArray<*, *, *, *>> A.toUByteArray(): UByteArray =
    toUint8Array().toUByteArray()
