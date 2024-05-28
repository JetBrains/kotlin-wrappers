// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium.engine

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import js.objects.jso
import js.promise.Promise
import seskar.js.JsAsync

/**
 * Provides tiled imagery hosted by Mapbox.
 * ```
 * // Mapbox style provider
 * const mapbox = new MapboxStyleImageryProvider({
 *     styleId: 'streets-v11',
 *     accessToken: 'thisIsMyAccessToken'
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MapboxStyleImageryProvider.html">Online Documentation</a>
 */
external class MapboxStyleImageryProvider(options: ConstructorOptions) {
    /**
     * Gets the URL of the Mapbox server.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MapboxStyleImageryProvider.html#url">Online Documentation</a>
     */
    val url: String

    /**
     * Gets the rectangle, in radians, of the imagery provided by the instance.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MapboxStyleImageryProvider.html#rectangle">Online Documentation</a>
     */
    val rectangle: Rectangle

    /**
     * Gets the width of each tile, in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MapboxStyleImageryProvider.html#tileWidth">Online Documentation</a>
     */
    val tileWidth: Int

    /**
     * Gets the height of each tile, in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MapboxStyleImageryProvider.html#tileHeight">Online Documentation</a>
     */
    val tileHeight: Int

    /**
     * Gets the maximum level-of-detail that can be requested.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MapboxStyleImageryProvider.html#maximumLevel">Online Documentation</a>
     */
    val maximumLevel: Int?

    /**
     * Gets the minimum level-of-detail that can be requested. Generally,
     * a minimum level should only be used when the rectangle of the imagery is small
     * enough that the number of tiles at the minimum level is small.  An imagery
     * provider with more than a few tiles at the minimum level will lead to
     * rendering problems.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MapboxStyleImageryProvider.html#minimumLevel">Online Documentation</a>
     */
    val minimumLevel: Int

    /**
     * Gets the tiling scheme used by the provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MapboxStyleImageryProvider.html#tilingScheme">Online Documentation</a>
     */
    val tilingScheme: TilingScheme

    /**
     * Gets the tile discard policy.  If not undefined, the discard policy is responsible
     * for filtering out "missing" tiles via its shouldDiscardImage function.  If this function
     * returns undefined, no tiles are filtered.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MapboxStyleImageryProvider.html#tileDiscardPolicy">Online Documentation</a>
     */
    val tileDiscardPolicy: TileDiscardPolicy

    /**
     * Gets an event that is raised when the imagery provider encounters an asynchronous error..  By subscribing
     * to the event, you will be notified of the error and can potentially recover from it.  Event listeners
     * are passed an instance of [TileProviderError].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MapboxStyleImageryProvider.html#errorEvent">Online Documentation</a>
     */
    val errorEvent: DefaultEvent

    /**
     * Gets the credit to display when this imagery provider is active.  Typically this is used to credit
     * the source of the imagery.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MapboxStyleImageryProvider.html#credit">Online Documentation</a>
     */
    val credit: Credit

    /**
     * Gets the proxy used by this provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MapboxStyleImageryProvider.html#proxy">Online Documentation</a>
     */
    val proxy: Proxy

    /**
     * Gets a value indicating whether or not the images provided by this imagery provider
     * include an alpha channel.  If this property is false, an alpha channel, if present, will
     * be ignored.  If this property is true, any images without an alpha channel will be treated
     * as if their alpha is 1.0 everywhere.  When this property is false, memory usage
     * and texture upload time are reduced.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MapboxStyleImageryProvider.html#hasAlphaChannel">Online Documentation</a>
     */
    val hasAlphaChannel: Boolean

    /**
     * Gets the credits to be displayed when a given tile is displayed.
     * @param [x] The tile X coordinate.
     * @param [y] The tile Y coordinate.
     * @param [level] The tile level;
     * @return The credits to be displayed when the tile is displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MapboxStyleImageryProvider.html#getTileCredits">Online Documentation</a>
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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MapboxStyleImageryProvider.html#requestImage">Online Documentation</a>
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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MapboxStyleImageryProvider.html#pickFeatures">Online Documentation</a>
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
     * Initialization options for the MapboxStyleImageryProvider constructor
     * @property [url] The Mapbox server url.
     *   Default value - `'https://api.mapbox.com/styles/v1/'`
     * @property [username] The username of the map account.
     *   Default value - `'mapbox'`
     * @property [styleId] The Mapbox Style ID.
     * @property [accessToken] The public access token for the imagery.
     * @property [tilesize] The size of the image tiles.
     *   Default value - `512`
     * @property [scaleFactor] Determines if tiles are rendered at a @2x scale factor.
     * @property [ellipsoid] The ellipsoid.  If not specified, the WGS84 ellipsoid is used.
     * @property [minimumLevel] The minimum level-of-detail supported by the imagery provider.  Take care when specifying
     *   this that the number of tiles at the minimum level is small, such as four or less.  A larger number is likely
     *   to result in rendering problems.
     *   Default value - `0`
     * @property [maximumLevel] The maximum level-of-detail supported by the imagery provider, or undefined if there is no limit.
     * @property [rectangle] The rectangle, in radians, covered by the image.
     *   Default value - [Rectangle.MAX_VALUE]
     * @property [credit] A credit for the data source, which is displayed on the canvas.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MapboxStyleImageryProvider.html#.ConstructorOptions">Online Documentation</a>
     */
    @JsPlainObject
    sealed interface ConstructorOptions {
        var url: Resource?
        var username: String?
        var styleId: String
        var accessToken: String
        var tilesize: Int?
        var scaleFactor: Boolean?
        var ellipsoid: Ellipsoid?
        var minimumLevel: Int?
        var maximumLevel: Int?
        var rectangle: Rectangle?
        var credit: Credit?
    }
}

inline fun MapboxStyleImageryProvider(
    block: MapboxStyleImageryProvider.ConstructorOptions.() -> Unit,
): MapboxStyleImageryProvider =
    MapboxStyleImageryProvider(options = jso(block))
