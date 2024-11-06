// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.cssom

import js.reflect.unsafeCast

inline fun attr(
    name: String,
): Content =
    unsafeCast("attr($name)")

inline fun <T : Any> env(
    id: Ident,
): T =
    unsafeCast("env($id)")

inline fun <T : Any> env(
    id: Ident,
    fallback: T,
): T =
    unsafeCast("env($id,$fallback)")

inline fun url(
    value: String,
): Url =
    unsafeCast("url($value)")

inline fun <T : Any> `var`(
    name: CustomPropertyName<T>,
): T =
    unsafeCast("var($name)")

inline fun <T : Any> `var`(
    name: CustomPropertyName<T>,
    fallback: T,
): T =
    unsafeCast("var($name,$fallback)")
