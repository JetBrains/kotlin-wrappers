// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * Synchronizes a video element with a simulation clock.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VideoSynchronizer.html">Online Documentation</a>
 */
external class VideoSynchronizer {
    /**
     * Gets or sets the simulation time that marks the start of the video.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VideoSynchronizer.html#epoch">Online Documentation</a>
     */
    var epoch: JulianDate

    /**
     * Gets or sets the amount of time in seconds the video's currentTime
     * and the clock's currentTime can diverge before a video seek is performed.
     * Lower values make the synchronization more accurate but video
     * performance might suffer.  Higher values provide better performance
     * but at the cost of accuracy.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VideoSynchronizer.html#tolerance">Online Documentation</a>
     */
    var tolerance: Double

    /**
     * Gets or sets the clock used to drive the video element.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VideoSynchronizer.html#clock">Online Documentation</a>
     */
    var clock: Clock

    /**
     * Gets or sets the video element to synchronize.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VideoSynchronizer.html#element">Online Documentation</a>
     */
    var element: org.w3c.dom.HTMLVideoElement

    /**
     * Destroys and resources used by the object.  Once an object is destroyed, it should not be used.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VideoSynchronizer.html#destroy">Online Documentation</a>
     */
    fun destroy()

    /**
     * Returns true if this object was destroyed; otherwise, false.
     * @return True if this object was destroyed; otherwise, false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VideoSynchronizer.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean
}

inline fun VideoSynchronizer(
    block: VideoSynchronizer.() -> Unit,
): VideoSynchronizer =
    VideoSynchronizer().apply(block)
