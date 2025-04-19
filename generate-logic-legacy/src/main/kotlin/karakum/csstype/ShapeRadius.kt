package karakum.csstype

import karakum.common.ConversionResult
import karakum.common.sealedUnionBody

internal const val SHAPE_RADIUS = "ShapeRadius"
private val SHAPE_RADIUS_BODY = sealedUnionBody(
    SHAPE_RADIUS,
    listOf(
        "closest-side",
        "farthest-side",
    )
)

internal fun ShapeRadius(): ConversionResult =
    ConversionResult(
        name = SHAPE_RADIUS,
        body = SHAPE_RADIUS_BODY,
    )
