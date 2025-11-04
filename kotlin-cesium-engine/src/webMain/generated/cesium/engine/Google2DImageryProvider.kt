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
 * This object is normally not instantiated directly, use [Google2DImageryProvider.fromIonAssetId] or [Google2DImageryProvider.fromUrl].
 * </div>
 *
 * Provides 2D image tiles from [Google 2D Tiles](https://developers.google.com/maps/documentation/tile/2d-tiles-overview).
 *
 * Google 2D Tiles can only be used with the Google geocoder.
 * ```
 * // Google 2D imagery provider
 * const googleTilesProvider = Google2DImageryProvider.fromIonAssetId({
 *     assetId: 3830184
 * });
 * ```
 * ```
 * // Use your own Google api key
 * GoogleMaps.defaultApiKey = "your-api-key";
 *
 * const googleTilesProvider = Google2DImageryProvider.fromUrl({
 *     mapType: "SATELLITE"
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Google2DImageryProvider.html">Online Documentation</a>
 */
external class Google2DImageryProvider(
    options: ConstructorOptions,
) {
    /**
     * Gets the URL of the Google 2D Imagery server.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Google2DImageryProvider.html#url">Online Documentation</a>
     */
    val url: String

    /**
     * Gets the rectangle, in radians, of the imagery provided by the instance.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Google2DImageryProvider.html#rectangle">Online Documentation</a>
     */
    val rectangle: Rectangle

    /**
     * Gets the width of each tile, in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Google2DImageryProvider.html#tileWidth">Online Documentation</a>
     */
    val tileWidth: Int

    /**
     * Gets the height of each tile, in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Google2DImageryProvider.html#tileHeight">Online Documentation</a>
     */
    val tileHeight: Int

    /**
     * Gets the maximum level-of-detail that can be requested.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Google2DImageryProvider.html#maximumLevel">Online Documentation</a>
     */
    val maximumLevel: Int?

    /**
     * Gets the minimum level-of-detail that can be requested. Generally,
     * a minimum level should only be used when the rectangle of the imagery is small
     * enough that the number of tiles at the minimum level is small.  An imagery
     * provider with more than a few tiles at the minimum level will lead to
     * rendering problems.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Google2DImageryProvider.html#minimumLevel">Online Documentation</a>
     */
    val minimumLevel: Int

    /**
     * Gets the tiling scheme used by the provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Google2DImageryProvider.html#tilingScheme">Online Documentation</a>
     */
    val tilingScheme: TilingScheme

    /**
     * Gets the tile discard policy.  If not undefined, the discard policy is responsible
     * for filtering out "missing" tiles via its shouldDiscardImage function.  If this function
     * returns undefined, no tiles are filtered.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Google2DImageryProvider.html#tileDiscardPolicy">Online Documentation</a>
     */
    val tileDiscardPolicy: TileDiscardPolicy

    /**
     * Gets an event that is raised when the imagery provider encounters an asynchronous error.  By subscribing
     * to the event, you will be notified of the error and can potentially recover from it.  Event listeners
     * are passed an instance of [TileProviderError].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Google2DImageryProvider.html#errorEvent">Online Documentation</a>
     */
    val errorEvent: DefaultEvent

    /**
     * Gets the credit to display when this imagery provider is active.  Typically this is used to credit
     * the source of the imagery.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Google2DImageryProvider.html#credit">Online Documentation</a>
     */
    val credit: Credit

    /**
     * Gets the proxy used by this provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Google2DImageryProvider.html#proxy">Online Documentation</a>
     */
    val proxy: Proxy

    /**
     * Gets a value indicating whether or not the images provided by this imagery provider
     * include an alpha channel.  If this property is false, an alpha channel, if present, will
     * be ignored.  If this property is true, any images without an alpha channel will be treated
     * as if their alpha is 1.0 everywhere.  When this property is false, memory usage
     * and texture upload time are reduced.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Google2DImageryProvider.html#hasAlphaChannel">Online Documentation</a>
     */
    val hasAlphaChannel: Boolean

    /**
     * Gets the credits to be displayed when a given tile is displayed.
     * @param [x] The tile X coordinate.
     * @param [y] The tile Y coordinate.
     * @param [level] The tile level;
     * @return The credits to be displayed when the tile is displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Google2DImageryProvider.html#getTileCredits">Online Documentation</a>
     */
    fun getTileCredits(
        x: Double,
        y: Double,
        level: Int,
    ): ReadonlyArray<Credit>?

    /**
     * Requests the image for a given tile.
     * @param [x] The tile X coordinate.
     * @param [y] The tile Y coordinate.
     * @param [level] The tile level.
     * @param [request] The request object. Intended for internal use only.
     * @return A promise for the image that will resolve when the image is available, or
     *   undefined if there are too many active requests to the server, and the request should be retried later.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Google2DImageryProvider.html#requestImage">Online Documentation</a>
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
     * Picking features is not currently supported by this imagery provider, so this function simply returns
     * undefined.
     * @param [x] The tile X coordinate.
     * @param [y] The tile Y coordinate.
     * @param [level] The tile level.
     * @param [longitude] The longitude at which to pick features.
     * @param [latitude] The latitude at which to pick features.
     * @return Undefined since picking is not supported.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Google2DImageryProvider.html#pickFeatures">Online Documentation</a>
     */
    fun pickFeatures(
        x: Double,
        y: Double,
        level: Int,
        longitude: Double,
        latitude: Double,
    ): Void

    /**
     * Initialization options for the Google2DImageryProvider constructor
     * @property [key] The Google api key to send with tile requests.
     * @property [session] The Google session token that tracks the current state of your map and viewport.
     * @property [url] The Google 2D maps endpoint.
     * @property [tileWidth] The width of each tile in pixels.
     * @property [tileHeight] The height of each tile in pixels.
     * @property [ellipsoid] The ellipsoid.  If not specified, the default ellipsoid is used.
     *   Default value - [Ellipsoid.default]
     * @property [minimumLevel] The minimum level-of-detail supported by the imagery provider.  Take care when specifying
     *   this that the number of tiles at the minimum level is small, such as four or less.  A larger number is likely
     *   to result in rendering problems.
     *   Default value - `0`
     * @property [maximumLevel] The maximum level-of-detail supported by the imagery provider.
     *   Default value - `22`
     * @property [rectangle] The rectangle, in radians, covered by the image.
     *   Default value - [Rectangle.MAX_VALUE]
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Google2DImageryProvider.html#.ConstructorOptions">Online Documentation</a>
     */
    @JsPlainObject
    interface ConstructorOptions {
        val key: String
        val session: String
        val url: JsAny /* string | Resource | IonResource */
        val tileWidth: String
        val tileHeight: String
        val ellipsoid: Ellipsoid?
        val minimumLevel: Int?
        val maximumLevel: Int?
        val rectangle: Rectangle?
    }

    companion object {
        /**
         * Creates an [ImageryProvider] which provides 2D global tiled imagery from [Google 2D Tiles](https://developers.google.com/maps/documentation/tile/2d-tiles-overview), streamed using the Cesium ion REST API.
         * ```
         * // Google 2D imagery provider
         * const googleTilesProvider = Google2DImageryProvider.fromIonAssetId({
         *     assetId: 3830184
         * });
         * ```
         * ```
         * // Google 2D roadmap overlay with custom styles
         * const googleTileProvider = Google2DImageryProvider.fromIonAssetId({
         *     assetId: 3830184,
         *     overlayLayerType: "layerRoadmap",
         *     styles: [
         *         {
         *             stylers: [{ hue: "#00ffe6" }, { saturation: -20 }],
         *         },
         *         {
         *             featureType: "road",
         *             elementType: "geometry",
         *             stylers: [{ lightness: 100 }, { visibility: "simplified" }],
         *         },
         *     ],
         * });
         * ```
         * @return A promise that resolves to the created Google2DImageryProvider.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Google2DImageryProvider.html#.fromIonAssetId">Online Documentation</a>
         */
        @JsAsync
        @Suppress("WRONG_EXTERNAL_DECLARATION")
        suspend fun fromIonAssetId(options: FromIonAssetIdOptions): Google2DImageryProvider

        @JsName("fromIonAssetId")
        fun fromIonAssetIdAsync(options: FromIonAssetIdOptions): Promise<Google2DImageryProvider>

        /**
         * @property [assetId] The Cesium ion asset id.
         * @property [mapType] The map type of the Google map imagery. Valid options are satellite, terrain, and roadmap. If overlayLayerType is set, mapType is ignored and a transparent overlay is returned. If overlayMapType is undefined, then a basemap of mapType is returned. layerRoadmap overlayLayerType is included in terrain and roadmap mapTypes.
         *   Default value - `"satellite"`
         * @property [language] an IETF language tag that specifies the language used to display information on the tiles
         *   Default value - `"en_US"`
         * @property [region] A Common Locale Data Repository region identifier (two uppercase letters) that represents the physical location of the user.
         *   Default value - `"US"`
         * @property [overlayLayerType] Returns a transparent overlay map with the specified layerType. If no value is provided, a basemap of mapType is returned. Use multiple instances of Google2DImageryProvider to add multiple Google Maps overlays to a scene. layerRoadmap is included in terrain and roadmap mapTypes, so adding as overlay to terrain or roadmap has no effect.
         * @property [styles] An array of JSON style objects that specify the appearance and detail level of map features such as roads, parks, and built-up areas. Styling is used to customize the standard Google base map. The styles parameter is valid only if the mapType is roadmap. For the complete style syntax, see the ([Google Style Reference](https://developers.google.com/maps/documentation/tile/style-reference)).
         * @property [ellipsoid] The ellipsoid.  If not specified, the default ellipsoid is used.
         *   Default value - [Ellipsoid.default]
         * @property [minimumLevel] The minimum level-of-detail supported by the imagery provider.  Take care when specifying
         *   this that the number of tiles at the minimum level is small, such as four or less.  A larger number is likely
         *   to result in rendering problems.
         *   Default value - `0`
         * @property [maximumLevel] The maximum level-of-detail supported by the imagery provider.
         *   Default value - `22`
         * @property [rectangle] The rectangle, in radians, covered by the image.
         *   Default value - [Rectangle.MAX_VALUE]
         * @property [credit] A credit for the data source, which is displayed on the canvas.
         */
        @JsPlainObject
        interface FromIonAssetIdOptions {
            val assetId: String
            val mapType: JsAny /* "satellite" | "terrain" | "roadmap" */?
            val language: String?
            val region: String?
            val overlayLayerType: JsAny /* "layerRoadmap" | "layerStreetview" | "layerTraffic" */?
            val styles: JsAny?
            val ellipsoid: Ellipsoid?
            val minimumLevel: Int?
            val maximumLevel: Int?
            val rectangle: Rectangle?
            val credit: Credit?
        }

        /**
         * Creates an [ImageryProvider] which provides 2D global tiled imagery from [Google 2D Tiles](https://developers.google.com/maps/documentation/tile/2d-tiles-overview).
         * ```
         * // Use your own Google api key
         * GoogleMaps.defaultApiKey = "your-api-key";
         *
         * const googleTilesProvider = Google2DImageryProvider.fromUrl({
         *     mapType: "satellite"
         * });
         * ```
         * ```
         * // Google 2D roadmap overlay with custom styles
         * GoogleMaps.defaultApiKey = "your-api-key";
         *
         * const googleTileProvider = Google2DImageryProvider.fromUrl({
         *     overlayLayerType: "layerRoadmap",
         *     styles: [
         *         {
         *             stylers: [{ hue: "#00ffe6" }, { saturation: -20 }],
         *         },
         *         {
         *             featureType: "road",
         *             elementType: "geometry",
         *             stylers: [{ lightness: 100 }, { visibility: "simplified" }],
         *         },
         *     ],
         * });
         * ```
         * @return A promise that resolves to the created Google2DImageryProvider.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Google2DImageryProvider.html#.fromUrl">Online Documentation</a>
         */
        @JsAsync
        @Suppress("WRONG_EXTERNAL_DECLARATION")
        suspend fun fromUrl(options: FromUrlOptions): Google2DImageryProvider

        @JsName("fromUrl")
        fun fromUrlAsync(options: FromUrlOptions): Promise<Google2DImageryProvider>

        /**
         * @property [key] Your API key to access Google 2D Tiles. See [https://developers.google.com/maps/documentation/javascript/get-api-key] for instructions on how to create your own key.
         *   Default value - [GoogleMaps.defaultApiKey]
         * @property [mapType] The map type of the Google map imagery. Valid options are satellite, terrain, and roadmap. If overlayLayerType is set, mapType is ignored and a transparent overlay is returned. If overlayMapType is undefined, then a basemap of mapType is returned. layerRoadmap overlayLayerType is included in terrain and roadmap mapTypes.
         *   Default value - `"satellite"`
         * @property [language] an IETF language tag that specifies the language used to display information on the tiles
         *   Default value - `"en_US"`
         * @property [region] A Common Locale Data Repository region identifier (two uppercase letters) that represents the physical location of the user.
         *   Default value - `"US"`
         * @property [overlayLayerType] Returns a transparent overlay map with the specified layerType. If no value is provided, a basemap of mapType is returned. Use multiple instances of Google2DImageryProvider to add multiple Google Maps overlays to a scene. layerRoadmap is included in terrain and roadmap mapTypes, so adding as overlay to terrain or roadmap has no effect.
         * @property [styles] An array of JSON style objects that specify the appearance and detail level of map features such as roads, parks, and built-up areas. Styling is used to customize the standard Google base map. The styles parameter is valid only if the mapType is roadmap. For the complete style syntax, see the ([Google Style Reference](https://developers.google.com/maps/documentation/tile/style-reference)).
         * @property [ellipsoid] The ellipsoid.  If not specified, the default ellipsoid is used.
         *   Default value - [Ellipsoid.default]
         * @property [minimumLevel] The minimum level-of-detail supported by the imagery provider.  Take care when specifying
         *   this that the number of tiles at the minimum level is small, such as four or less.  A larger number is likely
         *   to result in rendering problems.
         *   Default value - `0`
         * @property [maximumLevel] The maximum level-of-detail supported by the imagery provider.
         *   Default value - `22`
         * @property [rectangle] The rectangle, in radians, covered by the image.
         *   Default value - [Rectangle.MAX_VALUE]
         * @property [credit] A credit for the data source, which is displayed on the canvas.
         */
        @JsPlainObject
        interface FromUrlOptions {
            val key: String?
            val mapType: JsAny /* "satellite" | "terrain" | "roadmap" */?
            val language: String?
            val region: String?
            val overlayLayerType: JsAny /* "layerRoadmap" | "layerStreetview" | "layerTraffic" */?
            val styles: JsAny?
            val ellipsoid: Ellipsoid?
            val minimumLevel: Int?
            val maximumLevel: Int?
            val rectangle: Rectangle?
            val credit: Credit?
        }
    }
}
