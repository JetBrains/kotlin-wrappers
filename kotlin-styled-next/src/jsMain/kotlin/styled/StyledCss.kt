package styled

import kotlinx.css.*
import kotlinx.css.properties.KeyframesBuilder

internal typealias ClassName = String
internal typealias Selector = String

internal data class StyledRule(
    val selector: String,
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
    declarations: LinkedHashMap<String, Any>?,
    private val rules: List<StyledRule>,
    val classes: List<String>,
) {
    private val declarations = buildString {
        declarations?.forEach { outer ->
            append("${outer.key.hyphenize()}: ${outer.value};\n")
        }
    }

    private fun buildRules(indent: String = ""): List<String> {
        return rules.filter { (selector) -> !withAmpersand(selector) && !withMedia(selector) }
            .flatMap { (selector, _, css) ->
                css.getCssRules(selector, "  $indent")
            }
    }

    private var memoizedHashCode: Int? = null
    override fun hashCode(): Int {
        return memoizedHashCode ?: (rules.sumOf { it.hashCode() } + declarations.hashCode())
            .also { hashCode -> memoizedHashCode = hashCode }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as StyledCss

        return hashCode() == other.hashCode()
                && rules == other.rules
                && declarations == other.declarations
    }

    /**
     * @param outerSelector is the selector
     * @param indent is indentation for pretty-printing the resulting CSS string
     * @return the list of built rules in string representation.
     * Each resulting rule can be injected to a CSS Object Model or plain stylesheet.
     */
    fun getCssRules(outerSelector: String?, indent: String = ""): List<String> {
        val result = mutableListOf<String>()
        val (ampersandRules, rules) = rules.partition { withAmpersand(it.selector) }
        if (rules.isNotEmpty() || declarations.isNotEmpty()) {
            if (outerSelector != null) {
                result.add(
                    buildString {
                        append("$indent$outerSelector {\n")
                        append(declarations)
                        append("$indent}\n")
                        buildRules(indent).forEach { result.add("$outerSelector $it\n") }
                    }
                )
            } else {
                result.addAll(buildRules(indent))
            }
        }

        rules.filter { withMedia(it.selector) }.forEach { (selector, _, css) ->
            result.add(
                buildString {
                    append("$indent$selector {\n")
                    css.getCssRules(outerSelector, "  $indent").forEach { appendLine(it); }
                    append("$indent}\n")
                }
            )
        }

        ampersandRules.forEach {
            result.add(
                buildString {
                    val selector = resolveRelativeSelector(it.selector, outerSelector!!)
                    result.addAll(it.css.getCssRules(selector, indent))
                }
            )
        }
        return result
    }

    private fun withAmpersand(selector: String): Boolean {
        return selector.contains("&")
    }

    private fun withMedia(selector: String): Boolean {
        return selector.trim().startsWith("@media")
    }

    private fun resolveRelativeSelector(selector: Selector, selfClassName: ClassName): String {
        return selector.replace("&", selfClassName)
    }
}

private fun Rule.toStyledRule(parent: RuleBuilder, block: RuleSet = this.block): StyledRule {
    return StyledRule(
        selector,
        passStaticClassesToParent,
        CSSBuilder(allowClasses = false, parent = if (passStaticClassesToParent) parent else null).apply { block() }
            .toStyledCss()
    )
}

/**
 * @return all [multiRules], but only the first occurrence of a regular rule from [rules]
 */
private fun resolveRules(rules: List<Rule>, multiRules: List<Rule>, parent: RuleBuilder): List<StyledRule> {
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

internal fun CSSBuilder.toStyledCss(): StyledCss {
    val resolvedRules = resolveRules(rules = rules, multiRules = multiRules, parent = this)
    return StyledCss(declarations, rules = resolvedRules, classes = classes)
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
