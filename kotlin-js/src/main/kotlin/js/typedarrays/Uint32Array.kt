package js.typedarrays

import js.buffer.ArrayBuffer
import js.core.ReadonlyArray

open external class Uint32Array() :
    TypedArray<Uint32Array, Int> {
    constructor(length: Int)
    constructor(array: Uint32Array)
    constructor(array: ReadonlyArray<Int>)
    constructor(
        buffer: ArrayBuffer,
        byteOffset: Int = definedExternally,
        length: Int = definedExternally
    )

    companion object {
        val BYTES_PER_ELEMENT: Int
    }
}
