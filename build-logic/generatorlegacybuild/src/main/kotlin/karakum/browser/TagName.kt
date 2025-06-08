package karakum.browser

internal const val HTML_TAG_NAME = "HtmlTagName"
internal const val SVG_TAG_NAME = "SvgTagName"
internal const val MATHML_TAG_NAME = "MathMLTagName"

internal const val SVG_NAMESPACE = "http://www.w3.org/2000/svg"
internal const val MATHML_NAMESPACE = "http://www.w3.org/1998/Math/MathML"

private fun tagNameBody(
    tagType: String,
    elementType: String,
): String = """
sealed external interface $tagType<T : $elementType>

inline fun <T : $elementType> $tagType(
    tagName: String,
): $tagType<T> =
    unsafeCast(tagName)
""".trimIndent()

internal fun tagNames(
    source: String,
): Sequence<ConversionResult> {
    return sequenceOf(
        tagDictionary("HTML", source, HTML_TAG_NAME),
        tagDictionary("SVG", source, SVG_TAG_NAME, SVG_NAMESPACE),
        tagDictionary("MathML", source, MATHML_TAG_NAME, MATHML_NAMESPACE),
        ConversionResult(
            name = HTML_TAG_NAME,
            body = tagNameBody(HTML_TAG_NAME, "HTMLElement"),
            pkg = "web.html",
        ),
        ConversionResult(
            name = SVG_TAG_NAME,
            body = tagNameBody(SVG_TAG_NAME, "SVGElement"),
            pkg = "web.svg",
        ),
        ConversionResult(
            name = MATHML_TAG_NAME,
            body = tagNameBody(MATHML_TAG_NAME, "MathMLElement"),
            pkg = "web.mathml",
        ),
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
            inline val $propertyName: $groupTagName<$tagType>
                get() = $groupTagName("$tagName")
            """.trimIndent()
        }

    val namespaceBody = if (namespace != null) {
        """
        @JsValue("$namespace")
        external object ${name.uppercase()}_NAMESPACE: ElementNamespace
        """.trimIndent()
    } else null

    val body = sequenceOf(
        namespaceBody,
        "object $name {\n$members\n}",
    ).filterNotNull()
        .joinToString("\n\n")

    return ConversionResult(
        name = name,
        body = body,
        pkg = "web.${name.lowercase()}",
    )
}
