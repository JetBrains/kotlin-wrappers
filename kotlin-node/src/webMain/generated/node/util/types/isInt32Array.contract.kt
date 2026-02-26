// Automatically generated - do not modify!

package node.util.types

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isInt32Array(value: Any?): Boolean /* object is Int32Array */ {
    contract {
        returns(true) implies (value is js.typedarrays.Int32Array<*>)
    }

    return isInt32ArrayRaw(value)
}
