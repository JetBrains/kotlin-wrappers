@file:Suppress(
    "NOTHING_TO_INLINE",
)

package csstype

inline fun Margin(
    value: String,
): Margin =
    value.unsafeCast<Margin>()

inline fun Margin(
    vertical: AutoLengthProperty,
    horizontal: AutoLengthProperty,
): Margin =
    Margin("$vertical $horizontal")

inline fun Margin(
    top: AutoLengthProperty,
    horizontal: AutoLengthProperty,
    bottom: AutoLengthProperty,
): Margin =
    Margin("$top $horizontal $bottom")

inline fun Margin(
    top: AutoLengthProperty,
    right: AutoLengthProperty,
    bottom: AutoLengthProperty,
    left: AutoLengthProperty,
): Margin =
    Margin("$top $right $bottom $left")
