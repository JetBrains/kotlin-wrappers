package karakum.csstype

import karakum.common.ConversionResult

internal const val AUTO_LENGTH_PROPERTY = "AutoLengthProperty"

internal fun AutoLengthProperty(): ConversionResult {
    val body = """
        sealed external interface $AUTO_LENGTH_PROPERTY
    """.trimIndent()

    return ConversionResult(AUTO_LENGTH_PROPERTY, body)
}
