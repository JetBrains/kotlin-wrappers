@file:Suppress(
    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
    "INLINE_EXTERNAL_DECLARATION",
    "NOTHING_TO_INLINE",

    "EXTERNAL_TYPE_EXTENDS_NON_EXTERNAL_TYPE",
)

package js.core

import js.function.JsFunction
import js.function.invoke
import js.reflect.unsafeCast
import seskar.js.JsPrimitive

@PublishedApi
internal val POW = JsFunction<BigInt, BigInt, BigInt>(
    "base",
    "exponent",
    "return base ** exponent"
)

@JsPrimitive
external class BigInt
private constructor() :
    BigIntComparableAdapter,
    Comparable<BigInt> {

    inline operator fun unaryMinus(): BigInt =
        unsafeCast(-unsafeCast<Double>(this))

    inline operator fun plus(other: BigInt): BigInt =
        unsafeCast(unsafeCast<Double>(this) + unsafeCast<Double>(other))

    inline operator fun minus(other: BigInt): BigInt =
        unsafeCast(unsafeCast<Double>(this) - unsafeCast<Double>(other))

    inline operator fun times(other: BigInt): BigInt =
        unsafeCast(unsafeCast<Double>(this) * unsafeCast<Double>(other))

    inline operator fun div(other: BigInt): BigInt =
        unsafeCast(unsafeCast<Double>(this) / unsafeCast<Double>(other))

    inline operator fun inc(): BigInt =
        this + 1.n

    inline operator fun dec(): BigInt =
        this - 1.n

    inline fun pow(x: Int): BigInt =
        pow(x.n)

    inline fun pow(x: Long): BigInt =
        pow(x.n)

    inline fun pow(x: BigInt): BigInt =
        POW(this, x)

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

external fun BigInt(
    value: Number,
): BigInt

external fun BigInt(
    value: String,
): BigInt

inline val Number.n: BigInt
    get() = BigInt(this)

inline val String.n: BigInt
    get() = BigInt(this)
