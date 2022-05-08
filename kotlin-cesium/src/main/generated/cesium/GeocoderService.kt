// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * Provides geocoding through an external service. This type describes an interface and
 * is not intended to be used.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeocoderService.html">Online Documentation</a>
 */
external class GeocoderService {
    /**
     * @param [query] The query to be sent to the geocoder service
     * @param [type] The type of geocode to perform.
     *   Default value - [GeocodeType.SEARCH]
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeocoderService.html#geocode">Online Documentation</a>
     */
    fun geocode(
        query: String,
        type: GeocodeType? = definedExternally,
    ): kotlin.js.Promise<Array<out Result>>

    /**
     * @property [displayName] The display name for a location
     * @property [destination] The bounding box for a location
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeocoderService.html#.Result">Online Documentation</a>
     */
    interface Result {
        var displayName: String
        var destination: dynamic
    }
}
