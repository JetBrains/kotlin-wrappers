package kotlinx.css.properties

import kotlinx.css.Rule
import kotlinx.css.RuleContainer
import kotlinx.css.RuleSet

interface KeyframesBuilder : RuleContainer {
    fun from(block: RuleSet) = rule("from", block)
    fun to(block: RuleSet) = rule("to", block)

    operator fun Int.invoke(block: RuleSet) = rule("$this%", block)
    operator fun Double.invoke(block: RuleSet) = rule("$this%", block)
}

fun KeyframesBuilder(indent: String = ""): KeyframesBuilder {
    return KeyframesBuilderImpl(indent)
}

class KeyframesBuilderImpl(private val indent: String = "") : KeyframesBuilder {
    override fun toString() =
        buildString {
            buildRules(indent)
        }

    override val rules = mutableListOf<Rule>()
    override val multiRules = mutableListOf<Rule>()
}
