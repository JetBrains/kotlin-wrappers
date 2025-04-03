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
    noinline value: () -> Unit,
): T =
    value.unsafeCast<T>()

actual inline fun <T : Any, R : Any> unsafeCast(
    noinline value: () -> R,
): T =
    value.unsafeCast<T>()

actual inline fun <T : Any, P : Any> unsafeCast(
    noinline value: (P) -> Unit,
): T =
    value.unsafeCast<T>()

actual inline fun <T : Any, P : Any> unsafeCast(
    noinline value: (P) -> Double,
): T =
    value.unsafeCast<T>()

actual inline fun <T : Any, P : Any, R : Any> unsafeCast(
    noinline value: (P) -> R,
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
