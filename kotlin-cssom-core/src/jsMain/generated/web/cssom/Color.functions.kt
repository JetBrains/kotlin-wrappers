// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.cssom

import js.reflect.unsafeCast

inline fun Color(
    value: String,
): Color =
    unsafeCast(value)

inline fun rgb(
    red: Int,
    green: Int,
    blue: Int,
): Color =
    unsafeCast("rgb($red $green $blue)")

inline fun rgb(
    red: Int,
    green: Int,
    blue: Int,
    alpha: Double,
): Color =
    unsafeCast("rgb($red $green $blue / $alpha)")

inline fun oklch(
    l: Percentage,
    c: Double,
    h: Double,
): Color =
    unsafeCast("oklch($l $c $h)")

inline fun oklch(
    l: Percentage,
    c: Double,
    h: Double,
    a: Double,
): Color =
    unsafeCast("oklch($l $c $h / $a)")
