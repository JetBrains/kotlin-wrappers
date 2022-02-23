// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * Pauses the KmlTour for a given number of seconds.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/KmlTourWait.html">Online Documentation</a>
 *
 * @constructor
 * @param [duration] entry duration
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/KmlTourWait.html">Online Documentation</a>
 */
external class KmlTourWait(duration: Double) {
    /**
     * Play this playlist entry
     * @param [done] function which will be called when playback ends
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/KmlTourWait.html#play">Online Documentation</a>
     */
    fun play(done: DoneCallback)

    /**
     * Stop execution of curent entry, cancel curent timeout
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/KmlTourWait.html#stop">Online Documentation</a>
     */
    fun stop()
}
