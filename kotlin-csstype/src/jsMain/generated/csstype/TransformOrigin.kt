// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package csstype

sealed external interface TransformOrigin

inline fun TransformOrigin(
    offsetX: GeometryPosition,
    offsetY: GeometryPosition,
): TransformOrigin =
    "$offsetX $offsetY".unsafeCast<TransformOrigin>()

inline fun TransformOrigin(
    offsetX: GeometryPosition,
    offsetY: GeometryPosition,
    offsetZ: Length,
): TransformOrigin =
    "$offsetX $offsetY $offsetZ".unsafeCast<TransformOrigin>()
