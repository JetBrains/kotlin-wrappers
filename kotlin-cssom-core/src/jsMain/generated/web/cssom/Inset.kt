// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.cssom

import js.reflect.unsafeCast

typealias Inset = AutoLengthProperty

inline fun Inset(
    vertical: AutoLength,
    horizontal: AutoLength,
): Inset =
    unsafeCast("$vertical $horizontal")

inline fun Inset(
    top: AutoLength,
    horizontal: AutoLength,
    bottom: AutoLength,
): Inset =
    unsafeCast("$top $horizontal $bottom")

inline fun Inset(
    top: AutoLength,
    right: AutoLength,
    bottom: AutoLength,
    left: AutoLength,
): Inset =
    unsafeCast("$top $right $bottom $left")
