// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.ReadonlyArray
import js.core.jso
import kotlin.js.Promise

/**
 * Provides tiled imagery hosted by an ArcGIS MapServer.  By default, the server's pre-cached tiles are
 * used, if available.
 * ```
 * const esri = new ArcGisMapServerImageryProvider({
 *     url : 'https://services.arcgisonline.com/ArcGIS/rest/services/World_Imagery/MapServer'
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html">Online Documentation</a>
 */
external class ArcGisMapServerImageryProvider(options: ConstructorOptions) {
    /**
     * The default alpha blending value of this provider, with 0.0 representing fully transparent and
     * 1.0 representing fully opaque.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#defaultAlpha">Online Documentation</a>
     */
    var defaultAlpha: Double?

    /**
     * The default alpha blending value on the night side of the globe of this provider, with 0.0 representing fully transparent and
     * 1.0 representing fully opaque.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#defaultNightAlpha">Online Documentation</a>
     */
    var defaultNightAlpha: Double?

    /**
     * The default alpha blending value on the day side of the globe of this provider, with 0.0 representing fully transparent and
     * 1.0 representing fully opaque.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#defaultDayAlpha">Online Documentation</a>
     */
    var defaultDayAlpha: Double?

    /**
     * The default brightness of this provider.  1.0 uses the unmodified imagery color.  Less than 1.0
     * makes the imagery darker while greater than 1.0 makes it brighter.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#defaultBrightness">Online Documentation</a>
     */
    var defaultBrightness: Double?

    /**
     * The default contrast of this provider.  1.0 uses the unmodified imagery color.  Less than 1.0 reduces
     * the contrast while greater than 1.0 increases it.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#defaultContrast">Online Documentation</a>
     */
    var defaultContrast: Double?

    /**
     * The default hue of this provider in radians. 0.0 uses the unmodified imagery color.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#defaultHue">Online Documentation</a>
     */
    var defaultHue: Double?

    /**
     * The default saturation of this provider. 1.0 uses the unmodified imagery color. Less than 1.0 reduces the
     * saturation while greater than 1.0 increases it.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#defaultSaturation">Online Documentation</a>
     */
    var defaultSaturation: Double?

    /**
     * The default gamma correction to apply to this provider.  1.0 uses the unmodified imagery color.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#defaultGamma">Online Documentation</a>
     */
    var defaultGamma: Double?

    /**
     * The default texture minification filter to apply to this provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#defaultMinificationFilter">Online Documentation</a>
     */
    var defaultMinificationFilter: TextureMinificationFilter

    /**
     * The default texture magnification filter to apply to this provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#defaultMagnificationFilter">Online Documentation</a>
     */
    var defaultMagnificationFilter: TextureMagnificationFilter

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
     * Gets the width of each tile, in pixels. This function should
     * not be called before [ArcGisMapServerImageryProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#tileWidth">Online Documentation</a>
     */
    val tileWidth: Int

    /**
     * Gets the height of each tile, in pixels.  This function should
     * not be called before [ArcGisMapServerImageryProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#tileHeight">Online Documentation</a>
     */
    val tileHeight: Int

    /**
     * Gets the maximum level-of-detail that can be requested.  This function should
     * not be called before [ArcGisMapServerImageryProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#maximumLevel">Online Documentation</a>
     */
    val maximumLevel: Int?

    /**
     * Gets the minimum level-of-detail that can be requested.  This function should
     * not be called before [ArcGisMapServerImageryProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#minimumLevel">Online Documentation</a>
     */
    val minimumLevel: Int

    /**
     * Gets the tiling scheme used by this provider.  This function should
     * not be called before [ArcGisMapServerImageryProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#tilingScheme">Online Documentation</a>
     */
    val tilingScheme: TilingScheme

    /**
     * Gets the rectangle, in radians, of the imagery provided by this instance.  This function should
     * not be called before [ArcGisMapServerImageryProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#rectangle">Online Documentation</a>
     */
    val rectangle: Rectangle

    /**
     * Gets the tile discard policy.  If not undefined, the discard policy is responsible
     * for filtering out "missing" tiles via its shouldDiscardImage function.  If this function
     * returns undefined, no tiles are filtered.  This function should
     * not be called before [ArcGisMapServerImageryProvider.ready] returns true.
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
     * Gets a value indicating whether or not the provider is ready for use.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#ready">Online Documentation</a>
     */
    val ready: Boolean

    /**
     * Gets a promise that resolves to true when the provider is ready for use.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#readyPromise">Online Documentation</a>
     */
    val readyPromise: Promise<Boolean>

    /**
     * Gets the credit to display when this imagery provider is active.  Typically this is used to credit
     * the source of the imagery.  This function should not be called before [ArcGisMapServerImageryProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#credit">Online Documentation</a>
     */
    val credit: Credit

    /**
     * Gets a value indicating whether this imagery provider is using pre-cached tiles from the
     * ArcGIS MapServer.  If the imagery provider is not yet ready ([ArcGisMapServerImageryProvider.ready]), this function
     * will return the value of `options.usePreCachedTilesIfAvailable`, even if the MapServer does
     * not have pre-cached tiles.
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
     * Requests the image for a given tile.  This function should
     * not be called before [ArcGisMapServerImageryProvider.ready] returns true.
     * @param [x] The tile X coordinate.
     * @param [y] The tile Y coordinate.
     * @param [level] The tile level.
     * @param [request] The request object. Intended for internal use only.
     * @return A promise for the image that will resolve when the image is available, or
     *   undefined if there are too many active requests to the server, and the request should be retried later.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#requestImage">Online Documentation</a>
     */
    fun requestImage(
        x: Double,
        y: Double,
        level: Int,
        request: Request? = definedExternally,
    ): Promise<ImageryTypes>?

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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#pickFeatures">Online Documentation</a>
     */
    fun pickFeatures(
        x: Double,
        y: Double,
        level: Int,
        longitude: Double,
        latitude: Double,
    ): Promise<ReadonlyArray<ImageryLayerFeatureInfo>>?

    /**
     * Initialization options for the ArcGisMapServerImageryProvider constructor
     * @property [url] The URL of the ArcGIS MapServer service.
     * @property [token] The ArcGIS token used to authenticate with the ArcGIS MapServer service.
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
     *   tiles are used if they are available.  If false, any pre-cached tiles are ignored and the
     *   'export' service is used.
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
     *   parameter is specified, the WGS84 ellipsoid is used.
     * @property [credit] A credit for the data source, which is displayed on the canvas.  This parameter is ignored when accessing a tiled server.
     * @property [tileWidth] The width of each tile in pixels.  This parameter is ignored when accessing a tiled server.
     *   Default value - `256`
     * @property [tileHeight] The height of each tile in pixels.  This parameter is ignored when accessing a tiled server.
     *   Default value - `256`
     * @property [maximumLevel] The maximum tile level to request, or undefined if there is no maximum.  This parameter is ignored when accessing
     *   a tiled server.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapServerImageryProvider.html#.ConstructorOptions">Online Documentation</a>
     */
    interface ConstructorOptions {
        var url: Resource
        var token: String?
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
}

inline fun ArcGisMapServerImageryProvider(
    block: ArcGisMapServerImageryProvider.ConstructorOptions.() -> Unit,
): ArcGisMapServerImageryProvider =
    ArcGisMapServerImageryProvider(options = jso(block))
