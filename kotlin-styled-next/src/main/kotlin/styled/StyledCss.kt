package styled

import kotlinx.css.*

internal typealias ClassName = String
internal typealias Selector = String
internal typealias AnimationName = String

private fun withMedia(selector: Selector) = selector.trim().startsWith("@media")
private fun withContainer(selector: Selector) = selector.trim().startsWith("@container")
private fun withAmpersand(selector: Selector) = selector.contains("&")
private fun withFontFace(selector: Selector) = selector.trim().startsWith("@font-face")
private fun withSupports(selector: Selector) = selector.trim().startsWith("@supports")
private fun withCustomHandle(selector: Selector) =
    withMedia(selector) || withContainer(selector) || withSupports(selector) || withAmpersand(selector) || withFontFace(
        selector
    )

/**
 * @param outerSelector is the selector
 * @param indent is indentation for pretty-printing the resulting CSS string
 * @return the list of built rules in string representation.
 * Each resulting rule can be injected to a CSS Object Model or plain stylesheet.
 */
internal fun CssBuilder.getCssRules(outerSelector: String?, indent: String = ""): List<String> {
    val declarationBlock = declarations.buildPrefixedString("  ")

    val result = mutableListOf<String>()
    val (rules, handleRules) = (resolveRules(rules, multiRules)).partition { !withCustomHandle(it.selector) }
    if (declarationBlock.isNotEmpty() && outerSelector != null) {
        result.add(
            buildString {
                appendLine("$indent$outerSelector {")
                append(declarationBlock)
                appendLine("$indent}")
            }
        )
    }
    result.addAll(buildRules(rules, outerSelector ?: ""))

    handleRules.forEach { (selector, css) ->
        val resolvedSelector = resolveRelativeSelector(selector, outerSelector)
        if (withMedia(resolvedSelector)) {
            result.add(
                buildString {
                    append("$indent$selector {\n")
                    css.getCssRules(outerSelector, "  $indent").forEach { appendLine(it); }
                    append("$indent}\n")
                }
            )
        } else if (withContainer(resolvedSelector) || withSupports(resolvedSelector)) {
            result.add(
                buildString {
                    append("$indent$selector {\n")
                    css.getCssRules("  $indent").forEach { appendLine(it); }
                    append("$indent}\n")
                }
            )
        } else {
            result.addAll(css.getCssRules(resolvedSelector))
        }
    }
    return result
}

private fun resolveRelativeSelector(selector: Selector, selfClassName: ClassName?): Selector {
    if (selfClassName == null) return selector
    return selfClassName.split(",").joinToString { selector.replace("&", it.trim()) }
}

private fun isPseudoClass(selector: Selector) = selector.trim().startsWith(":")
private fun buildRules(rules: List<Rule>, outerSelector: String): List<String> {
    return rules.flatMap { (selector, css) ->
        val delimiter = if (isPseudoClass(selector)) "" else " "
        css.getCssRules(selector.split(",").joinToString { "$outerSelector$delimiter${it.trim()}" })
    }
}
