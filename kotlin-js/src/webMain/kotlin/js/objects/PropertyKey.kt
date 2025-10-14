package js.objects

import js.reflect.JsExternalInheritorsOnly
import js.reflect.unsafeCast

@JsExternalInheritorsOnly
external interface PropertyKey

inline fun PropertyKey(
    value: String,
): PropertyKey =
    unsafeCast(value)
