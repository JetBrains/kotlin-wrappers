package js.typedarrays

import js.buffer.ArrayBufferLike
import js.core.BigInt
import js.core.JsIterable
import js.core.ReadonlyArray

open external class BigInt64Array() :
    TypedArray<BigInt64Array, BigInt> {
    constructor(length: Int)
    constructor(elements: JsIterable<BigInt>)
    constructor(elements: ReadonlyArray<BigInt>)
    constructor(
        buffer: ArrayBufferLike,
        byteOffset: Int = definedExternally,
        length: Int = definedExternally,
    )

    companion object {
        val BYTES_PER_ELEMENT: Int
    }
}
