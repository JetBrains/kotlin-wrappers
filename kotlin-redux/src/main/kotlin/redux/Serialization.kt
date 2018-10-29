@file:Suppress("unused")

package redux

import kotlinx.serialization.*
import kotlinx.serialization.internal.*
import kotlinx.serialization.json.*

@UseExperimental(ImplicitReflectionSerializer::class)
inline fun <reified A : RAction> serializeAction(action: A): String {
    return "{\"type\":\"${A::class.simpleName}\",${JSON.stringify(action).drop(1)}"
}

@UseExperimental(ImplicitReflectionSerializer::class)
inline fun <reified A : RAction> deserializeAction(action: String): A? {
    val map = JSON.parse((StringSerializer to StringSerializer).map, action)
    return if (map["type"] == A::class.simpleName) JSON.nonstrict.parse(action) else null
}
