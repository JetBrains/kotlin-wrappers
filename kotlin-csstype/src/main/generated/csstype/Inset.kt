// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package csstype

typealias Inset = AutoLengthProperty

inline fun Inset(
    vertical: AutoLengthProperty,
    horizontal: AutoLengthProperty,
): Inset =
    "$vertical $horizontal".unsafeCast<Inset>()

inline fun Inset(
    top: AutoLengthProperty,
    horizontal: AutoLengthProperty,
    bottom: AutoLengthProperty,
): Inset =
    "$top $horizontal $bottom".unsafeCast<Inset>()

inline fun Inset(
    top: AutoLengthProperty,
    right: AutoLengthProperty,
    bottom: AutoLengthProperty,
    left: AutoLengthProperty,
): Inset =
    "$top $right $bottom $left".unsafeCast<Inset>()
