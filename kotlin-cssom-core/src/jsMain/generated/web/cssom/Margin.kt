// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.cssom

import js.reflect.unsafeCast

typealias Margin = AutoLengthProperty

inline fun Margin(
    vertical: AutoLength,
    horizontal: AutoLength,
): Margin =
    unsafeCast("$vertical $horizontal")

inline fun Margin(
    top: AutoLength,
    horizontal: AutoLength,
    bottom: AutoLength,
): Margin =
    unsafeCast("$top $horizontal $bottom")

inline fun Margin(
    top: AutoLength,
    right: AutoLength,
    bottom: AutoLength,
    left: AutoLength,
): Margin =
    unsafeCast("$top $right $bottom $left")
