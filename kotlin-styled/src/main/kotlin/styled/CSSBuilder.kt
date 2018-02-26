package styled

import kotlinext.js.*
import styled.properties.*

typealias RuleSet = CSSBuilder.() -> Unit

fun ruleSet(set: RuleSet) = set

data class Rule(val selector: String, val block: RuleSet)

interface RuleContainer {
    fun StringBuilder.buildRules(indent: String) {
        val resolvedRules = HashMap<String, CSSBuilder>()
        rules.forEach { (selector, block) ->
            if (!resolvedRules.containsKey(selector)) {
                resolvedRules[selector] = CSSBuilder("$indent  ", allowClasses = false)
            }
            val rule = resolvedRules[selector]!!
            rule.block()
        }

        resolvedRules.forEach {
            append("${it.key} {\n")
            append(it.value)
            append("}\n")
        }
    }

    val rules: MutableList<Rule>

    fun rule(selector: String, block: RuleSet) = Rule(selector, block).apply {
        rules.add(this)
    }
}


class CSSBuilder(private val indent: String = "", val allowClasses: Boolean = true) : StyledElement(), RuleContainer {
    var styleName: String? = null

    var classes = mutableListOf<String>()

    override fun toString() = buildString {
        declarations.forEach {
            append("${it.key.hyphenize()}: ${it.value};\n")
        }

        buildRules(indent)
    }

    override val rules = mutableListOf<Rule>()

    operator fun String.invoke(block: RuleSet) = rule(this, block)

    operator fun TagSelector.invoke(block: RuleSet) = tagName(block)

    // https://developer.mozilla.org/en/docs/Web/CSS/Pseudo-classes
    // The more exotic ones were omitted
    fun active(block: RuleSet) = "&:active"(block)

    fun checked(block: RuleSet) = "&:checked"(block)
    fun disabled(block: RuleSet) = "&:disabled"(block)
    fun empty(block: RuleSet) = "&:empty"(block)
    fun enabled(block: RuleSet) = "&:enabled"(block)
    fun firstChild(block: RuleSet) = "&:first-child"(block)
    fun firstOfType(block: RuleSet) = "&:first-of-type"(block)
    fun focus(block: RuleSet) = "&:focus"(block)
    fun hover(block: RuleSet) = "&:hover"(block)
    fun lastChild(block: RuleSet) = "&:last-child"(block)
    fun lastOfType(block: RuleSet) = "&:last-of-type"(block)
    fun link(block: RuleSet) = "&:link"(block)
    fun onlyChild(block: RuleSet) = "&:only-child"(block)
    fun onlyOfType(block: RuleSet) = "&:only-of-type"(block)
    fun visited(block: RuleSet) = "&:visited"(block)

    // Children & descendants
    fun children(selector: String? = null, block: RuleSet) = "& > ${selector?.let { it } ?: "*"}"(block)

    fun descendants(selector: String? = null, block: RuleSet) = "& ${selector?.let { it } ?: "*"}"(block)

    // TODO refactor, uses a dev-mode property!
    fun ancestorHover(styleName: String, block: RuleSet) = "[data-style*=\"$styleName\"]:hover &"(block)

    // https://developer.mozilla.org/en/docs/Web/CSS/Pseudo-elements
    fun after(block: RuleSet) = "&::after" {
        content = "".quoted
        block()
    }

    fun before(block: RuleSet) = "&::before" {
        content = "".quoted
        block()
    }

    fun placeholder(block: RuleSet) {
        "&::placeholder"(block)
        "&::-webkit-input-placeholder"(block) // Chrome, Opera, Safari
        "&::-moz-placeholder"(block) // Firefox 19+
        "&::-ms-input-placeholder"(block) // IE 10+
        "&:-moz-placeholder"(block) // Firefox 18-
    }

    // Combinators
    fun child(selector: String, block: RuleSet) = "> $selector"(block)

    fun sibling(selector: String, block: RuleSet) = "~ $selector"(block)

    fun adjacentSibling(selector: String, block: RuleSet) = "+ $selector"(block)

    operator fun compareTo(rule: Rule): Int {
        // remove current rule
        rules.removeAt(rules.lastIndex)
        child(rule.selector, rule.block)
        return 0
    }

    operator fun Rule.not() {
        rules.removeAt(rules.lastIndex)
        selector.replace(Regex("^(&?)(.*)$"), "$1:not($2)")(block)
    }

    operator fun Rule.unaryPlus() {
        rules.removeAt(rules.lastIndex)
        "&.$selector"(block)
    }

    fun specific(specificity: Int = 2, block: RuleSet) = "&".repeat(specificity)(block)

    fun media(query: String, block: RuleSet) = "@media ($query)"(block)

    operator fun RuleSet.unaryPlus() = this()

    operator fun String.unaryPlus() {
        if (!allowClasses) {
            throw RuntimeException("class names are not allowed for this builder")
        }
        classes.add(this)
    }

    operator fun Array<String>.unaryPlus() {
        if (!allowClasses) {
            throw RuntimeException("class names are not allowed for this builder")
        }
        this.forEach { classes.add(it) }
    }

    operator fun Iterable<String>.unaryPlus() {
        if (!allowClasses) {
            throw RuntimeException("class names are not allowed for this builder")
        }
        this.forEach { classes.add(it) }
    }

    fun animation(
        duration: Time = 0.s,
        timing: Timing = Timing.ease,
        delay: Time = 0.s,
        iterationCount: IterationCount = 1.times,
        direction: AnimationDirection = AnimationDirection.normal,
        fillMode: FillMode = FillMode.none,
        playState: PlayState = PlayState.running,
        handler: KeyframesBuilder.() -> Unit
    ) = animation(keyframes(indent, handler), duration, timing, delay, iterationCount, direction, fillMode, playState)
}
