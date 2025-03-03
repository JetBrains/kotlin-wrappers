package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.iterable.JsIterable
import kotlin.js.definedExternally

open external class Int32Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<Int32Array<B>, Int32Array<ArrayBuffer>, B, Int> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<Int>)

    @Suppress("UPPER_BOUND_VIOLATED")
    constructor(elements: ReadonlyArray<Int>)

    companion object : TypedArrayCompanion<Int32Array<ArrayBuffer>, Int>
}
