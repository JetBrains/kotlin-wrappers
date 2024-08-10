// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray
import js.core.Void
import js.promise.Promise
import kotlinx.js.JsPlainObject
import seskar.js.JsAsync

/**
 * Provides a single, top-level imagery tile.  The single image is assumed to be in
 * the Geographic projection (i.e. WGS84 / EPSG:4326),
 * and will be rendered using a [GeographicTilingScheme].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SingleTileImageryProvider.html">Online Documentation</a>
 */
external class SingleTileImageryProvider(
    options: ConstructorOptions,
) {
    /**
     * Gets the URL of the single, top-level imagery tile.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SingleTileImageryProvider.html#url">Online Documentation</a>
     */
    val url: String

    /**
     * Gets the proxy used by this provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SingleTileImageryProvider.html#proxy">Online Documentation</a>
     */
    val proxy: Proxy

    /**
     * Gets the width of each tile, in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SingleTileImageryProvider.html#tileWidth">Online Documentation</a>
     */
    val tileWidth: Int

    /**
     * Gets the height of each tile, in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SingleTileImageryProvider.html#tileHeight">Online Documentation</a>
     */
    val tileHeight: Int

    /**
     * Gets the maximum level-of-detail that can be requested.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SingleTileImageryProvider.html#maximumLevel">Online Documentation</a>
     */
    val maximumLevel: Int?

    /**
     * Gets the minimum level-of-detail that can be requested.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SingleTileImageryProvider.html#minimumLevel">Online Documentation</a>
     */
    val minimumLevel: Int

    /**
     * Gets the tiling scheme used by this provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SingleTileImageryProvider.html#tilingScheme">Online Documentation</a>
     */
    val tilingScheme: TilingScheme

    /**
     * Gets the rectangle, in radians, of the imagery provided by this instance.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SingleTileImageryProvider.html#rectangle">Online Documentation</a>
     */
    val rectangle: Rectangle

    /**
     * Gets the tile discard policy.  If not undefined, the discard policy is responsible
     * for filtering out "missing" tiles via its shouldDiscardImage function.  If this function
     * returns undefined, no tiles are filtered.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SingleTileImageryProvider.html#tileDiscardPolicy">Online Documentation</a>
     */
    val tileDiscardPolicy: TileDiscardPolicy

    /**
     * Gets an event that is raised when the imagery provider encounters an asynchronous error.  By subscribing
     * to the event, you will be notified of the error and can potentially recover from it.  Event listeners
     * are passed an instance of [TileProviderError].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SingleTileImageryProvider.html#errorEvent">Online Documentation</a>
     */
    val errorEvent: DefaultEvent

    /**
     * Gets the credit to display when this imagery provider is active.  Typically this is used to credit
     * the source of the imagery.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SingleTileImageryProvider.html#credit">Online Documentation</a>
     */
    val credit: Credit

    /**
     * Gets a value indicating whether or not the images provided by this imagery provider
     * include an alpha channel.  If this property is false, an alpha channel, if present, will
     * be ignored.  If this property is true, any images without an alpha channel will be treated
     * as if their alpha is 1.0 everywhere.  When this property is false, memory usage
     * and texture upload time are reduced.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SingleTileImageryProvider.html#hasAlphaChannel">Online Documentation</a>
     */
    val hasAlphaChannel: Boolean

    /**
     * Gets the credits to be displayed when a given tile is displayed.
     * @param [x] The tile X coordinate.
     * @param [y] The tile Y coordinate.
     * @param [level] The tile level;
     * @return The credits to be displayed when the tile is displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SingleTileImageryProvider.html#getTileCredits">Online Documentation</a>
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
     * @return The resolved image
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SingleTileImageryProvider.html#requestImage">Online Documentation</a>
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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SingleTileImageryProvider.html#pickFeatures">Online Documentation</a>
     */
    fun pickFeatures(
        x: Double,
        y: Double,
        level: Int,
        longitude: Double,
        latitude: Double,
    ): Void

    /**
     * Initialization options for the SingleTileImageryProvider constructor
     * @property [url] The url for the tile.
     * @property [tileWidth] The width of the tile, in pixels.
     * @property [tileHeight] The height of the tile, in pixels.
     * @property [rectangle] The rectangle, in radians, covered by the image.
     *   Default value - [Rectangle.MAX_VALUE]
     * @property [credit] A credit for the data source, which is displayed on the canvas.
     * @property [ellipsoid] The ellipsoid.  If not specified, the WGS84 ellipsoid is used.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SingleTileImageryProvider.html#.ConstructorOptions">Online Documentation</a>
     */
    @JsPlainObject
    sealed interface ConstructorOptions {
        var url: Resource
        var tileWidth: Int?
        var tileHeight: Int?
        var rectangle: Rectangle?
        var credit: Credit?
        var ellipsoid: Ellipsoid?
    }

    companion object {
        /**
         * Creates a provider for a single, top-level imagery tile.  The single image is assumed to use a
         * ```
         * const provider = await SingleTileImageryProvider.fromUrl("https://yoururl.com/image.png");
         * ```
         * @param [url] The url for the tile
         * @param [options] Object describing initialization options.
         * @return The resolved SingleTileImageryProvider.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SingleTileImageryProvider.html#.fromUrl">Online Documentation</a>
         */
        @JsAsync
        suspend fun fromUrl(
            url: Resource,
            options: fromUrlOptions? = definedExternally,
        ): SingleTileImageryProvider

        @JsName("fromUrl")
        fun fromUrlAsync(
            url: Resource,
            options: fromUrlOptions? = definedExternally,
        ): Promise<SingleTileImageryProvider>

        @JsAsync
        suspend fun fromUrl(
            url: String,
            options: fromUrlOptions? = definedExternally,
        ): SingleTileImageryProvider

        @JsName("fromUrl")
        fun fromUrlAsync(
            url: String,
            options: fromUrlOptions? = definedExternally,
        ): Promise<SingleTileImageryProvider>

        /**
         * Initialization options for the SingleTileImageryProvider constructor when using SingleTileImageryProvider.fromUrl
         * @property [rectangle] The rectangle, in radians, covered by the image.
         *   Default value - [Rectangle.MAX_VALUE]
         * @property [credit] A credit for the data source, which is displayed on the canvas.
         * @property [ellipsoid] The ellipsoid.  If not specified, the WGS84 ellipsoid is used.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SingleTileImageryProvider.html#.fromUrlOptions">Online Documentation</a>
         */
        @JsPlainObject
        sealed interface fromUrlOptions {
            var rectangle: Rectangle?
            var credit: Credit?
            var ellipsoid: Ellipsoid?
        }
    }
}
