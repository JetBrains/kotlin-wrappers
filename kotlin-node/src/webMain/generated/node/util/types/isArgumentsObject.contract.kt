// Automatically generated - do not modify!

package node.util.types

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isArgumentsObject(value: Any?): Boolean /* object is IArguments */ {
    contract {
        returns(true) implies (value is js.array.ArrayLike<Any?> /* IArguments */)
    }

    return isArgumentsObjectRaw(value)
}
