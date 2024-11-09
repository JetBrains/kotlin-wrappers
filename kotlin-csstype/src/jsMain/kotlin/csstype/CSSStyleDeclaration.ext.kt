@file:Suppress(
    "NOTHING_TO_INLINE",
)

package csstype

import js.reflect.unsafeCast
import web.cssom.CSSStyleDeclaration
import web.cssom.CustomPropertyName

operator fun <T : Any> CSSStyleDeclaration.get(
    name: CustomPropertyName<T>,
): T? {
    val value = getPropertyValue(
        property = unsafeCast(name),
    )

    return if (value.isNotEmpty()) {
        unsafeCast(value)
    } else null
}

inline operator fun <T : Any> CSSStyleDeclaration.set(
    name: CustomPropertyName<T>,
    value: T?,
) {
    setProperty(
        property = unsafeCast(name),
        value = unsafeCast(value),
    )
}
