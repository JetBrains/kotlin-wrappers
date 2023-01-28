// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.ReadonlyArray
import js.core.jso
import web.dom.Element

/**
 * A widget for finding addresses and landmarks, and flying the camera to them.  Geocoding is
 * performed using [Cesium ion](https://cesium.com/cesium-ion/).
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Geocoder.html">Online Documentation</a>
 */
external class Geocoder(options: ConstructorOptions) {
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
    interface ConstructorOptions {
        var container: Element
        var scene: Scene
        var geocoderServices: ReadonlyArray<GeocoderService>?
        var autoComplete: Boolean?
        var flightDuration: Double?
        var destinationFound: DestinationFoundFunction?
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

/**
 * A function that handles the result of a successful geocode.
 * @param [viewModel] The view model.
 * @param [destination] The destination result of the geocode.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Geocoder.html#.DestinationFoundFunction">Online Documentation</a>
 */
typealias DestinationFoundFunction = (viewModel: GeocoderViewModel, destination: dynamic) -> Unit

inline fun Geocoder(
    block: Geocoder.ConstructorOptions.() -> Unit,
): Geocoder =
    Geocoder(options = jso(block))
