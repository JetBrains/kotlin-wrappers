package js.reflect

actual inline fun <T : Any> legacyUnsafeCast(
    value: Function<*>,
): T =
    value.unsafeCast<T>()
