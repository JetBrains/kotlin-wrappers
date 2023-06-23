@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.cssom

inline fun ScrollbarColor(
    thumbColor: Color,
    trackColor: Color,
): ScrollbarColor =
    "$thumbColor $trackColor".unsafeCast<ScrollbarColor>()
