// Automatically generated - do not modify!

package node.util.types

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isRegExp(value: Any?): Boolean /* object is RegExp */ {
    contract {
        returns(true) implies (value is js.regexp.RegExp)
    }

    return isRegExpRaw(value)
}
