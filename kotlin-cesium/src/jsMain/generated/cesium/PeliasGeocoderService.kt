// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

import js.core.ReadonlyArray
import js.promise.Promise

/**
 * Provides geocoding via a [Pelias](https://pelias.io/) server.
 * ```
 * // Configure a Viewer to use the Pelias server hosted by https://geocode.earth/
 * const viewer = new Viewer('cesiumContainer', {
 *   geocoder: new PeliasGeocoderService(new Resource({
 *     url: 'https://api.geocode.earth/v1/',
 *       queryParameters: {
 *         api_key: '<Your geocode.earth API key>'
 *     }
 *   }))
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PeliasGeocoderService.html">Online Documentation</a>
 *
 * @constructor
 * @property [url] The endpoint to the Pelias server.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PeliasGeocoderService.html">Online Documentation</a>
 */
external class PeliasGeocoderService(val url: Resource) {
    constructor(url: String)

    /**
     * Gets the credit to display after a geocode is performed. Typically this is used to credit
     * the geocoder service.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PeliasGeocoderService.html#credit">Online Documentation</a>
     */
    val credit: Credit?

    /**
     * @param [query] The query to be sent to the geocoder service
     * @param [type] The type of geocode to perform.
     *   Default value - [GeocodeType.SEARCH]
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PeliasGeocoderService.html#geocode">Online Documentation</a>
     */
    fun geocode(
        query: String,
        type: GeocodeType? = definedExternally,
    ): Promise<ReadonlyArray<GeocoderService.Result>>
}
