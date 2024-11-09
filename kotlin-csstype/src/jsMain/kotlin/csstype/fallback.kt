@file:Suppress(
    "NOTHING_TO_INLINE",
)

package csstype

import js.reflect.unsafeCast

inline fun <T : Any> fallback(
    vararg values: T,
): T =
    unsafeCast(values)
