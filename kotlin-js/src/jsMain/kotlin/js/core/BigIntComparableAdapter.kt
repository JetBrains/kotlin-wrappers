@file:Suppress(
    "NOTHING_TO_INLINE",
    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
    "INLINE_EXTERNAL_DECLARATION",
)

package js.core

// TODO: test in Kotlin 1.9
//  class -> interface?
sealed external class BigIntComparableAdapter {
    inline fun compareTo(other: BigInt): Int =
        unsafeCast<Double>().compareTo(other.unsafeCast<Double>())
}
