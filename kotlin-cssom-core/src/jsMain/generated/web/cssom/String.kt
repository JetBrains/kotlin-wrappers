// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.cssom

import js.reflect.unsafeCast

sealed external interface StringType :
    Content,
    FontFamily

inline fun string(
    value: String,
): StringType =
    unsafeCast(value)
