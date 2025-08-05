package js.typedarrays

import js.buffer.ArrayBuffer
import js.core.JsPrimitives.toJsByte

fun ByteArray.toInt8Array(): Int8Array<ArrayBuffer> {
    val array = Int8Array<ArrayBuffer>(length = size)
    repeat(size) { index ->
        array[index] = this[index].toJsByte()
    }
    return array
}
