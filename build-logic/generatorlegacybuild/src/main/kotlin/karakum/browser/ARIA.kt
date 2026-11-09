package karakum.browser

import karakum.common.CommonUnionConverter.sealedUnionBody
import karakum.common.UnionConverter.CommentProvider

internal fun Sequence<ConversionResult>.withAriaUnions(): Sequence<ConversionResult> {
    val unions = MDN.root
        .resolve("api/element")
        .listFiles { file -> file.isDirectory }
        .asSequence()
        .filter { it.name.startsWith("aria") }
        .map { it.resolve("index.md").readText() }
        .mapNotNull { ariaUnion(it) }
        .plus(ariaRole())
        .toList()

    val unionNames = unions.map { it.name }

    return map { patchAriaMixin(it, unionNames) }
        .plus(unions)
}

private fun patchAriaMixin(
    result: ConversionResult,
    unionNames: List<String>,
): ConversionResult {
    if (result.name != "ARIAMixin")
        return result

    var body = result.body
    for (unionName in unionNames) {
        val propertyName = when (unionName) {
            "AriaRole" -> "role"
            else -> unionName.replaceFirstChar { it.lowercase() }
        }

        body = body.replace(
            "var $propertyName: String",
            "var $propertyName: $unionName",
        )
    }

    return result.copy(body = body)
}

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
        body = sealedUnionBody("AriaRole", values, AriaRoleCommentProvider),
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

private object AriaRoleCommentProvider :
    CommentProvider {

    override fun getComment(
        name: String,
    ): String =
        """
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/Accessibility/ARIA/Reference/Roles)
         */
        """.trimIndent()

    override fun getComment(
        name: String,
        unionValue: String,
    ): String =
        """
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/Accessibility/ARIA/Reference/Roles/${unionValue}_role)
         */
        """.trimIndent()
}
