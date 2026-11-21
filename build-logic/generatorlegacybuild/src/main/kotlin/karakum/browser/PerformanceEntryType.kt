package karakum.browser

import karakum.common.unionName

internal fun PerformanceEntryType(): ConversionResult {
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
        external interface PerformanceEntryType<T : PerformanceEntry>
        """.trimIndent()

    val constants = valueMap.map { (name, type) ->
        """
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEntry/entryType#${name.lowercase()})
         */
        inline val PerformanceEntryType.Companion.${unionName(name)}: PerformanceEntryType<* /* $type */>
            get() = unsafeCast("$name")
        """.trimIndent()
    }.joinToString("\n\n")

    val body = declaration + "\n\n" + constants

    return ConversionResult(
        name = "PerformanceEntryType",
        body = body,
        pkg = "web.performance",
    )
}
