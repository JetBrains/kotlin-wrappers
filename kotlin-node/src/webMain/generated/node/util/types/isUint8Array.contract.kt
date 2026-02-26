// Automatically generated - do not modify!

package node.util.types

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isUint8Array(value: Any?): Boolean /* object is Uint8Array */ {
    contract {
        returns(true) implies (value is js.typedarrays.Uint8Array<*>)
    }

    return isUint8ArrayRaw(value)
}
