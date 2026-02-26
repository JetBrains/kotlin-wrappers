// Automatically generated - do not modify!

package node.util.types

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isArrayBuffer(value: Any?): Boolean /* object is ArrayBuffer */ {
    contract {
        returns(true) implies (value is js.buffer.ArrayBuffer)
    }

    return isArrayBufferRaw(value)
}
