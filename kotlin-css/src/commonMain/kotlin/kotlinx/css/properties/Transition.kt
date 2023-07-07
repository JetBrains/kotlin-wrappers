package kotlinx.css.properties

import kotlinx.css.StyleList

class Transition(val property: String = "all", val duration: Time = 0.s, private val timing: Timing = Timing.ease, private val delay: Time = 0.s) {
    override fun toString() = "$property $duration $timing $delay"
}

class Transitions : StyleList<Transition>(", ") {
    companion object {
        val none = Transitions()
    }
}
