package styled

import kotlinx.css.*
import kotlinx.css.properties.KeyframesBuilder

internal typealias ClassName = String
internal typealias Selector = String
internal typealias AnimationName = String

internal data class StyledRule(
    val selector: Selector,
    val passStaticClassesToParent: Boolean = false,
    val css: StyledCss
) {
    private var memoizedHashCode: Int? = null

    override fun hashCode(): Int {
        return memoizedHashCode ?: (selector.hashCode() + css.hashCode()).also { hash -> memoizedHashCode = hash }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as StyledRule

        return hashCode() == other.hashCode()
                && selector == other.selector
                && css == other.css
    }
}

/**
 * StyledCss is used to efficiently build CSS rules from the DSL representation.
 */
internal open class StyledCss(
    declarations: CssDeclarations?,
    private val rules: List<StyledRule>
) {
    private val declarationBlock = declarations?.buildPrefixedString("  ") ?: ""

    private fun withMedia(selector: Selector) = selector.trim().startsWith("@media")
    private fun withContainer(selector: Selector) = selector.trim().startsWith("@container")
    private fun withAmpersand(selector: Selector) = selector.contains("&")
    private fun withFontFace(selector: Selector) = selector.trim().startsWith("@font-face")
    private fun withSupports(selector: Selector) = selector.trim().startsWith("@supports")
    private fun withCustomHandle(selector: Selector) =
        withMedia(selector) || withContainer(selector) || withSupports(selector) || withAmpersand(selector) || withFontFace(selector)

    private var memoizedHashCode: Int? = null
    override fun hashCode(): Int {
        return memoizedHashCode ?: (rules.sumOf { it.hashCode() } + declarationBlock.hashCode())
            .also { hashCode -> memoizedHashCode = hashCode }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as StyledCss

        return hashCode() == other.hashCode()
                && rules == other.rules
                && declarationBlock == other.declarationBlock
    }

    /**
     * @param outerSelector is the selector
     * @param indent is indentation for pretty-printing the resulting CSS string
     * @return the list of built rules in string representation.
     * Each resulting rule can be injected to a CSS Object Model or plain stylesheet.
     */
    fun getCssRules(outerSelector: String?, indent: String = ""): List<String> {
        val result = mutableListOf<String>()
        val (rules, handleRules) = rules.partition { !withCustomHandle(it.selector) }
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

        handleRules.forEach { (selector, _, css) ->
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
}

private fun isPseudoClass(selector: Selector) = selector.trim().startsWith(":")
private fun buildRules(rules: List<StyledRule>, outerSelector: String): List<String> {
    return rules.flatMap { (selector, _, css) ->
        val delimiter = if (isPseudoClass(selector)) "" else " "
        css.getCssRules(selector.split(",").joinToString { "$outerSelector$delimiter${it.trim()}" })
    }
}

private fun Rule.toStyledRule(parent: RuleContainer, block: RuleSet = this.block): StyledRule {
    return StyledRule(
        selector,
        passStaticClassesToParent,
        CssBuilder(allowClasses = false, parent = if (passStaticClassesToParent) parent else null)
            .apply { block() }
            .toStyledCss()
    )
}

/**
 * @return all [multiRules], but only the first occurrence of a regular rule from [rules]
 */
private fun resolveRules(rules: List<Rule>, multiRules: List<Rule>, parent: RuleContainer): List<StyledRule> {
    val resolvedRules = LinkedHashMap<String, Rule>()
    val newRules = mutableListOf<StyledRule>()
    rules.forEach {
        if (!resolvedRules.containsKey(it.selector)) {
            resolvedRules[it.selector] = it
        }
        newRules.add(resolvedRules[it.selector]!!.toStyledRule(parent, it.block))
    }
    newRules.addAll(multiRules.map { it.toStyledRule(parent) })
    return newRules
}

internal fun CssBuilder.toStyledCss(): StyledCss {
    val resolvedRules = resolveRules(rules = rules, multiRules = multiRules, parent = this)
    return StyledCss(declarations, rules = resolvedRules)
}

internal class StyledKeyframes(private val rules: List<StyledRule>) {
    override fun hashCode(): Int {
        return rules.sumOf { it.hashCode() }
    }

    override fun toString(): String {
        return buildString {
            rules.forEach { (selector, _, css) ->
                append(css.getCssRules(selector).joinToString("\n"))
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as StyledKeyframes
        return rules == other.rules
    }
}

internal fun KeyframesBuilder.toStyledKeyframes(): StyledKeyframes {
    val resolvedRules = resolveRules(rules = rules, multiRules = multiRules, parent = this)
    return StyledKeyframes(rules = resolvedRules)
}
