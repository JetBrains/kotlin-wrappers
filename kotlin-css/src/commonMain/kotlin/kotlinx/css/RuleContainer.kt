package kotlinx.css

@CssDsl
interface RuleContainer {
    val indent: String
    val rules: MutableList<Rule>
    val multiRules: MutableList<Rule>

    fun StringBuilder.buildRules(indent: String) {
        val resolvedRules = resolveRules(rules, multiRules)

        resolvedRules.forEach { (selector, css) ->
            append("$selector {\n")
            append(css)
            append("}\n")
        }
    }

    /**
     * @return all [multiRules], but only the first occurrence of a regular rule from [rules]
     */
    fun resolveRules(rules: List<Rule>, multiRules: List<Rule>): List<Rule> {
        val resolvedRules = LinkedHashMap<String, Rule>()
        val newRules = mutableListOf<Rule>()
        rules.forEach {
            if (!resolvedRules.containsKey(it.selector)) {
                resolvedRules[it.selector] = it
            }
        }
        newRules.addAll(resolvedRules.map { it.value })
        newRules.addAll(multiRules)
        return newRules
    }


    fun rule(selector: String, block: RuleSet) = rule(selector, passStaticClassesToParent = false, block = block)
    fun rule(selector: String, passStaticClassesToParent: Boolean, repeatable: Boolean = false, css: CssBuilder) =
        Rule(selector, css).also {
            css.parent = if (passStaticClassesToParent) this else null
            (if (repeatable) multiRules else rules).add(it)
        }

    fun rule(selector: String, passStaticClassesToParent: Boolean, repeatable: Boolean = false, block: RuleSet): Rule {
        val css = CssBuilder(
            "$indent  ",
            allowClasses = false,
            parent = if (passStaticClassesToParent) this else null
        ).apply(block)
        return rule(selector, passStaticClassesToParent, repeatable, css)
    }
}
