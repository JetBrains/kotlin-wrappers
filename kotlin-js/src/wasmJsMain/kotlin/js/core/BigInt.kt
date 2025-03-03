@file:Suppress(
    "EXTERNAL_TYPE_EXTENDS_NON_EXTERNAL_TYPE",
)

package js.core

actual external class BigInt :
    Comparable<BigInt> {

    actual override fun compareTo(other: BigInt): Int
}
