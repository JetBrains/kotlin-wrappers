package js.reflect

actual inline fun <T : JsAny> legacyUnsafeCast(
    value: Function<*>,
): T =
    value.toJsReference().unsafeCast()
