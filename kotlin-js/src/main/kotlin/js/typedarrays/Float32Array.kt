package js.typedarrays

import js.buffer.ArrayBufferLike
import js.core.JsIterable
import js.core.ReadonlyArray

open external class Float32Array() :
    TypedArray<Float32Array, Float> {
    constructor(length: Int)
    constructor(elements: JsIterable<Float>)
    constructor(elements: ReadonlyArray<Float>)
    constructor(
        buffer: ArrayBufferLike,
        byteOffset: Int = definedExternally,
        length: Int = definedExternally,
    )

    companion object {
        val BYTES_PER_ELEMENT: Int
    }
}
