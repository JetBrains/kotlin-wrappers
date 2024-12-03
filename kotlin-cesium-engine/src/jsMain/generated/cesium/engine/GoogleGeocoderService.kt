// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray
import js.promise.Promise
import kotlinx.js.JsPlainObject
import seskar.js.JsAsync

/**
 * Provides geocoding through Google.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleGeocoderService.html">Online Documentation</a>
 */
external class GoogleGeocoderService(
    options: ConstructorOptions,
) {
    /**
     * @property [key] An API key to use with the Google geocoding service
     */
    @JsPlainObject
    interface ConstructorOptions {
        var key: String
    }

    /**
     * Gets the credit to display after a geocode is performed. Typically this is used to credit
     * the geocoder service.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleGeocoderService.html#credit">Online Documentation</a>
     */
    val credit: Credit?

    /**
     * Get a list of possible locations that match a search string.
     * @param [query] The query to be sent to the geocoder service
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleGeocoderService.html#geocode">Online Documentation</a>
     */
    @JsAsync
    suspend fun geocode(query: String): ReadonlyArray<GeocoderService.Result>

    @JsName("geocode")
    fun geocodeAsync(query: String): Promise<ReadonlyArray<GeocoderService.Result>>
}
