// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

/**
 * Constants to determine how much time advances with each call
 * to [Clock.tick].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#ClockStep">Online Documentation</a>
 */

external enum class ClockStep {

    /**
     * [Clock.tick] advances the current time by a fixed step,
     * which is the number of seconds specified by [Clock.multiplier].
     */
    TICK_DEPENDENT,

    /**
     * [Clock.tick] advances the current time by the amount of system
     * time elapsed since the previous call multiplied by [Clock.multiplier].
     */
    SYSTEM_CLOCK_MULTIPLIER,

    /**
     * [Clock.tick] sets the clock to the current system time;
     * ignoring all other settings.
     */
    SYSTEM_CLOCK,

    ;

}
