// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Pauses the KmlTour for a given number of seconds.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/KmlTourWait.html">Online Documentation</a>
 *
 * @constructor
 * @param [duration] entry duration
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/KmlTourWait.html">Online Documentation</a>
 */
open external class KmlTourWait(
    duration: Double,
) {
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

    /**
     * A function which will be called when playback ends.
     * @param [terminated] true if [KmlTourWait.stop] was
     *   called before entry done playback.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/KmlTourWait.html#.DoneCallback">Online Documentation</a>
     */
    typealias DoneCallback = (terminated: Boolean) -> Unit
}
