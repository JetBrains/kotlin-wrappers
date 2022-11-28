package js.typedarrays

import js.buffer.ArrayBuffer
import js.core.ReadonlyArray

open external class Int16Array() :
    TypedArray<Int16Array, Short> {
    constructor(length: Int)
    constructor(array: Int16Array)
    constructor(array: ReadonlyArray<Short>)
    constructor(
        buffer: ArrayBuffer,
        byteOffset: Int = definedExternally,
        length: Int = definedExternally
    )

    companion object {
        val BYTES_PER_ELEMENT: Int
    }
}
