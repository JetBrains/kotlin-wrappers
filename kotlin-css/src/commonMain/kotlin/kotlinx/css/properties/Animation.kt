@file:Suppress("EnumEntryName")

package kotlinx.css.properties

import kotlinx.css.CssValue
import kotlinx.css.StyleList
import kotlinx.css.hyphenize

data class IterationCount(override val value: String) : CssValue(value) {
    override fun toString() = value

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


data class Animation(
    val name: String,
    val duration: Time = 0.s,
    val timing: Timing = Timing.ease,
    val delay: Time = 0.s,
    val iterationCount: IterationCount = 1.times,
    val direction: AnimationDirection = AnimationDirection.normal,
    val fillMode: FillMode = FillMode.none,
    val playState: PlayState = PlayState.running,
) : CssValue("$duration $timing $delay $iterationCount $direction $fillMode $playState $name") {
    override fun toString() = value
}

class Animations : StyleList<Animation>(", ") {
    companion object {
        val none = Animations()
    }
}
