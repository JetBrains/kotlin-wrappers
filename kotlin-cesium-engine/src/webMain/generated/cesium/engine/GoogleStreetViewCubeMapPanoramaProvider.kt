// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.promise.Promise
import kotlinx.js.JsPlainObject
import seskar.js.JsAsync

/**
 * <div class="notice">
 * This object is normally not instantiated directly, use [GoogleStreetViewCubeMapPanoramaProvider.fromUrl].
 * </div>
 *
 * Creates a [PanoramaProvider] which provides imagery from [Google Street View Static API](https://developers.google.com/maps/documentation/streetview) to be displayed in a panorama.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleStreetViewCubeMapPanoramaProvider.html">Online Documentation</a>
 */
external class GoogleStreetViewCubeMapPanoramaProvider {
    /**
     * Gets the panorama primitive for a requested position and orientation.
     * ```
     * const provider = await GoogleStreetViewCubeMapPanoramaProvider.fromUrl({
     *   key: 'your Google Streetview Static api key'
     * })
     *
     * const panoIdObject = provider.getNearestPanoId(position);
     * const position = Cartographic.fromDegrees(panoIdObject.location.lng, panoIdObject.location.lat, 0);
     *
     * const primitive = await provider.loadPanorama({
     *   cartographic: position,
     *   panoId: panoIdObject.panoId
     * });
     * viewer.scene.primitive.add(primitive);
     * ```
     * @return The panorama primitive textured with imagery.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleStreetViewCubeMapPanoramaProvider.html#loadPanorama">Online Documentation</a>
     */
    fun loadPanorama(options: LoadPanoramaOptions): CubeMapPanorama

    /**
     * @property [cartographic] The position to place the panorama in the scene.
     * @property [panoId] The panoramaId identifier for the image in the Google API. If not provided this will be looked up for the provided cartographic location.
     * @property [tileSize] Optional tile size override (square).
     * @property [signature] Optional signature for signed URLs. See [https://developers.google.com/maps/documentation/streetview/digital-signature] for more information.
     * @property [credit] A credit for the data source, which is displayed on the canvas.
     */
    @JsPlainObject
    interface LoadPanoramaOptions {
        val cartographic: Cartographic
        val panoId: String?
        val tileSize: Double?
        val signature: String?
        val credit: Credit?
    }

    /**
     * Gets the panoIds for the given cartographic location. See [https://developers.google.com/maps/documentation/tile/streetview#panoid-search].
     * ```
     * const provider = await GoogleStreetViewCubeMapPanoramaProvider.fromUrl({
     *   key: 'your Google Streetview Static api key'
     * })
     * const panoIds = provider.getNearestPanoId(position);
     * ```
     * @param [position] The position to search for the nearest panoId.
     * @param [radius] The radius in meters to search for the nearest panoId.
     *   Default value - `50`
     * @return an object containing a panoId, latitude, and longitude of the closest panorama
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleStreetViewCubeMapPanoramaProvider.html#getNearestPanoId">Online Documentation</a>
     */
    fun getNearestPanoId(
        position: Cartographic,
        radius: Double? = definedExternally,
    ): JsAny

    /**
     * Gets metadata for panoId. See [https://developers.google.com/maps/documentation/tile/streetview#metadata_response] for response object.
     * ```
     * const panoIdObject = provider.getNearestPanoId(position);
     * const panoIdMetadata = provider.getPanoIdMetadata(panoIdObject.panoId);
     * ```
     * @return object containing metadata for the panoId.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleStreetViewCubeMapPanoramaProvider.html#getPanoIdMetadata">Online Documentation</a>
     */
    fun getPanoIdMetadata(panoId: String): JsAny

    companion object {
        /**
         * Creates a [PanoramaProvider] which provides cube face images from the [Google Street View Static API](https://developers.google.com/maps/documentation/streetview).
         * ```
         * const provider = await GoogleStreetViewCubeMapPanoramaProvider.fromUrl({
         *   key: 'your Google Streetview Static api key'
         * })
         * ```
         * @return A promise that resolves to the created GoogleStreetViewCubeMapPanoramaProvider.'
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleStreetViewCubeMapPanoramaProvider.html#.fromUrl">Online Documentation</a>
         */
        @JsAsync
        @Suppress("WRONG_EXTERNAL_DECLARATION")
        suspend fun fromUrl(options: FromUrlOptions): GoogleStreetViewCubeMapPanoramaProvider

        @JsName("fromUrl")
        fun fromUrlAsync(options: FromUrlOptions): Promise<GoogleStreetViewCubeMapPanoramaProvider>

        /**
         * @property [key] Your API key to access Google Street View Static API. See [https://developers.google.com/maps/documentation/javascript/get-api-key] for instructions on how to create your own key. If undefined, defaults to [GoogleMaps.defaultStreetViewStaticApiKey]. If that value is unavailable, falls back to [GoogleMaps.defaultApiKey].
         *   Default value - [GoogleMaps.defaultStreetViewStaticApiKey]
         * @property [url] The URL to access Google Street View Static API. See [https://developers.google.com/maps/documentation/streetview/overview] for more information.
         *   Default value - [GoogleMaps.streetViewStaticApiEndpoint]
         * @property [tileSize] Default width and height (in pixels) of each square tile.
         *   Default value - `600`
         * @property [credit] A credit for the data source, which is displayed on the canvas.
         */
        @JsPlainObject
        interface FromUrlOptions {
            val key: String?
            val url: Resource?
            val tileSize: Double?
            val credit: Credit?
        }
    }
}
