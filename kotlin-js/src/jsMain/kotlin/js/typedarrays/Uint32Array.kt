package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.iterable.JsIterable

open external class Uint32Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<Uint32Array<B>, Uint32Array<ArrayBuffer>, B, Int> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<Int>)
    constructor(elements: ReadonlyArray<Int>)

    companion object : TypedArrayCompanion<Uint32Array<ArrayBuffer>, Int>
}
