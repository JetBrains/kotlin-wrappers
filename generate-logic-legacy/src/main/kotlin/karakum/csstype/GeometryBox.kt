package karakum.csstype

import karakum.common.ConversionResult
import karakum.common.sealedUnionBody

internal const val GEOMETRY_BOX = "GeometryBox"
private val GEOMETRY_BOX_BODY = sealedUnionBody(
    GEOMETRY_BOX,
    listOf(
        "border-box",
        "padding-box",
        "content-box",
        "margin-box",
    )
).replaceFirst(GEOMETRY_BOX, "$GEOMETRY_BOX : $BASIC_SHAPE")

internal fun GeometryBox(): ConversionResult =
    ConversionResult(
        name = GEOMETRY_BOX,
        body = GEOMETRY_BOX_BODY,
    )
