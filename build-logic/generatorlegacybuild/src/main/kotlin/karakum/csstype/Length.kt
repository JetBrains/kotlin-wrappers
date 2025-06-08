package karakum.csstype

import karakum.common.ConversionResult
import karakum.common.sealedUnionBody

internal const val LENGTH = "Length"

private val LENGTH_LIKE_VALUES = listOf(
    "fit-content",
    "intrinsic",
    "max-content",
    "min-content",
    "min-intrinsic",
    "normal",
)

internal fun Length(): ConversionResult {
    val declarations = sequenceOf(
        sealedUnionBody(LENGTH, LENGTH_TYPE, LENGTH_LIKE_VALUES),
    ) + LENGTH_UNITS.map { (name, suffix) ->
        unitsExtension(LENGTH, name, suffix)
    }

    return ConversionResult(LENGTH, declarations.joinToString("\n\n"))
}
