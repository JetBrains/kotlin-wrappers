package js.reflect

import kotlin.js.JsAny
import kotlin.reflect.KProperty1

fun <T : JsAny, V : JsAny> safeGet(
    target: T,
    property: KProperty1<T, V>,
): V? =
    if (Reflect.has(target, property.name)) {
        property.get(target)
    } else {
        null
    }
