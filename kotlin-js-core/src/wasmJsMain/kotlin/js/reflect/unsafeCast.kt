package js.reflect

actual inline fun <T : JsAny> unsafeCast(
    value: String,
): T =
    value.toJsString().unsafeCast()

actual fun <T : JsAny> unsafeCast(
    value: String?,
): T? =
    if (value != null) {
        unsafeCast(value)
    } else null

actual inline fun <T : JsAny> unsafeCast(
    value: Int,
): T =
    value.toJsNumber().unsafeCast()

actual inline fun <T : JsAny> unsafeCast(
    value: Double,
): T =
    value.toJsNumber().unsafeCast()

actual fun <T : JsAny> unsafeCast(
    value: () -> Unit,
): T = js("value")

actual fun <T : JsAny, R : JsAny> unsafeCast(
    value: () -> R,
): T = js("value")

actual fun <T : JsAny, P : JsAny> unsafeCast(
    value: (P) -> Unit,
): T = js("value")

actual fun <T : JsAny, P : JsAny> unsafeCast(
    value: (P) -> Double,
): T = js("value")

actual fun <T : JsAny, P : JsAny, R : JsAny> unsafeCast(
    value: (P) -> R,
): T = js("value")

actual inline fun <T : JsAny> unsafeCast(
    value: JsAny,
): T =
    value.unsafeCast()

actual fun <T : JsAny> unsafeCast(
    value: JsAny?,
): T? =
    value?.unsafeCast()
