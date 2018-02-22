package styled.properties

import styled.*
import kotlin.reflect.*

class Transition(val property: String, val duration: Time, private val timing: Timing, private val delay: Time) {
    override fun toString() = "$property $duration $timing $delay"
}

class Transitions : StyleList<Transition>(", ") {
    companion object {
        val none = Transitions()
    }
}

fun StyledElement.transition(
    property: String = "all",
    duration: Time = 0.s,
    timing: Timing = Timing.ease,
    delay: Time = 0.s
) {
    transition += Transition(property, duration, timing, delay)
}

fun StyledElement.transition(
    property: KProperty<*>,
    duration: Time = 0.s,
    timing: Timing = Timing.ease,
    delay: Time = 0.s
) = transition(property.name.hyphenize(), duration, timing, delay)

fun CSSBuilder.delayUnhover(vararg properties: KProperty<*>,
                            duration: Time = 300.ms,
                            timing: Timing = Timing.materialDeceleration,
                            delay: Time = 0.s) = !hover {
    when {
        properties.isNotEmpty() -> properties.forEach {
            transition(it, duration, timing, delay)
        }
        else -> transition("all", duration, timing, delay)
    }
}
