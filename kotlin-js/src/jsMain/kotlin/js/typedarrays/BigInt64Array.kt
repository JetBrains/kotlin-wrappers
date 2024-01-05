@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBufferLike
import js.core.BigInt
import js.iterable.JsIterable

open external class BigInt64Array(
    override val buffer: ArrayBufferLike,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<BigInt64Array, BigInt> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<BigInt>)
    constructor(elements: ReadonlyArray<BigInt>)

    companion object : TypedArrayCompanion<BigInt64Array, BigInt>
}
