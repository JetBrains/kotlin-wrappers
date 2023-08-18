package csstype

import web.cssom.CSSStyleDeclaration
import web.cssom.CustomPropertyName

operator fun <T : Any> CSSStyleDeclaration.get(
    name: CustomPropertyName<T>,
): T? {
    val value = getPropertyValue(
        property = name.unsafeCast<String>(),
    )

    return if (value.isNotEmpty()) {
        value.unsafeCast<T>()
    } else null
}

inline operator fun <T : Any> CSSStyleDeclaration.set(
    name: CustomPropertyName<T>,
    value: T?,
) {
    setProperty(
        property = name.unsafeCast<String>(),
        value = value.unsafeCast<String?>(),
    )
}
