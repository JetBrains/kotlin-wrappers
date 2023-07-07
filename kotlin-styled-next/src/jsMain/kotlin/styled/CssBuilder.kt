package styled

import kotlinx.css.CssBuilder
import kotlinx.css.animation
import kotlinx.css.properties.*

fun CssBuilder.animation(
    duration: Time = 0.s,
    timing: Timing = Timing.ease,
    delay: Time = 0.s,
    iterationCount: IterationCount = 1.times,
    direction: AnimationDirection = AnimationDirection.normal,
    fillMode: FillMode = FillMode.none,
    playState: PlayState = PlayState.running,
    builder: KeyframesBuilder.() -> Unit,
) {
    val name = GlobalStyles.scheduleToInject(builder)
    animation += Animation(name, duration, timing, delay, iterationCount, direction, fillMode, playState)
}
