package styled

import kotlinx.css.CssBuilder
import kotlinx.css.Rule

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
    val (rules, handleRules) = (rules + multiRules).partition { !withCustomHandle(it.selector) }
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
        val resolvedSelector = resolveRelative(selector, outerSelector)
        if (withMedia(resolvedSelector)) {
            result.add(
                buildString {
                    appendLine("$indent$selector {")
                    css.getCssRules(outerSelector, "  $indent").forEach { appendLine(it); }
                    appendLine("$indent}")
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

/** Prevents exponential classname growth for [CssBuilder.specific] hierarchy */
private fun Selector.resolveExponential(parentSelector: String): Selector {
    if (contains("&&")) {
        val classes = parentSelector.split(".").filter(String::isNotEmpty)
        if (classes.size > 1 && classes.toSet().size == 1) {
            val repeated = ".${classes.first()}".repeat(classes.size + 1)
            return replace("&&", repeated)
        }
    }
    return this
}

/** Replace all ampersands in [selector] with [parentSelector] */
private fun resolveRelative(selector: String, parentSelector: Selector?): Selector {
    if (parentSelector == null) return selector
    return parentSelector.split(",").joinToString {
        val part = it.trim()
        selector.resolveExponential(part).replace("&", part)
    }
}

private fun isPseudoClass(selector: Selector) = selector.trim().startsWith(":")
private fun buildRules(rules: List<Rule>, outerSelector: String): List<String> {
    return rules.flatMap { (selector, css) ->
        val delimiter = if (isPseudoClass(selector)) "" else " "
        css.getCssRules(selector.split(",").joinToString { "$outerSelector$delimiter${it.trim()}" })
    }
}
