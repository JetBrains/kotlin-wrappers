package react

import js.reflect.unsafeCast
import js.reflect.upcast

@JsExternalInheritorsOnly
sealed external interface ActionOrString<in T>

inline fun ActionOrString<*>.asStringOrNull(): String? =
    upcast<Any>() as? String

inline fun <T> ActionOrString<T>.asActionOrNull(): Action<T>? =
    if (upcast<Any>() is Function<*>) {
        unsafeCast<Action<T>>(this)
    } else null
