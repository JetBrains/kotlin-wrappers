package karakum.browser

internal const val DOM_EXCEPTION = "DOMException"

internal fun domExceptionErrorNames(): String =
    mdnContent("api/domexception/index.md")
        .substringAfter("\n## Error names\n", "")
        .substringAfter("> [!NOTE]", "")
        .substringAfter("\n\n", "")
        .substringBefore("\n\n", "")
        .let { "\n$it" }
        .splitToSequence("\n- ")
        .drop(1)
        .map { it.split("\n  - : ") }
        .mapNotNull { (name, description) -> parseErrorName(name, description) }
        .joinToString("\n\n") { (name, description) ->
            """
            /**
              * $description
              */
            inline val DOMException.Companion.${name}: JsErrorName
                get() = unsafeCast("$name")
            """.trimIndent()
        }

private fun parseErrorName(
    nameSource: String,
    descriptionSource: String,
): Pair<String, String>? {
    if ("{{deprecated_inline}}" in nameSource)
        return null

    val name = nameSource.substringBefore(" {{")
        .removeSurrounding("`")
        // QuotaExceededError
        .removeSurrounding("{{domxref(\"", "\")}}")

    val description = descriptionSource
        .replace("""{{ domxref("Range") }}""", "[Range]")
        .replace("""{{ domxref("Document") }}""", "[Document]")
        .substringBefore(". (Legacy code ")
        .substringBefore(" (No legacy code ")

    return name to description
}
