package node.util.types

import js.collections.JsMap
import kotlin.contracts.contract

@Suppress("NOTHING_TO_INLINE")
inline fun isMap(target: Any?): Boolean {
    contract {
        returns(true) implies (target is JsMap<*, *>)
    }

    return isMapRaw(target)
}
