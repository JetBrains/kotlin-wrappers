package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.iterable.JsIterable

open external class Int16Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<Int16Array<B>, Int16Array<ArrayBuffer>, B, Short> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<Short>)
    constructor(elements: ReadonlyArray<Short>)

    companion object : TypedArrayCompanion<Int16Array<ArrayBuffer>, Short>
}
