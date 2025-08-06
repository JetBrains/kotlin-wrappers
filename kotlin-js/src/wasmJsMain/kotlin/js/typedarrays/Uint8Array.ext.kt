package js.typedarrays

import js.core.JsPrimitives.toUByte

actual fun Uint8Array<*>.toUByteArray(): UByteArray =
    UByteArray(size = length) { index ->
        get(index).toUByte()
    }
