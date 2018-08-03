@file:Suppress("unused")

package redux

import kotlinx.serialization.internal.StringSerializer
import kotlinx.serialization.map
import kotlinx.serialization.json.JSON

inline fun <reified A : RAction> serializeAction(action: A): String {
    return "{\"type\":\"${A::class.simpleName}\",${JSON.stringify(action).drop(1)}"
}

inline fun <reified A : RAction> deserializeAction(action: String): A? {
    val map = JSON.parse((StringSerializer to StringSerializer).map, action)
    return if (map["type"] == A::class.simpleName) JSON.nonstrict.parse(action) else null
}
