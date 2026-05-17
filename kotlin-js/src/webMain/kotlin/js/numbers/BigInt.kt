package js.numbers

import js.core.JsPrimitive
import js.function.JsFunction
import js.function.invoke
import js.numbers.internal.*

@PublishedApi
internal val POW = JsFunction<BigInt, BigInt, BigInt>(
    "base",
    "exponent",
    "return base ** exponent",
)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/BigInt)
 */
@JsPrimitive("bigint")
external class BigInt
private constructor() {

    /**
     * Returns a string representation of an object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/BigInt/toString)
     *
     * @param radix Specifies a radix for converting numeric values to strings.
     */
    fun toString(radix: Int): String

    companion object {

        /**
         * Interprets the low bits of a BigInt as a 2's-complement signed integer.
         * All higher bits are discarded.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/BigInt/asIntN)
         *
         * @param bits The number of low bits to use
         * @param int The BigInt whose bits to extract
         */
        fun asIntN(bits: Int, int: BigInt): BigInt

        /**
         * Interprets the low bits of a BigInt as an unsigned integer.
         * All higher bits are discarded.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/BigInt/asUintN)
         *
         * @param bits The number of low bits to use
         * @param int The BigInt whose bits to extract
         */
        fun asUintN(bits: Int, int: BigInt): BigInt
    }
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/BigInt/BigInt)
 */
external fun BigInt(
    value: Int,
): BigInt

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/BigInt/BigInt)
 */
external fun BigInt(
    value: Long,
): BigInt

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/BigInt/BigInt)
 */
external fun BigInt(
    value: String,
): BigInt

inline val Int.n: BigInt
    get() = BigInt(this)

inline val Long.n: BigInt
    get() = BigInt(this)

inline val String.n: BigInt
    get() = BigInt(this)

inline operator fun BigInt.unaryMinus(): BigInt =
    unsafeNegate(this)

inline operator fun BigInt.plus(other: BigInt): BigInt =
    unsafeAdd(this, other)

inline operator fun BigInt.minus(other: BigInt): BigInt =
    unsafeSubtract(this, other)

inline operator fun BigInt.times(other: BigInt): BigInt =
    unsafeMultiply(this, other)

inline operator fun BigInt.div(other: BigInt): BigInt =
    unsafeDivide(this, other)

inline operator fun BigInt.inc(): BigInt =
    this + 1.n

inline operator fun BigInt.dec(): BigInt =
    this - 1.n

inline fun BigInt.pow(x: Int): BigInt =
    pow(x.n)

inline fun BigInt.pow(x: Long): BigInt =
    pow(x.n)

inline fun BigInt.pow(x: BigInt): BigInt =
    POW(this, x)
