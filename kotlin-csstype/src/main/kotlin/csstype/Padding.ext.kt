@file:Suppress(
    "NOTHING_TO_INLINE",
)

package csstype

inline fun Padding(
    vertical: AutoLengthProperty,
    horizontal: AutoLengthProperty,
): Padding =
    "$vertical $horizontal".unsafeCast<Padding>()

inline fun Padding(
    top: AutoLengthProperty,
    horizontal: AutoLengthProperty,
    bottom: AutoLengthProperty,
): Padding =
    "$top $horizontal $bottom".unsafeCast<Padding>()

inline fun Padding(
    top: AutoLengthProperty,
    right: AutoLengthProperty,
    bottom: AutoLengthProperty,
    left: AutoLengthProperty,
): Padding =
    "$top $right $bottom $left".unsafeCast<Padding>()
