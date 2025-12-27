// Automatically generated - do not modify!

package node.util.types

import js.date.Date
import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isDate(value: Any?): Boolean /* object is Date */ {
    contract {
        returns(true) implies (value is Date)
    }

    return isDateRaw(value)
}
