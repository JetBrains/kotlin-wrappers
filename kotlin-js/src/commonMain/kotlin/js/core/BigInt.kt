@file:Suppress(
    "EXPECTED_EXTERNAL_DECLARATION",
    "EXTERNAL_TYPE_EXTENDS_NON_EXTERNAL_TYPE",
)

package js.core

expect external class BigInt :
    Comparable<BigInt> {

    override fun compareTo(other: BigInt): Int
}

external fun BigInt(
    value: Int,
): BigInt

external fun BigInt(
    value: Long,
): BigInt

external fun BigInt(
    value: String,
): BigInt

inline val Int.n: BigInt
    get() = BigInt(this)

inline val Long.n: BigInt
    get() = BigInt(this)

inline val String.n: BigInt
    get() = BigInt(this)
