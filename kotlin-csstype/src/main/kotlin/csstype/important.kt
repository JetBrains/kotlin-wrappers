@file:Suppress(
    "NOTHING_TO_INLINE",
)

package csstype

inline fun <T : Any> important(
    value: T,
): T =
    "$value !important".unsafeCast<T>()
