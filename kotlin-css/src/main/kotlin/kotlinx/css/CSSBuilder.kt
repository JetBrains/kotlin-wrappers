package kotlinx.css

typealias RuleSet = CSSBuilder.() -> Unit

fun ruleSet(set: RuleSet) = set

data class Rule(val selector: String, val passStaticClassesToParent: Boolean = false, val block: RuleSet)

interface RuleContainer {
    fun StringBuilder.buildRules(indent: String) {
        val resolvedRules = LinkedHashMap<String, CSSBuilder>()
        rules.forEach { (selector, passStaticClassesToParent, block) ->
            if (!resolvedRules.containsKey(selector)) {
                resolvedRules[selector] = CSSBuilder(
                    "$indent  ",
                    allowClasses = false,
                    parent = if (passStaticClassesToParent) this@RuleContainer else null
                )
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

    fun rule(selector: String, block: RuleSet) = rule(selector, false, block)

    fun rule(selector: String, passStaticClassesToParent: Boolean, block: RuleSet) =
        Rule(selector, passStaticClassesToParent, block).apply {
            rules.add(this)
        }
}

class CSSBuilder(
    val indent: String = "",
    val allowClasses: Boolean = true,
    val parent: RuleContainer? = null
) : StyledElement(), RuleContainer {
    var classes = mutableListOf<String>()

    var styleName = mutableListOf<String>()

    override fun toString() = buildString {
        declarations.forEach {
            append("${it.key.hyphenize()}: ${it.value};\n")
        }

        buildRules(indent)
    }

    override val rules = mutableListOf<Rule>()

    operator fun String.invoke(block: RuleSet) =
        rule(this, false, block)

    operator fun TagSelector.invoke(block: RuleSet) = tagName(block)

    // https://developer.mozilla.org/en/docs/Web/CSS/Pseudo-classes
    // The experimental ones were omitted
    fun active(block: RuleSet) = "&:active"(block)

    fun checked(block: RuleSet) = "&:checked"(block)
    fun default(block: RuleSet) = "&:default"(block)
    fun disabled(block: RuleSet) = "&:disabled"(block)
    fun empty(block: RuleSet) = "&:empty"(block)
    fun enabled(block: RuleSet) = "&:enabled"(block)
    fun firstChild(block: RuleSet) = "&:first-child"(block)
    fun firstOfType(block: RuleSet) = "&:first-of-type"(block)
    fun focus(block: RuleSet) = "&:focus"(block)
    fun hover(block: RuleSet) = "&:hover"(block)
    fun indeterminate(block: RuleSet) = "&:indeterminate"(block)
    fun inRange(block: RuleSet) = "&:in-range"(block)
    fun invalid(block: RuleSet) = "&:invalid"(block)
    fun lastChild(block: RuleSet) = "&:last-child"(block)
    fun lastOfType(block: RuleSet) = "&:last-of-type"(block)
    fun link(block: RuleSet) = "&:link"(block)
    fun not(selector: String, block: RuleSet) = "&:not($selector)"(block)
    fun nthChild(selector: String, block: RuleSet) = "&:nth-child($selector)"(block)
    fun nthLastChild(selector: String, block: RuleSet) = "&:nth-last-child($selector)"(block)
    fun nthLastOfType(selector: String, block: RuleSet) = "&:nth-last-of-type($selector)"(block)
    fun nthOfType(selector: String, block: RuleSet) = "&:nth-of-type($selector)"(block)
    fun onlyChild(block: RuleSet) = "&:only-child"(block)
    fun onlyOfType(block: RuleSet) = "&:only-of-type"(block)
    fun optional(block: RuleSet) = "&:optional"(block)
    fun outOfRange(block: RuleSet) = "&:out-of-range"(block)
    fun readOnly(block: RuleSet) = "&:read-only"(block)
    fun readWrite(block: RuleSet) = "&:read-write"(block)
    fun required(block: RuleSet) = "&:required"(block)
    fun valid(block: RuleSet) = "&:valid"(block)
    fun visited(block: RuleSet) = "&:visited"(block)

    // Children & descendants
    fun children(selector: String? = null, block: RuleSet) = "& > ${selector?.let { it } ?: "*"}"(block)

    fun descendants(selector: String? = null, block: RuleSet) = "& ${selector?.let { it } ?: "*"}"(block)

    fun ancestorHover(selector: String, block: RuleSet) = "$selector:hover &"(block)

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

    // Universal selector
    fun universal(block: RuleSet) = "*"(block)

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

    fun specific(specificity: Int = 2, block: RuleSet): Rule {
        return rule("&".repeat(specificity), passStaticClassesToParent = true, block = block)
    }

    fun prefix(selector: String, block: RuleSet) {
        "$selector &"(block)
    }

    // https://developer.mozilla.org/en-US/docs/Web/CSS/At-rule
    fun media(query: String, block: RuleSet) = "@media $query"(block)

    fun supports(query: String, block: RuleSet) = "@supports $query"(block)

    fun fontFace(query: String, block: RuleSet) = "@font-face $query"(block)

    // Custom properties
    fun root(block: RuleSet) {
        ":root" {
            block()
        }
    }

    fun setCustomProperty(name: String, value: CssValue) {
        put("--$name", value.value)
    }

    // Operator overrides
    operator fun RuleSet.unaryPlus() = this()

    operator fun String.unaryPlus() = addClass(this)

    operator fun Array<String>.unaryPlus() = this.forEach { addClass(it) }

    operator fun Iterable<String>.unaryPlus() = this.forEach { addClass(it) }

    private fun addClass(className: String) {
        if (allowClasses) {
            classes.add(className)
        } else {
            (parent as? CSSBuilder)?.addClass(className)
        }
    }
}

fun String.toCustomProperty(): String {
    return "var(--$this)"
}
