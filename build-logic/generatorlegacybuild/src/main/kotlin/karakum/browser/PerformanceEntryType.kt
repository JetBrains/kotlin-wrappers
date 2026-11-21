package karakum.browser

import karakum.common.unionName

private val WEB_TYPES = setOf(
    "PerformanceMeasure",
    "PerformanceResourceTiming",
)

private val KNOWN_TYPES = setOf(
    "LargestContentfulPaint",
    "PerformanceEventTiming",
    "PerformanceMark",
    "PerformanceNavigationTiming",
    "PerformanceNodeTiming",
    "PerformancePaintTiming",
) + WEB_TYPES

internal fun performanceEntryTypes(): Sequence<ConversionResult> {
    val valueMap = getApiDirectory("PerformanceEntry/entryType")!!
        .resolve("index.md")
        .readText()
        .substringAfter("## Value\n", "")
        .substringBefore("\n#", "")
        .let { "\n$it" }
        .splitToSequence("\n- ")
        .drop(1)
        .associate {
            val name = it
                .substringBefore("\n")
                .removeSurrounding("`")

            val type = it
                .replace(" an ", " a ")
                .substringAfter("The entry instance will be a {{domxref(\"", "")
                .substringBefore("\")}}", "")

            name to type
        }


    val declaration = """
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEntry/entryType)
         */
        @JsUnion
        sealed /* union */
        external interface PerformanceEntryType<out T : PerformanceEntry>
        """.trimIndent()

    fun getConstantContent(name: String, type: String): String {
        val typeParameter = if (type in KNOWN_TYPES) type else """* /* $type */"""
        return """
            /**
             * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEntry/entryType#${name.lowercase()})
             */
            inline val PerformanceEntryType.Companion.${unionName(name)}: PerformanceEntryType<$typeParameter>
                get() = unsafeCast("$name")
            """.trimIndent()
    }


    val constants = valueMap
        .filterValues { it in WEB_TYPES }
        .map { (name, type) -> getConstantContent(name, type) }
        .joinToString("\n\n")

    val browserConstants = valueMap
        .filterValues { it !in WEB_TYPES }
        .map { (name, type) -> getConstantContent(name, type) }
        .joinToString("\n\n")

    val body = declaration + "\n\n" + constants

    return sequenceOf(
        ConversionResult(
            name = "PerformanceEntryType",
            body = body,
            pkg = "web.performance",
        ),
        ConversionResult(
            name = "PerformanceEntryType.ext",
            body = browserConstants,
            pkg = "web.performance",
        ),
    )
}
