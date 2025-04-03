package js.reflect

actual inline fun <T : Any> unsafeCast(
    noinline value: () -> Unit,
): T =
    value.unsafeCast<T>()

actual inline fun <T : Any, P : Any> unsafeCast(
    noinline value: (P) -> Unit,
): T =
    value.unsafeCast<T>()
