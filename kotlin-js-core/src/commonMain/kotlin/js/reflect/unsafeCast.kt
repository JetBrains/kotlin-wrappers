package js.reflect

import js.core.JsAny

expect fun <T : JsAny> unsafeCast(
    value: String,
): T

expect fun <T : JsAny> unsafeCast(
    value: String?,
): T?

expect fun <T : JsAny> unsafeCast(
    value: JsAny,
): T

expect fun <T : JsAny> unsafeCast(
    value: JsAny?,
): T?
