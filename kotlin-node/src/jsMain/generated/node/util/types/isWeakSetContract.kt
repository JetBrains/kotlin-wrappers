// Generated by Karakum - do not modify it manually!

package node.util.types


@Suppress("NOTHING_TO_INLINE", "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isWeakSet(`object`: Any?): Boolean /* object is WeakSet<object> */ {
    kotlin.contracts.contract {
        returns(true) implies (`object` is js.collections.WeakSet<*>)
    }

    return isWeakSetRaw(`object`)
}