@file:Suppress(
    "NOTHING_TO_INLINE",
)

package csstype

inline fun Padding(
    value: String,
): Padding =
    value.unsafeCast<Padding>()

inline fun Padding(
    vertical: AutoLengthProperty,
    horizontal: AutoLengthProperty,
): Padding =
    Padding("$vertical $horizontal")

inline fun Padding(
    top: AutoLengthProperty,
    horizontal: AutoLengthProperty,
    bottom: AutoLengthProperty,
): Padding =
    Padding("$top $horizontal $bottom")

inline fun Padding(
    top: AutoLengthProperty,
    right: AutoLengthProperty,
    bottom: AutoLengthProperty,
    left: AutoLengthProperty,
): Padding =
    Padding("$top $right $bottom $left")
