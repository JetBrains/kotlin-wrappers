package karakum.csstype

import karakum.common.ConversionResult

internal const val CUSTOM_PROPERTY_NAME = "CustomPropertyName"

// language=Kotlin
private val BODY = """
sealed external interface $CUSTOM_PROPERTY_NAME<T : Any>

inline fun <T: Any> $CUSTOM_PROPERTY_NAME(
    value: String,
): $CUSTOM_PROPERTY_NAME<T> =
    unsafeCast(value)

""".trimIndent()

internal fun CustomPropertyName(): ConversionResult =
    ConversionResult(CUSTOM_PROPERTY_NAME, BODY)
