package js.typedarrays

import js.buffer.ArrayBuffer
import js.numbers.JsNumbers.toKotlinUByte

inline fun Uint8Array<*>.toUint8Array(): Uint8Array<ArrayBuffer> =
    Uint8Array(this)

fun Uint8Array<*>.toUByteArray(): UByteArray =
    UByteArray(size = length) { index ->
        get(index).toKotlinUByte()
    }
