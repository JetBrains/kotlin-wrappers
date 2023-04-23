package csstype

import web.cssom.CSSStyleDeclaration
import web.cssom.Variable

operator fun <T : Any> CSSStyleDeclaration.get(
    variable: Variable<T>,
): T? {
    val value = getPropertyValue(
        property = variable.unsafeCast<String>(),
    )

    return if (value.isNotEmpty()) {
        value.unsafeCast<T>()
    } else null
}

inline operator fun <T : Any> CSSStyleDeclaration.set(
    variable: Variable<T>,
    value: T?,
) {
    setProperty(
        property = variable.unsafeCast<String>(),
        value = value.unsafeCast<String?>(),
    )
}
