package kotlinx.css

interface CssBuilder : StyledElement, RuleContainer {
    val indent: String
    val allowClasses: Boolean
    val parent: RuleContainer?
    val classes: MutableList<String>
    val styleName: MutableList<String>

    operator fun String.invoke(block: RuleSet) =
        rule(this, passStaticClassesToParent = false, block = block)

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
    fun focusVisible(block: RuleSet) = "&:focus-visible"(block)
    fun focusWithin(block: RuleSet) = "&:focus-within"(block)
    fun hover(block: RuleSet) = "&:hover"(block)
    fun indeterminate(block: RuleSet) = "&:indeterminate"(block)
    fun inRange(block: RuleSet) = "&:in-range"(block)
    fun invalid(block: RuleSet) = "&:invalid"(block)
    fun lastChild(block: RuleSet) = "&:last-child"(block)
    fun lastOfType(block: RuleSet) = "&:last-of-type"(block)
    fun link(block: RuleSet) = "&:link"(block)
    fun not(@Suppress("UNUSED_PARAMETER") selector: String, block: RuleSet) = "&:not($selector)"(block)
    fun nthChild(@Suppress("UNUSED_PARAMETER") selector: String, block: RuleSet) = "&:nth-child($selector)"(block)
    fun nthLastChild(@Suppress("UNUSED_PARAMETER") selector: String, block: RuleSet) = "&:nth-last-child($selector)"(block)
    fun nthLastOfType(@Suppress("UNUSED_PARAMETER") selector: String, block: RuleSet) = "&:nth-last-of-type($selector)"(block)
    fun nthOfType(@Suppress("UNUSED_PARAMETER") selector: String, block: RuleSet) = "&:nth-of-type($selector)"(block)
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
    fun children(@Suppress("UNUSED_PARAMETER") selector: String? = null, block: RuleSet) = "& > ${selector ?: "*"}"(block)

    fun descendants(@Suppress("UNUSED_PARAMETER") selector: String? = null, block: RuleSet) = "& ${selector ?: "*"}"(block)

    // Temporarily using && here because of a bug introduced in version 5.2: https://github.com/styled-components/styled-components/issues/3244#issuecomment-687676703
    fun ancestorHover(@Suppress("UNUSED_PARAMETER") selector: String, block: RuleSet) = "$selector:hover &&"(block)

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
    fun child(@Suppress("UNUSED_PARAMETER") selector: String, block: RuleSet) = "> $selector"(block)

    fun sibling(@Suppress("UNUSED_PARAMETER") selector: String, block: RuleSet) = "~ $selector"(block)

    fun adjacentSibling(@Suppress("UNUSED_PARAMETER") selector: String, block: RuleSet) = "+ $selector"(block)

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
        selector.replace(NOT_REGEX, "$1:not($2)")(block)
    }

    operator fun Rule.unaryPlus() {
        rules.removeAt(rules.lastIndex)
        "&.$selector"(block)
    }

    fun specific(specificity: Int = 2, block: RuleSet): Rule {
        return rule("&".repeat(specificity), passStaticClassesToParent = true, block = block)
    }

    fun prefix(@Suppress("UNUSED_PARAMETER") selector: String, block: RuleSet) {
        // Temporarily using && here because of a bug introduced in version 5.2: https://github.com/styled-components/styled-components/issues/3244#issuecomment-687676703
        "$selector &&"(block)
    }

    // https://developer.mozilla.org/en-US/docs/Web/CSS/At-rule
    fun media(@Suppress("UNUSED_PARAMETER") query: String, block: RuleSet) = "@media $query"(block)

    fun supports(@Suppress("UNUSED_PARAMETER") query: String, block: RuleSet) = "@supports $query"(block)

    fun container(@Suppress("UNUSED_PARAMETER") query: String, block: RuleSet) = "@container $query"(block)

    fun fontFace(block: RuleSet) = rule("@font-face", passStaticClassesToParent = false, repeatable = true, block = block)

    fun retina(block: RuleSet) {
        media("(-webkit-min-device-pixel-ratio: 2), (min-resolution: 192dpi)") {
            block()
        }
    }

    // Custom properties
    fun root(block: RuleSet) {
        ":root" {
            block()
        }
    }

    /**
     * Add custom property to CSS [declarations]. If the variable name is in the camelCase, it turns it to snake-case
     */
    fun setCustomProperty(name: String, value: CssValue) {
        put("--$name", value.value)
    }

    // Functions
    fun min(v1: LinearDimension, v2: LinearDimension): LinearDimension =
        LinearDimension("min($v1, $v2)")

    fun max(v1: LinearDimension, v2: LinearDimension): LinearDimension =
        LinearDimension("max($v1, $v2)")

    fun clamp(min: LinearDimension, preferred: LinearDimension, max: LinearDimension): LinearDimension =
        LinearDimension("clamp($min, $preferred, $max)")

    // Operator overrides
    operator fun RuleSet.unaryPlus()

    operator fun String.unaryPlus() = addClass(this)

    operator fun Array<String>.unaryPlus() = this.forEach { addClass(it) }

    operator fun Iterable<String>.unaryPlus() = this.forEach { addClass(it) }

    private fun addClass(className: String) {
        if (allowClasses) {
            classes.add(className)
        } else {
            (parent as? CssBuilder)?.addClass(className)
        }
    }

    companion object {
        private val NOT_REGEX by lazy { Regex("^(&?)(.*)$") }
    }
}

typealias RuleSet = CssBuilder.() -> Unit

fun ruleSet(set: RuleSet) = set

fun String.toCustomProperty(): String {
    return "var(--$this)"
}

fun CssBuilder(indent: String = "", allowClasses: Boolean = true, parent: RuleContainer? = null): CssBuilder = CssBuilderImpl(indent, allowClasses, parent)

open class CssBuilderImpl(
    override val indent: String = "",
    override val allowClasses: Boolean = true,
    override val parent: RuleContainer? = null,
) : CssBuilder {
    override val classes = mutableListOf<String>()
    override fun RuleSet.unaryPlus() = this()

    override val declarations = CssDeclarations()

    override val styleName = mutableListOf<String>()

    override fun toString() = buildString {
        declarations.forEach {
            append("${it.key.hyphenize()}: ${it.value};\n")
        }

        buildRules(indent)
    }

    override val rules = mutableListOf<Rule>()
    override val multiRules = mutableListOf<Rule>()
}
