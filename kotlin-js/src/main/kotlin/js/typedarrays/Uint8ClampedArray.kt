package js.typedarrays

import js.buffer.ArrayBufferLike
import js.core.JsIterable
import js.core.ReadonlyArray

open external class Uint8ClampedArray(
    buffer: ArrayBufferLike,
    byteOffset: Int = definedExternally,
    length: Int = definedExternally
) : TypedArray<Uint8ClampedArray, Byte> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<Byte>)
    constructor(elements: ReadonlyArray<Byte>)

    companion object {
        val BYTES_PER_ELEMENT: Int
    }
}
