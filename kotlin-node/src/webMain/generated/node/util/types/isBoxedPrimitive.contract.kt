// Automatically generated - do not modify!

package node.util.types

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isBoxedPrimitive(value: Any?): Boolean /* object is String | Number | BigInt | Boolean | Symbol */ {
    contract {
        returns(true) implies (value is Any /* String | Number | BigInt | Boolean | Symbol */)
    }

    return isBoxedPrimitiveRaw(value)
}
