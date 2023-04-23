@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.cssom

inline fun <T : Any> important(
    value: T,
): T =
    "$value !important".unsafeCast<T>()
