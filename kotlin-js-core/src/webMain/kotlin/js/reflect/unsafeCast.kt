package js.reflect

import kotlin.js.JsAny

expect fun <T : JsAny> unsafeCast(
    value: Boolean,
): T

expect fun <T : JsAny> unsafeCast(
    value: String,
): T

expect fun <T : JsAny> unsafeCast(
    value: String?,
): T?

expect fun <T : JsAny> unsafeCast(
    value: Int,
): T

expect fun <T : JsAny> unsafeCast(
    value: Double,
): T

expect fun <T : JsAny> unsafeCast(
    value: JsAny,
): T

expect fun <T : JsAny> unsafeCast(
    value: JsAny?,
): T?
