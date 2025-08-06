package js.typedarrays

import js.core.JsPrimitives.toUByte

actual inline fun Uint8Array<*>.asUByteArray(): UByteArray =
    toUByteArray()

actual fun Uint8Array<*>.toUByteArray(): UByteArray =
    UByteArray(size = length) { index ->
        get(index).toUByte()
    }
