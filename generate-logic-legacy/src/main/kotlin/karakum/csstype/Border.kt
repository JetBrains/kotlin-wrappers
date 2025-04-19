package karakum.csstype

internal const val BORDER = "Border"
internal const val OUTLINE = "Outline"
internal const val OUTLINE_STYLE = "OutlineStyle"

private val PARAMETERS = listOf(
    "width" to LENGTH,
    "style" to "LineStyle",
    "color" to COLOR,
)

internal fun borderFactories(
    type: String,
): String =
    sequenceOf(2, 3)
        .map { PARAMETERS.take(it).toTypedArray() }
        .joinToString("\n\n") { parameters ->
            factory(type, parameters)
        }
