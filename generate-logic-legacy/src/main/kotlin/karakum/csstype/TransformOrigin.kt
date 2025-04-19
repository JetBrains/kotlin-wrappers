package karakum.csstype

internal const val TRANSFORM_ORIGIN = "TransformOrigin"

private val PARAMETERS = listOf(
    "offsetX" to GEOMETRY_POSITION,
    "offsetY" to GEOMETRY_POSITION,
    "offsetZ" to LENGTH,
)

internal fun transformOriginFactories(): String =
    (2..3)
        .map { PARAMETERS.take(it) }
        .map { it.toTypedArray() }
        .joinToString("\n\n") { parameters ->
            factory(TRANSFORM_ORIGIN, parameters)
        }
