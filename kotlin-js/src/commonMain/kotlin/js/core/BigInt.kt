@file:Suppress(
    "EXPECTED_EXTERNAL_DECLARATION",
    "EXTERNAL_TYPE_EXTENDS_NON_EXTERNAL_TYPE",
)

package js.core

expect external class BigInt :
    Comparable<BigInt> {

    override fun compareTo(other: BigInt): Int
}
