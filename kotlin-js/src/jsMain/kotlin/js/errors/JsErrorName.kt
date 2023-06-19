@file:Suppress(
    "NOTHING_TO_INLINE",
)

package js.errors

sealed external interface JsErrorName

inline fun JsErrorName(
    value: String,
): JsErrorName =
    value.unsafeCast<JsErrorName>()
