package js.typedarrays

import js.buffer.ArrayBuffer
import js.core.BigInt
import js.core.ReadonlyArray

open external class BigUint64Array() :
    TypedArray<BigUint64Array, BigInt> {
    constructor(length: Int)
    constructor(array: BigUint64Array)
    constructor(array: /* JsIterable */ ReadonlyArray<BigInt>)
    constructor(
        buffer: ArrayBuffer,
        byteOffset: Int = definedExternally,
        length: Int = definedExternally,
    )

    companion object {
        val BYTES_PER_ELEMENT: Int
    }
}
