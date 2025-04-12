package karakum.csstype

import karakum.common.ConversionResult

internal const val IMAGE = "Image"

// source - https://developer.mozilla.org/en-US/docs/Web/CSS/image
private val PARENT_TYPES = setOf(
    "Background",
    "BackgroundImage",
    "Border",
    "BorderImage",
    "BorderImageSource",
    "Content",
    "ListStyle",
    "ListStyleImage",
    "Mask",
    "MaskImage",
)

internal fun Image(): ConversionResult =
    ConversionResult(
        name = IMAGE,
        body = "sealed external interface $IMAGE:\n" +
                PARENT_TYPES.joinToString(",\n")
    )
