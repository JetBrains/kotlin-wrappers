// Automatically generated - do not modify!

package node.util.types

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isInt16Array(value: Any?): Boolean /* object is Int16Array */ {
    contract {
        returns(true) implies (value is js.typedarrays.Int16Array<*>)
    }

    return isInt16ArrayRaw(value)
}
