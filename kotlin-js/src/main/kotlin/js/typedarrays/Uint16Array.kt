package js.typedarrays

import js.buffer.ArrayBuffer
import js.core.ReadonlyArray

open external class Uint16Array() :
    TypedArray<Uint16Array, Short> {
    constructor(length: Int)
    constructor(array: Uint16Array)
    constructor(array: ReadonlyArray<Short>)
    constructor(
        buffer: ArrayBuffer,
        byteOffset: Int = definedExternally,
        length: Int = definedExternally,
    )

    companion object {
        val BYTES_PER_ELEMENT: Int
    }
}
