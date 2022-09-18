// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package csstype

sealed external interface TransformOrigin

inline fun TransformOrigin(
    xOffset: Length,
    yOffset: Length,
): TransformOrigin =
    "$xOffset $yOffset".unsafeCast<TransformOrigin>()

inline fun TransformOrigin(
    xOffsetKeyword: GeometryPosition,
    yOffset: Length,
): TransformOrigin =
    "$xOffsetKeyword $yOffset".unsafeCast<TransformOrigin>()

inline fun TransformOrigin(
    xOffsetKeyword: GeometryPosition,
    yOffsetKeyword: GeometryPosition,
): TransformOrigin =
    "$xOffsetKeyword $yOffsetKeyword".unsafeCast<TransformOrigin>()

inline fun TransformOrigin(
    xOffset: Length,
    yOffset: Length,
    zOffset: Length,
): TransformOrigin =
    "$xOffset $yOffset $zOffset".unsafeCast<TransformOrigin>()

inline fun TransformOrigin(
    xOffsetKeyword: GeometryPosition,
    yOffset: Length,
    zOffset: Length,
): TransformOrigin =
    "$xOffsetKeyword $yOffset $zOffset".unsafeCast<TransformOrigin>()

inline fun TransformOrigin(
    xOffsetKeyword: GeometryPosition,
    yOffsetKeyword: GeometryPosition,
    zOffset: Length,
): TransformOrigin =
    "$xOffsetKeyword $yOffsetKeyword $zOffset".unsafeCast<TransformOrigin>()
