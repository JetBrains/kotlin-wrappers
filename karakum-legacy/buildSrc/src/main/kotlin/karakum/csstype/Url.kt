package karakum.csstype

import karakum.common.ConversionResult

internal const val URL = "Url"

// source - https://developer.mozilla.org/ru/docs/Web/CSS/url()
private val PARENT_TYPES = setOf(
    "Cursor",
    "Filter",
    IMAGE,
    "OffsetPath",
)

internal fun Url(): ConversionResult =
    ConversionResult(
        name = URL,
        body = "sealed external interface $URL:\n" +
                PARENT_TYPES.joinToString(",\n")
    )
