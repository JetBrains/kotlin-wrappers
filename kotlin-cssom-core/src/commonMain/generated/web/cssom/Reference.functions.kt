// Automatically generated - do not modify!

package web.cssom

import js.core.JsAny
import js.reflect.unsafeCast

inline fun attr(
    name: String,
): Content =
    unsafeCast("attr($name)")

inline fun <T : JsAny> env(
    id: Ident,
): T =
    unsafeCast("env($id)")

inline fun <T : JsAny> env(
    id: Ident,
    fallback: T,
): T =
    unsafeCast("env($id,$fallback)")

inline fun url(
    value: String,
): Url =
    unsafeCast("url($value)")

inline fun <T : JsAny> `var`(
    name: CustomPropertyName<T>,
): T =
    unsafeCast("var($name)")

inline fun <T : JsAny> `var`(
    name: CustomPropertyName<T>,
    fallback: T,
): T =
    unsafeCast("var($name,$fallback)")
