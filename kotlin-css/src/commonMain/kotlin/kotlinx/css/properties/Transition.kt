package kotlinx.css.properties

import kotlinx.css.CssValue
import kotlinx.css.StyleList

class Transition(
    property: String = "all",
    duration: Time = 0.s,
    timing: Timing = Timing.ease,
    delay: Time = 0.s
) : CssValue("$property $duration $timing $delay")

class Transitions : StyleList<Transition>(", ") {
    companion object {
        val none = Transitions()
    }
}
