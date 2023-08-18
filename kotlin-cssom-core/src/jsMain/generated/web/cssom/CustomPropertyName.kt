// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.cssom

sealed external interface CustomPropertyName<T : Any>

inline fun <T : Any> CustomPropertyName(
    name: String,
): CustomPropertyName<T> =
    name.unsafeCast<CustomPropertyName<T>>()
