package karakum.browser

internal const val HTML_TAG_NAME = "HtmlTagName"
internal const val SVG_TAG_NAME = "SvgTagName"
internal const val MATHML_TAG_NAME = "MathMLTagName"

internal const val XHTML_NAMESPACE = "http://www.w3.org/1999/xhtml"
internal const val SVG_NAMESPACE = "http://www.w3.org/2000/svg"
internal const val MATHML_NAMESPACE = "http://www.w3.org/1998/Math/MathML"

internal fun tagNames(
    source: String,
): Sequence<ConversionResult> {
    return sequenceOf(
        tagDictionary(name = "HTML", source = source, groupTagName = HTML_TAG_NAME, namespace = XHTML_NAMESPACE),
        tagDictionary(name = "SVG", source = source, groupTagName = SVG_TAG_NAME, namespace = SVG_NAMESPACE),
        tagDictionary(name = "MathML", source = source, groupTagName = MATHML_TAG_NAME, namespace = MATHML_NAMESPACE),
    )
}

private fun tagDictionary(
    name: String,
    source: String,
    groupTagName: String,
    namespace: String,
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

    val namespaceName = namespace
        .substringAfterLast("/")
        .uppercase()
        .plus("_NAMESPACE")

    val namespaceBody = """
        inline val ${namespaceName}: TagNamespace<$elementType>
            get() = unsafeCast("$namespace")
        """.trimIndent()

    val body = sequenceOf(
        namespaceBody,
        "object $groupTagName {\n$members\n}",
    ).joinToString("\n\n")

    return ConversionResult(
        name = groupTagName,
        body = body,
        pkg = "web.${name.lowercase()}",
    )
}
