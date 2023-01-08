package js.typedarrays

import js.buffer.ArrayBufferLike
import js.core.JsIterable
import js.core.ReadonlyArray

open external class Float32Array(
    buffer: ArrayBufferLike,
    byteOffset: Int = definedExternally,
    length: Int = definedExternally,
) : TypedArray<Float32Array, Float> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<Float>)
    constructor(elements: ReadonlyArray<Float>)

    companion object {
        val BYTES_PER_ELEMENT: Int
    }
}
