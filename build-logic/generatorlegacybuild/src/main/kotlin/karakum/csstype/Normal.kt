package karakum.csstype

import karakum.common.ConversionResult
import karakum.common.JsUnionConverter.sealedUnionBody

internal const val NORMAL = "Normal"

internal fun Normal(): ConversionResult =
    ConversionResult(
        name = NORMAL,
        body = sealedUnionBody(NORMAL, listOf("normal")),
    )
