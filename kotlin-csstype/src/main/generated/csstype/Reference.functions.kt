// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package csstype

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
