package karakum.csstype

import karakum.common.ConversionResult

private const val FILTER_FUNCTION = "FilterFunction"

private val PARENT_TYPES = listOf(
    "Filter",
    "BackdropFilter",
)

private class FilterFactory(
    val name: String,
    val types: Array<out String>,
) {
    companion object {
        val FACTORIES = listOf(
            FilterFactory("blur", "Int", "Double", LENGTH),
            FilterFactory("brightness", "Int", "Double", PERCENTAGE),
            FilterFactory("contrast", "Int", "Double", PERCENTAGE),
            FilterFactory("drop-shadow"),
            FilterFactory("grayscale", "Int", "Double", PERCENTAGE),
            FilterFactory("hue-rotate", "Int", "Double", ANGLE),
            FilterFactory("invert", "Int", "Double", PERCENTAGE),
            FilterFactory("opacity", "Int", "Double", PERCENTAGE),
            FilterFactory("saturate", "Int", "Double", PERCENTAGE),
            FilterFactory("sepia", "Int", "Double", PERCENTAGE),
        )
    }
}

private val DROP_SHADOW_PARAMETERS = arrayOf(
    "offsetX" to LENGTH,
    "offsetY" to LENGTH,
    "blurRadius" to LENGTH,
    "color" to COLOR,
)

private fun FilterFactory(
    name: String,
    vararg types: String,
): FilterFactory =
    FilterFactory(name, types)

internal fun FilterFunction(): ConversionResult {
    val declarations = sequenceOf(
        """
        sealed external interface $FILTER_FUNCTION:
                ${PARENT_TYPES.joinToString(",\n")}
        """.trimIndent(),
    ) + FilterFactory.FACTORIES
        .flatMap { f ->
            when (f.name) {
                "drop-shadow" -> (2..4)
                    .map { f.name to DROP_SHADOW_PARAMETERS.sliceArray(0..(it - 1)) }

                else -> f.types.map { f.name to arrayOf("value" to it) }
            }
        }
        .map { (name, parameters) -> function(name, FILTER_FUNCTION, parameters, " ") }

    return ConversionResult(
        name = FILTER_FUNCTION,
        body = declarations.joinToString("\n\n"),
    )
}
