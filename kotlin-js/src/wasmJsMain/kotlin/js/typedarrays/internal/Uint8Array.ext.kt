package js.typedarrays.internal

import js.typedarrays.Uint8Array
import js.typedarrays.toUByteArray

actual inline fun Uint8Array<*>.castOrConvertToUByteArray(): UByteArray =
    toUByteArray()
