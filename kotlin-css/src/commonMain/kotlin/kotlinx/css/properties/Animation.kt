@file:Suppress("EnumEntryName")

package kotlinx.css.properties

import kotlinx.css.*

class IterationCount(override val value: String) : CssValue(value) {
    companion object {
        val infinite = IterationCount("infinite")
    }
}

val Int.times get() = IterationCount("$this")

enum class AnimationDirection {
    initial, inherit, unset,

    normal, reverse, alternate, alternateReverse;

    override fun toString() = name.hyphenize()
}

enum class FillMode {
    initial, inherit, unset,

    none, forwards, backwards, both;

    override fun toString() = name
}

enum class PlayState {
    initial, inherit, unset,

    running, paused;

    override fun toString() = name
}


class Animation(
    val duration: Time = 0.s,
    private val timing: Timing = Timing.ease,
    private val delay: Time = 0.s,
    private val iterationCount: IterationCount = 1.times,
    private val direction: AnimationDirection = AnimationDirection.normal,
    private val fillMode: FillMode = FillMode.none,
    private val playState: PlayState = PlayState.running,
    val name: String,
) {
    override fun toString() = "$duration $timing $delay $iterationCount $direction $fillMode $playState $name"
}

class Animations : StyleList<Animation>(", ") {
    companion object {
        val none = Animations()
    }
}

fun StyledElement.animation(
    name: String,
    duration: Time = 0.s,
    timing: Timing = Timing.ease,
    delay: Time = 0.s,
    iterationCount: IterationCount = 1.times,
    direction: AnimationDirection = AnimationDirection.normal,
    fillMode: FillMode = FillMode.none,
    playState: PlayState = PlayState.running,
) {
    animation += Animation(duration, timing, delay, iterationCount, direction, fillMode, playState, name)
}
