package css.properties

import css.*

class IterationCount(val value: String) {
    companion object {
        val infinite = IterationCount("infinite")
    }

    override fun toString() = value
}

val Int.times get() = IterationCount("$this")

@Suppress("EnumEntryName")
enum class AnimationDirection {
    normal,
    reverse,
    alternate,
    alternateReverse;

    override fun toString() = name.hyphenize()
}

@Suppress("EnumEntryName")
enum class FillMode {
    none,
    forwards,
    backwards,
    both;

    override fun toString() = name
}

@Suppress("EnumEntryName")
enum class PlayState {
    running,
    paused;

    override fun toString() = name
}


class Animation(
    val duration: Time,
    private val timing: Timing,
    private val delay: Time,
    private val iterationCount: IterationCount,
    private val direction: AnimationDirection,
    private val fillMode: FillMode,
    private val playState: PlayState,
    val name: String
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
    playState: PlayState = PlayState.running
) {
    animation += Animation(duration, timing, delay, iterationCount, direction, fillMode, playState, name)
}
