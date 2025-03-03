package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.iterable.JsIterable
import kotlin.js.definedExternally

open external class Uint8ClampedArray<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<Uint8ClampedArray<B>, Uint8ClampedArray<ArrayBuffer>, B, Short /* UByte */> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<Short /* UByte */>)

    @Suppress("UPPER_BOUND_VIOLATED")
    constructor(elements: ReadonlyArray<Short /* UByte */>)

    companion object : TypedArrayCompanion<Uint8ClampedArray<ArrayBuffer>, Short /* UByte */>
}
