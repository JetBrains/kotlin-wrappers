// Generated by Karakum - do not modify it manually!

package node.util.types

import js.typedarrays.BigUint64Array


@Suppress("NOTHING_TO_INLINE", "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isBigUint64Array(value: Any?): Boolean /* value is BigUint64Array */ {
    kotlin.contracts.contract {
        returns(true) implies (value is BigUint64Array)
    }

    return isBigUint64ArrayRaw(value)
}