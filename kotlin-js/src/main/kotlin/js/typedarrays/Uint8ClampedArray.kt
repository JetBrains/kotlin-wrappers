package js.typedarrays

import js.buffer.ArrayBuffer
import js.core.ReadonlyArray

open external class Uint8ClampedArray() :
    TypedArray<Uint8ClampedArray, Byte> {
    constructor(length: Int)
    constructor(array: Uint8ClampedArray)
    constructor(array: ReadonlyArray<Byte>)
    constructor(
        buffer: ArrayBuffer,
        byteOffset: Int = definedExternally,
        length: Int = definedExternally
    )

    companion object {
        val BYTES_PER_ELEMENT: Int
    }
}
