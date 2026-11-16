package karakum.browser

// TEMP WA for https://youtrack.jetbrains.com/issue/KT-91505

internal val MIXINS_WITH_REQUIRED_OVERRIDES: Set<String> = setOf(
    "ARIANotifyMixin",
    "Animatable",
    "Body",
    "ChildNode",
    "DocumentOrShadowRoot",
    "ElementCSSInlineStyle",
    "ElementContentEditable",
    "FontFaceSource",
    "HTMLHyperlinkElementUtils",
    "HTMLOrSVGOrMathMLElement",
    "HyperlinkElementUtils",
    "NonElementParentNode",
    "ParentNode",
    "XPathEvaluatorBase",
)

internal fun List<ConversionResult>.withMixinOverrides(): List<ConversionResult> {
    val overridesMap: Map<String, String> = asSequence()
        .filter { it.name in MIXINS_WITH_REQUIRED_OVERRIDES }
        .filter { it.name != "NonElementParentNode" }
        .associate { it.name to getOverrides(it) }

    return map { withOverrides(it, overridesMap) }
}

private fun getOverrides(
    result: ConversionResult,
): String {
    val overrides = result.body
        .replace(" = definedExternally", "")
        .replace("\nval ", "\noverride val ")
        .replace("\nvar ", "\noverride var ")
        .replace("\nfun ", "\noverride fun ")
        .substringAfter("{\n", "")
        .substringBefore("\n}", "")
        .splitToSequence("\n")
        .filter { !it.startsWith("/*") }
        .filter { !it.startsWith(" *") }
        .filter { !it.startsWith("@") }
        .joinToString("\n")

    return "/* `${result.name}` overrides */\n\n$overrides"
}

private fun withOverrides(
    result: ConversionResult,
    overridesMap: Map<String, String>,
): ConversionResult {
    val body = result.body
    val overrides = body.substringAfter("external class ", "")
        .substringBefore(" {\n", "")
        .let { str ->
            sequenceOf(":\n", "):")
                .map { str.substringAfter(it, "") }
                .firstOrNull { it.isNotEmpty() }
                ?: ""
        }
        .splitToSequence(",\n")
        .map { it.trim() }
        .mapNotNull { overridesMap[it] }
        .joinToString("\n\n")
        .ifEmpty { return result }

    val newBody = if ("\ncompanion object" in body) {
        body.replaceFirst("\ncompanion object", "\n\n$overrides\ncompanion object")
    } else {
        body.replaceFirst("\n}", "\n\n$overrides\n}")
    }

    require(newBody != body) {
        "No overrides added to ${result.name}"
    }

    return result.copy(body = newBody)
}
