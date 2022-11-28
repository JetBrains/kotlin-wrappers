package js.typedarrays

import js.buffer.ArrayBuffer
import js.core.ReadonlyArray

open external class Float32Array() :
    TypedArray<Float32Array, Float> {
    constructor(length: Int)
    constructor(array: Float32Array)
    constructor(array: ReadonlyArray<Float>)
    constructor(
        buffer: ArrayBuffer,
        byteOffset: Int = definedExternally,
        length: Int = definedExternally,
    )

    companion object {
        val BYTES_PER_ELEMENT: Int
    }
}
