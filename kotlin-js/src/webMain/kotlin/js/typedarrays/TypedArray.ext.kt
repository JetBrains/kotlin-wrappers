package js.typedarrays

import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.typedarrays.internal.castOrConvertToByteArray
import kotlin.js.JsAny

private fun TypedArray<*, *, *, *>.toBuffer(): ArrayBufferLike =
    buffer.slice(
        begin = byteOffset,
        end = byteOffset + byteLength,
    )

fun TypedArray<*, *, *, *>.toInt8Array(): Int8Array<ArrayBuffer> {
    if (this is Int8Array<*>)
        return Int8Array(this)

    return when (val sourceBuffer = toBuffer()) {
        is ArrayBuffer -> Int8Array(sourceBuffer)
        else -> Int8Array(sourceBuffer).slice()
    }
}

fun TypedArray<*, *, *, *>.toUint8Array(): Uint8Array<ArrayBuffer> {
    if (this is Uint8Array<*>)
        return Uint8Array(this)

    return when (val sourceBuffer = toBuffer()) {
        is ArrayBuffer -> Uint8Array(sourceBuffer)
        else -> Uint8Array(sourceBuffer).slice()
    }
}

fun TypedArray<*, *, *, *>.toByteArray(): ByteArray =
    toInt8Array().castOrConvertToByteArray()

fun TypedArray<*, *, *, *>.toUByteArray(): UByteArray =
    toByteArray().asUByteArray()

internal fun <A : TypedArray<*, *, ArrayBuffer, T>, T : JsAny> A.fill(
    getValue: (index: Int) -> T,
): A {
    for (index in 0 until length) {
        this[index] = getValue(index)
    }
    return this
}
