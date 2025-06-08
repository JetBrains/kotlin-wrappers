package karakum.csstype

import karakum.common.ConversionResult

internal const val ANGLE = "Angle"

private val ANGLE_UNITS = listOf(
    "deg",
    "rad",
    "grad",
    "turn",
)

internal fun Angle(): ConversionResult {
    val declarations = sequenceOf(
        "sealed external interface $ANGLE",
    ) + ANGLE_UNITS.map { unit ->
        unitsExtension(ANGLE, unit, unit)
    }

    return ConversionResult(ANGLE, declarations.joinToString("\n\n"))
}
