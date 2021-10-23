package kotlinx.css

@CssDsl
interface RuleContainer {
    val indent: String
    val rules: MutableList<Rule>
    val multiRules: MutableList<Rule>

    fun StringBuilder.buildRules(indent: String) {
        val resolvedRules = LinkedHashMap<String, CssBuilder>()
        rules.forEach { (selector, css) ->
            if (!resolvedRules.containsKey(selector)) {
                resolvedRules[selector] = css
            }
        }

        resolvedRules.forEach { (selector, css) ->
            append("$selector {\n")
            append(css)
            append("}\n")
        }

        multiRules.forEach { (selector, css) ->
            append("$selector {\n")
            append(css)
            append("}\n")
        }
    }


    fun rule(selector: String, block: RuleSet) = rule(selector, passStaticClassesToParent = false, block = block)
    fun rule(selector: String, passStaticClassesToParent: Boolean, repeatable: Boolean = false, block: RuleSet): Rule {
        val css = CssBuilder(
            "$indent  ",
            allowClasses = false,
            parent = if (passStaticClassesToParent) this else null
        ).apply(block)
        return Rule(selector, css, block).also {
            (if (repeatable) multiRules else rules).add(it)
        }
    }
}
