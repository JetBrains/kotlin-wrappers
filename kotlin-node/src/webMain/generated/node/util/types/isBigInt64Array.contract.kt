// Automatically generated - do not modify!

package node.util.types

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isBigInt64Array(value: Any?): Boolean /* value is BigInt64Array */ {
    contract {
        returns(true) implies (value is js.typedarrays.BigInt64Array<*>)
    }

    return isBigInt64ArrayRaw(value)
}
