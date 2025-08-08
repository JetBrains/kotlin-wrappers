package js.typedarrays.internal

import js.internal.InternalApi
import js.typedarrays.Uint8Array

@InternalApi
expect inline fun Uint8Array<*>.castOrConvertToUByteArray(): UByteArray
