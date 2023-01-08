package js.typedarrays

import js.buffer.ArrayBufferLike
import js.core.JsIterable
import js.core.ReadonlyArray

open external class Float64Array(
    buffer: ArrayBufferLike,
    byteOffset: Int = definedExternally,
    length: Int = definedExternally,
) : TypedArray<Float64Array, Double> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<Double>)
    constructor(elements: ReadonlyArray<Double>)

    override val byteLength: Int

    companion object {
        val BYTES_PER_ELEMENT: Int
    }
}
