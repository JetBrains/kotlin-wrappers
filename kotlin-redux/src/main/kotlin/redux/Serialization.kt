@file:Suppress("unused")

package redux

import kotlinx.serialization.*
import kotlinx.serialization.json.*

val defaultJson = Json(
    JsonConfiguration.Stable.copy(
        isLenient = true,
        ignoreUnknownKeys = true,
        serializeSpecialFloatingPointValues = true,
        useArrayPolymorphism = true
    )
)

@ImplicitReflectionSerializer
inline fun <reified A : RAction> serializeAction(action: A): String {
    var obj = defaultJson.toJson(action) as JsonObject
    obj = JsonObject(obj + ("type" to JsonPrimitive(A::class.simpleName)))
    return defaultJson.stringify(obj)
}

@ImplicitReflectionSerializer
inline fun <reified A : RAction> deserializeAction(action: String): A? {
    val obj = defaultJson.parseJson(action) as JsonObject
    val type: String? = obj.getPrimitiveOrNull("type")?.contentOrNull
    return if (type == A::class.simpleName) {
        defaultJson.parse(action)
    } else {
        null
    }
}
