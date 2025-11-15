package karakum.csstype

import karakum.common.ConversionResult

internal const val CustomProperties = "CustomProperties"

// language=Kotlin
private val BODY = """
external interface $CustomProperties {
    operator fun <T : JsAny> get(
        name: $CUSTOM_PROPERTY_NAME<T>,
    ): T?

    operator fun <T : JsAny> set(
        name: $CUSTOM_PROPERTY_NAME<T>,
        value: T?,
    )
}
""".trimIndent()

internal fun CustomProperties(): ConversionResult =
    ConversionResult(CustomProperties, BODY)
