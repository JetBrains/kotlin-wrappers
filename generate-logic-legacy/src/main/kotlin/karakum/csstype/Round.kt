package karakum.csstype

import karakum.common.ConversionResult
import karakum.common.sealedUnionBody

internal const val ROUND = "Round"

internal fun Round(): ConversionResult =
    ConversionResult(
        name = ROUND,
        body = sealedUnionBody(ROUND, listOf("round")),
    )
