// Automatically generated - do not modify!

package node.util.types

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isNumberObject(value: Any?): Boolean /* object is Number */ {
    contract {
        returns(true) implies (value is Number)
    }

    return isNumberObjectRaw(value)
}
