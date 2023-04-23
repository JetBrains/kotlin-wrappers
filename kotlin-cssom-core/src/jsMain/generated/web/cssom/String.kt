// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.cssom

sealed external interface StringType :
    Content,
    FontFamily

inline fun string(
    value: String,
): StringType =
    value.unsafeCast<StringType>()
