@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.iterable.JsIterable

open external class Float64Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<Float64Array<B>, Float64Array<ArrayBuffer>, B, Double> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<Double>)
    constructor(elements: ReadonlyArray<Double>)

    companion object : TypedArrayCompanion<Float64Array<ArrayBuffer>, Double>
}
