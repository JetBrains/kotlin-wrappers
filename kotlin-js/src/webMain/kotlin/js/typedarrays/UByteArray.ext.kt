package js.typedarrays

import js.buffer.ArrayBuffer
import js.core.JsPrimitives.toJsUByte

fun UByteArray.toUint8Array(): Uint8Array<ArrayBuffer> {
    val array = Uint8Array<ArrayBuffer>(length = size)
    repeat(size) { index ->
        array[index] = this[index].toJsUByte()
    }
    return array
}
