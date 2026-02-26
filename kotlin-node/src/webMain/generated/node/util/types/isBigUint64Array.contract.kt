// Automatically generated - do not modify!

package node.util.types

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isBigUint64Array(value: Any?): Boolean /* value is BigUint64Array */ {
    contract {
        returns(true) implies (value is js.typedarrays.BigUint64Array<*>)
    }

    return isBigUint64ArrayRaw(value)
}
