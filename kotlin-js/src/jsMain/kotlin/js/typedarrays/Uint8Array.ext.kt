package js.typedarrays

inline fun Uint8Array<*>.toByteArray(): ByteArray =
    Int8Array(buffer, byteOffset, length).asByteArray()

inline fun Uint8Array<*>.toUByteArray(): UByteArray =
    toByteArray().asUByteArray()
