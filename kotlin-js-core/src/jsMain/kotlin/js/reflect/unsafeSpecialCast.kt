package js.reflect

inline fun <T> unsafeSpecialCast(
    value: Any?,
): T =
    value.unsafeCast<T>()

inline fun <T> unsafeSpecialCast(
    value: Function<*>,
): T =
    value.unsafeCast<T>()
