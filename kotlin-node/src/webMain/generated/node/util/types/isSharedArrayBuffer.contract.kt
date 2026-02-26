// Automatically generated - do not modify!

package node.util.types

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isSharedArrayBuffer(value: Any?): Boolean /* object is SharedArrayBuffer */ {
    contract {
        returns(true) implies (value is js.buffer.SharedArrayBuffer)
    }

    return isSharedArrayBufferRaw(value)
}
