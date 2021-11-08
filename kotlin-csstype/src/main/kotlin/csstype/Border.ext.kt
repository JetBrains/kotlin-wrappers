@file:Suppress(
    "NOTHING_TO_INLINE",
)

package csstype

inline fun Border(
    thickness: Length,
    style: LineStyle,
): Border =
    "$thickness $style".unsafeCast<Border>()

inline fun Border(
    thickness: Length,
    style: LineStyle,
    color: Color,
): Border =
    "$thickness $style $color".unsafeCast<Border>()
