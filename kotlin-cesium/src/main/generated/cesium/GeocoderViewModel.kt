// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.ReadonlyArray

/**
 * The view model for the [Geocoder] widget.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeocoderViewModel.html">Online Documentation</a>
 */
external class GeocoderViewModel(options: ConstructorOptions) {
    /**
     * @property [scene] The Scene instance to use.
     * @property [geocoderServices] Geocoder services to use for geocoding queries.
     *   If more than one are supplied, suggestions will be gathered for the geocoders that support it,
     *   and if no suggestion is selected the result from the first geocoder service wil be used.
     * @property [flightDuration] The duration of the camera flight to an entered location, in seconds.
     * @property [destinationFound] A callback function that is called after a successful geocode.  If not supplied, the default behavior is to fly the camera to the result destination.
     *   Default value - [GeocoderViewModel.flyToDestination]
     */
    interface ConstructorOptions {
        var scene: Scene
        var geocoderServices: ReadonlyArray<GeocoderService>?
        var flightDuration: Double?
        var destinationFound: DestinationFoundFunction?
    }

    /**
     * Gets or sets a value indicating if this instance should always show its text input field.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeocoderViewModel.html#keepExpanded">Online Documentation</a>
     */
    var keepExpanded: Boolean

    /**
     * True if the geocoder should query as the user types to autocomplete
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeocoderViewModel.html#autoComplete">Online Documentation</a>
     */
    var autoComplete: Boolean

    /**
     * Gets and sets the command called when a geocode destination is found
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeocoderViewModel.html#destinationFound">Online Documentation</a>
     */
    var destinationFound: DestinationFoundFunction

    /**
     * Gets a value indicating whether a search is currently in progress.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeocoderViewModel.html#isSearchInProgress">Online Documentation</a>
     */
    var isSearchInProgress: Boolean

    /**
     * Gets or sets the text to search for.  The text can be an address, or longitude, latitude,
     * and optional height, where longitude and latitude are in degrees and height is in meters.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeocoderViewModel.html#searchText">Online Documentation</a>
     */
    var searchText: String

    /**
     * Gets or sets the the duration of the camera flight in seconds.
     * A value of zero causes the camera to instantly switch to the geocoding location.
     * The duration will be computed based on the distance when undefined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeocoderViewModel.html#flightDuration">Online Documentation</a>
     */
    var flightDuration: Double?

    /**
     * Gets the event triggered on flight completion.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeocoderViewModel.html#complete">Online Documentation</a>
     */
    var complete: DefaultEvent

    /**
     * Gets the scene to control.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeocoderViewModel.html#scene">Online Documentation</a>
     */
    var scene: Scene

    /**
     * Gets the Command that is executed when the button is clicked.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeocoderViewModel.html#search">Online Documentation</a>
     */
    var search: Command

    /**
     * Gets the currently selected geocoder search suggestion
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeocoderViewModel.html#selectedSuggestion">Online Documentation</a>
     */
    var selectedSuggestion: Any

    /**
     * Gets the list of geocoder search suggestions
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeocoderViewModel.html#suggestions">Online Documentation</a>
     */
    var suggestions: ReadonlyArray<Any>

    /**
     * Destroys the widget.  Should be called if permanently
     * removing the widget from layout.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeocoderViewModel.html#destroy">Online Documentation</a>
     */
    fun destroy()

    companion object {
        /**
         * A function to fly to the destination found by a successful geocode.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeocoderViewModel.html#.flyToDestination">Online Documentation</a>
         */
        var flyToDestination: DestinationFoundFunction
    }
}

inline fun GeocoderViewModel(
    block: GeocoderViewModel.ConstructorOptions.() -> Unit,
): GeocoderViewModel {
    val options: GeocoderViewModel.ConstructorOptions = js("({})")
    block(options)
    return GeocoderViewModel(options)
}
