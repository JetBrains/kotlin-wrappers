// Generated by Karakum - do not modify it manually!

package node.util.types


@Suppress("NOTHING_TO_INLINE", "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isBoxedPrimitive(`object`: Any?): Boolean /* object is String | Number | BigInt | Boolean | Symbol */ {
    kotlin.contracts.contract {
        returns(true) implies (`object` is Any /* String | Number | BigInt | Boolean | Symbol */)
    }

    return isBoxedPrimitiveRaw(`object`)
}