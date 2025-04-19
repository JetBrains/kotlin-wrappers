package karakum.csstype

import karakum.common.ConversionResult

internal const val SELECTOR = "Selector"

// language=Kotlin
private val BODY = """
external interface $SELECTOR

inline fun $SELECTOR(
    syntax: String,
): $SELECTOR =
    unsafeCast(syntax)

""".trimIndent()

internal fun Selector(): ConversionResult =
    ConversionResult(SELECTOR, BODY)
