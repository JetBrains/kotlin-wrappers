package kotlinx.css.properties

import kotlinx.css.StyleList
import kotlinx.css.StyledElement
import kotlinx.css.transition

class Transition(val property: String = "all", val duration: Time = 0.s, private val timing: Timing = Timing.ease, private val delay: Time = 0.s) {
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
    delay: Time = 0.s,
) {
    transition += Transition(property, duration, timing, delay)
}
