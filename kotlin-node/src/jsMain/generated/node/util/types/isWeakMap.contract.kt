// Generated by Karakum - do not modify it manually!

package node.util.types

import kotlin.contracts.contract


@Suppress("NOTHING_TO_INLINE", "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isWeakMap(value: Any?): Boolean /* object is WeakMap<object, unknown> */ {
    contract {
        returns(true) implies (value is js.collections.WeakMap<*, *>)
    }

    return isWeakMapRaw(value)
}
