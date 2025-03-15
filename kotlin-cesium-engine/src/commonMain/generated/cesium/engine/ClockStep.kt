// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Constants to determine how much time advances with each call
 * to [Clock.tick].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#ClockStep">Online Documentation</a>
 */
sealed external interface ClockStep {
    companion object {

        /**
         * [Clock.tick] advances the current time by a fixed step,
         * which is the number of seconds specified by [Clock.multiplier].
         */
        val TICK_DEPENDENT: ClockStep

        /**
         * [Clock.tick] advances the current time by the amount of system
         * time elapsed since the previous call multiplied by [Clock.multiplier].
         */
        val SYSTEM_CLOCK_MULTIPLIER: ClockStep

        /**
         * [Clock.tick] sets the clock to the current system time;
         * ignoring all other settings.
         */
        val SYSTEM_CLOCK: ClockStep
    }
}
