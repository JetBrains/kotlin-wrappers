package js.typedarrays

import js.buffer.ArrayBuffer

open external class Uint8ClampedArray :
    TypedArray<Uint8ClampedArray, Byte> {
    constructor(length: Int)
    constructor(array: Uint8ClampedArray)
    constructor(array: Array<Byte>)
    constructor(
        buffer: ArrayBuffer,
        byteOffset: Int = definedExternally,
        length: Int = definedExternally
    )

    companion object {
        val BYTES_PER_ELEMENT: Int
    }
}
