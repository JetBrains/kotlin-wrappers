@file:Suppress(
    "NOTHING_TO_INLINE",
)

package js.reflect

inline fun <T: Any> unsafeCast(
    value: String,
): T =
    value.unsafeCast<T>()

inline fun <T: Any> unsafeCast(
    value: String?,
): T? =
    value.unsafeCast<T?>()

inline fun <T: Any> unsafeCast(
    value: Any,
): T =
    value.unsafeCast<T>()

inline fun <T: Any> unsafeCast(
    value: Any?,
): T? =
    value.unsafeCast<T?>()
