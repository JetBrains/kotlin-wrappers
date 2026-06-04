// Automatically generated - do not modify!

package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.iterable.JsIterable
import js.numbers.BigInt
import js.serialization.Serializable

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/BigInt64Array)
 */
open external class BigInt64Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<BigInt64Array<B>, BigInt64Array<ArrayBuffer>, B, BigInt>,
    Serializable {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/BigInt64Array/BigInt64Array)
     */
    constructor()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/BigInt64Array/BigInt64Array)
     */
    constructor(length: Int)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/BigInt64Array/BigInt64Array)
     */
    constructor(elements: JsIterable<BigInt>)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/BigInt64Array/BigInt64Array)
     */
    constructor(elements: ReadonlyArray<BigInt>)

    companion object : TypedArrayCompanion<BigInt64Array<ArrayBuffer>, BigInt> {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/of)
         */
        override operator fun of(
            vararg items: BigInt,
        ): BigInt64Array<ArrayBuffer>
    }
}
