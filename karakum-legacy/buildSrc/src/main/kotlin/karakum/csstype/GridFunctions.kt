package karakum.csstype

import karakum.common.ConversionResult
import karakum.common.sealedUnionBody

private const val AUTO_REPEAT = "AutoRepeat"
private const val GRID_AUTO_TRACKS = "GridAutoTracks"
private const val GRID_TEMPLATE_TRACKS = "GridTemplateTracks"

internal fun AutoRepeat(): ConversionResult =
    ConversionResult(
        AUTO_REPEAT,
        sealedUnionBody(AUTO_REPEAT, listOf("auto-fill", "auto-fit")),
    )

internal fun gridFunctions(): ConversionResult {
    val declarations = sequenceOf(
        function(
            name = "fit-content",
            returnType = GRID_TEMPLATE_TRACKS,
            parameters = arrayOf(
                "value" to LENGTH,
            ),
        ),
        function(
            name = "minmax",
            returnType = GRID_AUTO_TRACKS,
            parameters = arrayOf(
                "min" to GRID_AUTO_TRACKS,
                "max" to GRID_AUTO_TRACKS,
            ),
        ),
    ) + sequenceOf(
        "times" to "Int",
        "repeat" to AUTO_REPEAT,
    ).map { firstParameter ->
        function(
            name = "repeat",
            returnType = GRID_TEMPLATE_TRACKS,
            parameters = arrayOf(
                firstParameter,
                "value" to GRID_TEMPLATE_TRACKS,
            )
        )
    }

    return ConversionResult(
        name = "Grid.functions",
        body = declarations.joinToString("\n\n"),
    )
}
