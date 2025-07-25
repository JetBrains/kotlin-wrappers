// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import js.promise.Promise
import seskar.js.JsAsync

/**
 * Provides geocoding through Bing Maps.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsGeocoderService.html">Online Documentation</a>
 */
external class BingMapsGeocoderService(
    options: ConstructorOptions,
) {
    /**
     * @property [key] A key to use with the Bing Maps geocoding service
     * @property [culture] A Bing Maps [Culture Code](https://docs.microsoft.com/en-us/bingmaps/rest-services/common-parameters-and-types/supported-culture-codes) to return results in a specific culture and language.
     */
    @JsPlainObject
    interface ConstructorOptions {
        val key: String
        val culture: String?
    }

    /**
     * The URL endpoint for the Bing geocoder service
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsGeocoderService.html#url">Online Documentation</a>
     */
    val url: String

    /**
     * The key for the Bing geocoder service
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsGeocoderService.html#key">Online Documentation</a>
     */
    val key: String

    /**
     * Gets the credit to display after a geocode is performed. Typically this is used to credit
     * the geocoder service.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsGeocoderService.html#credit">Online Documentation</a>
     */
    val credit: Credit?

    /**
     * @param [query] The query to be sent to the geocoder service
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsGeocoderService.html#geocode">Online Documentation</a>
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun geocode(query: String): ReadonlyArray<GeocoderService.Result>

    @JsName("geocode")
    fun geocodeAsync(query: String): Promise<ReadonlyArray<GeocoderService.Result>>
}
