package karakum.csstype

import karakum.common.ConversionResult

internal const val GRADIENT = "Gradient"

private const val LINEAR_GRADIENT = "linear-gradient"
private const val REPEATING_LINEAR_GRADIENT = "repeating-linear-gradient"

// source - https://developer.mozilla.org/en-US/docs/Web/CSS/gradient
private val PARENT_TYPES = setOf(
    IMAGE,
)

internal fun Gradient(): ConversionResult {
    val declarations = listOf(
        "sealed external interface $GRADIENT:\n" +
                PARENT_TYPES.joinToString(",\n"),
        function(
            name = LINEAR_GRADIENT,
            returnType = GRADIENT,
            parameters = arrayOf(
                "stops" to LINEAR_COLOR_STOP,
            )
        ),
        function(
            name = LINEAR_GRADIENT,
            returnType = GRADIENT,
            parameters = arrayOf(
                "angle" to ANGLE,
                "stops" to LINEAR_COLOR_STOP,
            )
        ),
        function(
            name = REPEATING_LINEAR_GRADIENT,
            returnType = GRADIENT,
            parameters = arrayOf(
                "stops" to LINEAR_COLOR_STOP,
            )
        ),
        function(
            name = REPEATING_LINEAR_GRADIENT,
            returnType = GRADIENT,
            parameters = arrayOf(
                "angle" to ANGLE,
                "stops" to LINEAR_COLOR_STOP,
            )
        ),
    )

    return ConversionResult(
        name = GRADIENT,
        body = declarations.joinToString("\n\n")
    )
}
