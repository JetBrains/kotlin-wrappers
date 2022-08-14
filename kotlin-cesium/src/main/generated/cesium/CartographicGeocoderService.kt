// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

import kotlinx.js.ReadonlyArray

/**
 * Geocodes queries containing longitude and latitude coordinates and an optional height.
 * Query format: `longitude latitude (height)` with longitude/latitude in degrees and height in meters.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CartographicGeocoderService.html">Online Documentation</a>
 */
external class CartographicGeocoderService {
    /**
     * @param [query] The query to be sent to the geocoder service
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CartographicGeocoderService.html#geocode">Online Documentation</a>
     */
    fun geocode(query: String): kotlin.js.Promise<ReadonlyArray<GeocoderService.Result>>
}
