// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * A simple clock for keeping track of simulated time.
 * ```
 * // Create a clock that loops on Christmas day 2013 and runs in real-time.
 * const clock = new Clock({
 *    startTime : JulianDate.fromIso8601("2013-12-25"),
 *    currentTime : JulianDate.fromIso8601("2013-12-25"),
 *    stopTime : JulianDate.fromIso8601("2013-12-26"),
 *    clockRange : ClockRange.LOOP_STOP,
 *    clockStep : ClockStep.SYSTEM_CLOCK_MULTIPLIER
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Clock.html">Online Documentation</a>
 */
external class Clock {
    /**
     * The start time of the clock.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Clock.html#startTime">Online Documentation</a>
     */
    var startTime: JulianDate

    /**
     * The stop time of the clock.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Clock.html#stopTime">Online Documentation</a>
     */
    var stopTime: JulianDate

    /**
     * Determines how the clock should behave when
     * [Clock.startTime] or [Clock.stopTime]
     * is reached.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Clock.html#clockRange">Online Documentation</a>
     */
    var clockRange: ClockRange

    /**
     * Indicates whether [Clock.tick] can advance time.  This could be false if data is being buffered,
     * for example.  The clock will only advance time when both
     * [Clock.canAnimate] and [Clock.shouldAnimate] are true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Clock.html#canAnimate">Online Documentation</a>
     */
    var canAnimate: Boolean

    /**
     * An [Event] that is fired whenever [Clock.tick] is called.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Clock.html#onTick">Online Documentation</a>
     */
    var onTick: Event<*>

    /**
     * An [Event] that is fired whenever [Clock.stopTime] is reached.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Clock.html#onStop">Online Documentation</a>
     */
    var onStop: Event<*>

    /**
     * The current time.
     * Changing this property will change
     * [Clock.clockStep] from [ClockStep.SYSTEM_CLOCK] to
     * [ClockStep.SYSTEM_CLOCK_MULTIPLIER].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Clock.html#currentTime">Online Documentation</a>
     */
    var currentTime: JulianDate

    /**
     * Gets or sets how much time advances when [Clock.tick] is called. Negative values allow for advancing backwards.
     * If [Clock.clockStep] is set to [ClockStep.TICK_DEPENDENT], this is the number of seconds to advance.
     * If [Clock.clockStep] is set to [ClockStep.SYSTEM_CLOCK_MULTIPLIER], this value is multiplied by the
     * elapsed system time since the last call to [Clock.tick].
     * Changing this property will change
     * [Clock.clockStep] from [ClockStep.SYSTEM_CLOCK] to
     * [ClockStep.SYSTEM_CLOCK_MULTIPLIER].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Clock.html#multiplier">Online Documentation</a>
     */
    var multiplier: Double

    /**
     * Determines if calls to [Clock.tick] are frame dependent or system clock dependent.
     * Changing this property to [ClockStep.SYSTEM_CLOCK] will set
     * [Clock.multiplier] to 1.0, [Clock.shouldAnimate] to true, and
     * [Clock.currentTime] to the current system clock time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Clock.html#clockStep">Online Documentation</a>
     */
    var clockStep: ClockStep

    /**
     * Indicates whether [Clock.tick] should attempt to advance time.
     * The clock will only advance time when both
     * [Clock.canAnimate] and [Clock.shouldAnimate] are true.
     * Changing this property will change
     * [Clock.clockStep] from [ClockStep.SYSTEM_CLOCK] to
     * [ClockStep.SYSTEM_CLOCK_MULTIPLIER].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Clock.html#shouldAnimate">Online Documentation</a>
     */
    var shouldAnimate: Boolean

    /**
     * Advances the clock from the current time based on the current configuration options.
     * tick should be called every frame, regardless of whether animation is taking place
     * or not.  To control animation, use the [Clock.shouldAnimate] property.
     * @return The new value of the [Clock.currentTime] property.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Clock.html#tick">Online Documentation</a>
     */
    fun tick(): JulianDate
}

inline fun Clock(
    block: Clock.() -> Unit,
): Clock =
    Clock().apply(block)
