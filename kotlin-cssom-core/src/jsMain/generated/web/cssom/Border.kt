// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.cssom

sealed external interface Border

inline fun Border(
    width: Length,
    style: LineStyle,
): Border =
    "$width $style".unsafeCast<Border>()

inline fun Border(
    width: Length,
    style: LineStyle,
    color: Color,
): Border =
    "$width $style $color".unsafeCast<Border>()
