// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.cssom

import js.reflect.unsafeCast

sealed external interface TextShadow

inline fun TextShadow(
    offsetX: Length,
    offsetY: Length,
): TextShadow =
    unsafeCast("$offsetX $offsetY")

inline fun TextShadow(
    offsetX: Length,
    offsetY: Length,
    color: Color,
): TextShadow =
    unsafeCast("$offsetX $offsetY $color")

inline fun TextShadow(
    offsetX: Length,
    offsetY: Length,
    blurRadius: Length,
): TextShadow =
    unsafeCast("$offsetX $offsetY $blurRadius")

inline fun TextShadow(
    offsetX: Length,
    offsetY: Length,
    blurRadius: Length,
    color: Color,
): TextShadow =
    unsafeCast("$offsetX $offsetY $blurRadius $color")
