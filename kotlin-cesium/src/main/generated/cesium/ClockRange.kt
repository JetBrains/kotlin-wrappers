// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * Constants used by [Clock.tick] to determine behavior
 * when [Clock.startTime] or [Clock.stopTime] is reached.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#ClockRange">Online Documentation</a>
 */

external enum class ClockRange {

    /**
     * [Clock.tick] will always advances the clock in its current direction.
     */
    UNBOUNDED,

    /**
     * When [Clock.startTime] or [Clock.stopTime] is reached,
     * [Clock.tick] will not advance [Clock.currentTime] any further.
     */
    CLAMPED,

    /**
     * When [Clock.stopTime] is reached, [Clock.tick] will advance
     * [Clock.currentTime] to the opposite end of the interval.  When
     * time is moving backwards, [Clock.tick] will not advance past
     * [Clock.startTime]
     */
    LOOP_STOP,

    ;

}
