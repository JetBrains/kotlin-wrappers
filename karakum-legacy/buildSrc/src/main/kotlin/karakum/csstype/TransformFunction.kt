package karakum.csstype

import karakum.common.ConversionResult

private const val TRANSFORM = "Transform"
private const val TRANSFORM_FUNCTION = "TransformFunction"

private data class Parameter(
    val name: String,
    val type: String,
)

private class TransformFactory(
    val name: String,
    private val parameterNames: String,
    private val type: String = NUMBER,
) {
    val parameters by lazy {
        parameterNames.splitToSequence(", ")
            .map { Parameter(it, if (it == "a" && parameterNames.endsWith(", a")) ANGLE else type) }
            .toList()
    }

    companion object {
        val FACTORIES = listOf(
            TransformFactory("matrix", "a, b, c, d, tx, ty"),
            TransformFactory("matrix3d", "a1, b1, c1, d1, a2, b2, c2, d2, a3, b3, c3, d3, a4, b4, c4, d4"),
            TransformFactory("perspective", "d", LENGTH),
            TransformFactory("rotate", "a", ANGLE),
            TransformFactory("rotate3d", "a"),
            TransformFactory("rotate3d", "x, y, z, a", NUMBER /* a: ANGLE */),
            TransformFactory("rotatex", "a", ANGLE),
            TransformFactory("rotatey", "a", ANGLE),
            TransformFactory("rotatez", "a", ANGLE),
            TransformFactory("scale", "sx"),
            TransformFactory("scale", "sx, sy"),
            TransformFactory("scale3d", "sx, sy, sz"),
            TransformFactory("scalex", "sx"),
            TransformFactory("scaley", "sy"),
            TransformFactory("scalez", "sz"),
            TransformFactory("skew", "ax", ANGLE),
            TransformFactory("skew", "ax, ay", ANGLE),
            TransformFactory("skewx", "a", ANGLE),
            TransformFactory("skewy", "a", ANGLE),
            TransformFactory("translate", "tx", LENGTH),
            TransformFactory("translate", "tx, ty", LENGTH),
            TransformFactory("translate3d", "tx, ty, tz", LENGTH),
            TransformFactory("translatex", "tx", LENGTH),
            TransformFactory("translatey", "ty", LENGTH),
            TransformFactory("translatez", "tz", LENGTH),
        )
    }
}

internal fun TransformFunction(): ConversionResult {
    val declarations = sequenceOf(
        """
        sealed external interface $TRANSFORM_FUNCTION:
                $TRANSFORM
        """.trimIndent()
    ) + TransformFactory.FACTORIES
        .map { factory ->
            function(
                name = factory.name,
                returnType = TRANSFORM_FUNCTION,
                parameters = factory.parameters
                    .map { it.name to it.type }
                    .toTypedArray()
            )
        }

    return ConversionResult(
        name = TRANSFORM_FUNCTION,
        body = declarations.joinToString("\n\n"),
    )
}
