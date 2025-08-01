// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray
import js.core.JsAny
import js.core.JsString
import js.objects.JsPlainObject
import js.promise.Promise
import seskar.js.JsAsync

/**
 * Provides imagery by requesting tiles using a specified URL template.
 * ```
 * // Access Natural Earth II imagery, which uses a TMS tiling scheme and Geographic (EPSG:4326) project
 * const tms = new UrlTemplateImageryProvider({
 *     url : buildModuleUrl('Assets/Textures/NaturalEarthII') + '/{z}/{x}/{reverseY}.jpg',
 *     tilingScheme : new GeographicTilingScheme(),
 *     maximumLevel : 5
 * });
 * // Access the CartoDB Positron basemap, which uses an OpenStreetMap-like tiling scheme.
 * const positron = new UrlTemplateImageryProvider({
 *     url : 'http://{s}.basemaps.cartocdn.com/light_all/{z}/{x}/{y}.png',
 *     credit : 'Map tiles by CartoDB, under CC BY 3.0. Data by OpenStreetMap, under ODbL.'
 * });
 * // Access a Web Map Service (WMS) server.
 * const wms = new UrlTemplateImageryProvider({
 *    url : 'https://services.ga.gov.au/gis/services/NM_Hydrology_and_Marine_Points/MapServer/WMSServer?' +
 *          'tiled=true&transparent=true&format=image%2Fpng&exceptions=application%2Fvnd.ogc.se_xml&' +
 *          'styles=&service=WMS&version=1.3.0&request=GetMap&' +
 *          'layers=Bores&crs=EPSG%3A3857&' +
 *          'bbox={westProjected}%2C{southProjected}%2C{eastProjected}%2C{northProjected}&' +
 *          'width=256&height=256',
 *    rectangle : Rectangle.fromDegrees(95.0, -55.0, 170.0, -1.0)  // From GetCapabilities EX_GeographicBoundingBox
 * });
 * // Using custom tags in your template url.
 * const custom = new UrlTemplateImageryProvider({
 *    url : 'https://yoururl/{Time}/{z}/{y}/{x}.png',
 *    customTags : {
 *        Time: function(imageryProvider, x, y, level) {
 *            return '20171231'
 *        }
 *    }
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/UrlTemplateImageryProvider.html">Online Documentation</a>
 */
external class UrlTemplateImageryProvider(
    options: ConstructorOptions,
) {
    /**
     * Gets or sets a value indicating whether feature picking is enabled.  If true, [UrlTemplateImageryProvider.pickFeatures] will
     * request the `options.pickFeaturesUrl` and attempt to interpret the features included in the response.  If false,
     * [UrlTemplateImageryProvider.pickFeatures] will immediately return undefined (indicating no pickable
     * features) without communicating with the server.  Set this property to false if you know your data
     * source does not support picking features or if you don't want this provider's features to be pickable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/UrlTemplateImageryProvider.html#enablePickFeatures">Online Documentation</a>
     */
    var enablePickFeatures: Boolean

    /**
     * Gets the URL template to use to request tiles.  It has the following keywords:
     * - `{z}`: The level of the tile in the tiling scheme.  Level zero is the root of the quadtree pyramid.
     * - `{x}`: The tile X coordinate in the tiling scheme, where 0 is the Westernmost tile.
     * - `{y}`: The tile Y coordinate in the tiling scheme, where 0 is the Northernmost tile.
     * - `{s}`: One of the available subdomains, used to overcome browser limits on the number of simultaneous requests per host.
     * - `{reverseX}`: The tile X coordinate in the tiling scheme, where 0 is the Easternmost tile.
     * - `{reverseY}`: The tile Y coordinate in the tiling scheme, where 0 is the Southernmost tile.
     * - `{reverseZ}`: The level of the tile in the tiling scheme, where level zero is the maximum level of the quadtree pyramid.  In order to use reverseZ, maximumLevel must be defined.
     * - `{westDegrees}`: The Western edge of the tile in geodetic degrees.
     * - `{southDegrees}`: The Southern edge of the tile in geodetic degrees.
     * - `{eastDegrees}`: The Eastern edge of the tile in geodetic degrees.
     * - `{northDegrees}`: The Northern edge of the tile in geodetic degrees.
     * - `{westProjected}`: The Western edge of the tile in projected coordinates of the tiling scheme.
     * - `{southProjected}`: The Southern edge of the tile in projected coordinates of the tiling scheme.
     * - `{eastProjected}`: The Eastern edge of the tile in projected coordinates of the tiling scheme.
     * - `{northProjected}`: The Northern edge of the tile in projected coordinates of the tiling scheme.
     * - `{width}`: The width of each tile in pixels.
     * - `{height}`: The height of each tile in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/UrlTemplateImageryProvider.html#url">Online Documentation</a>
     */
    val url: String

    /**
     * Gets the URL scheme zero padding for each tile coordinate. The format is '000' where each coordinate will be padded on
     * the left with zeros to match the width of the passed string of zeros. e.g. Setting:
     * urlSchemeZeroPadding : { '{x}' : '0000'}
     * will cause an 'x' value of 12 to return the string '0012' for {x} in the generated URL.
     * It has the following keywords:
     * - `{z}`: The zero padding for the level of the tile in the tiling scheme.
     * - `{x}`: The zero padding for the tile X coordinate in the tiling scheme.
     * - `{y}`: The zero padding for the the tile Y coordinate in the tiling scheme.
     * - `{reverseX}`: The zero padding for the tile reverseX coordinate in the tiling scheme.
     * - `{reverseY}`: The zero padding for the tile reverseY coordinate in the tiling scheme.
     * - `{reverseZ}`: The zero padding for the reverseZ coordinate of the tile in the tiling scheme.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/UrlTemplateImageryProvider.html#urlSchemeZeroPadding">Online Documentation</a>
     */
    val urlSchemeZeroPadding: JsAny

    /**
     * Gets the URL template to use to use to pick features.  If this property is not specified,
     * [UrlTemplateImageryProvider.pickFeatures] will immediately return undefined, indicating no
     * features picked.  The URL template supports all of the keywords supported by the
     * [UrlTemplateImageryProvider.url] property, plus the following:
     * - `{i}`: The pixel column (horizontal coordinate) of the picked position, where the Westernmost pixel is 0.
     * - `{j}`: The pixel row (vertical coordinate) of the picked position, where the Northernmost pixel is 0.
     * - `{reverseI}`: The pixel column (horizontal coordinate) of the picked position, where the Easternmost pixel is 0.
     * - `{reverseJ}`: The pixel row (vertical coordinate) of the picked position, where the Southernmost pixel is 0.
     * - `{longitudeDegrees}`: The longitude of the picked position in degrees.
     * - `{latitudeDegrees}`: The latitude of the picked position in degrees.
     * - `{longitudeProjected}`: The longitude of the picked position in the projected coordinates of the tiling scheme.
     * - `{latitudeProjected}`: The latitude of the picked position in the projected coordinates of the tiling scheme.
     * - `{format}`: The format in which to get feature information, as specified in the [GetFeatureInfoFormat].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/UrlTemplateImageryProvider.html#pickFeaturesUrl">Online Documentation</a>
     */
    val pickFeaturesUrl: String

    /**
     * Gets the proxy used by this provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/UrlTemplateImageryProvider.html#proxy">Online Documentation</a>
     */
    val proxy: Proxy

    /**
     * Gets the width of each tile, in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/UrlTemplateImageryProvider.html#tileWidth">Online Documentation</a>
     */
    val tileWidth: Int

    /**
     * Gets the height of each tile, in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/UrlTemplateImageryProvider.html#tileHeight">Online Documentation</a>
     */
    val tileHeight: Int

    /**
     * Gets the maximum level-of-detail that can be requested, or undefined if there is no limit.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/UrlTemplateImageryProvider.html#maximumLevel">Online Documentation</a>
     */
    val maximumLevel: Int?

    /**
     * Gets the minimum level-of-detail that can be requested.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/UrlTemplateImageryProvider.html#minimumLevel">Online Documentation</a>
     */
    val minimumLevel: Int

    /**
     * Gets the tiling scheme used by this provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/UrlTemplateImageryProvider.html#tilingScheme">Online Documentation</a>
     */
    val tilingScheme: TilingScheme

    /**
     * Gets the rectangle, in radians, of the imagery provided by this instance.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/UrlTemplateImageryProvider.html#rectangle">Online Documentation</a>
     */
    val rectangle: Rectangle

    /**
     * Gets the tile discard policy.  If not undefined, the discard policy is responsible
     * for filtering out "missing" tiles via its shouldDiscardImage function.  If this function
     * returns undefined, no tiles are filtered.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/UrlTemplateImageryProvider.html#tileDiscardPolicy">Online Documentation</a>
     */
    val tileDiscardPolicy: TileDiscardPolicy

    /**
     * Gets an event that is raised when the imagery provider encounters an asynchronous error.  By subscribing
     * to the event, you will be notified of the error and can potentially recover from it.  Event listeners
     * are passed an instance of [TileProviderError].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/UrlTemplateImageryProvider.html#errorEvent">Online Documentation</a>
     */
    val errorEvent: DefaultEvent

    /**
     * Gets the credit to display when this imagery provider is active.  Typically this is used to credit
     * the source of the imagery.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/UrlTemplateImageryProvider.html#credit">Online Documentation</a>
     */
    val credit: Credit

    /**
     * Gets a value indicating whether or not the images provided by this imagery provider
     * include an alpha channel.  If this property is false, an alpha channel, if present, will
     * be ignored.  If this property is true, any images without an alpha channel will be treated
     * as if their alpha is 1.0 everywhere.  When this property is false, memory usage
     * and texture upload time are reduced.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/UrlTemplateImageryProvider.html#hasAlphaChannel">Online Documentation</a>
     */
    val hasAlphaChannel: Boolean

    /**
     * Gets the credits to be displayed when a given tile is displayed.
     * @param [x] The tile X coordinate.
     * @param [y] The tile Y coordinate.
     * @param [level] The tile level;
     * @return The credits to be displayed when the tile is displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/UrlTemplateImageryProvider.html#getTileCredits">Online Documentation</a>
     */
    fun getTileCredits(
        x: Double,
        y: Double,
        level: Int,
    ): ReadonlyArray<Credit>

    /**
     * @param [x] The tile X coordinate.
     * @param [y] The tile Y coordinate.
     * @param [level] The tile level.
     * @param [request] The request object. Intended for internal use only.
     * @return A promise for the image that will resolve when the image is available, or
     *   undefined if there are too many active requests to the server, and the request should be retried later.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/UrlTemplateImageryProvider.html#requestImage">Online Documentation</a>
     */
    @JsAsync(optional = true)
    @Suppress("WRONG_EXTERNAL_DECLARATION")
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
     *   It may also be undefined if picking is not supported.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/UrlTemplateImageryProvider.html#pickFeatures">Online Documentation</a>
     */
    @JsAsync(optional = true)
    @Suppress("WRONG_EXTERNAL_DECLARATION")
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
     * Initialization options for the UrlTemplateImageryProvider constructor
     * @property [url] The URL template to use to request tiles.  It has the following keywords:
     *   - `{z}`: The level of the tile in the tiling scheme.  Level zero is the root of the quadtree pyramid.
     *   - `{x}`: The tile X coordinate in the tiling scheme, where 0 is the Westernmost tile.
     *   - `{y}`: The tile Y coordinate in the tiling scheme, where 0 is the Northernmost tile.
     *   - `{s}`: One of the available subdomains, used to overcome browser limits on the number of simultaneous requests per host.
     *   - `{reverseX}`: The tile X coordinate in the tiling scheme, where 0 is the Easternmost tile.
     *   - `{reverseY}`: The tile Y coordinate in the tiling scheme, where 0 is the Southernmost tile.
     *   - `{reverseZ}`: The level of the tile in the tiling scheme, where level zero is the maximum level of the quadtree pyramid.  In order to use reverseZ, maximumLevel must be defined.
     *   - `{westDegrees}`: The Western edge of the tile in geodetic degrees.
     *   - `{southDegrees}`: The Southern edge of the tile in geodetic degrees.
     *   - `{eastDegrees}`: The Eastern edge of the tile in geodetic degrees.
     *   - `{northDegrees}`: The Northern edge of the tile in geodetic degrees.
     *   - `{westProjected}`: The Western edge of the tile in projected coordinates of the tiling scheme.
     *   - `{southProjected}`: The Southern edge of the tile in projected coordinates of the tiling scheme.
     *   - `{eastProjected}`: The Eastern edge of the tile in projected coordinates of the tiling scheme.
     *   - `{northProjected}`: The Northern edge of the tile in projected coordinates of the tiling scheme.
     *   - `{width}`: The width of each tile in pixels.
     *   - `{height}`: The height of each tile in pixels.
     * @property [pickFeaturesUrl] The URL template to use to pick features.  If this property is not specified,
     *   [UrlTemplateImageryProvider.pickFeatures] will immediately returned undefined, indicating no
     *   features picked.  The URL template supports all of the keywords supported by the `url`
     *   parameter, plus the following:
     *   - `{i}`: The pixel column (horizontal coordinate) of the picked position, where the Westernmost pixel is 0.
     *   - `{j}`: The pixel row (vertical coordinate) of the picked position, where the Northernmost pixel is 0.
     *   - `{reverseI}`: The pixel column (horizontal coordinate) of the picked position, where the Easternmost pixel is 0.
     *   - `{reverseJ}`: The pixel row (vertical coordinate) of the picked position, where the Southernmost pixel is 0.
     *   - `{longitudeDegrees}`: The longitude of the picked position in degrees.
     *   - `{latitudeDegrees}`: The latitude of the picked position in degrees.
     *   - `{longitudeProjected}`: The longitude of the picked position in the projected coordinates of the tiling scheme.
     *   - `{latitudeProjected}`: The latitude of the picked position in the projected coordinates of the tiling scheme.
     *   - `{format}`: The format in which to get feature information, as specified in the [GetFeatureInfoFormat].
     * @property [urlSchemeZeroPadding] Gets the URL scheme zero padding for each tile coordinate. The format is '000' where
     *   each coordinate will be padded on the left with zeros to match the width of the passed string of zeros. e.g. Setting:
     *   urlSchemeZeroPadding : { '{x}' : '0000'}
     *   will cause an 'x' value of 12 to return the string '0012' for {x} in the generated URL.
     *   It the passed object has the following keywords:
     *   - `{z}`: The zero padding for the level of the tile in the tiling scheme.
     *   - `{x}`: The zero padding for the tile X coordinate in the tiling scheme.
     *   - `{y}`: The zero padding for the the tile Y coordinate in the tiling scheme.
     *   - `{reverseX}`: The zero padding for the tile reverseX coordinate in the tiling scheme.
     *   - `{reverseY}`: The zero padding for the tile reverseY coordinate in the tiling scheme.
     *   - `{reverseZ}`: The zero padding for the reverseZ coordinate of the tile in the tiling scheme.
     * @property [subdomains] The subdomains to use for the `{s}` placeholder in the URL template.
     *   If this parameter is a single string, each character in the string is a subdomain.  If it is
     *   an array, each element in the array is a subdomain.
     *   Default value - `'abc'`
     * @property [credit] A credit for the data source, which is displayed on the canvas.
     *   Default value - `''`
     * @property [minimumLevel] The minimum level-of-detail supported by the imagery provider.  Take care when specifying
     *   this that the number of tiles at the minimum level is small, such as four or less.  A larger number is likely
     *   to result in rendering problems.
     *   Default value - `0`
     * @property [maximumLevel] The maximum level-of-detail supported by the imagery provider, or undefined if there is no limit.
     * @property [rectangle] The rectangle, in radians, covered by the image.
     *   Default value - [Rectangle.MAX_VALUE]
     * @property [tilingScheme] The tiling scheme specifying how the ellipsoidal
     *   surface is broken into tiles.  If this parameter is not provided, a [WebMercatorTilingScheme]
     *   is used.
     *   Default value - [WebMercatorTilingScheme]
     * @property [ellipsoid] The ellipsoid.  If the tilingScheme is specified,
     *   this parameter is ignored and the tiling scheme's ellipsoid is used instead. If neither
     *   parameter is specified, the WGS84 ellipsoid is used.
     * @property [tileWidth] Pixel width of image tiles.
     *   Default value - `256`
     * @property [tileHeight] Pixel height of image tiles.
     *   Default value - `256`
     * @property [hasAlphaChannel] true if the images provided by this imagery provider
     *   include an alpha channel; otherwise, false.  If this property is false, an alpha channel, if
     *   present, will be ignored.  If this property is true, any images without an alpha channel will
     *   be treated as if their alpha is 1.0 everywhere.  When this property is false, memory usage
     *   and texture upload time are potentially reduced.
     *   Default value - `true`
     * @property [getFeatureInfoFormats] The formats in which to get feature information at a
     *   specific location when [UrlTemplateImageryProvider.pickFeatures] is invoked.  If this
     *   parameter is not specified, feature picking is disabled.
     * @property [enablePickFeatures] If true, [UrlTemplateImageryProvider.pickFeatures] will
     *   request the `pickFeaturesUrl` and attempt to interpret the features included in the response.  If false,
     *   [UrlTemplateImageryProvider.pickFeatures] will immediately return undefined (indicating no pickable
     *   features) without communicating with the server.  Set this property to false if you know your data
     *   source does not support picking features or if you don't want this provider's features to be pickable. Note
     *   that this can be dynamically overridden by modifying the [UriTemplateImageryProvider.enablePickFeatures]
     *   property.
     *   Default value - `true`
     * @property [tileDiscardPolicy] A policy for discarding tile images according to some criteria
     * @property [customTags] Allow to replace custom keywords in the URL template. The object must have strings as keys and functions as values.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/UrlTemplateImageryProvider.html#.ConstructorOptions">Online Documentation</a>
     */
    @JsPlainObject
    interface ConstructorOptions {
        val url: Resource
        val pickFeaturesUrl: Resource?
        val urlSchemeZeroPadding: JsAny?
        val subdomains: ReadonlyArray<JsString>?
        val credit: Credit?
        val minimumLevel: Int?
        val maximumLevel: Int?
        val rectangle: Rectangle?
        val tilingScheme: TilingScheme?
        val ellipsoid: Ellipsoid?
        val tileWidth: Int?
        val tileHeight: Int?
        val hasAlphaChannel: Boolean?
        val getFeatureInfoFormats: ReadonlyArray<GetFeatureInfoFormat>?
        val enablePickFeatures: Boolean?
        val tileDiscardPolicy: TileDiscardPolicy?
        val customTags: JsAny?
    }
}
