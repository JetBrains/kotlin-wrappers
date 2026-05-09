package js.reflect.internal

import js.objects.PropertyKey
import js.reflect.Reflect
import js.reflect.unsafeCast

internal fun kotlinGet(
    target: JsAny,
    propertyKey: PropertyKey,
): Any? {
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
