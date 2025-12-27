// Automatically generated - do not modify!

package node.util.types

import js.buffer.DataView
import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isDataView(value: Any?): Boolean /* object is DataView */ {
    contract {
        returns(true) implies (value is DataView<*>)
    }

    return isDataViewRaw(value)
}
