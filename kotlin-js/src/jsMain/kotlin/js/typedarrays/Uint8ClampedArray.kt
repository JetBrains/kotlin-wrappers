package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.iterable.JsIterable

open external class Uint8ClampedArray<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<Uint8ClampedArray<B>, Uint8ClampedArray<ArrayBuffer>, B, UByte> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<UByte>)
    constructor(elements: ReadonlyArray<UByte>)

    companion object : TypedArrayCompanion<Uint8ClampedArray<ArrayBuffer>, UByte>
}
