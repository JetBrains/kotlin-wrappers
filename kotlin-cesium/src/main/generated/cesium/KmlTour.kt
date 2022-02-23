// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * Describes a KmlTour, which uses KmlTourFlyTo, and KmlTourWait to
 * guide the camera to a specified destinations on given time intervals.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/KmlTour.html">Online Documentation</a>
 *
 * @constructor
 * @property [name] name parsed from KML
 * @property [id] id parsed from KML
 * @property [playlist] array with KmlTourFlyTos and KmlTourWaits
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/KmlTour.html">Online Documentation</a>
 */
external class KmlTour(
    var name: String,
    var id: String,
    var playlist: Array<out Any>,
) {
    /**
     * Index of current entry from playlist
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/KmlTour.html#playlistIndex">Online Documentation</a>
     */
    var playlistIndex: Int

    /**
     * Event will be called when tour starts to play,
     * before any playlist entry starts to play.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/KmlTour.html#tourStart">Online Documentation</a>
     */
    var tourStart: Event

    /**
     * Event will be called when all playlist entries are
     * played, or tour playback being canceled.
     *
     * If tour playback was terminated, event callback will
     * be called with terminated=true parameter.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/KmlTour.html#tourEnd">Online Documentation</a>
     */
    var tourEnd: Event

    /**
     * Event will be called when entry from playlist starts to play.
     *
     * Event callback will be called with curent entry as first parameter.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/KmlTour.html#entryStart">Online Documentation</a>
     */
    var entryStart: Event

    /**
     * Event will be called when entry from playlist ends to play.
     *
     * Event callback will be called with following parameters:
     * 1. entry - entry
     * 2. terminated - true if playback was terminated by calling [KmlTour.stop]
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/KmlTour.html#entryEnd">Online Documentation</a>
     */
    var entryEnd: Event

    /**
     * Add entry to this tour playlist.
     * @param [entry] an entry to add to the playlist.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/KmlTour.html#addPlaylistEntry">Online Documentation</a>
     */
    fun addPlaylistEntry(entry: KmlTourFlyTo)

    fun addPlaylistEntry(entry: KmlTourWait)

    /**
     * Play this tour.
     * @param [viewer] viewer widget.
     * @param [cameraOptions] these options will be merged with [Camera.flyTo]
     *   options for FlyTo playlist entries.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/KmlTour.html#play">Online Documentation</a>
     */
    fun play(
        viewer: Viewer,
        cameraOptions: Any? = definedExternally,
    )

    /**
     * Stop curently playing tour.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/KmlTour.html#stop">Online Documentation</a>
     */
    fun stop()
}
