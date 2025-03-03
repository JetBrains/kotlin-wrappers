package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.iterable.JsIterable
import kotlin.js.definedExternally

open external class Float32Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<Float32Array<B>, Float32Array<ArrayBuffer>, B, Float> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<Float>)

    @Suppress("UPPER_BOUND_VIOLATED")
    constructor(elements: ReadonlyArray<Float>)

    companion object : TypedArrayCompanion<Float32Array<ArrayBuffer>, Float>
}
