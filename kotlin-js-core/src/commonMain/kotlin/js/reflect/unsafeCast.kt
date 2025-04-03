package js.reflect

import js.core.JsAny

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
    value: () -> Unit,
): T

expect fun <T : JsAny, R : JsAny> unsafeCast(
    value: () -> R,
): T

expect fun <T : JsAny, P : JsAny> unsafeCast(
    value: (P) -> Unit,
): T

expect fun <T : JsAny, P : JsAny> unsafeCast(
    value: (P) -> Double,
): T

expect fun <T : JsAny, P : JsAny, R : JsAny> unsafeCast(
    value: (P) -> R,
): T

expect fun <T : JsAny> unsafeCast(
    value: JsAny,
): T

expect fun <T : JsAny> unsafeCast(
    value: JsAny?,
): T?
