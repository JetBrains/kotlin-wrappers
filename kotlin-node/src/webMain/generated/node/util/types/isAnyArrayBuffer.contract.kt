// Automatically generated - do not modify!

package node.util.types

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isAnyArrayBuffer(value: Any?): Boolean /* object is ArrayBufferLike */ {
    contract {
        returns(true) implies (value is js.buffer.ArrayBufferLike)
    }

    return isAnyArrayBufferRaw(value)
}
