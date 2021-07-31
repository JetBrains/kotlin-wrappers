package kotlinx.css

@CssDsl
interface RuleBuilder {
    fun StringBuilder.buildRules(indent: String) {
        val resolvedRules = LinkedHashMap<String, CSSBuilder>()
        rules.forEach { (selector, passStaticClassesToParent, block) ->
            if (!resolvedRules.containsKey(selector)) {
                resolvedRules[selector] = CSSBuilder(
                    "$indent  ",
                    allowClasses = false,
                    parent = if (passStaticClassesToParent) this@RuleBuilder else null
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
            val blockBuilder = CSSBuilder(
                "$indent  ",
                allowClasses = false,
                parent = if (passStaticClassesToParent) this@RuleBuilder else null
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

@Deprecated(
    message = "Legacy type alias",
    replaceWith = ReplaceWith("RuleBuilder", "kotlinx.css"),
)
typealias RuleContainer = RuleBuilder

typealias RuleSet = CSSBuilder.() -> Unit

fun ruleSet(set: RuleSet) = set

data class Rule(val selector: String, val passStaticClassesToParent: Boolean = false, val block: RuleSet)
