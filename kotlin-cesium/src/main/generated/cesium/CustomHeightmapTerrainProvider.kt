// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "VAR_OVERRIDDEN_BY_VAL",
    "VAR_TYPE_MISMATCH_ON_OVERRIDE",
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * A simple [TerrainProvider] that gets height values from a callback function.
 * It can be used for procedurally generated terrain or as a way to load custom
 * heightmap data without creating a subclass of [TerrainProvider].
 *
 * There are some limitations such as no water mask, no vertex normals, and no
 * availability, so a full-fledged [TerrainProvider] subclass is better suited
 * for these more sophisticated use cases.
 * ```
 * const viewer = new Viewer("cesiumContainer", {
 *   terrainProvider: new CustomHeightmapTerrainProvider({
 *     width: 32,
 *     height: 32,
 *     callback: function (x, y, level) {
 *       return new Float32Array(32 * 32); // all zeros
 *     },
 *   }),
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomHeightmapTerrainProvider.html">Online Documentation</a>
 */
external class CustomHeightmapTerrainProvider(options: ConstructorOptions) : TerrainProvider {
    /**
     * @property [callback] The callback function for requesting tile geometry.
     * @property [width] The number of columns per heightmap tile.
     * @property [height] The number of rows per heightmap tile.
     * @property [tilingScheme] The tiling scheme specifying how the ellipsoidal
     *   surface is broken into tiles. If this parameter is not provided, a [GeographicTilingScheme]
     *   is used.
     * @property [ellipsoid] The ellipsoid.  If the tilingScheme is specified,
     *   this parameter is ignored and the tiling scheme's ellipsoid is used instead. If neither
     *   parameter is specified, the WGS84 ellipsoid is used.
     * @property [credit] A credit for the data source, which is displayed on the canvas.
     */
    interface ConstructorOptions {
        var callback: GeometryCallback
        var width: Double
        var height: Double
        var tilingScheme: TilingScheme?
        var ellipsoid: Ellipsoid?
        var credit: Credit?
    }

    /**
     * Gets an event that is raised when the terrain provider encounters an asynchronous error. By subscribing
     * to the event, you will be notified of the error and can potentially recover from it. Event listeners
     * are passed an instance of [TileProviderError].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomHeightmapTerrainProvider.html#errorEvent">Online Documentation</a>
     */
    override val errorEvent: Event

    /**
     * Gets the credit to display when this terrain provider is active. Typically this is used to credit
     * the source of the terrain.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomHeightmapTerrainProvider.html#credit">Online Documentation</a>
     */
    override val credit: Credit

    /**
     * Gets the tiling scheme used by this provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomHeightmapTerrainProvider.html#tilingScheme">Online Documentation</a>
     */
    override val tilingScheme: TilingScheme

    /**
     * Gets a value indicating whether or not the provider is ready for use.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomHeightmapTerrainProvider.html#ready">Online Documentation</a>
     */
    override val ready: Boolean

    /**
     * Gets a promise that resolves to true when the provider is ready for use.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomHeightmapTerrainProvider.html#readyPromise">Online Documentation</a>
     */
    override val readyPromise: kotlin.js.Promise<Boolean>

    /**
     * Gets a value indicating whether or not the provider includes a water mask. The water mask
     * indicates which areas of the globe are water rather than land, so they can be rendered
     * as a reflective surface with animated waves.
     * Water mask is not supported by [CustomHeightmapTerrainProvider], so the return
     * value will always be false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomHeightmapTerrainProvider.html#hasWaterMask">Online Documentation</a>
     */
    override val hasWaterMask: Boolean

    /**
     * Gets a value indicating whether or not the requested tiles include vertex normals.
     * Vertex normals are not supported by [CustomHeightmapTerrainProvider], so the return
     * value will always be false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomHeightmapTerrainProvider.html#hasVertexNormals">Online Documentation</a>
     */
    override val hasVertexNormals: Boolean


    override val availability: TileAvailability

    /**
     * Gets the number of columns per heightmap tile.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomHeightmapTerrainProvider.html#width">Online Documentation</a>
     */
    val width: Boolean

    /**
     * Gets the number of rows per heightmap tile.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomHeightmapTerrainProvider.html#height">Online Documentation</a>
     */
    val height: Boolean

    /**
     * Requests the geometry for a given tile. The result includes terrain
     * data and indicates that all child tiles are available.
     * @param [x] The X coordinate of the tile for which to request geometry.
     * @param [y] The Y coordinate of the tile for which to request geometry.
     * @param [level] The level of the tile for which to request geometry.
     * @param [request] The request object. Intended for internal use only.
     * @return A promise for the requested geometry. If this method
     *   returns undefined instead of a promise, it is an indication that too many requests are already
     *   pending and the request will be retried later.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomHeightmapTerrainProvider.html#requestTileGeometry">Online Documentation</a>
     */
    override fun requestTileGeometry(
        x: Double,
        y: Double,
        level: Int,
        request: Request?,
    ): kotlin.js.Promise<TerrainData>?

    /**
     * Gets the maximum geometric error allowed in a tile at a given level.
     * @param [level] The tile level for which to get the maximum geometric error.
     * @return The maximum geometric error.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomHeightmapTerrainProvider.html#getLevelMaximumGeometricError">Online Documentation</a>
     */
    override fun getLevelMaximumGeometricError(level: Int): Double

    /**
     * Determines whether data for a tile is available to be loaded.
     * @param [x] The X coordinate of the tile for which to request geometry.
     * @param [y] The Y coordinate of the tile for which to request geometry.
     * @param [level] The level of the tile for which to request geometry.
     * @return Undefined if not supported, otherwise true or false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomHeightmapTerrainProvider.html#getTileDataAvailable">Online Documentation</a>
     */
    override fun getTileDataAvailable(
        x: Double,
        y: Double,
        level: Int,
    ): Boolean?

    /**
     * Makes sure we load availability data for a tile
     * @param [x] The X coordinate of the tile for which to request geometry.
     * @param [y] The Y coordinate of the tile for which to request geometry.
     * @param [level] The level of the tile for which to request geometry.
     * @return Undefined if nothing need to be loaded or a Promise that resolves when all required tiles are loaded
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomHeightmapTerrainProvider.html#loadTileDataAvailability">Online Documentation</a>
     */
    override fun loadTileDataAvailability(
        x: Double,
        y: Double,
        level: Int,
    ): kotlin.js.Promise<Nothing?>?
}

/**
 * @param [x] The X coordinate of the tile for which to request geometry.
 * @param [y] The Y coordinate of the tile for which to request geometry.
 * @param [level] The level of the tile for which to request geometry.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomHeightmapTerrainProvider.html#.GeometryCallback">Online Documentation</a>
 */
typealias GeometryCallback = (x: Double, y: Double, level: Double) -> dynamic

inline fun CustomHeightmapTerrainProvider(
    block: CustomHeightmapTerrainProvider.ConstructorOptions.() -> Unit,
): CustomHeightmapTerrainProvider {
    val options: CustomHeightmapTerrainProvider.ConstructorOptions = js("({})")
    block(options)
    return CustomHeightmapTerrainProvider(options)
}
