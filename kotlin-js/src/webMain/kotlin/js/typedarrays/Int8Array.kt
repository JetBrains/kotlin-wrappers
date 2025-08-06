package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.core.JsByte
import js.iterable.JsIterable
import js.serialization.Serializable
import kotlin.js.definedExternally

open external class Int8Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<Int8Array<B>, Int8Array<ArrayBuffer>, B, JsByte>,
    Serializable {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<JsByte>)
    constructor(elements: ReadonlyArray<JsByte>)

    companion object : TypedArrayCompanion<Int8Array<ArrayBuffer>, JsByte>
}

inline fun Int8Array<*>.toInt8Array(): Int8Array<ArrayBuffer> =
    Int8Array(this)

expect fun Int8Array<*>.asByteArray(): ByteArray

expect fun Int8Array<*>.toByteArray(): ByteArray
