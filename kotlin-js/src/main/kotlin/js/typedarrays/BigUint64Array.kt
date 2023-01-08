package js.typedarrays

import js.buffer.ArrayBufferLike
import js.core.BigInt
import js.core.JsIterable
import js.core.ReadonlyArray

open external class BigUint64Array(
    buffer: ArrayBufferLike,
    byteOffset: Int = definedExternally,
    length: Int = definedExternally,
) : TypedArray<BigUint64Array, BigInt> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<BigInt>)
    constructor(elements: ReadonlyArray<BigInt>)

    companion object {
        val BYTES_PER_ELEMENT: Int
    }
}
