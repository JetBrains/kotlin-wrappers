@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.cssom

inline fun <T : Any> fallback(
    vararg values: T,
): T =
    values.unsafeCast<T>()
