// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * Transitions the KmlTour to the next destination. This transition is facilitated
 * using a specified flyToMode over a given number of seconds.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/KmlTourFlyTo.html">Online Documentation</a>
 *
 * @constructor
 * @param [duration] entry duration
 * @param [flyToMode] KML fly to mode: bounce, smooth, etc
 * @param [view] KmlCamera or KmlLookAt
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/KmlTourFlyTo.html">Online Documentation</a>
 */
external class KmlTourFlyTo(
    duration: Double,
    flyToMode: String,
    view: KmlCamera,
) {
    constructor(
        duration: Double,
        flyToMode: String,
        view: KmlLookAt,
    )

    /**
     * Play this playlist entry
     * @param [done] function which will be called when playback ends
     * @param [camera] Cesium camera
     * @param [cameraOptions] which will be merged with camera flyTo options. See [Camera.flyTo]
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/KmlTourFlyTo.html#play">Online Documentation</a>
     */
    fun play(
        done: DoneCallback,
        camera: Camera,
        cameraOptions: Any? = definedExternally,
    )

    /**
     * Stop execution of curent entry. Cancel camera flyTo
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/KmlTourFlyTo.html#stop">Online Documentation</a>
     */
    fun stop()

    /**
     * Returns options for [Camera.flyTo] or [Camera.flyToBoundingSphere]
     * depends on this.view type.
     * @param [cameraOptions] options to merge with generated. See [Camera.flyTo]
     * @return [Camera.flyTo] or [Camera.flyToBoundingSphere] options
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/KmlTourFlyTo.html#getCameraOptions">Online Documentation</a>
     */
    fun getCameraOptions(cameraOptions: Any): Any
}

/**
 * A function that will be executed when the flight completes.
 * @param [terminated] true if [KmlTourFlyTo.stop] was
 *   called before entry done playback.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/KmlTourFlyTo.html#.DoneCallback">Online Documentation</a>
 */
typealias DoneCallback = (terminated: Boolean) -> Unit
