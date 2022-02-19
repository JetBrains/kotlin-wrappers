// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package csstype

typealias Margin = AutoLengthProperty

inline fun Margin(
    vertical: AutoLengthProperty,
    horizontal: AutoLengthProperty,
): Margin =
    "$vertical $horizontal".unsafeCast<Margin>()

inline fun Margin(
    top: AutoLengthProperty,
    horizontal: AutoLengthProperty,
    bottom: AutoLengthProperty,
): Margin =
    "$top $horizontal $bottom".unsafeCast<Margin>()

inline fun Margin(
    top: AutoLengthProperty,
    right: AutoLengthProperty,
    bottom: AutoLengthProperty,
    left: AutoLengthProperty,
): Margin =
    "$top $right $bottom $left".unsafeCast<Margin>()
