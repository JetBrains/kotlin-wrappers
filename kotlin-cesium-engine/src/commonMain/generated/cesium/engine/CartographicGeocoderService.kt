// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray
import js.promise.Promise
import seskar.js.JsAsync

/**
 * Geocodes queries containing longitude and latitude coordinates and an optional height.
 * Query format: `longitude latitude (height)` with longitude/latitude in degrees and height in meters.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CartographicGeocoderService.html">Online Documentation</a>
 */
external class CartographicGeocoderService {
    /**
     * Gets the credit to display after a geocode is performed. Typically this is used to credit
     * the geocoder service.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CartographicGeocoderService.html#credit">Online Documentation</a>
     */
    val credit: Credit?

    /**
     * @param [query] The query to be sent to the geocoder service
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CartographicGeocoderService.html#geocode">Online Documentation</a>
     */
    @JsAsync
    suspend fun geocode(query: String): ReadonlyArray<GeocoderService.Result>

    @JsName("geocode")
    fun geocodeAsync(query: String): Promise<ReadonlyArray<GeocoderService.Result>>
}
