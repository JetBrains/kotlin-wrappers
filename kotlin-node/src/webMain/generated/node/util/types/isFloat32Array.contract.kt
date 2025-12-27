// Automatically generated - do not modify!

package node.util.types

import js.typedarrays.Float32Array
import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isFloat32Array(value: Any?): Boolean /* object is Float32Array */ {
    contract {
        returns(true) implies (value is Float32Array<*>)
    }

    return isFloat32ArrayRaw(value)
}
