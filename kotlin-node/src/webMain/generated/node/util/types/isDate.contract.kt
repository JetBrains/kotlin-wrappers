// Automatically generated - do not modify!

package node.util.types

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isDate(value: Any?): Boolean /* object is Date */ {
    contract {
        returns(true) implies (value is js.date.Date)
    }

    return isDateRaw(value)
}
