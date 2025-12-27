// Automatically generated - do not modify!

package node.util.types

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isWeakSet(value: Any?): Boolean /* object is WeakSet<object> */ {
    contract {
        returns(true) implies (value is js.collections.WeakSet<*>)
    }

    return isWeakSetRaw(value)
}
