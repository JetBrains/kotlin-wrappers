package js.reflect

expect fun <T : Any> unsafeCast(
    value: String,
): T

expect fun <T : Any> unsafeCast(
    value: String?,
): T?

expect fun <T> unsafeCast(
    value: Any?,
): T
