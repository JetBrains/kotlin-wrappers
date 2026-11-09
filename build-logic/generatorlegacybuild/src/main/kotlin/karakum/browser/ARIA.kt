package karakum.browser

import karakum.common.CommonUnionConverter.sealedUnionBody
import karakum.common.UnionConverter.CommentProvider

internal fun ariaUnions(): Sequence<ConversionResult> =
    MDN.root
        .resolve("api/element")
        .listFiles { file -> file.isDirectory }
        .asSequence()
        .filter { it.name.startsWith("aria") }
        .map { it.resolve("index.md").readText() }
        .mapNotNull { ariaUnion(it) }
        .plus(ariaRole())

private fun ariaUnion(
    source: String,
): ConversionResult? {
    val valueContent = source
        .substringAfter("## Value\n", "")
        .substringBefore("\n#")
        .ifEmpty { return null }

    val values = valueContent
        .splitToSequence("\n")
        .mapNotNull { parseAriaUnionValue(it) }
        .sorted()
        .toList()
        .ifEmpty { return null }

    if (values == listOf("<string>"))
        return null

    val name = source
        .substringAfter("\nslug: Web/API/Element/", "")
        .substringBefore("\n", "")
        .replaceFirstChar { it.uppercase() }

    return ConversionResult(
        name = name,
        body = sealedUnionBody(name, values, AriaCommentProvider),
        pkg = "web.aria",
    )
}

private fun parseAriaUnionValue(
    line: String,
): String? {
    val source = line.removePrefix("- ")
    if (source == line)
        return null

    return source.removePrefix("`")
        .also { if (it == source) return null }
        .substringBefore("`", "")
        .removeSurrounding("\"")
        .takeIf { it != "undefined" }
}

private fun ariaRole(): ConversionResult {
    val values = MDN.root
        .resolve("accessibility/aria/reference/roles")
        .listFiles { file -> file.isDirectory }
        .asSequence()
        .map { it.name }
        .mapNotNull { name -> name.removeSuffix("_role").takeIf { it != name } }
        .sorted()
        .toList()

    return ConversionResult(
        name = "AriaRole",
        body = sealedUnionBody("AriaRole", values),
        pkg = "web.aria",
    )
}

private object AriaCommentProvider :
    CommentProvider {

    override fun getComment(
        name: String,
    ): String {
        val propertyName = name.replaceFirstChar { it.lowercase() }

        return """
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/$propertyName)
         */
        """.trimIndent()
    }

    override fun getComment(
        name: String,
        unionValue: String,
    ): String {
        val propertyName = name.replaceFirstChar { it.lowercase() }

        return """
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/$propertyName#$unionValue)
         */
        """.trimIndent()
    }
}
