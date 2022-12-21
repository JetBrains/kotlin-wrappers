package js.typedarrays

import js.buffer.ArrayBuffer
import js.core.JsIterable
import js.core.ReadonlyArray

open external class Uint8ClampedArray() :
    TypedArray<Uint8ClampedArray, Byte> {
    constructor(length: Int)
    constructor(elements: JsIterable<Byte>)
    constructor(elements: ReadonlyArray<Byte>)
    constructor(
        buffer: ArrayBuffer,
        byteOffset: Int = definedExternally,
        length: Int = definedExternally
    )

    companion object {
        val BYTES_PER_ELEMENT: Int
    }
}
