@file:Suppress(
    "NOTHING_TO_INLINE",
)

package csstype

inline fun Content(
    value: String,
): Content =
    "'$value'".unsafeCast<Content>()

inline fun Content(
    value: Int,
): Content =
    "'$value'".unsafeCast<Content>()
