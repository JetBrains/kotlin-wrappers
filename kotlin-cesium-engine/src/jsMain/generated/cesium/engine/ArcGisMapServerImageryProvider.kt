// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray
import js.promise.Promise
import kotlinx.js.JsPlainObject
import seskar.js.JsAsync

/**
 * <div class="notice">
 * This object is normally not instantiated directly, use [ArcGisMapServerImageryProvider.fromBasemapType] or [ArcGisMapServerImageryProvider.fromUrl].
 * </div>
 *
 * Provides tiled imagery hosted by an ArcGIS MapServer.  By default, the server's pre-cached tiles are
 * used, if available.
 *
 * <br/>
 *
 * An [ ArcGIS Access Token ](https://developers.arcgis.com/documentation/mapping-apis-and-services/security) is required to authenticate requests to an ArcGIS Image Tile service.
 * To access secure ArcGIS resources, it's required to create an ArcGIS developer
 * account or an ArcGIS online account, then implement an authentication method to obtain an access token.
 * ```
 * // Set the default access token for accessing ArcGIS Image Tile service
 * ArcGisMapService.defaultAccessToken = "<ArcGIS Access Token>";
 *
 * // Add a base layer from a default ArcGIS basemap
 * const viewer = new Viewer("cesiumContainer", {
 *   baseLayer: ImageryLayer.fromProviderAsync(
 *     ArcGisMapServerImageryProvider.fromBasemapType(
 *       ArcGisBaseMapType.SATELLITE
 *     )
 *   ),
 * });
 * ```
 * ```
 * // Create an imagery provider from the url directly
 * const esri = await ArcGisMapServerImageryProvider.fromUrl(
 *   "https://ibasemaps-api.arcgis.com/arcgis/rest/services/World_Imagery/MapServer", {
 *     token: "<ArcGIS Access Token>"
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html">Online Documentation</a>
 */
external class ArcGisMapServerImageryProvider(
    options: ConstructorOptions? = definedExternally,
) {
    /**
     * Gets or sets a value indicating whether feature picking is enabled.  If true, [ArcGisMapServerImageryProvider.pickFeatures] will
     * invoke the "identify" operation on the ArcGIS server and return the features included in the response.  If false,
     * [ArcGisMapServerImageryProvider.pickFeatures] will immediately return undefined (indicating no pickable features)
     * without communicating with the server.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#enablePickFeatures">Online Documentation</a>
     */
    var enablePickFeatures: Boolean

    /**
     * Gets the URL of the ArcGIS MapServer.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#url">Online Documentation</a>
     */
    val url: String

    /**
     * Gets the ArcGIS token used to authenticate with the ArcGis MapServer service.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#token">Online Documentation</a>
     */
    val token: String

    /**
     * Gets the proxy used by this provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#proxy">Online Documentation</a>
     */
    val proxy: Proxy

    /**
     * Gets the width of each tile, in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#tileWidth">Online Documentation</a>
     */
    val tileWidth: Int

    /**
     * Gets the height of each tile, in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#tileHeight">Online Documentation</a>
     */
    val tileHeight: Int

    /**
     * Gets the maximum level-of-detail that can be requested.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#maximumLevel">Online Documentation</a>
     */
    val maximumLevel: Int?

    /**
     * Gets the minimum level-of-detail that can be requested.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#minimumLevel">Online Documentation</a>
     */
    val minimumLevel: Int

    /**
     * Gets the tiling scheme used by this provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#tilingScheme">Online Documentation</a>
     */
    val tilingScheme: TilingScheme

    /**
     * Gets the rectangle, in radians, of the imagery provided by this instance.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#rectangle">Online Documentation</a>
     */
    val rectangle: Rectangle

    /**
     * Gets the tile discard policy.  If not undefined, the discard policy is responsible
     * for filtering out "missing" tiles via its shouldDiscardImage function.  If this function
     * returns undefined, no tiles are filtered.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#tileDiscardPolicy">Online Documentation</a>
     */
    val tileDiscardPolicy: TileDiscardPolicy

    /**
     * Gets an event that is raised when the imagery provider encounters an asynchronous error.  By subscribing
     * to the event, you will be notified of the error and can potentially recover from it.  Event listeners
     * are passed an instance of [TileProviderError].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#errorEvent">Online Documentation</a>
     */
    val errorEvent: DefaultEvent

    /**
     * Gets the credit to display when this imagery provider is active.  Typically this is used to credit
     * the source of the imagery.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#credit">Online Documentation</a>
     */
    val credit: Credit

    /**
     * Gets a value indicating whether this imagery provider is using pre-cached tiles from the
     * ArcGIS MapServer.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#usingPrecachedTiles">Online Documentation</a>
     */
    val usingPrecachedTiles: Boolean

    /**
     * Gets a value indicating whether or not the images provided by this imagery provider
     * include an alpha channel.  If this property is false, an alpha channel, if present, will
     * be ignored.  If this property is true, any images without an alpha channel will be treated
     * as if their alpha is 1.0 everywhere.  When this property is false, memory usage
     * and texture upload time are reduced.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#hasAlphaChannel">Online Documentation</a>
     */
    val hasAlphaChannel: Boolean

    /**
     * Gets the comma-separated list of layer IDs to show.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#layers">Online Documentation</a>
     */
    var layers: String

    /**
     * Gets the credits to be displayed when a given tile is displayed.
     * @param [x] The tile X coordinate.
     * @param [y] The tile Y coordinate.
     * @param [level] The tile level;
     * @return The credits to be displayed when the tile is displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#getTileCredits">Online Documentation</a>
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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#requestImage">Online Documentation</a>
     */
    @JsAsync(optional = true)
    suspend fun requestImage(
        x: Double,
        y: Double,
        level: Int,
        request: Request? = definedExternally,
    ): ImageryTypes?

    @JsName("requestImage")
    fun requestImageAsync(
        x: Double,
        y: Double,
        level: Int,
        request: Request? = definedExternally,
    ): Promise<ImageryTypes>?

    /**
     * Asynchronously determines what features, if any, are located at a given longitude and latitude within
     * a tile.
     * @param [x] The tile X coordinate.
     * @param [y] The tile Y coordinate.
     * @param [level] The tile level.
     * @param [longitude] The longitude at which to pick features.
     * @param [latitude] The latitude at which to pick features.
     * @return A promise for the picked features that will resolve when the asynchronous
     *   picking completes.  The resolved value is an array of [ImageryLayerFeatureInfo]
     *   instances.  The array may be empty if no features are found at the given location.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#pickFeatures">Online Documentation</a>
     */
    @JsAsync(optional = true)
    suspend fun pickFeatures(
        x: Double,
        y: Double,
        level: Int,
        longitude: Double,
        latitude: Double,
    ): ReadonlyArray<ImageryLayerFeatureInfo>?

    @JsName("pickFeatures")
    fun pickFeaturesAsync(
        x: Double,
        y: Double,
        level: Int,
        longitude: Double,
        latitude: Double,
    ): Promise<ReadonlyArray<ImageryLayerFeatureInfo>>?

    /**
     * Initialization options for the ArcGisMapServerImageryProvider constructor
     * @property [tileDiscardPolicy] The policy that determines if a tile
     *   is invalid and should be discarded.  If this value is not specified, a default
     *   [DiscardMissingTileImagePolicy] is used for tiled map servers, and a
     *   [NeverTileDiscardPolicy] is used for non-tiled map servers.  In the former case,
     *   we request tile 0,0 at the maximum tile level and check pixels (0,0), (200,20), (20,200),
     *   (80,110), and (160, 130).  If all of these pixels are transparent, the discard check is
     *   disabled and no tiles are discarded.  If any of them have a non-transparent color, any
     *   tile that has the same values in these pixel locations is discarded.  The end result of
     *   these defaults should be correct tile discarding for a standard ArcGIS Server.  To ensure
     *   that no tiles are discarded, construct and pass a [NeverTileDiscardPolicy] for this
     *   parameter.
     * @property [usePreCachedTilesIfAvailable] If true, the server's pre-cached
     *   tiles are used if they are available. Exporting Tiles is only supported with deprecated APIs.
     *   Default value - `true`
     * @property [layers] A comma-separated list of the layers to show, or undefined if all layers should be shown.
     * @property [enablePickFeatures] If true, [ArcGisMapServerImageryProvider.pickFeatures] will invoke
     *   the Identify service on the MapServer and return the features included in the response.  If false,
     *   [ArcGisMapServerImageryProvider.pickFeatures] will immediately return undefined (indicating no pickable features)
     *   without communicating with the server.  Set this property to false if you don't want this provider's features to
     *   be pickable. Can be overridden by setting the [ArcGisMapServerImageryProvider.enablePickFeatures] property on the object.
     *   Default value - `true`
     * @property [rectangle] The rectangle of the layer.  This parameter is ignored when accessing
     *   a tiled layer.
     *   Default value - [Rectangle.MAX_VALUE]
     * @property [tilingScheme] The tiling scheme to use to divide the world into tiles.
     *   This parameter is ignored when accessing a tiled server.
     *   Default value - [GeographicTilingScheme()][GeographicTilingScheme]
     * @property [ellipsoid] The ellipsoid.  If the tilingScheme is specified and used,
     *   this parameter is ignored and the tiling scheme's ellipsoid is used instead. If neither
     *   parameter is specified, the default ellipsoid is used.
     *   Default value - [Ellipsoid.default]
     * @property [credit] A credit for the data source, which is displayed on the canvas.  This parameter is ignored when accessing a tiled server.
     * @property [tileWidth] The width of each tile in pixels.  This parameter is ignored when accessing a tiled server.
     *   Default value - `256`
     * @property [tileHeight] The height of each tile in pixels.  This parameter is ignored when accessing a tiled server.
     *   Default value - `256`
     * @property [maximumLevel] The maximum tile level to request, or undefined if there is no maximum.  This parameter is ignored when accessing
     *   a tiled server.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#.ConstructorOptions">Online Documentation</a>
     */
    @JsPlainObject
    sealed interface ConstructorOptions {
        var tileDiscardPolicy: TileDiscardPolicy?
        var usePreCachedTilesIfAvailable: Boolean?
        var layers: String?
        var enablePickFeatures: Boolean?
        var rectangle: Rectangle?
        var tilingScheme: TilingScheme?
        var ellipsoid: Ellipsoid?
        var credit: Credit?
        var tileWidth: Int?
        var tileHeight: Int?
        var maximumLevel: Int?
    }

    companion object {
        /**
         * Creates an [ImageryProvider] which provides tiled imagery from an ArcGIS base map.
         * ```
         * // Set the default access token for accessing ArcGIS Image Tile service
         * ArcGisMapService.defaultAccessToken = "<ArcGIS Access Token>";
         *
         * // Add a base layer from a default ArcGIS basemap
         * const provider = await ArcGisMapServerImageryProvider.fromBasemapType(
         *   ArcGisBaseMapType.SATELLITE);
         * ```
         * ```
         * // Add a base layer from a default ArcGIS Basemap
         * const viewer = new Viewer("cesiumContainer", {
         *   baseLayer: ImageryLayer.fromProviderAsync(
         *     ArcGisMapServerImageryProvider.fromBasemapType(
         *       ArcGisBaseMapType.HILLSHADE, {
         *         token: "<ArcGIS Access Token>"
         *       }
         *     )
         *   ),
         * });
         * ```
         * @param [style] The style of the ArcGIS base map imagery. Valid options are [ArcGisBaseMapType.SATELLITE], [ArcGisBaseMapType.OCEANS], and [ArcGisBaseMapType.HILLSHADE].
         * @param [options] Object describing initialization options.
         * @return A promise that resolves to the created ArcGisMapServerImageryProvider.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#.fromBasemapType">Online Documentation</a>
         */
        @JsAsync
        suspend fun fromBasemapType(
            style: ArcGisBaseMapType,
            options: ConstructorOptions? = definedExternally,
        ): ArcGisMapServerImageryProvider

        @JsName("fromBasemapType")
        fun fromBasemapTypeAsync(
            style: ArcGisBaseMapType,
            options: ConstructorOptions? = definedExternally,
        ): Promise<ArcGisMapServerImageryProvider>

        /**
         * Creates an [ImageryProvider] which provides tiled imagery hosted by an ArcGIS MapServer.  By default, the server's pre-cached tiles are
         * used, if available.
         * ```
         * const esri = await ArcGisMapServerImageryProvider.fromUrl(
         *     "https://services.arcgisonline.com/ArcGIS/rest/services/World_Imagery/MapServer"
         * );
         * ```
         * @param [url] The URL of the ArcGIS MapServer service.
         * @param [options] Object describing initialization options.
         * @return A promise that resolves to the created ArcGisMapServerImageryProvider.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#.fromUrl">Online Documentation</a>
         */
        @JsAsync
        suspend fun fromUrl(
            url: Resource,
            options: ConstructorOptions? = definedExternally,
        ): ArcGisMapServerImageryProvider

        @JsName("fromUrl")
        fun fromUrlAsync(
            url: Resource,
            options: ConstructorOptions? = definedExternally,
        ): Promise<ArcGisMapServerImageryProvider>

        @JsAsync
        suspend fun fromUrl(
            url: String,
            options: ConstructorOptions? = definedExternally,
        ): ArcGisMapServerImageryProvider

        @JsName("fromUrl")
        fun fromUrlAsync(
            url: String,
            options: ConstructorOptions? = definedExternally,
        ): Promise<ArcGisMapServerImageryProvider>
    }
}
