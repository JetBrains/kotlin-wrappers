// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * Provides tiled imagery using the Google Earth Imagery API.
 *
 * Notes: This imagery provider does not work with the public Google Earth servers. It works with the
 *        Google Earth Enterprise Server.
 *
 *        By default the Google Earth Enterprise server does not set the
 *        [Cross-Origin Resource Sharing](http://www.w3.org/TR/cors/) headers. You can either
 *        use a proxy server which adds these headers, or in the /opt/google/gehttpd/conf/gehttpd.conf
 *        and add the 'Header set Access-Control-Allow-Origin "*"' option to the '&lt;Directory /&gt;' and
 *        '&lt;Directory "/opt/google/gehttpd/htdocs"&gt;' directives.
 *
 *        This provider is for use with 2D Maps API as part of Google Earth Enterprise. For 3D Earth API uses, it
 *        is necessary to use [GoogleEarthEnterpriseImageryProvider]
 * ```
 * const google = new GoogleEarthEnterpriseMapsProvider({
 *     url : 'https://earth.localdomain',
 *     channel : 1008
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMapsProvider.html">Online Documentation</a>
 */
external class GoogleEarthEnterpriseMapsProvider(options: ConstructorOptions) {
    /**
     * The default alpha blending value of this provider, with 0.0 representing fully transparent and
     * 1.0 representing fully opaque.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMapsProvider.html#defaultAlpha">Online Documentation</a>
     */
    var defaultAlpha: Double?

    /**
     * The default alpha blending value on the night side of the globe of this provider, with 0.0 representing fully transparent and
     * 1.0 representing fully opaque.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMapsProvider.html#defaultNightAlpha">Online Documentation</a>
     */
    var defaultNightAlpha: Double?

    /**
     * The default alpha blending value on the day side of the globe of this provider, with 0.0 representing fully transparent and
     * 1.0 representing fully opaque.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMapsProvider.html#defaultDayAlpha">Online Documentation</a>
     */
    var defaultDayAlpha: Double?

    /**
     * The default brightness of this provider.  1.0 uses the unmodified imagery color.  Less than 1.0
     * makes the imagery darker while greater than 1.0 makes it brighter.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMapsProvider.html#defaultBrightness">Online Documentation</a>
     */
    var defaultBrightness: Double?

    /**
     * The default contrast of this provider.  1.0 uses the unmodified imagery color.  Less than 1.0 reduces
     * the contrast while greater than 1.0 increases it.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMapsProvider.html#defaultContrast">Online Documentation</a>
     */
    var defaultContrast: Double?

    /**
     * The default hue of this provider in radians. 0.0 uses the unmodified imagery color.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMapsProvider.html#defaultHue">Online Documentation</a>
     */
    var defaultHue: Double?

    /**
     * The default saturation of this provider. 1.0 uses the unmodified imagery color. Less than 1.0 reduces the
     * saturation while greater than 1.0 increases it.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMapsProvider.html#defaultSaturation">Online Documentation</a>
     */
    var defaultSaturation: Double?

    /**
     * The default gamma correction to apply to this provider.  1.0 uses the unmodified imagery color.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMapsProvider.html#defaultGamma">Online Documentation</a>
     */
    var defaultGamma: Double?

    /**
     * The default texture minification filter to apply to this provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMapsProvider.html#defaultMinificationFilter">Online Documentation</a>
     */
    var defaultMinificationFilter: TextureMinificationFilter

    /**
     * The default texture magnification filter to apply to this provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMapsProvider.html#defaultMagnificationFilter">Online Documentation</a>
     */
    var defaultMagnificationFilter: TextureMagnificationFilter

    /**
     * Gets the URL of the Google Earth MapServer.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMapsProvider.html#url">Online Documentation</a>
     */
    val url: String

    /**
     * Gets the url path of the data on the Google Earth server.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMapsProvider.html#path">Online Documentation</a>
     */
    val path: String

    /**
     * Gets the proxy used by this provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMapsProvider.html#proxy">Online Documentation</a>
     */
    val proxy: Proxy

    /**
     * Gets the imagery channel (id) currently being used.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMapsProvider.html#channel">Online Documentation</a>
     */
    val channel: Int

    /**
     * Gets the width of each tile, in pixels. This function should
     * not be called before [GoogleEarthEnterpriseMapsProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMapsProvider.html#tileWidth">Online Documentation</a>
     */
    val tileWidth: Int

    /**
     * Gets the height of each tile, in pixels.  This function should
     * not be called before [GoogleEarthEnterpriseMapsProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMapsProvider.html#tileHeight">Online Documentation</a>
     */
    val tileHeight: Int

    /**
     * Gets the maximum level-of-detail that can be requested.  This function should
     * not be called before [GoogleEarthEnterpriseMapsProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMapsProvider.html#maximumLevel">Online Documentation</a>
     */
    val maximumLevel: Int?

    /**
     * Gets the minimum level-of-detail that can be requested.  This function should
     * not be called before [GoogleEarthEnterpriseMapsProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMapsProvider.html#minimumLevel">Online Documentation</a>
     */
    val minimumLevel: Int

    /**
     * Gets the tiling scheme used by this provider.  This function should
     * not be called before [GoogleEarthEnterpriseMapsProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMapsProvider.html#tilingScheme">Online Documentation</a>
     */
    val tilingScheme: TilingScheme

    /**
     * Gets the version of the data used by this provider.  This function should
     * not be called before [GoogleEarthEnterpriseMapsProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMapsProvider.html#version">Online Documentation</a>
     */
    val version: Double

    /**
     * Gets the type of data that is being requested from the provider.  This function should
     * not be called before [GoogleEarthEnterpriseMapsProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMapsProvider.html#requestType">Online Documentation</a>
     */
    val requestType: String

    /**
     * Gets the rectangle, in radians, of the imagery provided by this instance.  This function should
     * not be called before [GoogleEarthEnterpriseMapsProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMapsProvider.html#rectangle">Online Documentation</a>
     */
    val rectangle: Rectangle

    /**
     * Gets the tile discard policy.  If not undefined, the discard policy is responsible
     * for filtering out "missing" tiles via its shouldDiscardImage function.  If this function
     * returns undefined, no tiles are filtered.  This function should
     * not be called before [GoogleEarthEnterpriseMapsProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMapsProvider.html#tileDiscardPolicy">Online Documentation</a>
     */
    val tileDiscardPolicy: TileDiscardPolicy

    /**
     * Gets an event that is raised when the imagery provider encounters an asynchronous error.  By subscribing
     * to the event, you will be notified of the error and can potentially recover from it.  Event listeners
     * are passed an instance of [TileProviderError].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMapsProvider.html#errorEvent">Online Documentation</a>
     */
    val errorEvent: Event<*>

    /**
     * Gets a value indicating whether or not the provider is ready for use.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMapsProvider.html#ready">Online Documentation</a>
     */
    val ready: Boolean

    /**
     * Gets a promise that resolves to true when the provider is ready for use.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMapsProvider.html#readyPromise">Online Documentation</a>
     */
    val readyPromise: kotlin.js.Promise<Boolean>

    /**
     * Gets the credit to display when this imagery provider is active.  Typically this is used to credit
     * the source of the imagery.  This function should not be called before [GoogleEarthEnterpriseMapsProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMapsProvider.html#credit">Online Documentation</a>
     */
    val credit: Credit

    /**
     * Gets a value indicating whether or not the images provided by this imagery provider
     * include an alpha channel.  If this property is false, an alpha channel, if present, will
     * be ignored.  If this property is true, any images without an alpha channel will be treated
     * as if their alpha is 1.0 everywhere.  When this property is false, memory usage
     * and texture upload time are reduced.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMapsProvider.html#hasAlphaChannel">Online Documentation</a>
     */
    val hasAlphaChannel: Boolean

    /**
     * Gets the credits to be displayed when a given tile is displayed.
     * @param [x] The tile X coordinate.
     * @param [y] The tile Y coordinate.
     * @param [level] The tile level;
     * @return The credits to be displayed when the tile is displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMapsProvider.html#getTileCredits">Online Documentation</a>
     */
    fun getTileCredits(
        x: Double,
        y: Double,
        level: Int,
    ): Array<out Credit>

    /**
     * Requests the image for a given tile.  This function should
     * not be called before [GoogleEarthEnterpriseMapsProvider.ready] returns true.
     * @param [x] The tile X coordinate.
     * @param [y] The tile Y coordinate.
     * @param [level] The tile level.
     * @param [request] The request object. Intended for internal use only.
     * @return A promise for the image that will resolve when the image is available, or
     *   undefined if there are too many active requests to the server, and the request should be retried later.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMapsProvider.html#requestImage">Online Documentation</a>
     */
    fun requestImage(
        x: Double,
        y: Double,
        level: Int,
        request: Request? = definedExternally,
    ): kotlin.js.Promise<ImageryTypes>?

    /**
     * Picking features is not currently supported by this imagery provider, so this function simply returns
     * undefined.
     * @param [x] The tile X coordinate.
     * @param [y] The tile Y coordinate.
     * @param [level] The tile level.
     * @param [longitude] The longitude at which to pick features.
     * @param [latitude] The latitude at which to pick features.
     * @return Undefined since picking is not supported.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMapsProvider.html#pickFeatures">Online Documentation</a>
     */
    fun pickFeatures(
        x: Double,
        y: Double,
        level: Int,
        longitude: Double,
        latitude: Double,
    ): Nothing?

    /**
     * Initialization options for the GoogleEarthEnterpriseMapsProvider constructor
     * @property [url] The url of the Google Earth server hosting the imagery.
     * @property [channel] The channel (id) to be used when requesting data from the server.
     *   The channel number can be found by looking at the json file located at:
     *   earth.localdomain/default_map/query?request=Json&vars=geeServerDefs The /default_map path may
     *   differ depending on your Google Earth Enterprise server configuration. Look for the "id" that
     *   is associated with a "ImageryMaps" requestType. There may be more than one id available.
     *   Example:
     *   {
     *   layers: [
     *   {
     *   id: 1002,
     *   requestType: "ImageryMaps"
     *   },
     *   {
     *   id: 1007,
     *   requestType: "VectorMapsRaster"
     *   }
     *   ]
     *   }
     * @property [path] The path of the Google Earth server hosting the imagery.
     *   Default value - `"/default_map"`
     * @property [maximumLevel] The maximum level-of-detail supported by the Google Earth
     *   Enterprise server, or undefined if there is no limit.
     * @property [tileDiscardPolicy] The policy that determines if a tile
     *   is invalid and should be discarded. To ensure that no tiles are discarded, construct and pass
     *   a [NeverTileDiscardPolicy] for this parameter.
     * @property [ellipsoid] The ellipsoid.  If not specified, the WGS84 ellipsoid is used.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMapsProvider.html#.ConstructorOptions">Online Documentation</a>
     */
    interface ConstructorOptions {
        var url: Resource
        var channel: Int
        var path: String?
        var maximumLevel: Int?
        var tileDiscardPolicy: TileDiscardPolicy?
        var ellipsoid: Ellipsoid?
    }

    companion object {
        /**
         * Gets or sets the URL to the Google Earth logo for display in the credit.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMapsProvider.html#.logoUrl">Online Documentation</a>
         */
        var logoUrl: String
    }
}

inline fun GoogleEarthEnterpriseMapsProvider(
    block: GoogleEarthEnterpriseMapsProvider.ConstructorOptions.() -> Unit,
): GoogleEarthEnterpriseMapsProvider {
    val options: GoogleEarthEnterpriseMapsProvider.ConstructorOptions = js("({})")
    block(options)
    return GoogleEarthEnterpriseMapsProvider(options)
}
