package kotlinx.css.properties

import kotlinx.css.Rule
import kotlinx.css.RuleBuilder
import kotlinx.css.RuleSet

class KeyframesBuilder(private val indent: String = "") : RuleBuilder {
    override fun toString() =
        buildString {
            buildRules(indent)
        }

    override val rules = mutableListOf<Rule>()
    override val multiRules = mutableListOf<Rule>()

    fun from(block: RuleSet) = rule("from", block)
    fun to(block: RuleSet) = rule("to", block)

    operator fun Int.invoke(block: RuleSet) = rule("$this%", block)
    operator fun Double.invoke(block: RuleSet) = rule("$this%", block)
}
