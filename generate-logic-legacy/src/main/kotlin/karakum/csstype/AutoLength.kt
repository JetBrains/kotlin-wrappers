package karakum.csstype

import karakum.common.ConversionResult

internal const val AUTO_LENGTH = "AutoLength"

internal fun AutoLength(): ConversionResult {
    val body = """
        sealed external interface $AUTO_LENGTH : 
            $AUTO_LENGTH_PROPERTY
    """.trimIndent()

    return ConversionResult(AUTO_LENGTH, body)
}
