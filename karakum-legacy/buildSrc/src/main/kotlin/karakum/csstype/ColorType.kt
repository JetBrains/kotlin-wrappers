package karakum.csstype

import karakum.common.ConversionResult

internal const val COLOR_TYPE = "ColorType"

// source - https://developer.mozilla.org/ru/docs/Web/CSS/url()
private val PARENT_TYPES = setOf(
    COLOR_PROPERTY,
    ANGULAR_COLOR_STOP,
    LINEAR_COLOR_STOP,
)

internal fun ColorType(): ConversionResult =
    ConversionResult(
        name = COLOR_TYPE,
        body = "sealed external interface $COLOR_TYPE:\n" +
                PARENT_TYPES.joinToString(",\n")
    )
