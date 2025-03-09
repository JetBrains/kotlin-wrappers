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

actual inline fun <T : JsAny> unsafeCast(
    value: JsAny,
): T =
    value.unsafeCast()

actual fun <T : JsAny> unsafeCast(
    value: JsAny?,
): T? =
    value?.unsafeCast()
