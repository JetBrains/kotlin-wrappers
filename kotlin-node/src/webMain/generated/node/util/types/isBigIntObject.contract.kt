// Automatically generated - do not modify!

package node.util.types

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isBigIntObject(value: Any?): Boolean /* object is BigInt */ {
    contract {
        returns(true) implies (value is js.numbers.BigInt)
    }

    return isBigIntObjectRaw(value)
}
