@file:Suppress(
    "NOTHING_TO_INLINE",
)

package csstype

inline fun <T : Any> fallback(
    vararg values: T,
): T =
    values.unsafeCast<T>()
