@file:Suppress(
    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
    "INLINE_EXTERNAL_DECLARATION",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "DECLARATION_CANT_BE_INLINED",
    "NOTHING_TO_INLINE",

    "WRONG_JS_QUALIFIER",
    "EXTERNAL_TYPE_EXTENDS_NON_EXTERNAL_TYPE",
)
// language=JavaScript
@file:JsQualifier(
    """({
    __type_plus_guard__: Object.setPrototypeOf({
        [Symbol.hasInstance](instance) {
            return typeof instance === 'bigint'
        }
    }, BigInt)
  })"""
)

package js.core

import seskar.js.JsPrimitive

@JsPrimitive
@JsName("__type_plus_guard__")
sealed external class BigInt :
    BigIntComparableAdapter,
    Comparable<BigInt> {

    inline operator fun unaryMinus(): BigInt =
        (-unsafeCast<Double>()).unsafeCast<BigInt>()

    inline operator fun plus(other: BigInt): BigInt =
        (unsafeCast<Double>() + other.unsafeCast<Double>()).unsafeCast<BigInt>()

    inline operator fun minus(other: BigInt): BigInt =
        (unsafeCast<Double>() - other.unsafeCast<Double>()).unsafeCast<BigInt>()

    inline operator fun times(other: BigInt): BigInt =
        (unsafeCast<Double>() * other.unsafeCast<Double>()).unsafeCast<BigInt>()

    inline operator fun div(other: BigInt): BigInt =
        (unsafeCast<Double>() / other.unsafeCast<Double>()).unsafeCast<BigInt>()

    /**
     * Returns a string representation of an object.
     * @param radix Specifies a radix for converting numeric values to strings.
     */
    fun toString(radix: Int): String

    companion object {

        /**
         * Interprets the low bits of a BigInt as a 2's-complement signed integer.
         * All higher bits are discarded.
         * @param bits The number of low bits to use
         * @param int The BigInt whose bits to extract
         */
        fun asIntN(bits: Int, int: BigInt): BigInt

        /**
         * Interprets the low bits of a BigInt as an unsigned integer.
         * All higher bits are discarded.
         * @param bits The number of low bits to use
         * @param int The BigInt whose bits to extract
         */
        fun asUintN(bits: Int, int: BigInt): BigInt
    }
}
