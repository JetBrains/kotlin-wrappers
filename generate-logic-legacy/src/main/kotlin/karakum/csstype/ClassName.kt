package karakum.csstype

import karakum.common.ConversionResult

internal const val CLASS_NAME = "ClassName"

private val BODY = """
sealed external interface ClassName

inline fun $CLASS_NAME(
    value: String,
): $CLASS_NAME =
    unsafeCast(value)
""".trimIndent()

internal fun ClassName(): ConversionResult =
    ConversionResult(CLASS_NAME, BODY)
