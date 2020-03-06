@file:Suppress("unused")

package redux

import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.json.*

@UnstableDefault
@ImplicitReflectionSerializer
inline fun <reified A : RAction> serializeAction(action: A): String {
    return "{\"type\":\"${A::class.simpleName}\",${Json.stringify(action).drop(1)}"
}

@UnstableDefault
@ImplicitReflectionSerializer
inline fun <reified A : RAction> deserializeAction(action: String): A? {
    val t = String.serializer() to String.serializer()
    val map = Json.parse(MapSerializer(t.first, t.second), action)
    return if (map["type"] == A::class.simpleName) Json.nonstrict.parse(action) else null
}
