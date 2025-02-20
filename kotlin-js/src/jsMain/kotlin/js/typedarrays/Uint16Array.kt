package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.iterable.JsIterable

open external class Uint16Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<Uint16Array<B>, Uint16Array<ArrayBuffer>, B, Int /* Short */> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<Int /* Short */>)
    constructor(elements: ReadonlyArray<Int /* Short */>)

    companion object : TypedArrayCompanion<Uint16Array<ArrayBuffer>, Int /* Short */>
}
