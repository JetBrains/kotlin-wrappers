package karakum.csstype

internal const val TRANSITION = "Transition"
internal const val TRANSITION_PROPERTY = "TransitionProperty"

private val PARAMETERS = listOf(
    "property" to TRANSITION_PROPERTY,
    "duration" to TIME,
    "timingFunction" to "TransitionTimingFunction",
    "delay" to TIME,
)

internal fun transitionFactories(): String =
    sequenceOf(
        listOf(0, 1, 2),
        listOf(0, 1, 3),
        listOf(0, 1, 2, 3),
    )
        .map { it.map { PARAMETERS[it] }.toTypedArray() }
        .joinToString("\n\n") { parameters ->
            factory(TRANSITION, parameters)
        }
