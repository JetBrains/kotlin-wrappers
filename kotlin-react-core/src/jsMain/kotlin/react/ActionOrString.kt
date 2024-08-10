@file:Suppress(
    "NOTHING_TO_INLINE",
)

package react

@JsExternalInheritorsOnly
sealed external interface ActionOrString<in T>

inline fun ActionOrString<*>.asStringOrNull(): String? =
    asDynamic() as? String

inline fun <T> ActionOrString<T>.asActionOrNull(): Action<T>? =
    if (asDynamic() is Function<*>) {
        unsafeCast<Action<T>>()
    } else null
