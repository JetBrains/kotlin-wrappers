package kotlinx.css.properties

import kotlinx.css.Rule
import kotlinx.css.RuleContainer
import kotlinx.css.RuleSet
import kotlinx.css.calculateEquals

interface KeyframesBuilder : RuleContainer {
    fun from(block: RuleSet) = rule("from", block)
    fun to(block: RuleSet) = rule("to", block)

    operator fun Int.invoke(block: RuleSet) = rule("$this%", block)
    operator fun Double.invoke(block: RuleSet) = rule("$this%", block)
}

fun KeyframesBuilder(indent: String = ""): KeyframesBuilder {
    return KeyframesBuilderImpl(indent)
}

class KeyframesBuilderImpl(override val indent: String = "") : KeyframesBuilder {
    override val rules = mutableListOf<Rule>()
    override val multiRules = mutableListOf<Rule>()

    override fun toString() =
        buildString {
            buildRules(indent)
        }

    private var memoizedHashCode: Int? = null
    override fun hashCode(): Int {
        return memoizedHashCode ?: (rules.sumOf { it.hashCode() } + multiRules.sumOf { it.hashCode() })
            .also { hashCode -> memoizedHashCode = hashCode }
    }

    override fun equals(other: Any?) = calculateEquals(other) { t2 -> rules == t2.rules && multiRules == t2.multiRules }
}
