// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.cssom

inline fun Color(
    value: String,
): Color =
    value.unsafeCast<Color>()

inline fun rgb(
    red: Int,
    green: Int,
    blue: Int,
): Color =
    "rgb($red $green $blue)".unsafeCast<Color>()

inline fun rgb(
    red: Int,
    green: Int,
    blue: Int,
    alpha: Double,
): Color =
    "rgb($red $green $blue / $alpha)".unsafeCast<Color>()

inline fun oklch(
    l: Percentage,
    c: Double,
    h: Double,
): Color =
    "oklch($l $c $h)".unsafeCast<Color>()

inline fun oklch(
    l: Percentage,
    c: Double,
    h: Double,
    a: Double,
): Color =
    "oklch($l $c $h / $a)".unsafeCast<Color>()
