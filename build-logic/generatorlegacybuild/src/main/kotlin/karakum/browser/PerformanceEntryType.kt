package karakum.browser

internal fun PerformanceEntryType(): ConversionResult =
    ConversionResult(
        name = "PerformanceEntryType",
        body = """
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEntry/entryType)
         */
        @JsUnion
        sealed /* union */
        external interface PerformanceEntryType<T : PerformanceEntry>
        """.trimIndent(),
        pkg = "web.performance",
    )
