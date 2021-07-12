package styled

import kotlinx.css.CSSBuilder
import kotlinx.css.properties.*

fun CSSBuilder.animation(
    duration: Time = 0.s,
    timing: Timing = Timing.ease,
    delay: Time = 0.s,
    iterationCount: IterationCount = 1.times,
    direction: AnimationDirection = AnimationDirection.normal,
    fillMode: FillMode = FillMode.none,
    playState: PlayState = PlayState.running,
    handler: KeyframesBuilder.() -> Unit,
) = animation(keyframes(indent, handler), duration, timing, delay, iterationCount, direction, fillMode, playState)

inline fun keyframes(indent: String = "", handler: KeyframesBuilder.() -> Unit): String {
    val builder = KeyframesBuilder(indent)
    builder.handler()
    return keyframesName(builder.toString())
}
