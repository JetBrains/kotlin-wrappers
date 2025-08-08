package js.typedarrays.internal

import js.internal.InternalApi
import js.typedarrays.Int8Array
import js.typedarrays.toByteArray

@InternalApi
actual inline fun Int8Array<*>.castOrConvertToByteArray(): ByteArray =
    toByteArray()
