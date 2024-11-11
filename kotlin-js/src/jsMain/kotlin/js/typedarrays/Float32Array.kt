@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.iterable.JsIterable

open external class Float32Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<Float32Array<B>, B, Float> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<Float>)
    constructor(elements: ReadonlyArray<Float>)

    companion object : TypedArrayCompanion<Float32Array<ArrayBuffer>, Float>
}
