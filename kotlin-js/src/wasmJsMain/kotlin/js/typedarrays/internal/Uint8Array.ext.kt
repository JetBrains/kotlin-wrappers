package js.typedarrays.internal

import js.internal.InternalApi
import js.typedarrays.Uint8Array
import js.typedarrays.toUByteArray

@InternalApi
actual inline fun Uint8Array<*>.castOrConvertToUByteArray(): UByteArray =
    toUByteArray()
