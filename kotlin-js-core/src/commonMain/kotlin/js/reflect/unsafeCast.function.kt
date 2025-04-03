package js.reflect

import js.core.JsAny

expect fun <T : JsAny> unsafeCast(
    value: () -> Unit,
): T

expect fun <T : JsAny, P : JsAny> unsafeCast(
    value: (P) -> Unit,
): T
