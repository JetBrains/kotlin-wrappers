@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.core

sealed external interface BigInt {
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

inline operator fun BigInt.unaryMinus(): BigInt =
    (-unsafeCast<Double>()).unsafeCast<BigInt>()

inline operator fun BigInt.plus(other: BigInt): BigInt =
    (unsafeCast<Double>() + other.unsafeCast<Double>()).unsafeCast<BigInt>()

inline operator fun BigInt.minus(other: BigInt): BigInt =
    (unsafeCast<Double>() - other.unsafeCast<Double>()).unsafeCast<BigInt>()

inline operator fun BigInt.times(other: BigInt): BigInt =
    (unsafeCast<Double>() * other.unsafeCast<Double>()).unsafeCast<BigInt>()

inline operator fun BigInt.div(other: BigInt): BigInt =
    (unsafeCast<Double>() / other.unsafeCast<Double>()).unsafeCast<BigInt>()
