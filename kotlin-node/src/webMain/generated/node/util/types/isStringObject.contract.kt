// Automatically generated - do not modify!

package node.util.types

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isStringObject(value: Any?): Boolean /* object is String */ {
    contract {
        returns(true) implies (value is String)
    }

    return isStringObjectRaw(value)
}
