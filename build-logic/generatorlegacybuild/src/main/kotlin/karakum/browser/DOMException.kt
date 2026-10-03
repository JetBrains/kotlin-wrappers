package karakum.browser

import karakum.common.CommonUnionConverter.unionBodyByConstants
import karakum.common.UnionConstant

internal const val DOM_EXCEPTION = "DOMException"
internal const val DOM_EXCEPTION_NAME = "DOMExceptionName"
internal const val DOM_EXCEPTION_TYPE = "DOMExceptionType"

internal fun domExceptionTypes(): Sequence<ConversionResult> {
    val errorData = mdnContent("api/domexception/index.md")
        .substringAfter("\n## Error names\n", "")
        .substringAfter("> [!NOTE]", "")
        .substringAfter("\n\n", "")
        .substringBefore("\n\n", "")
        .let { "\n$it" }
        .splitToSequence("\n- ")
        .drop(1)
        .map { it.split("\n  - : ") }
        .mapNotNull { (name, description) -> parseErrorName(name, description) }
        .toList()

    val nameExtensions = unionBodyByConstants(
        name = DOM_EXCEPTION_NAME,
        constants = errorData.map { (name, comment) ->
            UnionConstant(
                name = name,
                value = name,
                comment = comment,
            )
        },
    ).substringAfter(DOM_EXCEPTION_NAME + "\n\n")
        .replace("unsafeCast(", "$DOM_EXCEPTION_NAME(")

    // language=kotlin
    val nameBody = """
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#error_names)
     */
    @JsUnion
    external interface $DOM_EXCEPTION_NAME :
        JsErrorName

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#error_names)
     */
    inline fun $DOM_EXCEPTION_NAME(
        value: String,
    ): $DOM_EXCEPTION_NAME =
        unsafeCast(value)
    $nameExtensions
    """.trimIndent()

    val types = errorData
        .filter { (name) -> name != "QuotaExceededError" }
        .joinToString("\n\n") { (name, comment) ->
        """
        $comment
        sealed /* marker */
        interface $name :
            $DOM_EXCEPTION_TYPE
        """.trimIndent()
    }

    // language=kotlin
    val typeBody = """
    /**
     * [MDN Reference]([MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#error_names))
     */
    sealed /* marker */
    interface $DOM_EXCEPTION_TYPE {
        $types
    }
    """.trimIndent()

    return sequenceOf(
        ConversionResult(
            name = DOM_EXCEPTION_NAME,
            body = nameBody,
            pkg = "web.errors",
        ),
        ConversionResult(
            name = DOM_EXCEPTION_TYPE,
            body = typeBody,
            pkg = "web.errors",
        ),
    )
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

    val comment = """
    /**
     * $description
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#${name.lowercase()})
     */
    """.trimIndent()

    return name to comment
}
