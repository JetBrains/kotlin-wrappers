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
 * A very simple [TerrainProvider] that produces geometry by tessellating an ellipsoidal
 * surface.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidTerrainProvider.html">Online Documentation</a>
 */
external class EllipsoidTerrainProvider(options: ConstructorOptions? = definedExternally) : TerrainProvider {
    /**
     * @property [tilingScheme] The tiling scheme specifying how the ellipsoidal
     *   surface is broken into tiles.  If this parameter is not provided, a [GeographicTilingScheme]
     *   is used.
     * @property [ellipsoid] The ellipsoid.  If the tilingScheme is specified,
     *   this parameter is ignored and the tiling scheme's ellipsoid is used instead. If neither
     *   parameter is specified, the WGS84 ellipsoid is used.
     */
    interface ConstructorOptions {
        var tilingScheme: TilingScheme?
        var ellipsoid: Ellipsoid?
    }

    /**
     * Gets an event that is raised when the terrain provider encounters an asynchronous error.  By subscribing
     * to the event, you will be notified of the error and can potentially recover from it.  Event listeners
     * are passed an instance of [TileProviderError].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidTerrainProvider.html#errorEvent">Online Documentation</a>
     */
    override val errorEvent: Event<*>

    /**
     * Gets the credit to display when this terrain provider is active.  Typically this is used to credit
     * the source of the terrain.  This function should not be called before [EllipsoidTerrainProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidTerrainProvider.html#credit">Online Documentation</a>
     */
    override val credit: Credit

    /**
     * Gets the tiling scheme used by this provider.  This function should
     * not be called before [EllipsoidTerrainProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidTerrainProvider.html#tilingScheme">Online Documentation</a>
     */
    override val tilingScheme: GeographicTilingScheme

    /**
     * Gets a value indicating whether or not the provider is ready for use.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidTerrainProvider.html#ready">Online Documentation</a>
     */
    override val ready: Boolean

    /**
     * Gets a promise that resolves to true when the provider is ready for use.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidTerrainProvider.html#readyPromise">Online Documentation</a>
     */
    override val readyPromise: kotlin.js.Promise<Boolean>

    /**
     * Gets a value indicating whether or not the provider includes a water mask.  The water mask
     * indicates which areas of the globe are water rather than land, so they can be rendered
     * as a reflective surface with animated waves.  This function should not be
     * called before [EllipsoidTerrainProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidTerrainProvider.html#hasWaterMask">Online Documentation</a>
     */
    override val hasWaterMask: Boolean

    /**
     * Gets a value indicating whether or not the requested tiles include vertex normals.
     * This function should not be called before [EllipsoidTerrainProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidTerrainProvider.html#hasVertexNormals">Online Documentation</a>
     */
    override val hasVertexNormals: Boolean

    /**
     * Gets an object that can be used to determine availability of terrain from this provider, such as
     * at points and in rectangles.  This function should not be called before
     * [TerrainProvider.ready] returns true.  This property may be undefined if availability
     * information is not available.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidTerrainProvider.html#availability">Online Documentation</a>
     */
    override val availability: TileAvailability

    /**
     * Requests the geometry for a given tile.  This function should not be called before
     * [TerrainProvider.ready] returns true.  The result includes terrain
     * data and indicates that all child tiles are available.
     * @param [x] The X coordinate of the tile for which to request geometry.
     * @param [y] The Y coordinate of the tile for which to request geometry.
     * @param [level] The level of the tile for which to request geometry.
     * @param [request] The request object. Intended for internal use only.
     * @return A promise for the requested geometry.  If this method
     *   returns undefined instead of a promise, it is an indication that too many requests are already
     *   pending and the request will be retried later.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidTerrainProvider.html#requestTileGeometry">Online Documentation</a>
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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidTerrainProvider.html#getLevelMaximumGeometricError">Online Documentation</a>
     */
    override fun getLevelMaximumGeometricError(level: Int): Double

    /**
     * Determines whether data for a tile is available to be loaded.
     * @param [x] The X coordinate of the tile for which to request geometry.
     * @param [y] The Y coordinate of the tile for which to request geometry.
     * @param [level] The level of the tile for which to request geometry.
     * @return Undefined if not supported, otherwise true or false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidTerrainProvider.html#getTileDataAvailable">Online Documentation</a>
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
     * @return This provider does not support loading availability.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidTerrainProvider.html#loadTileDataAvailability">Online Documentation</a>
     */
    override fun loadTileDataAvailability(
        x: Double,
        y: Double,
        level: Int,
    ): Nothing?
}

inline fun EllipsoidTerrainProvider(
    block: EllipsoidTerrainProvider.ConstructorOptions.() -> Unit,
): EllipsoidTerrainProvider {
    val options: EllipsoidTerrainProvider.ConstructorOptions = js("({})")
    block(options)
    return EllipsoidTerrainProvider(options)
}
