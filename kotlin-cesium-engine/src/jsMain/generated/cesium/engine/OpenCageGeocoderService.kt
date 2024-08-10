// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium.engine

import js.array.ReadonlyArray
import js.promise.Promise
import seskar.js.JsAsync

/**
 * Provides geocoding via a [OpenCage](https://opencagedata.com/) server.
 * ```
 * // Configure a Viewer to use the OpenCage Geocoder
 * const viewer = new Viewer('cesiumContainer', {
 *   geocoder: new OpenCageGeocoderService('https://api.opencagedata.com/geocode/v1/', '<API key>')
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OpenCageGeocoderService.html">Online Documentation</a>
 *
 * @constructor
 * @property [url] The endpoint to the OpenCage server.
 * @param [apiKey] The OpenCage API Key.
 * @param [params] An object with the following properties (See https://opencagedata.com/api#forward-opt):
 * @param [params.abbrv] When set to 1 we attempt to abbreviate and shorten the formatted string we return.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OpenCageGeocoderService.html">Online Documentation</a>
 */
external class OpenCageGeocoderService(
    val url: Resource,
    apiKey: String,
    params: Any /* {
        abbrv?: number;
    } */? = definedExternally,
) {
    constructor(
        url: String,
        apiKey: String,
        params: Any /* {
        abbrv?: number;
    } */? = definedExternally,
    )

    /**
     * Optional params passed to OpenCage in order to customize geocoding
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OpenCageGeocoderService.html#params">Online Documentation</a>
     */
    val params: Any

    /**
     * Gets the credit to display after a geocode is performed. Typically this is used to credit
     * the geocoder service.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OpenCageGeocoderService.html#credit">Online Documentation</a>
     */
    val credit: Credit?

    /**
     * @param [query] The query to be sent to the geocoder service
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OpenCageGeocoderService.html#geocode">Online Documentation</a>
     */
    @JsAsync
    suspend fun geocode(query: String): ReadonlyArray<GeocoderService.Result>

    @JsName("geocode")
    fun geocodeAsync(query: String): Promise<ReadonlyArray<GeocoderService.Result>>
}
