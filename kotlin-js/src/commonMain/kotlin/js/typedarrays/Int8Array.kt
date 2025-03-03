package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.iterable.JsIterable
import kotlin.js.definedExternally

open external class Int8Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<Int8Array<B>, Int8Array<ArrayBuffer>, B, Byte> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<Byte>)

    @Suppress("UPPER_BOUND_VIOLATED")
    constructor(elements: ReadonlyArray<Byte>)

    companion object : TypedArrayCompanion<Int8Array<ArrayBuffer>, Byte>
}
