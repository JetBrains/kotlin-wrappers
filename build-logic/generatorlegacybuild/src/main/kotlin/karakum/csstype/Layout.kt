package karakum.csstype

internal val LAYOUT_CLASSES = setOf(
    "Inset",
    "Margin",
    "Padding",
)

internal val LAYOUT_PARAMETERS = listOf(
    listOf("value"),
    listOf("vertical", "horizontal"),
    listOf("top", "horizontal", "bottom"),
    listOf("top", "right", "bottom", "left"),
)

private val PARAMETERS = LAYOUT_PARAMETERS.drop(1)

internal fun layoutFactories(name: String): String {
    val parameterType = when (name) {
        "Padding" -> LENGTH
        else -> AUTO_LENGTH
    }

    return PARAMETERS.asSequence()
        .map { names -> names.map { it to parameterType } }
        .map { factory(name, it.toTypedArray()) }
        .joinToString("\n\n")
}
