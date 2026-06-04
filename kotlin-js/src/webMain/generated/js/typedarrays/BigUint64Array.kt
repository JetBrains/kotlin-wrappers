// Automatically generated - do not modify!

package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.iterable.JsIterable
import js.numbers.BigInt
import js.serialization.Serializable

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/BigUint64Array)
 */
open external class BigUint64Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<BigUint64Array<B>, BigUint64Array<ArrayBuffer>, B, BigInt>,
    Serializable {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/BigUint64Array/BigUint64Array)
     */
    constructor()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/BigUint64Array/BigUint64Array)
     */
    constructor(length: Int)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/BigUint64Array/BigUint64Array)
     */
    constructor(elements: JsIterable<BigInt>)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/BigUint64Array/BigUint64Array)
     */
    constructor(elements: ReadonlyArray<BigInt>)

    companion object : TypedArrayCompanion<BigUint64Array<ArrayBuffer>, BigInt> {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/of)
         */
        override operator fun of(
            vararg items: BigInt,
        ): BigUint64Array<ArrayBuffer>
    }
}
