package js.typedarrays

import js.buffer.ArrayBufferLike
import js.core.JsIterable
import js.core.ReadonlyArray

open external class Int32Array() :
    TypedArray<Int32Array, Int> {
    constructor(length: Int)
    constructor(elements: JsIterable<Int>)
    constructor(elements: ReadonlyArray<Int>)
    constructor(
        buffer: ArrayBufferLike,
        byteOffset: Int = definedExternally,
        length: Int = definedExternally
    )

    companion object {
        val BYTES_PER_ELEMENT: Int
    }
}
