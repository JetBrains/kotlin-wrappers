package node.util.types

import js.collections.JsSet
import kotlin.contracts.contract

inline fun isSet(target: Any?): Boolean {
    contract {
        returns(true) implies (target is JsSet<*>)
    }

    return isSetRaw(target)
}
