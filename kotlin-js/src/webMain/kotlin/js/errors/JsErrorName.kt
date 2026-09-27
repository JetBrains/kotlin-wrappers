package js.errors

import js.internal.InternalApi
import js.reflect.unsafeCast

@SubclassOptInRequired(InternalApi::class)
external interface JsErrorName

inline fun JsErrorName(
    value: String,
): JsErrorName =
    unsafeCast(value)
