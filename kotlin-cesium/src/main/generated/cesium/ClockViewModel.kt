// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * A view model which exposes a [Clock] for user interfaces.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClockViewModel.html">Online Documentation</a>
 *
 * @constructor
 * @property [clock] The clock object wrapped by this view model, if undefined a new instance will be created.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClockViewModel.html">Online Documentation</a>
 */
external class ClockViewModel(var clock: Clock = definedExternally) {
    /**
     * Gets the current system time.
     * This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClockViewModel.html#systemTime">Online Documentation</a>
     */
    var systemTime: JulianDate

    /**
     * Gets or sets the start time of the clock.
     * See [Clock.startTime].
     * This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClockViewModel.html#startTime">Online Documentation</a>
     */
    var startTime: JulianDate

    /**
     * Gets or sets the stop time of the clock.
     * See [Clock.stopTime].
     * This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClockViewModel.html#stopTime">Online Documentation</a>
     */
    var stopTime: JulianDate

    /**
     * Gets or sets the current time.
     * See [Clock.currentTime].
     * This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClockViewModel.html#currentTime">Online Documentation</a>
     */
    var currentTime: JulianDate

    /**
     * Gets or sets the clock multiplier.
     * See [Clock.multiplier].
     * This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClockViewModel.html#multiplier">Online Documentation</a>
     */
    var multiplier: Double

    /**
     * Gets or sets the clock step setting.
     * See [Clock.clockStep].
     * This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClockViewModel.html#clockStep">Online Documentation</a>
     */
    var clockStep: ClockStep

    /**
     * Gets or sets the clock range setting.
     * See [Clock.clockRange].
     * This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClockViewModel.html#clockRange">Online Documentation</a>
     */
    var clockRange: ClockRange

    /**
     * Gets or sets whether the clock can animate.
     * See [Clock.canAnimate].
     * This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClockViewModel.html#canAnimate">Online Documentation</a>
     */
    var canAnimate: Boolean

    /**
     * Gets or sets whether the clock should animate.
     * See [Clock.shouldAnimate].
     * This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClockViewModel.html#shouldAnimate">Online Documentation</a>
     */
    var shouldAnimate: Boolean

    /**
     * Updates the view model with the contents of the underlying clock.
     * Can be called to force an update of the viewModel if the underlying
     * clock has changed and `Clock.tick` has not yet been called.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClockViewModel.html#synchronize">Online Documentation</a>
     */
    fun synchronize()

    /**
     * @return true if the object has been destroyed, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClockViewModel.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the view model.  Should be called to
     * properly clean up the view model when it is no longer needed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClockViewModel.html#destroy">Online Documentation</a>
     */
    fun destroy()
}
