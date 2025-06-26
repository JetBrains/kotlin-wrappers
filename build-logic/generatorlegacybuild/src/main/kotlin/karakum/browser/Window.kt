package karakum.browser

import karakum.common.CommonUnionConverter.sealedUnionBody

private val WINDOW_TARGET_VALUES = listOf(
    "_self",
    "_blank",
    "_parent",
    "_top",
)

// language=kotlin
private val WINDOW_NAME_BODY = """
sealed external interface WindowName :
    WindowTarget

inline fun WindowName(
    value: String,
): WindowName =
    unsafeCast(value)
""".trimIndent()

internal fun windowTypes(): Sequence<ConversionResult> =
    sequenceOf(
        ConversionResult(
            name = "WindowTarget",
            body = sealedUnionBody("WindowTarget", WINDOW_TARGET_VALUES),
            pkg = "web.window",
        ),
        ConversionResult(
            name = "WindowName",
            body = WINDOW_NAME_BODY,
            pkg = "web.window",
        )
    )
