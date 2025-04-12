package karakum.csstype

internal const val FLEX = "Flex"

private val GROW = "grow" to "FlexGrow"
private val BASIS = "basis" to "FlexBasis"
private val SHRINK = "shrink" to "FlexShrink"

internal fun flexFactories(): String =
    sequenceOf(
        arrayOf(GROW, BASIS),
        arrayOf(GROW, SHRINK),
        arrayOf(GROW, SHRINK, BASIS),
    ).joinToString("\n\n") { parameters ->
        factory(FLEX, parameters)
    }
