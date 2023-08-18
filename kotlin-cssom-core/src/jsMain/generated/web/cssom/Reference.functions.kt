// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.cssom

inline fun attr(
    name: String,
): Content =
    "attr($name)".unsafeCast<Content>()

inline fun <T : Any> env(
    id: Ident,
): T =
    "env($id)".unsafeCast<T>()

inline fun <T : Any> env(
    id: Ident,
    fallback: T,
): T =
    "env($id,$fallback)".unsafeCast<T>()

inline fun url(
    value: String,
): Url =
    "url($value)".unsafeCast<Url>()

inline fun <T : Any> `var`(
    name: CustomPropertyName<T>,
): T? =
    "var($name)".unsafeCast<T?>()

inline fun <T : Any> `var`(
    name: CustomPropertyName<T>,
    fallback: T,
): T =
    "var($name,$fallback)".unsafeCast<T>()
