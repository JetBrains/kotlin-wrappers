package js.typedarrays.internal

import js.typedarrays.Int8Array
import js.typedarrays.asByteArray

actual inline fun Int8Array<*>.castOrConvertToByteArray(): ByteArray =
    asByteArray()
