// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

import js.core.ReadonlyArray
import js.promise.Promise

/**
 * <div class="notice">
 * To construct a IonImageryProvider, call [IonImageryProvider.fromAssetId]. Do not call the constructor directly.
 * </div>
 *
 * Provides tiled imagery using the Cesium ion REST API.
 * ```
 * const imageryLayer = ImageryLayer.fromProviderAsync(IonImageryProvider.fromAssetId(3812));
 * viewer.imageryLayers.add(imageryLayer);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IonImageryProvider.html">Online Documentation</a>
 */
sealed external class IonImageryProvider {
    /**
     * Gets the rectangle, in radians, of the imagery provided by the instance.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IonImageryProvider.html#rectangle">Online Documentation</a>
     */
    val rectangle: Rectangle

    /**
     * Gets the width of each tile, in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IonImageryProvider.html#tileWidth">Online Documentation</a>
     */
    val tileWidth: Int

    /**
     * Gets the height of each tile, in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IonImageryProvider.html#tileHeight">Online Documentation</a>
     */
    val tileHeight: Int

    /**
     * Gets the maximum level-of-detail that can be requested.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IonImageryProvider.html#maximumLevel">Online Documentation</a>
     */
    val maximumLevel: Int?

    /**
     * Gets the minimum level-of-detail that can be requested. Generally,
     * a minimum level should only be used when the rectangle of the imagery is small
     * enough that the number of tiles at the minimum level is small.  An imagery
     * provider with more than a few tiles at the minimum level will lead to
     * rendering problems.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IonImageryProvider.html#minimumLevel">Online Documentation</a>
     */
    val minimumLevel: Int

    /**
     * Gets the tiling scheme used by the provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IonImageryProvider.html#tilingScheme">Online Documentation</a>
     */
    val tilingScheme: TilingScheme

    /**
     * Gets the tile discard policy.  If not undefined, the discard policy is responsible
     * for filtering out "missing" tiles via its shouldDiscardImage function.  If this function
     * returns undefined, no tiles are filtered.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IonImageryProvider.html#tileDiscardPolicy">Online Documentation</a>
     */
    val tileDiscardPolicy: TileDiscardPolicy

    /**
     * Gets an event that is raised when the imagery provider encounters an asynchronous error.  By subscribing
     * to the event, you will be notified of the error and can potentially recover from it.  Event listeners
     * are passed an instance of [TileProviderError].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IonImageryProvider.html#errorEvent">Online Documentation</a>
     */
    val errorEvent: DefaultEvent

    /**
     * Gets the credit to display when this imagery provider is active.  Typically this is used to credit
     * the source of the imagery.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IonImageryProvider.html#credit">Online Documentation</a>
     */
    val credit: Credit

    /**
     * Gets a value indicating whether or not the images provided by this imagery provider
     * include an alpha channel.  If this property is false, an alpha channel, if present, will
     * be ignored.  If this property is true, any images without an alpha channel will be treated
     * as if their alpha is 1.0 everywhere.  When this property is false, memory usage
     * and texture upload time are reduced.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IonImageryProvider.html#hasAlphaChannel">Online Documentation</a>
     */
    val hasAlphaChannel: Boolean

    /**
     * Gets the proxy used by this provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IonImageryProvider.html#proxy">Online Documentation</a>
     */
    val proxy: Proxy

    /**
     * Gets the credits to be displayed when a given tile is displayed.
     * @param [x] The tile X coordinate.
     * @param [y] The tile Y coordinate.
     * @param [level] The tile level;
     * @return The credits to be displayed when the tile is displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IonImageryProvider.html#getTileCredits">Online Documentation</a>
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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IonImageryProvider.html#requestImage">Online Documentation</a>
     */
    fun requestImage(
        x: Double,
        y: Double,
        level: Int,
        request: Request? = definedExternally,
    ): Promise<ImageryTypes>?

    /**
     * Asynchronously determines what features, if any, are located at a given longitude and latitude within
     * a tile. This function is optional, so it may not exist on all ImageryProviders.
     * @param [x] The tile X coordinate.
     * @param [y] The tile Y coordinate.
     * @param [level] The tile level.
     * @param [longitude] The longitude at which to pick features.
     * @param [latitude] The latitude at which to pick features.
     * @return A promise for the picked features that will resolve when the asynchronous
     *   picking completes.  The resolved value is an array of [ImageryLayerFeatureInfo]
     *   instances.  The array may be empty if no features are found at the given location.
     *   It may also be undefined if picking is not supported.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IonImageryProvider.html#pickFeatures">Online Documentation</a>
     */
    fun pickFeatures(
        x: Double,
        y: Double,
        level: Int,
        longitude: Double,
        latitude: Double,
    ): Promise<ReadonlyArray<ImageryLayerFeatureInfo>>?

    /**
     * Initialization options for the TileMapServiceImageryProvider constructor
     * @property [accessToken] The access token to use.
     *   Default value - [Ion.defaultAccessToken]
     * @property [server] The resource to the Cesium ion API server.
     *   Default value - [Ion.defaultServer]
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IonImageryProvider.html#.ConstructorOptions">Online Documentation</a>
     */
    interface ConstructorOptions {
        var accessToken: String?
        var server: Resource?
    }

    companion object {
        /**
         * Creates a provider for tiled imagery using the Cesium ion REST API.
         * ```
         * const imageryLayer = ImageryLayer.fromProviderAsync(IonImageryProvider.fromAssetId(3812));
         * viewer.imageryLayers.add(imageryLayer);
         * ```
         * @param [assetId] An ion imagery asset ID.
         * @param [options] Object describing initialization options.
         * @return A promise which resolves to the created IonImageryProvider.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IonImageryProvider.html#.fromAssetId">Online Documentation</a>
         */
        fun fromAssetId(
            assetId: Int,
            options: ConstructorOptions,
        ): Promise<IonImageryProvider>
    }
}
