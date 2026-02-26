// Automatically generated - do not modify!

package node.util.types

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isFloat64Array(value: Any?): Boolean /* object is Float64Array */ {
    contract {
        returns(true) implies (value is js.typedarrays.Float64Array<*>)
    }

    return isFloat64ArrayRaw(value)
}
