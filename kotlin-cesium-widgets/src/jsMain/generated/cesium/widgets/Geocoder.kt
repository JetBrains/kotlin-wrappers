// Automatically generated - do not modify!

@file:JsModule("@cesium/widgets")

package cesium.widgets

import cesium.engine.GeocoderService
import cesium.engine.Scene
import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import web.dom.Element

/**
 * A widget for finding addresses and landmarks, and flying the camera to them.  Geocoding is
 * performed using [Cesium ion](https://cesium.com/cesium-ion/).
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Geocoder.html">Online Documentation</a>
 */
external class Geocoder(
    options: ConstructorOptions,
) {
    /**
     * @property [container] The DOM element that will contain the widget.
     * @property [scene] The Scene instance to use.
     * @property [geocoderServices] The geocoder services to be used
     * @property [autoComplete] True if the geocoder should query as the user types to autocomplete
     *   Default value - `true`
     * @property [flightDuration] The duration of the camera flight to an entered location, in seconds.
     *   Default value - `1.5`
     * @property [destinationFound] A callback function that is called after a successful geocode.  If not supplied, the default behavior is to fly the camera to the result destination.
     *   Default value - [GeocoderViewModel.flyToDestination]
     */
    @JsPlainObject
    interface ConstructorOptions {
        val container: Element
        val scene: Scene
        val geocoderServices: ReadonlyArray<GeocoderService>?
        val autoComplete: Boolean?
        val flightDuration: Double?
        val destinationFound: DestinationFoundFunction?
    }

    /**
     * Gets the parent container.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Geocoder.html#container">Online Documentation</a>
     */
    var container: Element

    /**
     * Gets the parent container.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Geocoder.html#searchSuggestionsContainer">Online Documentation</a>
     */
    var searchSuggestionsContainer: Element

    /**
     * Gets the view model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Geocoder.html#viewModel">Online Documentation</a>
     */
    var viewModel: GeocoderViewModel

    /**
     * @return true if the object has been destroyed, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Geocoder.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the widget.  Should be called if permanently
     * removing the widget from layout.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Geocoder.html#destroy">Online Documentation</a>
     */
    fun destroy()
}
