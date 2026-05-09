package js.reflect

expect fun <T : JsAny> legacyUnsafeCast(
    value: Function<*>,
): T
