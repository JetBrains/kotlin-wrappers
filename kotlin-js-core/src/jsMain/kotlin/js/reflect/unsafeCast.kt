package js.reflect

actual inline fun <T : Any> unsafeCast(
    value: String,
): T =
    value.unsafeCast<T>()

actual inline fun <T : Any> unsafeCast(
    value: String?,
): T? =
    value.unsafeCast<T?>()

actual inline fun <T : Any> unsafeCast(
    value: Int,
): T =
    value.unsafeCast<T>()

actual inline fun <T : Any> unsafeCast(
    value: Double,
): T =
    value.unsafeCast<T>()

actual inline fun <T : Any> unsafeCast(
    value: Any,
): T =
    value.unsafeCast<T>()

actual inline fun <T : Any> unsafeCast(
    value: Any?,
): T? =
    value.unsafeCast<T?>()
