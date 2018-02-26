package styled.properties

import kotlinext.js.*
import styled.*

class KeyframesBuilder(private val indent: String = "") : RuleContainer {
    override fun toString() =
        buildString {
            buildRules(indent)
        }

    override val rules = mutableListOf<Rule>()

    fun from(block: RuleSet) = rule("from", block)
    fun to(block: RuleSet) = rule("to", block)

    operator fun Int.invoke(block: RuleSet) = rule("$this%", block)
    operator fun Double.invoke(block: RuleSet) = rule("$this%", block)
}

inline fun keyframes(indent: String = "", handler: KeyframesBuilder.() -> Unit): String {
    val builder = KeyframesBuilder(indent)
    builder.handler()
    return StyledComponents.keyframes(builder.toString())
}
