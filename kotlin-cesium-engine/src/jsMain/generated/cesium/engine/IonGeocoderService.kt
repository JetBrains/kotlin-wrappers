// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray
import js.promise.Promise
import kotlinx.js.JsPlainObject
import seskar.js.JsAsync

/**
 * Provides geocoding through Cesium ion.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IonGeocoderService.html">Online Documentation</a>
 */
external class IonGeocoderService(
    options: ConstructorOptions,
) {
    /**
     * @property [scene] The scene
     * @property [accessToken] The access token to use.
     *   Default value - [Ion.defaultAccessToken]
     * @property [server] The resource to the Cesium ion API server.
     *   Default value - [Ion.defaultServer]
     */
    @JsPlainObject
    interface ConstructorOptions {
        val scene: Scene
        val accessToken: String?
        val server: Resource?
    }

    /**
     * Gets the credit to display after a geocode is performed. Typically this is used to credit
     * the geocoder service.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IonGeocoderService.html#credit">Online Documentation</a>
     */
    val credit: Credit?

    /**
     * @param [query] The query to be sent to the geocoder service
     * @param [type] The type of geocode to perform.
     *   Default value - [GeocodeType.SEARCH]
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IonGeocoderService.html#geocode">Online Documentation</a>
     */
    @JsAsync
    suspend fun geocode(
        query: String,
        type: GeocodeType? = definedExternally,
    ): ReadonlyArray<GeocoderService.Result>

    @JsName("geocode")
    fun geocodeAsync(
        query: String,
        type: GeocodeType? = definedExternally,
    ): Promise<ReadonlyArray<GeocoderService.Result>>
}
