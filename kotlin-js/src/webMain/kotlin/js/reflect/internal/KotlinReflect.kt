package js.reflect.internal

import js.objects.PropertyKey
import js.reflect.Reflect
import js.reflect.unsafeCast
import kotlin.js.JsAny
import kotlin.js.JsReference
import kotlin.js.get
import kotlin.js.toJsReference

internal fun kotlinGet(
    target: JsAny,
    propertyKey: PropertyKey,
): JsAny? {
    val value = Reflect.get(target, propertyKey)
        ?: return null

    return unsafeCast<JsReference<JsAny>>(value).get()
}

internal fun kotlinSet(
    target: JsAny,
    propertyKey: PropertyKey,
    value: Any?,
) {
    Reflect.set(target, propertyKey, value?.toJsReference())
}
