package karakum.csstype

internal const val TEXT_SHADOW = "TextShadow"

private val COLOR_PARAMETER = "color" to COLOR

private val PARAMETERS = setOf(
    "offsetX",
    "offsetY",
    "blurRadius",
)

internal fun textShadowFactories(): String =
    (2..3)
        .map { PARAMETERS.take(it) }
        .map { it.map { it to LENGTH } }
        .flatMap { listOf(it, it + COLOR_PARAMETER) }
        .map { factory(TEXT_SHADOW, it.toTypedArray()) }
        .joinToString("\n\n")
