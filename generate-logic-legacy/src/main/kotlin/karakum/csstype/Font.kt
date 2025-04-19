package karakum.csstype

internal const val FONT = "Font"

private val COMBINATIONS = listOf(
    listOf(0),
    listOf(1),
    listOf(2),
    listOf(3),
    listOf(0, 1),
    listOf(0, 2),
    listOf(0, 3),
    listOf(1, 2),
    listOf(1, 3),
    listOf(2, 3),
    listOf(0, 1, 2),
    listOf(0, 1, 3),
    listOf(1, 2, 3),
    listOf(0, 1, 2, 3),
)

private val PARAMETERS = listOf(
    "style" to "FontStyle",
    "variant" to "FontVariant",
    "weight" to "FontWeight",
    "stretch" to "FontStretch",
    "size" to "FontSize",
    "lineHeight" to "LineHeight",
    "family" to "FontFamily",
)

internal fun fontFactories(): String =
    COMBINATIONS.asSequence()
        .flatMap {
            sequenceOf(
                it + listOf(4, 6),
                it + listOf(4, 5, 6),
            )
        }
        .map { it.map(PARAMETERS::get).toTypedArray() }
        .joinToString("\n\n") { parameters ->
            factory(FONT, parameters)
        }
