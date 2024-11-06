// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.cssom

import js.reflect.unsafeCast

typealias Padding = LengthProperty

inline fun Padding(
    vertical: Length,
    horizontal: Length,
): Padding =
    unsafeCast("$vertical $horizontal")

inline fun Padding(
    top: Length,
    horizontal: Length,
    bottom: Length,
): Padding =
    unsafeCast("$top $horizontal $bottom")

inline fun Padding(
    top: Length,
    right: Length,
    bottom: Length,
    left: Length,
): Padding =
    unsafeCast("$top $right $bottom $left")
