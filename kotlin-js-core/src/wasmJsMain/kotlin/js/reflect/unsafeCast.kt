@file:Suppress(
    "UPPER_BOUND_VIOLATED",
    "TYPE_MISMATCH",
)

package js.reflect

actual inline fun <T : Any> unsafeCast(
    value: String,
): T =
    value.toJsString().unsafeCast<T>()

actual inline fun <T : Any> unsafeCast(
    value: String?,
): T? =
    value?.toJsString()?.unsafeCast<T?>()

actual inline fun <T> unsafeCast(
    value: Any?,
): T =
    value?.toJsReference()?.unsafeCast<T>()
