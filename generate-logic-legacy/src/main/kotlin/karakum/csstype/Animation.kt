package karakum.csstype

internal const val ANIMATION = "Animation"
internal const val ANIMATION_NAME = "AnimationName"

private val PARAMETERS = listOf(
    "name" to ANIMATION_NAME,
    "duration" to TIME,
    "timingFunction" to "AnimationTimingFunction",
    "delay" to TIME,
)

internal fun animationFactories(): String =
    (2..4)
        .map { PARAMETERS.subList(0, it).toTypedArray() }
        .joinToString("\n\n") { parameters ->
            factory(ANIMATION, parameters)
        }
