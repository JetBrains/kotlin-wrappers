// Automatically generated - do not modify!

package node.util.types

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isWeakMap(value: Any?): Boolean /* object is WeakMap<object, unknown> */ {
    contract {
        returns(true) implies (value is js.collections.WeakMap<*, *>)
    }

    return isWeakMapRaw(value)
}
