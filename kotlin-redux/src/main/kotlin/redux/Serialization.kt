@file:Suppress("unused")

package redux

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.*

val defaultJson = Json {
    isLenient = true
    ignoreUnknownKeys = true
    allowSpecialFloatingPointValues = true
    useArrayPolymorphism = true
}

inline fun <reified A : RAction> serializeAction(action: A): String {
    var obj = defaultJson.encodeToJsonElement(action) as JsonObject
    obj = JsonObject(obj + ("type" to JsonPrimitive(A::class.simpleName)))
    return defaultJson.encodeToString(obj)
}

inline fun <reified A : RAction> deserializeAction(action: String): A? {
    val obj = defaultJson.parseToJsonElement(action) as JsonObject
    val type: String? = obj["type"]?.jsonPrimitive?.contentOrNull
    return if (type == A::class.simpleName) {
        defaultJson.decodeFromString(action)
    } else {
        null
    }
}
