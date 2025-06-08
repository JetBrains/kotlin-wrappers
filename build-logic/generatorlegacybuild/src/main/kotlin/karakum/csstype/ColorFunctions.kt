package karakum.csstype

import karakum.common.ConversionResult

private val RGB_PARAMETERS = arrayOf(
    "red" to "Int",
    "green" to "Int",
    "blue" to "Int",
    "alpha" to "Double",
)

private val OKLCH_PARAMETERS = arrayOf(
    "l" to PERCENTAGE,
    "c" to "Double",
    "h" to "Double",
    "a" to "Double",
)

internal fun colorFunctions(): ConversionResult {
    val declarations = sequenceOf(
        factory(
            COLOR,
            COLOR, // TODO: remove
            parameters = arrayOf(
                "value" to STRING,
            )
        )
    ).plus(
        sequenceOf(3, 4)
            .map { RGB_PARAMETERS.take(it).toTypedArray() }
            .map { parameters ->
                function(
                    name = "rgb",
                    returnType = COLOR,
                    parameters = parameters,
                    delimiter = " ",
                )
            }
    ).plus(
        sequenceOf(3, 4)
            .map { OKLCH_PARAMETERS.take(it).toTypedArray() }
            .map { parameters ->
                function(
                    name = "oklch",
                    returnType = COLOR,
                    parameters = parameters,
                    delimiter = " ",
                )
            }
    )

    return ConversionResult(
        name = "Color.functions",
        body = declarations.joinToString("\n\n"),
    )
}
