package karakum.browser

internal const val HTML_TAG_NAME = "HtmlTagName"
internal const val SVG_TAG_NAME = "SvgTagName"
internal const val MATHML_TAG_NAME = "MathMLTagName"

internal const val SVG_NAMESPACE = "http://www.w3.org/2000/svg"
internal const val MATHML_NAMESPACE = "http://www.w3.org/1998/Math/MathML"

internal fun tagNames(
    source: String,
): Sequence<ConversionResult> {
    return sequenceOf(
        tagDictionary("HTML", source, HTML_TAG_NAME),
        tagDictionary("SVG", source, SVG_TAG_NAME, SVG_NAMESPACE),
        tagDictionary("MathML", source, MATHML_TAG_NAME, MATHML_NAMESPACE),
    )
}

private fun tagDictionary(
    name: String,
    source: String,
    groupTagName: String,
    namespace: String? = null,
): ConversionResult {
    val elementType = name + "Element"

    val members = source
        .substringAfter("interface ${elementType}TagNameMap {\n")
        .substringBefore("\n}")
        .trimIndent()
        .splitToSequence("\n")
        .joinToString("\n\n") { line ->
            val (tagName, tagType) = line
                .removePrefix("\"")
                .removeSuffix(";")
                .split("\": ")

            val propertyName = when (tagName) {
                "object",
                "var",
                    -> "`$tagName`"

                else -> tagName.replace("-x", "X")
            }

            """
            inline val $propertyName: TagName<$tagType>
                get() = TagName("$tagName")
            """.trimIndent()
        }

    val namespaceBody = if (namespace != null) {
        """
        inline val ${name.uppercase()}_NAMESPACE: TagNamespace<$elementType>
            get() = unsafeCast("$namespace")
        """.trimIndent()
    } else null

    val body = sequenceOf(
        namespaceBody,
        "object $groupTagName {\n$members\n}",
    ).filterNotNull()
        .joinToString("\n\n")

    return ConversionResult(
        name = groupTagName,
        body = body,
        pkg = "web.${name.lowercase()}",
    )
}
