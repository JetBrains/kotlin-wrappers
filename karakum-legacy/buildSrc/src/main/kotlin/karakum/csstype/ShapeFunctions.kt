package karakum.csstype

import karakum.common.ConversionResult

internal fun shapeFunctions(): ConversionResult {
    val declarations = circleFunctions()
        .plus(ellipseFunctions())
        .plus(insetFunctions())
        .plus(pathFunctions())

    return ConversionResult(
        name = "Shape.functions",
        body = declarations.joinToString("\n\n"),
    )
}

private val R = "r" to SHAPE_RADIUS
private val RX = "rx" to SHAPE_RADIUS
private val RY = "ry" to SHAPE_RADIUS

private val C = "c" to GEOMETRY_POSITION
private val CX = "cx" to GEOMETRY_POSITION
private val CY = "cy" to GEOMETRY_POSITION

private fun circleFunctions(): Sequence<String> =
    sequenceOf(
        emptyList(),
        listOf(R),
        listOf(R, C),
        listOf(R, CX, CY),
    ).map { it.toTypedArray() }
        .map { parameters ->
            function(
                name = "circle",
                returnType = BASIC_SHAPE,
                parameters = parameters,
                delimiter = " ",
            )
        }

private fun ellipseFunctions(): Sequence<String> =
    sequenceOf(
        emptyList(),
        listOf(RX, RY),
        listOf(RX, RY, C),
        listOf(RX, RY, CX, CY),
    ).map { it.toTypedArray() }
        .map { parameters ->
            function(
                name = "ellipse",
                returnType = BASIC_SHAPE,
                parameters = parameters,
                delimiter = " ",
            )
        }

private val ROUND_PARAMETERS = listOf(
    "round" to "Round",
    "borderRadius" to LENGTH,
)

private fun insetFunctions(): Sequence<String> {
    val basicParameters = LAYOUT_PARAMETERS.drop(1)
        .map { it.map { it to LENGTH } }

    val roundParameters = LAYOUT_PARAMETERS
        .map { it.map { it to LENGTH } }
        .map { it + ROUND_PARAMETERS }

    return (basicParameters + roundParameters)
        .asSequence()
        .map { it.toTypedArray() }
        .map { parameters ->
            function(
                name = "inset",
                returnType = BASIC_SHAPE,
                parameters = parameters,
                delimiter = " ",
            )
        }
}

private val D = "d" to STRING

private fun pathFunctions(): Sequence<String> =
    sequenceOf(
        listOf(D),
    ).map { it.toTypedArray() }
        .map { parameters ->
            function(
                name = "path",
                returnType = BASIC_SHAPE,
                parameters = parameters,
                delimiter = " ",
            )
        }
