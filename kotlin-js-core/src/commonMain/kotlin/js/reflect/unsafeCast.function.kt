package js.reflect

import js.core.JsAny

expect fun <T : JsAny> unsafeCast(
    value: () -> Unit,
): T

expect fun <T : JsAny> unsafeCast(
    provider: () -> JsAny?,
): T

expect fun <T : JsAny, P1 : JsAny?> unsafeCast(
    value: (P1) -> Unit,
): T

expect fun <T : JsAny, P1 : JsAny?> unsafeCast(
    provider: (P1) -> JsAny?,
): T
