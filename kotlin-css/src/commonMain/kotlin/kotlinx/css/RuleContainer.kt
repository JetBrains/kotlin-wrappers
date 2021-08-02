package kotlinx.css

interface RuleContainer {
    fun StringBuilder.buildRules(indent: String) {
        val resolvedRules = LinkedHashMap<String, CssBuilder>()
        rules.forEach { (selector, passStaticClassesToParent, block) ->
            if (!resolvedRules.containsKey(selector)) {
                resolvedRules[selector] = CssBuilderImpl(
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

        multiRules.forEach { (selector, passStaticClassesToParent, block) ->
            val blockBuilder = CssBuilderImpl(
                "$indent  ",
                allowClasses = false,
                parent = if (passStaticClassesToParent) this@RuleContainer else null
            ).apply(block)

            append("$selector {\n")
            append(blockBuilder)
            append("}\n")
        }
    }

    val rules: MutableList<Rule>
    val multiRules: MutableList<Rule>

    fun rule(selector: String, block: RuleSet) = rule(selector, passStaticClassesToParent = false, block = block)

    fun rule(selector: String, passStaticClassesToParent: Boolean, repeatable: Boolean = false, block: RuleSet) =
        Rule(selector, passStaticClassesToParent, block).apply {
            (if (repeatable) multiRules else rules).add(this)
        }
}
