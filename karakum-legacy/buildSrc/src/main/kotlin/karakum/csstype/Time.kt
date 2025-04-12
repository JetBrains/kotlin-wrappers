package karakum.csstype

import karakum.common.ConversionResult

internal const val TIME = "Time"

internal fun Time(): ConversionResult {
    val body = sequenceOf(
        "sealed external interface $TIME: $TIME_PROPERTY",
        unitsExtension(TIME, "ms", "ms"),
        unitsExtension(TIME, "s", "s"),
    ).joinToString("\n\n")

    return ConversionResult(TIME, body)
}
