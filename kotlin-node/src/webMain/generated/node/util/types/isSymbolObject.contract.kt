// Automatically generated - do not modify!

package node.util.types

import js.symbol.Symbol
import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isSymbolObject(value: Any?): Boolean /* object is Symbol */ {
    contract {
        returns(true) implies (value is Symbol)
    }

    return isSymbolObjectRaw(value)
}
