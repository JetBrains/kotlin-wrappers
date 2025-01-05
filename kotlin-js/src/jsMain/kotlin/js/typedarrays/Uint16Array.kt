package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.iterable.JsIterable

open external class Uint16Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<Uint16Array<B>, Uint16Array<ArrayBuffer>, B, UShort> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<UShort>)
    constructor(elements: ReadonlyArray<UShort>)

    companion object : TypedArrayCompanion<Uint16Array<ArrayBuffer>, UShort>
}
