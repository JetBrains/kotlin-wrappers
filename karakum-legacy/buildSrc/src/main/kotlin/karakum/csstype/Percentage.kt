package karakum.csstype

import karakum.common.ConversionResult

internal const val PERCENTAGE = "Percentage"

internal fun Percentage(): ConversionResult {
    val declarations = sequenceOf(
        """
            sealed external interface $PERCENTAGE:
                $LENGTH
        """.trimIndent(),

        unitsExtension(PERCENTAGE, "pct", "%"),
    )

    return ConversionResult(PERCENTAGE, declarations.joinToString("\n\n"))
}
