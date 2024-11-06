// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.cssom

import js.reflect.unsafeCast

sealed external interface NumberType :
    AnimationIterationCount,
    AspectRatio,
    Flex,
    FlexGrow,
    FlexShrink,
    LineHeight,
    Opacity,
    Scale,
    Zoom

inline fun number(
    value: Double,
): NumberType =
    unsafeCast(value)
