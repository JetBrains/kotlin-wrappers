package karakum.browser

import karakum.common.loadContent
import java.net.URI

internal const val DOM_EXCEPTION = "DOMException"

private val MDN_URI =
    URI("https://raw.githubusercontent.com/mdn/content/main/files/en-us/web/api/domexception/index.md")

internal fun domExceptionErrorNames(): String =
    loadContent(MDN_URI)
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

    val description = descriptionSource
        .replace("""{{ domxref("Range") }}""", "`Range`")
        .replace("""{{ domxref("Document") }}""", "`Document`")
        .substringBefore(". (Legacy code ")
        .substringBefore(" (No legacy code ")

    return name to description
}
