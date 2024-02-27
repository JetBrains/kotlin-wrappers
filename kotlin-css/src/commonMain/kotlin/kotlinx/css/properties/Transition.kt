package kotlinx.css.properties

import kotlinx.css.CssValue
import kotlinx.css.StyleList

data class Transition(
    val property: String = "all",
    val duration: Time = 0.s,
    val timing: Timing = Timing.ease,
    val delay: Time = 0.s,
) : CssValue("$property $duration $timing $delay") {
    override fun toString() = value
}

class Transitions : StyleList<Transition>(", ") {
    companion object {
        val none = Transitions()
    }
}
