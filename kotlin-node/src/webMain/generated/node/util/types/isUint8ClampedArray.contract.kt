// Automatically generated - do not modify!

package node.util.types

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isUint8ClampedArray(value: Any?): Boolean /* object is Uint8ClampedArray */ {
    contract {
        returns(true) implies (value is js.typedarrays.Uint8ClampedArray<*>)
    }

    return isUint8ClampedArrayRaw(value)
}
