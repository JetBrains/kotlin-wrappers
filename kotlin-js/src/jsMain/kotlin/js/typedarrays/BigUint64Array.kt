@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package js.typedarrays

import js.buffer.ArrayBufferLike
import js.core.BigInt
import js.core.JsIterable
import js.core.ReadonlyArray

open external class BigUint64Array(
    override val buffer: ArrayBufferLike,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<BigUint64Array, BigInt> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<BigInt>)
    constructor(elements: ReadonlyArray<BigInt>)

    companion object : TypedArrayCompanion<BigUint64Array, BigInt> {
        val BYTES_PER_ELEMENT: Int
    }
}
