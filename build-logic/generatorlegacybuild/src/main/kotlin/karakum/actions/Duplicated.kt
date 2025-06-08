package karakum.actions

import karakum.common.ConversionResult

internal fun List<ConversionResult>.mergeDuplicated(): List<ConversionResult> {
    val duplicatedGroups = this
        .filter { "external fun " in it.body }
        .groupBy { it.name }
        .map { it.value }
        .filter { it.size > 1 }

    val newFunctions = duplicatedGroups.map {
        ConversionResult(
            name = it.first().name,
            body = it.joinToString("\n\n") {
                it.body
            }
        )
    }

    return this
        .minus(duplicatedGroups.flatMap { it })
        .plus(newFunctions)
}
