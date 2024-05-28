// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray
import js.core.Void
import js.objects.JsPlainObject
import js.promise.Promise
import seskar.js.JsAsync

/**
 * <div class="notice">
 * To construct a BingMapsImageryProvider, call [BingMapsImageryProvider.fromUrl]. Do not call the constructor directly.
 * </div>
 *
 * Provides tiled imagery using the Bing Maps Imagery REST API.
 * ```
 * const bing = await BingMapsImageryProvider.fromUrl(
 *   "https://dev.virtualearth.net", {
 *     key: "get-yours-at-https://www.bingmapsportal.com/",
 *     mapStyle: BingMapsStyle.AERIAL
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html">Online Documentation</a>
 */
external class BingMapsImageryProvider
private constructor() {
    /**
     * Gets the name of the BingMaps server url hosting the imagery.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#url">Online Documentation</a>
     */
    val url: String

    /**
     * Gets the proxy used by this provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#proxy">Online Documentation</a>
     */
    val proxy: Proxy

    /**
     * Gets the Bing Maps key.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#key">Online Documentation</a>
     */
    val key: String

    /**
     * Gets the type of Bing Maps imagery to load.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#mapStyle">Online Documentation</a>
     */
    val mapStyle: BingMapsStyle

    /**
     * Gets the additional map layer options as defined in [https://learn.microsoft.com/en-us/bingmaps/rest-services/imagery/get-imagery-metadata#template-parameters]/
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#mapLayer">Online Documentation</a>
     */
    val mapLayer: String

    /**
     * The culture to use when requesting Bing Maps imagery. Not
     * all cultures are supported. See [http://msdn.microsoft.com/en-us/library/hh441729.aspx]
     * for information on the supported cultures.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#culture">Online Documentation</a>
     */
    val culture: String

    /**
     * Gets the width of each tile, in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#tileWidth">Online Documentation</a>
     */
    val tileWidth: Int

    /**
     * Gets the height of each tile, in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#tileHeight">Online Documentation</a>
     */
    val tileHeight: Int

    /**
     * Gets the maximum level-of-detail that can be requested.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#maximumLevel">Online Documentation</a>
     */
    val maximumLevel: Int?

    /**
     * Gets the minimum level-of-detail that can be requested.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#minimumLevel">Online Documentation</a>
     */
    val minimumLevel: Int

    /**
     * Gets the tiling scheme used by this provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#tilingScheme">Online Documentation</a>
     */
    val tilingScheme: TilingScheme

    /**
     * Gets the rectangle, in radians, of the imagery provided by this instance.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#rectangle">Online Documentation</a>
     */
    val rectangle: Rectangle

    /**
     * Gets the tile discard policy.  If not undefined, the discard policy is responsible
     * for filtering out "missing" tiles via its shouldDiscardImage function.  If this function
     * returns undefined, no tiles are filtered.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#tileDiscardPolicy">Online Documentation</a>
     */
    val tileDiscardPolicy: TileDiscardPolicy

    /**
     * Gets an event that is raised when the imagery provider encounters an asynchronous error.  By subscribing
     * to the event, you will be notified of the error and can potentially recover from it.  Event listeners
     * are passed an instance of [TileProviderError].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#errorEvent">Online Documentation</a>
     */
    val errorEvent: DefaultEvent

    /**
     * Gets the credit to display when this imagery provider is active.  Typically this is used to credit
     * the source of the imagery.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#credit">Online Documentation</a>
     */
    val credit: Credit

    /**
     * Gets a value indicating whether or not the images provided by this imagery provider
     * include an alpha channel.  If this property is false, an alpha channel, if present, will
     * be ignored.  If this property is true, any images without an alpha channel will be treated
     * as if their alpha is 1.0 everywhere.  Setting this property to false reduces memory usage
     * and texture upload time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#hasAlphaChannel">Online Documentation</a>
     */
    val hasAlphaChannel: Boolean

    /**
     * Gets the credits to be displayed when a given tile is displayed.
     * @param [x] The tile X coordinate.
     * @param [y] The tile Y coordinate.
     * @param [level] The tile level;
     * @return The credits to be displayed when the tile is displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#getTileCredits">Online Documentation</a>
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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#requestImage">Online Documentation</a>
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
     * Picking features is not currently supported by this imagery provider, so this function simply returns
     * undefined.
     * @param [x] The tile X coordinate.
     * @param [y] The tile Y coordinate.
     * @param [level] The tile level.
     * @param [longitude] The longitude at which to pick features.
     * @param [latitude] The latitude at which to pick features.
     * @return Undefined since picking is not supported.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#pickFeatures">Online Documentation</a>
     */
    fun pickFeatures(
        x: Double,
        y: Double,
        level: Int,
        longitude: Double,
        latitude: Double,
    ): Void

    /**
     * Initialization options for the BingMapsImageryProvider constructor
     * @property [key] The Bing Maps key for your application, which can be
     *   created at [https://www.bingmapsportal.com/].
     * @property [tileProtocol] The protocol to use when loading tiles, e.g. 'http' or 'https'.
     *   By default, tiles are loaded using the same protocol as the page.
     * @property [mapStyle] The type of Bing Maps imagery to load.
     *   Default value - [BingMapsStyle.AERIAL]
     * @property [mapLayer] Additional display layer options as defined on [https://learn.microsoft.com/en-us/bingmaps/rest-services/imagery/get-imagery-metadata#template-parameters]
     * @property [culture] The culture to use when requesting Bing Maps imagery. Not
     *   all cultures are supported. See [http://msdn.microsoft.com/en-us/library/hh441729.aspx]
     *   for information on the supported cultures.
     *   Default value - `''`
     * @property [ellipsoid] The ellipsoid.  If not specified, the WGS84 ellipsoid is used.
     * @property [tileDiscardPolicy] The policy that determines if a tile
     *   is invalid and should be discarded.  By default, a [DiscardEmptyTileImagePolicy]
     *   will be used, with the expectation that the Bing Maps server will send a zero-length response for missing tiles.
     *   To ensure that no tiles are discarded, construct and pass a [NeverTileDiscardPolicy] for this parameter.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#.ConstructorOptions">Online Documentation</a>
     */
    @JsPlainObject
    sealed interface ConstructorOptions {
        var key: String?
        var tileProtocol: String?
        var mapStyle: BingMapsStyle?
        var mapLayer: String?
        var culture: String?
        var ellipsoid: Ellipsoid?
        var tileDiscardPolicy: TileDiscardPolicy?
    }

    companion object {
        /**
         * Creates an [ImageryProvider] which provides tiled imagery using the Bing Maps Imagery REST API.
         * ```
         * const bing = await BingMapsImageryProvider.fromUrl(
         *   "https://dev.virtualearth.net", {
         *     key: "get-yours-at-https://www.bingmapsportal.com/",
         *     mapStyle: BingMapsStyle.AERIAL
         * });
         * ```
         * @param [url] The url of the Bing Maps server hosting the imagery.
         * @return A promise that resolves to the created BingMapsImageryProvider
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#.fromUrl">Online Documentation</a>
         */
        @JsAsync
        suspend fun fromUrl(
            url: Resource,
            options: ConstructorOptions,
        ): BingMapsImageryProvider

        @JsName("fromUrl")
        fun fromUrlAsync(
            url: Resource,
            options: ConstructorOptions,
        ): Promise<BingMapsImageryProvider>

        @JsAsync
        suspend fun fromUrl(
            url: String,
            options: ConstructorOptions,
        ): BingMapsImageryProvider

        @JsName("fromUrl")
        fun fromUrlAsync(
            url: String,
            options: ConstructorOptions,
        ): Promise<BingMapsImageryProvider>

        /**
         * Converts a tiles (x, y, level) position into a quadkey used to request an image
         * from a Bing Maps server.
         * @param [x] The tile's x coordinate.
         * @param [y] The tile's y coordinate.
         * @param [level] The tile's zoom level.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#.tileXYToQuadKey">Online Documentation</a>
         */
        fun tileXYToQuadKey(
            x: Double,
            y: Double,
            level: Int,
        )

        /**
         * Converts a tile's quadkey used to request an image from a Bing Maps server into the
         * (x, y, level) position.
         * @param [quadkey] The tile's quad key
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#.quadKeyToTileXY">Online Documentation</a>
         */
        fun quadKeyToTileXY(quadkey: String)

        /**
         * Gets or sets the URL to the Bing logo for display in the credit.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#.logoUrl">Online Documentation</a>
         */
        var logoUrl: String
    }
}
