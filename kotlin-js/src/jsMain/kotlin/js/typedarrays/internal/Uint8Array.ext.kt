package js.typedarrays.internal

import js.typedarrays.Uint8Array
import js.typedarrays.asUByteArray

actual inline fun Uint8Array<*>.castOrConvertToUByteArray(): UByteArray =
    asUByteArray()
