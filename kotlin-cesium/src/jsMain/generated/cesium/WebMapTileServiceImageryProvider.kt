// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.ReadonlyArray
import js.core.Void
import js.core.jso
import js.promise.Promise

/**
 * Provides tiled imagery served by [WMTS 1.0.0](http://www.opengeospatial.org/standards/wmts) compliant servers.
 * This provider supports HTTP KVP-encoded and RESTful GetTile requests, but does not yet support the SOAP encoding.
 * ```
 * // Example 1. USGS shaded relief tiles (KVP)
 * const shadedRelief1 = new WebMapTileServiceImageryProvider({
 *     url : 'http://basemap.nationalmap.gov/arcgis/rest/services/USGSShadedReliefOnly/MapServer/WMTS',
 *     layer : 'USGSShadedReliefOnly',
 *     style : 'default',
 *     format : 'image/jpeg',
 *     tileMatrixSetID : 'default028mm',
 *     // tileMatrixLabels : ['default028mm:0', 'default028mm:1', 'default028mm:2' ...],
 *     maximumLevel: 19,
 *     credit : new Credit('U. S. Geological Survey')
 * });
 * viewer.imageryLayers.addImageryProvider(shadedRelief1);
 * ```
 * ```
 * // Example 2. USGS shaded relief tiles (RESTful)
 * const shadedRelief2 = new WebMapTileServiceImageryProvider({
 *     url : 'http://basemap.nationalmap.gov/arcgis/rest/services/USGSShadedReliefOnly/MapServer/WMTS/tile/1.0.0/USGSShadedReliefOnly/{Style}/{TileMatrixSet}/{TileMatrix}/{TileRow}/{TileCol}.jpg',
 *     layer : 'USGSShadedReliefOnly',
 *     style : 'default',
 *     format : 'image/jpeg',
 *     tileMatrixSetID : 'default028mm',
 *     maximumLevel: 19,
 *     credit : new Credit('U. S. Geological Survey')
 * });
 * viewer.imageryLayers.addImageryProvider(shadedRelief2);
 * ```
 * ```
 * // Example 3. NASA time dynamic weather data (RESTful)
 * const times = TimeIntervalCollection.fromIso8601({
 *     iso8601: '2015-07-30/2017-06-16/P1D',
 *     dataCallback: function dataCallback(interval, index) {
 *         return {
 *             Time: JulianDate.toIso8601(interval.start)
 *         };
 *     }
 * });
 * const weather = new WebMapTileServiceImageryProvider({
 *     url : 'https://gibs.earthdata.nasa.gov/wmts/epsg4326/best/AMSR2_Snow_Water_Equivalent/default/{Time}/{TileMatrixSet}/{TileMatrix}/{TileRow}/{TileCol}.png',
 *     layer : 'AMSR2_Snow_Water_Equivalent',
 *     style : 'default',
 *     tileMatrixSetID : '2km',
 *     maximumLevel : 5,
 *     format : 'image/png',
 *     clock: clock,
 *     times: times,
 *     credit : new Credit('NASA Global Imagery Browse Services for EOSDIS')
 * });
 * viewer.imageryLayers.addImageryProvider(weather);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapTileServiceImageryProvider.html">Online Documentation</a>
 */
external class WebMapTileServiceImageryProvider(options: ConstructorOptions) {
    /**
     * Gets the URL of the service hosting the imagery.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapTileServiceImageryProvider.html#url">Online Documentation</a>
     */
    val url: String

    /**
     * Gets the proxy used by this provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapTileServiceImageryProvider.html#proxy">Online Documentation</a>
     */
    val proxy: Proxy

    /**
     * Gets the width of each tile, in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapTileServiceImageryProvider.html#tileWidth">Online Documentation</a>
     */
    val tileWidth: Int

    /**
     * Gets the height of each tile, in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapTileServiceImageryProvider.html#tileHeight">Online Documentation</a>
     */
    val tileHeight: Int

    /**
     * Gets the maximum level-of-detail that can be requested.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapTileServiceImageryProvider.html#maximumLevel">Online Documentation</a>
     */
    val maximumLevel: Int?

    /**
     * Gets the minimum level-of-detail that can be requested.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapTileServiceImageryProvider.html#minimumLevel">Online Documentation</a>
     */
    val minimumLevel: Int

    /**
     * Gets the tiling scheme used by this provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapTileServiceImageryProvider.html#tilingScheme">Online Documentation</a>
     */
    val tilingScheme: TilingScheme

    /**
     * Gets the rectangle, in radians, of the imagery provided by this instance.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapTileServiceImageryProvider.html#rectangle">Online Documentation</a>
     */
    val rectangle: Rectangle

    /**
     * Gets the tile discard policy.  If not undefined, the discard policy is responsible
     * for filtering out "missing" tiles via its shouldDiscardImage function.  If this function
     * returns undefined, no tiles are filtered.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapTileServiceImageryProvider.html#tileDiscardPolicy">Online Documentation</a>
     */
    val tileDiscardPolicy: TileDiscardPolicy

    /**
     * Gets an event that is raised when the imagery provider encounters an asynchronous error.  By subscribing
     * to the event, you will be notified of the error and can potentially recover from it.  Event listeners
     * are passed an instance of [TileProviderError].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapTileServiceImageryProvider.html#errorEvent">Online Documentation</a>
     */
    val errorEvent: DefaultEvent

    /**
     * Gets the mime type of images returned by this imagery provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapTileServiceImageryProvider.html#format">Online Documentation</a>
     */
    val format: String

    /**
     * Gets the credit to display when this imagery provider is active.  Typically this is used to credit
     * the source of the imagery.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapTileServiceImageryProvider.html#credit">Online Documentation</a>
     */
    val credit: Credit

    /**
     * Gets a value indicating whether or not the images provided by this imagery provider
     * include an alpha channel.  If this property is false, an alpha channel, if present, will
     * be ignored.  If this property is true, any images without an alpha channel will be treated
     * as if their alpha is 1.0 everywhere.  When this property is false, memory usage
     * and texture upload time are reduced.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapTileServiceImageryProvider.html#hasAlphaChannel">Online Documentation</a>
     */
    val hasAlphaChannel: Boolean

    /**
     * Gets or sets a clock that is used to get keep the time used for time dynamic parameters.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapTileServiceImageryProvider.html#clock">Online Documentation</a>
     */
    var clock: Clock

    /**
     * Gets or sets a time interval collection that is used to get time dynamic parameters. The data of each
     * TimeInterval is an object containing the keys and values of the properties that are used during
     * tile requests.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapTileServiceImageryProvider.html#times">Online Documentation</a>
     */
    var times: TimeIntervalCollection

    /**
     * Gets or sets an object that contains static dimensions and their values.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapTileServiceImageryProvider.html#dimensions">Online Documentation</a>
     */
    var dimensions: Any

    /**
     * Gets the credits to be displayed when a given tile is displayed.
     * @param [x] The tile X coordinate.
     * @param [y] The tile Y coordinate.
     * @param [level] The tile level;
     * @return The credits to be displayed when the tile is displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapTileServiceImageryProvider.html#getTileCredits">Online Documentation</a>
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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapTileServiceImageryProvider.html#requestImage">Online Documentation</a>
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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapTileServiceImageryProvider.html#pickFeatures">Online Documentation</a>
     */
    fun pickFeatures(
        x: Double,
        y: Double,
        level: Int,
        longitude: Double,
        latitude: Double,
    ): Void

    /**
     * Initialization options for the WebMapTileServiceImageryProvider constructor
     * @property [url] The base URL for the WMTS GetTile operation (for KVP-encoded requests) or the tile-URL template (for RESTful requests). The tile-URL template should contain the following variables: &#123;style&#125;, &#123;TileMatrixSet&#125;, &#123;TileMatrix&#125;, &#123;TileRow&#125;, &#123;TileCol&#125;. The first two are optional if actual values are hardcoded or not required by the server. The &#123;s&#125; keyword may be used to specify subdomains.
     * @property [format] The MIME type for images to retrieve from the server.
     *   Default value - `'image/jpeg'`
     * @property [layer] The layer name for WMTS requests.
     * @property [style] The style name for WMTS requests.
     * @property [tileMatrixSetID] The identifier of the TileMatrixSet to use for WMTS requests.
     * @property [tileMatrixLabels] A list of identifiers in the TileMatrix to use for WMTS requests, one per TileMatrix level.
     * @property [clock] A Clock instance that is used when determining the value for the time dimension. Required when `times` is specified.
     * @property [times] TimeIntervalCollection with its `data` property being an object containing time dynamic dimension and their values.
     * @property [dimensions] A object containing static dimensions and their values.
     * @property [tileWidth] The tile width in pixels.
     *   Default value - `256`
     * @property [tileHeight] The tile height in pixels.
     *   Default value - `256`
     * @property [tilingScheme] The tiling scheme corresponding to the organization of the tiles in the TileMatrixSet.
     * @property [rectangle] The rectangle covered by the layer.
     *   Default value - [Rectangle.MAX_VALUE]
     * @property [minimumLevel] The minimum level-of-detail supported by the imagery provider.
     *   Default value - `0`
     * @property [maximumLevel] The maximum level-of-detail supported by the imagery provider, or undefined if there is no limit.
     * @property [ellipsoid] The ellipsoid.  If not specified, the WGS84 ellipsoid is used.
     * @property [credit] A credit for the data source, which is displayed on the canvas.
     * @property [subdomains] The subdomains to use for the `{s}` placeholder in the URL template.
     *   If this parameter is a single string, each character in the string is a subdomain.  If it is
     *   an array, each element in the array is a subdomain.
     *   Default value - `'abc'`
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMapTileServiceImageryProvider.html#.ConstructorOptions">Online Documentation</a>
     */
    interface ConstructorOptions {
        var url: Resource
        var format: String?
        var layer: String
        var style: String
        var tileMatrixSetID: String
        var tileMatrixLabels: ReadonlyArray<Any>?
        var clock: Clock?
        var times: TimeIntervalCollection?
        var dimensions: Any?
        var tileWidth: Int?
        var tileHeight: Int?
        var tilingScheme: TilingScheme?
        var rectangle: Rectangle?
        var minimumLevel: Int?
        var maximumLevel: Int?
        var ellipsoid: Ellipsoid?
        var credit: Credit?
        var subdomains: ReadonlyArray<String>?
    }
}

inline fun WebMapTileServiceImageryProvider(
    block: WebMapTileServiceImageryProvider.ConstructorOptions.() -> Unit,
): WebMapTileServiceImageryProvider =
    WebMapTileServiceImageryProvider(options = jso(block))
