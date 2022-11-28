package js.typedarrays

import js.buffer.ArrayBuffer
import js.core.ReadonlyArray

open external class Int8Array() :
    TypedArray<Int8Array, Byte> {
    constructor(length: Int)
    constructor(array: Int8Array)
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
