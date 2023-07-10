@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package js.typedarrays

import js.buffer.ArrayBufferLike
import js.core.BigInt
import js.core.JsIterable
import js.core.ReadonlyArray

open external class BigInt64Array(
    override val buffer: ArrayBufferLike,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<BigInt64Array, BigInt> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<BigInt>)
    constructor(elements: ReadonlyArray<BigInt>)

    companion object : TypedArrayCompanion<BigInt64Array, BigInt> {
        val BYTES_PER_ELEMENT: Int

        fun of(vararg items: BigInt): BigInt64Array
    }
}
