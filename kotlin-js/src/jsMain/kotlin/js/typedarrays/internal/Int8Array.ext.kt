package js.typedarrays.internal

import js.internal.InternalApi
import js.typedarrays.Int8Array
import js.typedarrays.asByteArray

@InternalApi
actual inline fun Int8Array<*>.castOrConvertToByteArray(): ByteArray =
    asByteArray()
