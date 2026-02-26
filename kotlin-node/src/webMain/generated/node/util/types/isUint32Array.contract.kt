// Automatically generated - do not modify!

package node.util.types

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isUint32Array(value: Any?): Boolean /* object is Uint32Array */ {
    contract {
        returns(true) implies (value is js.typedarrays.Uint32Array<*>)
    }

    return isUint32ArrayRaw(value)
}
