// Generated by Karakum - do not modify it manually!

package node.util

import kotlin.contracts.contract


@Suppress("NOTHING_TO_INLINE", "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isArray(value: Any?): Boolean /* object is unknown[] */ {
    contract {
        returns(true) implies (value is js.array.ReadonlyArray<Any?>)
    }

    return isArrayRaw(value)
}