package js.typedarrays

import js.buffer.ArrayBuffer
import js.core.JsIterable
import js.core.ReadonlyArray

open external class Float64Array() :
    TypedArray<Float64Array, Double> {
    constructor(length: Int)
    constructor(elements: JsIterable<Double>)
    constructor(elements: ReadonlyArray<Double>)
    constructor(
        buffer: ArrayBuffer,
        byteOffset: Int = definedExternally,
        length: Int = definedExternally,
    )

    companion object {
        val BYTES_PER_ELEMENT: Int
    }
}
