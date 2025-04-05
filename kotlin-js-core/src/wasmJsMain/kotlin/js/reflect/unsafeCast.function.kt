package js.reflect

actual fun <T : JsAny> unsafeCast(
    value: () -> Unit,
): T = js("value")

actual fun <T : JsAny> unsafeCast(
    provider: () -> JsAny?,
): T = js("value")

actual fun <T : JsAny, P1 : JsAny?> unsafeCast(
    value: (P1) -> Unit,
): T = js("value")

actual fun <T : JsAny, P1 : JsAny?> unsafeCast(
    provider: (P1) -> JsAny?,
): T = js("value")
