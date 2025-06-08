package karakum.csstype

import karakum.common.ConversionResult

internal const val BASIC_SHAPE = "BasicShape"
private val BASIC_SHAPE_BODY = """
sealed external interface $BASIC_SHAPE:
    ClipPath,
    ShapeOutside,
    OffsetPath
""".trimIndent()

internal fun BasicShape(): ConversionResult =
    ConversionResult(
        name = BASIC_SHAPE,
        body = BASIC_SHAPE_BODY,
    )
