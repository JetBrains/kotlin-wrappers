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

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as KeyframesBuilderImpl
        return rules == other.rules && multiRules == other.multiRules
    }
}
