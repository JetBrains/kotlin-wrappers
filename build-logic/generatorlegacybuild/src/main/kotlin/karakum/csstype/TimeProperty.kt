package karakum.csstype

import karakum.common.ConversionResult

internal const val TIME_PROPERTY = "TimeProperty"

internal fun TimeProperty(
    parentProvider: ParentProvider,
): ConversionResult {
    val body = """
        sealed external interface $TIME_PROPERTY:
        ${parentProvider.get()}
    """.trimIndent()

    return ConversionResult(TIME_PROPERTY, body)
}
