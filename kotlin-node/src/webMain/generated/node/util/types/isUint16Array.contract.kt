// Automatically generated - do not modify!

package node.util.types

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isUint16Array(value: Any?): Boolean /* object is Uint16Array */ {
    contract {
        returns(true) implies (value is js.typedarrays.Uint16Array<*>)
    }

    return isUint16ArrayRaw(value)
}
