// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package csstype

sealed external interface NumberType :
    AnimationIterationCount,
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
    value.unsafeCast<NumberType>()
