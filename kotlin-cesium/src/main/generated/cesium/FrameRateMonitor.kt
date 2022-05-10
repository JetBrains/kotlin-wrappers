// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * Monitors the frame rate (frames per second) in a [Scene] and raises an event if the frame rate is
 * lower than a threshold.  Later, if the frame rate returns to the required level, a separate event is raised.
 * To avoid creating multiple FrameRateMonitors for a single [Scene], use [FrameRateMonitor.fromScene]
 * instead of constructing an instance explicitly.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FrameRateMonitor.html">Online Documentation</a>
 */
external class FrameRateMonitor {
    /**
     * Gets or sets the length of the sliding window over which to compute the average frame rate, in seconds.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FrameRateMonitor.html#samplingWindow">Online Documentation</a>
     */
    var samplingWindow: Double

    /**
     * Gets or sets the length of time to wait at startup and each time the page becomes visible (i.e. when the user
     * switches back to the tab) before starting to measure performance, in seconds.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FrameRateMonitor.html#quietPeriod">Online Documentation</a>
     */
    var quietPeriod: Double

    /**
     * Gets or sets the length of the warmup period, in seconds.  During the warmup period, a separate
     * (usually lower) frame rate is required.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FrameRateMonitor.html#warmupPeriod">Online Documentation</a>
     */
    var warmupPeriod: Double

    /**
     * Gets or sets the minimum frames-per-second that are required for acceptable performance during
     * the warmup period.  If the frame rate averages less than this during any `samplingWindow` during the `warmupPeriod`, the
     * `lowFrameRate` event will be raised and the page will redirect to the `redirectOnLowFrameRateUrl`, if any.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FrameRateMonitor.html#minimumFrameRateDuringWarmup">Online Documentation</a>
     */
    var minimumFrameRateDuringWarmup: Int

    /**
     * Gets or sets the minimum frames-per-second that are required for acceptable performance after
     * the end of the warmup period.  If the frame rate averages less than this during any `samplingWindow` after the `warmupPeriod`, the
     * `lowFrameRate` event will be raised and the page will redirect to the `redirectOnLowFrameRateUrl`, if any.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FrameRateMonitor.html#minimumFrameRateAfterWarmup">Online Documentation</a>
     */
    var minimumFrameRateAfterWarmup: Int

    /**
     * Gets the [Scene] instance for which to monitor performance.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FrameRateMonitor.html#scene">Online Documentation</a>
     */
    var scene: Scene

    /**
     * Gets the event that is raised when a low frame rate is detected.  The function will be passed
     * the [Scene] instance as its first parameter and the average number of frames per second
     * over the sampling window as its second parameter.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FrameRateMonitor.html#lowFrameRate">Online Documentation</a>
     */
    var lowFrameRate: DefaultEvent

    /**
     * Gets the event that is raised when the frame rate returns to a normal level after having been low.
     * The function will be passed the [Scene] instance as its first parameter and the average
     * number of frames per second over the sampling window as its second parameter.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FrameRateMonitor.html#nominalFrameRate">Online Documentation</a>
     */
    var nominalFrameRate: DefaultEvent

    /**
     * Gets the most recently computed average frames-per-second over the last `samplingWindow`.
     * This property may be undefined if the frame rate has not been computed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FrameRateMonitor.html#lastFramesPerSecond">Online Documentation</a>
     */
    var lastFramesPerSecond: Int

    /**
     * Pauses monitoring of the frame rate.  To resume monitoring, [FrameRateMonitor.unpause]
     * must be called once for each time this function is called.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FrameRateMonitor.html#pause">Online Documentation</a>
     */
    fun pause()

    /**
     * Resumes monitoring of the frame rate.  If [FrameRateMonitor.pause] was called
     * multiple times, this function must be called the same number of times in order to
     * actually resume monitoring.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FrameRateMonitor.html#unpause">Online Documentation</a>
     */
    fun unpause()

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return True if this object was destroyed; otherwise, false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FrameRateMonitor.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Unsubscribes this instance from all events it is listening to.
     * Once an object is destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.  Therefore,
     * assign the return value (`undefined`) to the object as done in the example.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FrameRateMonitor.html#destroy">Online Documentation</a>
     */
    fun destroy()

    companion object {
        /**
         * The default frame rate monitoring settings.  These settings are used when [FrameRateMonitor.fromScene]
         * needs to create a new frame rate monitor, and for any settings that are not passed to the
         * [FrameRateMonitor] constructor.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FrameRateMonitor.html#.defaultSettings">Online Documentation</a>
         */
        var defaultSettings: Any

        /**
         * Gets the [FrameRateMonitor] for a given scene.  If the scene does not yet have
         * a [FrameRateMonitor], one is created with the [FrameRateMonitor.defaultSettings].
         * @param [scene] The scene for which to get the [FrameRateMonitor].
         * @return The scene's [FrameRateMonitor].
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FrameRateMonitor.html#.fromScene">Online Documentation</a>
         */
        fun fromScene(scene: Scene): FrameRateMonitor
    }
}

inline fun FrameRateMonitor(
    block: FrameRateMonitor.() -> Unit,
): FrameRateMonitor =
    FrameRateMonitor().apply(block)
