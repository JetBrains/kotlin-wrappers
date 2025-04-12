package karakum.csstype

import karakum.common.ConversionResult

internal const val GRID_LENGTH = "GridLength"

internal fun GridLength(): ConversionResult {
    val declarations = sequenceOf(
        """
            sealed external interface $GRID_LENGTH:
                $GRID_LENGTH_PROPERTY
        """.trimIndent(),

        unitsExtension(GRID_LENGTH, "fr", "fr"),
    )

    return ConversionResult(GRID_LENGTH, declarations.joinToString("\n\n"))
}
