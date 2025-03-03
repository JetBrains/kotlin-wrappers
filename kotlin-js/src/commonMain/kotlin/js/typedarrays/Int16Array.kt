package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.iterable.JsIterable
import kotlin.js.definedExternally

open external class Int16Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<Int16Array<B>, Int16Array<ArrayBuffer>, B, Short> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<Short>)

    @Suppress("UPPER_BOUND_VIOLATED")
    constructor(elements: ReadonlyArray<Short>)

    companion object : TypedArrayCompanion<Int16Array<ArrayBuffer>, Short>
}
