// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * Provides tiled imagery using the Bing Maps Imagery REST API.
 * ```
 * const bing = new BingMapsImageryProvider({
 *     url : 'https://dev.virtualearth.net',
 *     key : 'get-yours-at-https://www.bingmapsportal.com/',
 *     mapStyle : BingMapsStyle.AERIAL
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html">Online Documentation</a>
 */
external class BingMapsImageryProvider(options: ConstructorOptions) {
    /**
     * The default alpha blending value of this provider, with 0.0 representing fully transparent and
     * 1.0 representing fully opaque.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#defaultAlpha">Online Documentation</a>
     */
    var defaultAlpha: Double?

    /**
     * The default alpha blending value on the night side of the globe of this provider, with 0.0 representing fully transparent and
     * 1.0 representing fully opaque.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#defaultNightAlpha">Online Documentation</a>
     */
    var defaultNightAlpha: Double?

    /**
     * The default alpha blending value on the day side of the globe of this provider, with 0.0 representing fully transparent and
     * 1.0 representing fully opaque.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#defaultDayAlpha">Online Documentation</a>
     */
    var defaultDayAlpha: Double?

    /**
     * The default brightness of this provider.  1.0 uses the unmodified imagery color.  Less than 1.0
     * makes the imagery darker while greater than 1.0 makes it brighter.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#defaultBrightness">Online Documentation</a>
     */
    var defaultBrightness: Double?

    /**
     * The default contrast of this provider.  1.0 uses the unmodified imagery color.  Less than 1.0 reduces
     * the contrast while greater than 1.0 increases it.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#defaultContrast">Online Documentation</a>
     */
    var defaultContrast: Double?

    /**
     * The default hue of this provider in radians. 0.0 uses the unmodified imagery color.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#defaultHue">Online Documentation</a>
     */
    var defaultHue: Double?

    /**
     * The default saturation of this provider. 1.0 uses the unmodified imagery color. Less than 1.0 reduces the
     * saturation while greater than 1.0 increases it.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#defaultSaturation">Online Documentation</a>
     */
    var defaultSaturation: Double?

    /**
     * The default gamma correction to apply to this provider.  1.0 uses the unmodified imagery color.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#defaultGamma">Online Documentation</a>
     */
    var defaultGamma: Double?

    /**
     * The default texture minification filter to apply to this provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#defaultMinificationFilter">Online Documentation</a>
     */
    var defaultMinificationFilter: TextureMinificationFilter

    /**
     * The default texture magnification filter to apply to this provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#defaultMagnificationFilter">Online Documentation</a>
     */
    var defaultMagnificationFilter: TextureMagnificationFilter

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
     * The culture to use when requesting Bing Maps imagery. Not
     * all cultures are supported. See [http://msdn.microsoft.com/en-us/library/hh441729.aspx]
     * for information on the supported cultures.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#culture">Online Documentation</a>
     */
    val culture: String

    /**
     * Gets the width of each tile, in pixels. This function should
     * not be called before [BingMapsImageryProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#tileWidth">Online Documentation</a>
     */
    val tileWidth: Int

    /**
     * Gets the height of each tile, in pixels.  This function should
     * not be called before [BingMapsImageryProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#tileHeight">Online Documentation</a>
     */
    val tileHeight: Int

    /**
     * Gets the maximum level-of-detail that can be requested.  This function should
     * not be called before [BingMapsImageryProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#maximumLevel">Online Documentation</a>
     */
    val maximumLevel: Int?

    /**
     * Gets the minimum level-of-detail that can be requested.  This function should
     * not be called before [BingMapsImageryProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#minimumLevel">Online Documentation</a>
     */
    val minimumLevel: Int

    /**
     * Gets the tiling scheme used by this provider.  This function should
     * not be called before [BingMapsImageryProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#tilingScheme">Online Documentation</a>
     */
    val tilingScheme: TilingScheme

    /**
     * Gets the rectangle, in radians, of the imagery provided by this instance.  This function should
     * not be called before [BingMapsImageryProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#rectangle">Online Documentation</a>
     */
    val rectangle: Rectangle

    /**
     * Gets the tile discard policy.  If not undefined, the discard policy is responsible
     * for filtering out "missing" tiles via its shouldDiscardImage function.  If this function
     * returns undefined, no tiles are filtered.  This function should
     * not be called before [BingMapsImageryProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#tileDiscardPolicy">Online Documentation</a>
     */
    val tileDiscardPolicy: TileDiscardPolicy

    /**
     * Gets an event that is raised when the imagery provider encounters an asynchronous error.  By subscribing
     * to the event, you will be notified of the error and can potentially recover from it.  Event listeners
     * are passed an instance of [TileProviderError].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#errorEvent">Online Documentation</a>
     */
    val errorEvent: Event

    /**
     * Gets a value indicating whether or not the provider is ready for use.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#ready">Online Documentation</a>
     */
    val ready: Boolean

    /**
     * Gets a promise that resolves to true when the provider is ready for use.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#readyPromise">Online Documentation</a>
     */
    val readyPromise: kotlin.js.Promise<Boolean>

    /**
     * Gets the credit to display when this imagery provider is active.  Typically this is used to credit
     * the source of the imagery.  This function should not be called before [BingMapsImageryProvider.ready] returns true.
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
    ): Array<out Credit>

    /**
     * Requests the image for a given tile.  This function should
     * not be called before [BingMapsImageryProvider.ready] returns true.
     * @param [x] The tile X coordinate.
     * @param [y] The tile Y coordinate.
     * @param [level] The tile level.
     * @param [request] The request object. Intended for internal use only.
     * @return A promise for the image that will resolve when the image is available, or
     *   undefined if there are too many active requests to the server, and the request
     *   should be retried later.  The resolved image may be either an
     *   Image or a Canvas DOM object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#requestImage">Online Documentation</a>
     */
    fun requestImage(
        x: Double,
        y: Double,
        level: Int,
        request: Request? = definedExternally,
    ): kotlin.js.Promise<org.w3c.dom.HTMLElement>?

    /**
     * Picking features is not currently supported by this imagery provider, so this function simply returns
     * undefined.
     * @param [x] The tile X coordinate.
     * @param [y] The tile Y coordinate.
     * @param [level] The tile level.
     * @param [longitude] The longitude at which to pick features.
     * @param [latitude] The latitude at which to pick features.
     * @return A promise for the picked features that will resolve when the asynchronous
     *   picking completes.  The resolved value is an array of [ImageryLayerFeatureInfo]
     *   instances.  The array may be empty if no features are found at the given location.
     *   It may also be undefined if picking is not supported.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsImageryProvider.html#pickFeatures">Online Documentation</a>
     */
    fun pickFeatures(
        x: Double,
        y: Double,
        level: Int,
        longitude: Double,
        latitude: Double,
    ): kotlin.js.Promise<Array<out ImageryLayerFeatureInfo>>?

    /**
     * Initialization options for the BingMapsImageryProvider constructor
     * @property [url] The url of the Bing Maps server hosting the imagery.
     * @property [key] The Bing Maps key for your application, which can be
     *   created at [https://www.bingmapsportal.com/].
     * @property [tileProtocol] The protocol to use when loading tiles, e.g. 'http' or 'https'.
     *   By default, tiles are loaded using the same protocol as the page.
     * @property [mapStyle] The type of Bing Maps imagery to load.
     *   Default value - [BingMapsStyle.AERIAL]
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
    interface ConstructorOptions {
        var url: Resource
        var key: String
        var tileProtocol: String?
        var mapStyle: BingMapsStyle?
        var culture: String?
        var ellipsoid: Ellipsoid?
        var tileDiscardPolicy: TileDiscardPolicy?
    }

    companion object {
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

inline fun BingMapsImageryProvider(
    block: BingMapsImageryProvider.ConstructorOptions.() -> Unit,
): BingMapsImageryProvider {
    val options: BingMapsImageryProvider.ConstructorOptions = js("({})")
    block(options)
    return BingMapsImageryProvider(options)
}
