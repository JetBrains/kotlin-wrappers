package js.typedarrays.internal

import js.internal.InternalApi
import js.typedarrays.Uint8Array
import js.typedarrays.asUByteArray

@InternalApi
actual inline fun Uint8Array<*>.castOrConvertToUByteArray(): UByteArray =
    asUByteArray()
