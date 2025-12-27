// Automatically generated - do not modify!

package node.util.types

import js.typedarrays.Float16Array
import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isFloat16Array(value: Any?): Boolean /* object is Float16Array */ {
    contract {
        returns(true) implies (value is Float16Array<*>)
    }

    return isFloat16ArrayRaw(value)
}
