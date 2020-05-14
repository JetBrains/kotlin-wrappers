package kotlinx.css.properties

import kotlinx.css.*

class KeyframesBuilder(private val indent: String = "") : RuleContainer {
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
