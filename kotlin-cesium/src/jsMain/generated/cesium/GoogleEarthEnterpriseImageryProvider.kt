// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

import js.core.ReadonlyArray
import js.core.Void
import js.promise.Promise

/**
 * <div class="notice">
 * To construct a GoogleEarthEnterpriseImageryProvider, call [GoogleEarthEnterpriseImageryProvider.fromMetadata]. Do not call the constructor directly.
 * </div>
 *
 * Provides tiled imagery using the Google Earth Enterprise REST API.
 *
 * Notes: This provider is for use with the 3D Earth API of Google Earth Enterprise,
 *        [GoogleEarthEnterpriseMapsProvider] should be used with 2D Maps API.
 * ```
 * const geeMetadata = await GoogleEarthEnterpriseMetadata.fromUrl("http://www.example.com");
 * const gee = GoogleEarthEnterpriseImageryProvider.fromMetadata(geeMetadata);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseImageryProvider.html">Online Documentation</a>
 */
sealed external class GoogleEarthEnterpriseImageryProvider {
    /**
     * Gets the name of the Google Earth Enterprise server url hosting the imagery.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseImageryProvider.html#url">Online Documentation</a>
     */
    val url: String

    /**
     * Gets the proxy used by this provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseImageryProvider.html#proxy">Online Documentation</a>
     */
    val proxy: Proxy

    /**
     * Gets the width of each tile, in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseImageryProvider.html#tileWidth">Online Documentation</a>
     */
    val tileWidth: Int

    /**
     * Gets the height of each tile, in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseImageryProvider.html#tileHeight">Online Documentation</a>
     */
    val tileHeight: Int

    /**
     * Gets the maximum level-of-detail that can be requested.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseImageryProvider.html#maximumLevel">Online Documentation</a>
     */
    val maximumLevel: Int?

    /**
     * Gets the minimum level-of-detail that can be requested.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseImageryProvider.html#minimumLevel">Online Documentation</a>
     */
    val minimumLevel: Int

    /**
     * Gets the tiling scheme used by this provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseImageryProvider.html#tilingScheme">Online Documentation</a>
     */
    val tilingScheme: TilingScheme

    /**
     * Gets the rectangle, in radians, of the imagery provided by this instance.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseImageryProvider.html#rectangle">Online Documentation</a>
     */
    val rectangle: Rectangle

    /**
     * Gets the tile discard policy.  If not undefined, the discard policy is responsible
     * for filtering out "missing" tiles via its shouldDiscardImage function.  If this function
     * returns undefined, no tiles are filtered.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseImageryProvider.html#tileDiscardPolicy">Online Documentation</a>
     */
    val tileDiscardPolicy: TileDiscardPolicy

    /**
     * Gets an event that is raised when the imagery provider encounters an asynchronous error.  By subscribing
     * to the event, you will be notified of the error and can potentially recover from it.  Event listeners
     * are passed an instance of [TileProviderError].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseImageryProvider.html#errorEvent">Online Documentation</a>
     */
    val errorEvent: DefaultEvent

    /**
     * Gets the credit to display when this imagery provider is active.  Typically this is used to credit
     * the source of the imagery.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseImageryProvider.html#credit">Online Documentation</a>
     */
    val credit: Credit

    /**
     * Gets a value indicating whether or not the images provided by this imagery provider
     * include an alpha channel.  If this property is false, an alpha channel, if present, will
     * be ignored.  If this property is true, any images without an alpha channel will be treated
     * as if their alpha is 1.0 everywhere.  Setting this property to false reduces memory usage
     * and texture upload time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseImageryProvider.html#hasAlphaChannel">Online Documentation</a>
     */
    val hasAlphaChannel: Boolean

    /**
     * Gets the credits to be displayed when a given tile is displayed.
     * @param [x] The tile X coordinate.
     * @param [y] The tile Y coordinate.
     * @param [level] The tile level;
     * @return The credits to be displayed when the tile is displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseImageryProvider.html#getTileCredits">Online Documentation</a>
     */
    fun getTileCredits(
        x: Double,
        y: Double,
        level: Int,
    ): ReadonlyArray<Credit>

    /**
     * Requests the image for a given tile.
     * @param [x] The tile X coordinate.
     * @param [y] The tile Y coordinate.
     * @param [level] The tile level.
     * @param [request] The request object. Intended for internal use only.
     * @return A promise for the image that will resolve when the image is available, or
     *   undefined if there are too many active requests to the server, and the request should be retried later.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseImageryProvider.html#requestImage">Online Documentation</a>
     */
    fun requestImage(
        x: Double,
        y: Double,
        level: Int,
        request: Request? = definedExternally,
    ): Promise<ImageryTypes>?

    /**
     * Picking features is not currently supported by this imagery provider, so this function simply returns
     * undefined.
     * @param [x] The tile X coordinate.
     * @param [y] The tile Y coordinate.
     * @param [level] The tile level.
     * @param [longitude] The longitude at which to pick features.
     * @param [latitude] The latitude at which to pick features.
     * @return Undefined since picking is not supported.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseImageryProvider.html#pickFeatures">Online Documentation</a>
     */
    fun pickFeatures(
        x: Double,
        y: Double,
        level: Int,
        longitude: Double,
        latitude: Double,
    ): Void

    /**
     * Initialization options for the GoogleEarthEnterpriseImageryProvider constructor
     * @property [ellipsoid] The ellipsoid.  If not specified, the WGS84 ellipsoid is used.
     * @property [tileDiscardPolicy] The policy that determines if a tile
     *   is invalid and should be discarded. If this value is not specified, a default
     *   is to discard tiles that fail to download.
     * @property [credit] A credit for the data source, which is displayed on the canvas.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseImageryProvider.html#.ConstructorOptions">Online Documentation</a>
     */
    interface ConstructorOptions {
        var ellipsoid: Ellipsoid?
        var tileDiscardPolicy: TileDiscardPolicy?
        var credit: Credit?
    }

    companion object {
        /**
         * Creates a tiled imagery provider using the Google Earth Enterprise REST API.
         * ```
         * const geeMetadata = await GoogleEarthEnterpriseMetadata.fromUrl("http://www.example.com");
         * const gee = GoogleEarthEnterpriseImageryProvider.fromMetadata(geeMetadata);
         * ```
         * @param [metadata] A metadata object that can be used to share metadata requests with a GoogleEarthEnterpriseTerrainProvider.
         * @param [options] Object describing initialization options.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseImageryProvider.html#.fromMetadata">Online Documentation</a>
         */
        fun fromMetadata(
            metadata: GoogleEarthEnterpriseMetadata,
            options: ConstructorOptions,
        ): GoogleEarthEnterpriseImageryProvider
    }
}
