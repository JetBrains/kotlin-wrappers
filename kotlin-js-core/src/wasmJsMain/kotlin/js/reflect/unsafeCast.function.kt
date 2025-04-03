package js.reflect

actual fun <T : JsAny> unsafeCast(
    value: () -> Unit,
): T = js("value")

actual fun <T : JsAny, P : JsAny> unsafeCast(
    value: (P) -> Unit,
): T = js("value")
