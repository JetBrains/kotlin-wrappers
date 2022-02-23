// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package csstype

sealed external interface StringType :
    Content,
    FontFamily

inline fun string(
    value: String,
): StringType =
    value.unsafeCast<StringType>()
