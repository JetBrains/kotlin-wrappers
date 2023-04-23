// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.cssom

sealed external interface TextShadow

inline fun TextShadow(
    offsetX: Length,
    offsetY: Length,
): TextShadow =
    "$offsetX $offsetY".unsafeCast<TextShadow>()

inline fun TextShadow(
    offsetX: Length,
    offsetY: Length,
    color: Color,
): TextShadow =
    "$offsetX $offsetY $color".unsafeCast<TextShadow>()

inline fun TextShadow(
    offsetX: Length,
    offsetY: Length,
    blurRadius: Length,
): TextShadow =
    "$offsetX $offsetY $blurRadius".unsafeCast<TextShadow>()

inline fun TextShadow(
    offsetX: Length,
    offsetY: Length,
    blurRadius: Length,
    color: Color,
): TextShadow =
    "$offsetX $offsetY $blurRadius $color".unsafeCast<TextShadow>()
