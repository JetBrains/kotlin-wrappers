package js.reflect

inline fun <T> unsafeSpecialCast(
    value: Any?,
): T =
    value.unsafeCast<T>()
