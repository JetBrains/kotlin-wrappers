package js.typedarrays

import js.buffer.ArrayBufferLike
import js.core.JsIterable
import js.core.ReadonlyArray

open external class Int16Array() :
    TypedArray<Int16Array, Short> {
    constructor(length: Int)
    constructor(elements: JsIterable<Short>)
    constructor(elements: ReadonlyArray<Short>)
    constructor(
        buffer: ArrayBufferLike,
        byteOffset: Int = definedExternally,
        length: Int = definedExternally
    )

    companion object {
        val BYTES_PER_ELEMENT: Int
    }
}
