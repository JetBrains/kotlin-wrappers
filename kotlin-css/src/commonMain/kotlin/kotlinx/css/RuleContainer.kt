package kotlinx.css

@CssDsl
interface RuleContainer {
    val indent: String
    val rules: MutableList<Rule>
    val multiRules: MutableList<Rule>

    fun StringBuilder.buildRules(indent: String) {
        val resolvedRules = resolveRules(rules, multiRules)

        resolvedRules.forEach {
            appendLine("${it.selector} {")
            append(it.css)
            appendLine("}")
        }
    }

    /**
     * @return all [multiRules], but only the first occurrence of a regular rule from [rules]
     */
    fun resolveRules(rules: List<Rule>, multiRules: List<Rule>): List<Rule> {
        val resolvedRules = LinkedHashMap<String, Rule>()
        rules.forEach {
            val foundRule = resolvedRules[it.selector]
            if (foundRule == null) {
                resolvedRules[it.selector] = Rule(it.selector, CssBuilder().apply { append(it.css) })
            } else {
                // if CSS with the selector already exists, append new CSS to the old one
                foundRule.css.append(it.css)
            }
        }
        return multiRules + resolvedRules.values
    }

    fun rule(selector: String, block: RuleSet) = rule(selector, passStaticClassesToParent = false, block = block)

    fun rule(selector: String, passStaticClassesToParent: Boolean, repeatable: Boolean = false, block: RuleSet): Rule {
        val css = CssBuilder(
            "$indent  ",
            allowClasses = false,
            parent = if (passStaticClassesToParent) this else null
        ).apply(block)
        return rule(selector, passStaticClassesToParent, repeatable, css)
    }

    fun rule(selector: String, passStaticClassesToParent: Boolean, repeatable: Boolean = false, css: CssBuilder) =
        Rule(selector, css).also {
            css.parent = if (passStaticClassesToParent) this else null
            (if (repeatable) multiRules else rules).add(it)
        }
}
