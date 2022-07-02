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
 * A [TerrainProvider] that accesses terrain data in a Cesium terrain format.
 * Terrain formats can be one of the following:
 * - [https://github.com/AnalyticalGraphicsInc/quantized-mesh Quantized Mesh]
 * - [https://github.com/AnalyticalGraphicsInc/cesium/wiki/heightmap-1.0 Height Map]
 * ```
 * // Create Arctic DEM terrain with normals.
 * const viewer = new Viewer('cesiumContainer', {
 *     terrainProvider : new CesiumTerrainProvider({
 *         url : IonResource.fromAssetId(3956),
 *         requestVertexNormals : true
 *     })
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumTerrainProvider.html">Online Documentation</a>
 */
external class CesiumTerrainProvider(options: ConstructorOptions) : TerrainProvider {
    /**
     * @property [url] The URL of the Cesium terrain server.
     * @property [requestVertexNormals] Flag that indicates if the client should request additional lighting information from the server, in the form of per vertex normals if available.
     *   Default value - `false`
     * @property [requestWaterMask] Flag that indicates if the client should request per tile water masks from the server,  if available.
     *   Default value - `false`
     * @property [requestMetadata] Flag that indicates if the client should request per tile metadata from the server, if available.
     *   Default value - `true`
     * @property [ellipsoid] The ellipsoid.  If not specified, the WGS84 ellipsoid is used.
     * @property [credit] A credit for the data source, which is displayed on the canvas.
     */
    interface ConstructorOptions {
        var url: dynamic
        var requestVertexNormals: Boolean?
        var requestWaterMask: Boolean?
        var requestMetadata: Boolean?
        var ellipsoid: Ellipsoid?
        var credit: Credit?
    }

    /**
     * Requests the geometry for a given tile.  This function should not be called before
     * [CesiumTerrainProvider.ready] returns true.  The result must include terrain data and
     * may optionally include a water mask and an indication of which child tiles are available.
     * @param [x] The X coordinate of the tile for which to request geometry.
     * @param [y] The Y coordinate of the tile for which to request geometry.
     * @param [level] The level of the tile for which to request geometry.
     * @param [request] The request object. Intended for internal use only.
     * @return A promise for the requested geometry.  If this method
     *   returns undefined instead of a promise, it is an indication that too many requests are already
     *   pending and the request will be retried later.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumTerrainProvider.html#requestTileGeometry">Online Documentation</a>
     */
    override fun requestTileGeometry(
        x: Double,
        y: Double,
        level: Int,
        request: Request?,
    ): kotlin.js.Promise<TerrainData>?

    /**
     * Gets an event that is raised when the terrain provider encounters an asynchronous error.  By subscribing
     * to the event, you will be notified of the error and can potentially recover from it.  Event listeners
     * are passed an instance of [TileProviderError].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumTerrainProvider.html#errorEvent">Online Documentation</a>
     */
    override val errorEvent: DefaultEvent

    /**
     * Gets the credit to display when this terrain provider is active.  Typically this is used to credit
     * the source of the terrain.  This function should not be called before [CesiumTerrainProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumTerrainProvider.html#credit">Online Documentation</a>
     */
    override val credit: Credit

    /**
     * Gets the tiling scheme used by this provider.  This function should
     * not be called before [CesiumTerrainProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumTerrainProvider.html#tilingScheme">Online Documentation</a>
     */
    override val tilingScheme: GeographicTilingScheme

    /**
     * Gets a value indicating whether or not the provider is ready for use.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumTerrainProvider.html#ready">Online Documentation</a>
     */
    override val ready: Boolean

    /**
     * Gets a promise that resolves to true when the provider is ready for use.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumTerrainProvider.html#readyPromise">Online Documentation</a>
     */
    override val readyPromise: kotlin.js.Promise<Boolean>

    /**
     * Gets a value indicating whether or not the provider includes a water mask.  The water mask
     * indicates which areas of the globe are water rather than land, so they can be rendered
     * as a reflective surface with animated waves.  This function should not be
     * called before [CesiumTerrainProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumTerrainProvider.html#hasWaterMask">Online Documentation</a>
     */
    override val hasWaterMask: Boolean

    /**
     * Gets a value indicating whether or not the requested tiles include vertex normals.
     * This function should not be called before [CesiumTerrainProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumTerrainProvider.html#hasVertexNormals">Online Documentation</a>
     */
    override val hasVertexNormals: Boolean

    /**
     * Gets a value indicating whether or not the requested tiles include metadata.
     * This function should not be called before [CesiumTerrainProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumTerrainProvider.html#hasMetadata">Online Documentation</a>
     */
    val hasMetadata: Boolean

    /**
     * Boolean flag that indicates if the client should request vertex normals from the server.
     * Vertex normals data is appended to the standard tile mesh data only if the client requests the vertex normals and
     * if the server provides vertex normals.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumTerrainProvider.html#requestVertexNormals">Online Documentation</a>
     */
    val requestVertexNormals: Boolean

    /**
     * Boolean flag that indicates if the client should request a watermask from the server.
     * Watermask data is appended to the standard tile mesh data only if the client requests the watermask and
     * if the server provides a watermask.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumTerrainProvider.html#requestWaterMask">Online Documentation</a>
     */
    val requestWaterMask: Boolean

    /**
     * Boolean flag that indicates if the client should request metadata from the server.
     * Metadata is appended to the standard tile mesh data only if the client requests the metadata and
     * if the server provides a metadata.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumTerrainProvider.html#requestMetadata">Online Documentation</a>
     */
    val requestMetadata: Boolean

    /**
     * Gets an object that can be used to determine availability of terrain from this provider, such as
     * at points and in rectangles.  This function should not be called before
     * [CesiumTerrainProvider.ready] returns true.  This property may be undefined if availability
     * information is not available. Note that this reflects tiles that are known to be available currently.
     * Additional tiles may be discovered to be available in the future, e.g. if availability information
     * exists deeper in the tree rather than it all being discoverable at the root. However, a tile that
     * is available now will not become unavailable in the future.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumTerrainProvider.html#availability">Online Documentation</a>
     */
    override val availability: TileAvailability

    /**
     * Gets the maximum geometric error allowed in a tile at a given level.
     * @param [level] The tile level for which to get the maximum geometric error.
     * @return The maximum geometric error.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumTerrainProvider.html#getLevelMaximumGeometricError">Online Documentation</a>
     */
    override fun getLevelMaximumGeometricError(level: Int): Double

    /**
     * Determines whether data for a tile is available to be loaded.
     * @param [x] The X coordinate of the tile for which to request geometry.
     * @param [y] The Y coordinate of the tile for which to request geometry.
     * @param [level] The level of the tile for which to request geometry.
     * @return Undefined if not supported or availability is unknown, otherwise true or false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumTerrainProvider.html#getTileDataAvailable">Online Documentation</a>
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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CesiumTerrainProvider.html#loadTileDataAvailability">Online Documentation</a>
     */
    override fun loadTileDataAvailability(
        x: Double,
        y: Double,
        level: Int,
    ): kotlin.js.Promise<Nothing?>?
}

inline fun CesiumTerrainProvider(
    block: CesiumTerrainProvider.ConstructorOptions.() -> Unit,
): CesiumTerrainProvider {
    val options: CesiumTerrainProvider.ConstructorOptions = js("({})")
    block(options)
    return CesiumTerrainProvider(options)
}
