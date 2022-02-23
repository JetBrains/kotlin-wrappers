// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * Provides tiled imagery hosted by a Web Map Service (WMS) server.
 * ```
 * const provider = new WebMapServiceImageryProvider({
 *     url : 'https://sampleserver1.arcgisonline.com/ArcGIS/services/Specialty/ESRI_StatesCitiesRivers_USA/MapServer/WMSServer',
 *     layers : '0',
 *     proxy: new DefaultProxy('/proxy/')
 * });
 *
 * viewer.imageryLayers.addImageryProvider(provider);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapServiceImageryProvider.html">Online Documentation</a>
 */
external class WebMapServiceImageryProvider(options: ConstructorOptions) {
    /**
     * The default alpha blending value of this provider, with 0.0 representing fully transparent and
     * 1.0 representing fully opaque.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapServiceImageryProvider.html#defaultAlpha">Online Documentation</a>
     */
    var defaultAlpha: Double?

    /**
     * The default alpha blending value on the night side of the globe of this provider, with 0.0 representing fully transparent and
     * 1.0 representing fully opaque.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapServiceImageryProvider.html#defaultNightAlpha">Online Documentation</a>
     */
    var defaultNightAlpha: Double?

    /**
     * The default alpha blending value on the day side of the globe of this provider, with 0.0 representing fully transparent and
     * 1.0 representing fully opaque.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapServiceImageryProvider.html#defaultDayAlpha">Online Documentation</a>
     */
    var defaultDayAlpha: Double?

    /**
     * The default brightness of this provider.  1.0 uses the unmodified imagery color.  Less than 1.0
     * makes the imagery darker while greater than 1.0 makes it brighter.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapServiceImageryProvider.html#defaultBrightness">Online Documentation</a>
     */
    var defaultBrightness: Double?

    /**
     * The default contrast of this provider.  1.0 uses the unmodified imagery color.  Less than 1.0 reduces
     * the contrast while greater than 1.0 increases it.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapServiceImageryProvider.html#defaultContrast">Online Documentation</a>
     */
    var defaultContrast: Double?

    /**
     * The default hue of this provider in radians. 0.0 uses the unmodified imagery color.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapServiceImageryProvider.html#defaultHue">Online Documentation</a>
     */
    var defaultHue: Double?

    /**
     * The default saturation of this provider. 1.0 uses the unmodified imagery color. Less than 1.0 reduces the
     * saturation while greater than 1.0 increases it.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapServiceImageryProvider.html#defaultSaturation">Online Documentation</a>
     */
    var defaultSaturation: Double?

    /**
     * The default gamma correction to apply to this provider.  1.0 uses the unmodified imagery color.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapServiceImageryProvider.html#defaultGamma">Online Documentation</a>
     */
    var defaultGamma: Double?

    /**
     * The default texture minification filter to apply to this provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapServiceImageryProvider.html#defaultMinificationFilter">Online Documentation</a>
     */
    var defaultMinificationFilter: TextureMinificationFilter

    /**
     * The default texture magnification filter to apply to this provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapServiceImageryProvider.html#defaultMagnificationFilter">Online Documentation</a>
     */
    var defaultMagnificationFilter: TextureMagnificationFilter

    /**
     * Gets the URL of the WMS server.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapServiceImageryProvider.html#url">Online Documentation</a>
     */
    val url: String

    /**
     * Gets the proxy used by this provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapServiceImageryProvider.html#proxy">Online Documentation</a>
     */
    val proxy: Proxy

    /**
     * Gets the names of the WMS layers, separated by commas.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapServiceImageryProvider.html#layers">Online Documentation</a>
     */
    val layers: String

    /**
     * Gets the width of each tile, in pixels. This function should
     * not be called before [WebMapServiceImageryProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapServiceImageryProvider.html#tileWidth">Online Documentation</a>
     */
    val tileWidth: Int

    /**
     * Gets the height of each tile, in pixels.  This function should
     * not be called before [WebMapServiceImageryProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapServiceImageryProvider.html#tileHeight">Online Documentation</a>
     */
    val tileHeight: Int

    /**
     * Gets the maximum level-of-detail that can be requested.  This function should
     * not be called before [WebMapServiceImageryProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapServiceImageryProvider.html#maximumLevel">Online Documentation</a>
     */
    val maximumLevel: Int?

    /**
     * Gets the minimum level-of-detail that can be requested.  This function should
     * not be called before [WebMapServiceImageryProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapServiceImageryProvider.html#minimumLevel">Online Documentation</a>
     */
    val minimumLevel: Int

    /**
     * Gets the tiling scheme used by this provider.  This function should
     * not be called before [WebMapServiceImageryProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapServiceImageryProvider.html#tilingScheme">Online Documentation</a>
     */
    val tilingScheme: TilingScheme

    /**
     * Gets the rectangle, in radians, of the imagery provided by this instance.  This function should
     * not be called before [WebMapServiceImageryProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapServiceImageryProvider.html#rectangle">Online Documentation</a>
     */
    val rectangle: Rectangle

    /**
     * Gets the tile discard policy.  If not undefined, the discard policy is responsible
     * for filtering out "missing" tiles via its shouldDiscardImage function.  If this function
     * returns undefined, no tiles are filtered.  This function should
     * not be called before [WebMapServiceImageryProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapServiceImageryProvider.html#tileDiscardPolicy">Online Documentation</a>
     */
    val tileDiscardPolicy: TileDiscardPolicy

    /**
     * Gets an event that is raised when the imagery provider encounters an asynchronous error.  By subscribing
     * to the event, you will be notified of the error and can potentially recover from it.  Event listeners
     * are passed an instance of [TileProviderError].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapServiceImageryProvider.html#errorEvent">Online Documentation</a>
     */
    val errorEvent: Event

    /**
     * Gets a value indicating whether or not the provider is ready for use.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapServiceImageryProvider.html#ready">Online Documentation</a>
     */
    val ready: Boolean

    /**
     * Gets a promise that resolves to true when the provider is ready for use.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapServiceImageryProvider.html#readyPromise">Online Documentation</a>
     */
    val readyPromise: kotlin.js.Promise<Boolean>

    /**
     * Gets the credit to display when this imagery provider is active.  Typically this is used to credit
     * the source of the imagery.  This function should not be called before [WebMapServiceImageryProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapServiceImageryProvider.html#credit">Online Documentation</a>
     */
    val credit: Credit

    /**
     * Gets a value indicating whether or not the images provided by this imagery provider
     * include an alpha channel.  If this property is false, an alpha channel, if present, will
     * be ignored.  If this property is true, any images without an alpha channel will be treated
     * as if their alpha is 1.0 everywhere.  When this property is false, memory usage
     * and texture upload time are reduced.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapServiceImageryProvider.html#hasAlphaChannel">Online Documentation</a>
     */
    val hasAlphaChannel: Boolean

    /**
     * Gets or sets a value indicating whether feature picking is enabled.  If true, [WebMapServiceImageryProvider.pickFeatures] will
     * invoke the `GetFeatureInfo` service on the WMS server and attempt to interpret the features included in the response.  If false,
     * [WebMapServiceImageryProvider.pickFeatures] will immediately return undefined (indicating no pickable
     * features) without communicating with the server.  Set this property to false if you know your data
     * source does not support picking features or if you don't want this provider's features to be pickable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapServiceImageryProvider.html#enablePickFeatures">Online Documentation</a>
     */
    var enablePickFeatures: Boolean

    /**
     * Gets or sets a clock that is used to get keep the time used for time dynamic parameters.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapServiceImageryProvider.html#clock">Online Documentation</a>
     */
    var clock: Clock

    /**
     * Gets or sets a time interval collection that is used to get time dynamic parameters. The data of each
     * TimeInterval is an object containing the keys and values of the properties that are used during
     * tile requests.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapServiceImageryProvider.html#times">Online Documentation</a>
     */
    var times: TimeIntervalCollection

    /**
     * Gets the getFeatureInfo URL of the WMS server.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapServiceImageryProvider.html#getFeatureInfoUrl">Online Documentation</a>
     */
    val getFeatureInfoUrl: Resource

    /**
     * Gets the credits to be displayed when a given tile is displayed.
     * @param [x] The tile X coordinate.
     * @param [y] The tile Y coordinate.
     * @param [level] The tile level;
     * @return The credits to be displayed when the tile is displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapServiceImageryProvider.html#getTileCredits">Online Documentation</a>
     */
    fun getTileCredits(
        x: Double,
        y: Double,
        level: Int,
    ): Array<out Credit>

    /**
     * Requests the image for a given tile.  This function should
     * not be called before [WebMapServiceImageryProvider.ready] returns true.
     * @param [x] The tile X coordinate.
     * @param [y] The tile Y coordinate.
     * @param [level] The tile level.
     * @param [request] The request object. Intended for internal use only.
     * @return A promise for the image that will resolve when the image is available, or
     *   undefined if there are too many active requests to the server, and the request
     *   should be retried later.  The resolved image may be either an
     *   Image or a Canvas DOM object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapServiceImageryProvider.html#requestImage">Online Documentation</a>
     */
    fun requestImage(
        x: Double,
        y: Double,
        level: Int,
        request: Request? = definedExternally,
    ): kotlin.js.Promise<org.w3c.dom.HTMLElement>?

    /**
     * Asynchronously determines what features, if any, are located at a given longitude and latitude within
     * a tile.  This function should not be called before [ImageryProvider.ready] returns true.
     * @param [x] The tile X coordinate.
     * @param [y] The tile Y coordinate.
     * @param [level] The tile level.
     * @param [longitude] The longitude at which to pick features.
     * @param [latitude] The latitude at which to pick features.
     * @return A promise for the picked features that will resolve when the asynchronous
     *   picking completes.  The resolved value is an array of [ImageryLayerFeatureInfo]
     *   instances.  The array may be empty if no features are found at the given location.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapServiceImageryProvider.html#pickFeatures">Online Documentation</a>
     */
    fun pickFeatures(
        x: Double,
        y: Double,
        level: Int,
        longitude: Double,
        latitude: Double,
    ): kotlin.js.Promise<Array<out ImageryLayerFeatureInfo>>?

    /**
     * Initialization options for the WebMapServiceImageryProvider constructor
     * @property [url] The URL of the WMS service. The URL supports the same keywords as the [UrlTemplateImageryProvider].
     * @property [layers] The layers to include, separated by commas.
     * @property [parameters] Additional parameters to pass to the WMS server in the GetMap URL.
     *   Default value - [WebMapServiceImageryProvider.DefaultParameters]
     * @property [getFeatureInfoParameters] Additional parameters to pass to the WMS server in the GetFeatureInfo URL.
     *   Default value - [WebMapServiceImageryProvider.GetFeatureInfoDefaultParameters]
     * @property [enablePickFeatures] If true, [WebMapServiceImageryProvider.pickFeatures] will invoke
     *   the GetFeatureInfo operation on the WMS server and return the features included in the response.  If false,
     *   [WebMapServiceImageryProvider.pickFeatures] will immediately return undefined (indicating no pickable features)
     *   without communicating with the server.  Set this property to false if you know your WMS server does not support
     *   GetFeatureInfo or if you don't want this provider's features to be pickable. Note that this can be dynamically
     *   overridden by modifying the WebMapServiceImageryProvider#enablePickFeatures property.
     *   Default value - `true`
     * @property [getFeatureInfoFormats] The formats
     *   in which to try WMS GetFeatureInfo requests.
     *   Default value - [WebMapServiceImageryProvider.DefaultGetFeatureInfoFormats]
     * @property [rectangle] The rectangle of the layer.
     *   Default value - [Rectangle.MAX_VALUE]
     * @property [tilingScheme] The tiling scheme to use to divide the world into tiles.
     *   Default value - [GeographicTilingScheme()][GeographicTilingScheme]
     * @property [ellipsoid] The ellipsoid.  If the tilingScheme is specified,
     *   this parameter is ignored and the tiling scheme's ellipsoid is used instead. If neither
     *   parameter is specified, the WGS84 ellipsoid is used.
     * @property [tileWidth] The width of each tile in pixels.
     *   Default value - `256`
     * @property [tileHeight] The height of each tile in pixels.
     *   Default value - `256`
     * @property [minimumLevel] The minimum level-of-detail supported by the imagery provider.  Take care when
     *   specifying this that the number of tiles at the minimum level is small, such as four or less.  A larger number is
     *   likely to result in rendering problems.
     *   Default value - `0`
     * @property [maximumLevel] The maximum level-of-detail supported by the imagery provider, or undefined if there is no limit.
     *   If not specified, there is no limit.
     * @property [crs] CRS specification, for use with WMS specification >= 1.3.0.
     * @property [srs] SRS specification, for use with WMS specification 1.1.0 or 1.1.1
     * @property [credit] A credit for the data source, which is displayed on the canvas.
     * @property [subdomains] The subdomains to use for the `{s}` placeholder in the URL template.
     *   If this parameter is a single string, each character in the string is a subdomain.  If it is
     *   an array, each element in the array is a subdomain.
     *   Default value - `'abc'`
     * @property [clock] A Clock instance that is used when determining the value for the time dimension. Required when `times` is specified.
     * @property [times] TimeIntervalCollection with its data property being an object containing time dynamic dimension and their values.
     * @property [getFeatureInfoUrl] The getFeatureInfo URL of the WMS service. If the property is not defined then we use the property value of url.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapServiceImageryProvider.html#.ConstructorOptions">Online Documentation</a>
     */
    interface ConstructorOptions {
        var url: Resource
        var layers: String
        var parameters: Any?
        var getFeatureInfoParameters: Any?
        var enablePickFeatures: Boolean?
        var getFeatureInfoFormats: Array<out GetFeatureInfoFormat>?
        var rectangle: Rectangle?
        var tilingScheme: TilingScheme?
        var ellipsoid: Ellipsoid?
        var tileWidth: Int?
        var tileHeight: Int?
        var minimumLevel: Int?
        var maximumLevel: Int?
        var crs: String?
        var srs: String?
        var credit: Credit?
        var subdomains: Array<out String>?
        var clock: Clock?
        var times: TimeIntervalCollection?
        var getFeatureInfoUrl: Resource?
    }

    companion object {
        /**
         * The default parameters to include in the WMS URL to obtain images.  The values are as follows:
         *    service=WMS
         *    version=1.1.1
         *    request=GetMap
         *    styles=
         *    format=image/jpeg
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapServiceImageryProvider.html#.DefaultParameters">Online Documentation</a>
         */
        val DefaultParameters: Any

        /**
         * The default parameters to include in the WMS URL to get feature information.  The values are as follows:
         *     service=WMS
         *     version=1.1.1
         *     request=GetFeatureInfo
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapServiceImageryProvider.html#.GetFeatureInfoDefaultParameters">Online Documentation</a>
         */
        val GetFeatureInfoDefaultParameters: Any
    }
}

inline fun WebMapServiceImageryProvider(
    block: WebMapServiceImageryProvider.ConstructorOptions.() -> Unit,
): WebMapServiceImageryProvider {
    val options: WebMapServiceImageryProvider.ConstructorOptions = js("({})")
    block(options)
    return WebMapServiceImageryProvider(options)
}
