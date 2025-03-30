package node.util.types

import js.collections.JsMap
import kotlin.contracts.contract

inline fun isMap(target: Any?): Boolean {
    contract {
        returns(true) implies (target is JsMap<*, *>)
    }

    return isMapRaw(target)
}
