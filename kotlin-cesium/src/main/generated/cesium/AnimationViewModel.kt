// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

import js.core.ReadonlyArray

/**
 * The view model for the [Animation] widget.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AnimationViewModel.html">Online Documentation</a>
 *
 * @constructor
 * @property [clockViewModel] The ClockViewModel instance to use.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AnimationViewModel.html">Online Documentation</a>
 */
external class AnimationViewModel(var clockViewModel: ClockViewModel) {
    /**
     * Gets or sets whether the shuttle ring is currently being dragged.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AnimationViewModel.html#shuttleRingDragging">Online Documentation</a>
     */
    var shuttleRingDragging: Boolean

    /**
     * Gets or sets whether dragging the shuttle ring should cause the multiplier
     * to snap to the defined tick values rather than interpolating between them.
     * This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AnimationViewModel.html#snapToTicks">Online Documentation</a>
     */
    var snapToTicks: Boolean

    /**
     * Gets the string representation of the current time.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AnimationViewModel.html#timeLabel">Online Documentation</a>
     */
    var timeLabel: String

    /**
     * Gets the string representation of the current date.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AnimationViewModel.html#dateLabel">Online Documentation</a>
     */
    var dateLabel: String

    /**
     * Gets the string representation of the current multiplier.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AnimationViewModel.html#multiplierLabel">Online Documentation</a>
     */
    var multiplierLabel: String

    /**
     * Gets or sets the current shuttle ring angle.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AnimationViewModel.html#shuttleRingAngle">Online Documentation</a>
     */
    var shuttleRingAngle: Double

    /**
     * Gets a copy of the array of positive known clock multipliers to associate with the shuttle ring.
     * @return The array of known clock multipliers associated with the shuttle ring.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AnimationViewModel.html#getShuttleRingTicks">Online Documentation</a>
     */
    fun getShuttleRingTicks(): ReadonlyArray<Double>

    /**
     * Sets the array of positive known clock multipliers to associate with the shuttle ring.
     * These values will have negative equivalents created for them and sets both the minimum
     * and maximum range of values for the shuttle ring as well as the values that are snapped
     * to when a single click is made.  The values need not be in order, as they will be sorted
     * automatically, and duplicate values will be removed.
     * @param [positiveTicks] The list of known positive clock multipliers to associate with the shuttle ring.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AnimationViewModel.html#setShuttleRingTicks">Online Documentation</a>
     */
    fun setShuttleRingTicks(positiveTicks: ReadonlyArray<Double>)

    /**
     * Gets a command that decreases the speed of animation.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AnimationViewModel.html#slower">Online Documentation</a>
     */
    var slower: Command

    /**
     * Gets a command that increases the speed of animation.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AnimationViewModel.html#faster">Online Documentation</a>
     */
    var faster: Command

    /**
     * Gets the pause toggle button view model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AnimationViewModel.html#pauseViewModel">Online Documentation</a>
     */
    var pauseViewModel: ToggleButtonViewModel

    /**
     * Gets the reverse toggle button view model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AnimationViewModel.html#playReverseViewModel">Online Documentation</a>
     */
    var playReverseViewModel: ToggleButtonViewModel

    /**
     * Gets the play toggle button view model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AnimationViewModel.html#playForwardViewModel">Online Documentation</a>
     */
    var playForwardViewModel: ToggleButtonViewModel

    /**
     * Gets the realtime toggle button view model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AnimationViewModel.html#playRealtimeViewModel">Online Documentation</a>
     */
    var playRealtimeViewModel: ToggleButtonViewModel

    /**
     * Gets or sets the function which formats a date for display.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AnimationViewModel.html#dateFormatter">Online Documentation</a>
     */
    var dateFormatter: DateFormatter

    /**
     * Gets or sets the function which formats a time for display.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AnimationViewModel.html#timeFormatter">Online Documentation</a>
     */
    var timeFormatter: TimeFormatter

    companion object {
        /**
         * Gets or sets the default date formatter used by new instances.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AnimationViewModel.html#.defaultDateFormatter">Online Documentation</a>
         */
        var defaultDateFormatter: DateFormatter

        /**
         * Gets or sets the default array of known clock multipliers associated with new instances of the shuttle ring.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AnimationViewModel.html#.defaultTicks">Online Documentation</a>
         */
        var defaultTicks: ReadonlyArray<Double>

        /**
         * Gets or sets the default time formatter used by new instances.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AnimationViewModel.html#.defaultTimeFormatter">Online Documentation</a>
         */
        var defaultTimeFormatter: TimeFormatter
    }
}

/**
 * A function that formats a date for display.
 * @param [date] The date to be formatted
 * @param [viewModel] The AnimationViewModel instance requesting formatting.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AnimationViewModel.html#.DateFormatter">Online Documentation</a>
 */
typealias DateFormatter = (date: JulianDate, viewModel: AnimationViewModel) -> String

/**
 * A function that formats a time for display.
 * @param [date] The date to be formatted
 * @param [viewModel] The AnimationViewModel instance requesting formatting.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AnimationViewModel.html#.TimeFormatter">Online Documentation</a>
 */
typealias TimeFormatter = (date: JulianDate, viewModel: AnimationViewModel) -> String
