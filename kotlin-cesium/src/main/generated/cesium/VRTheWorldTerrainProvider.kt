// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "VAR_OVERRIDDEN_BY_VAL",
    "VAR_TYPE_MISMATCH_ON_OVERRIDE",
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.Void
import js.core.jso
import kotlin.js.Promise

/**
 * A [TerrainProvider] that produces terrain geometry by tessellating height maps
 * retrieved from a [VT MÄK VR-TheWorld server](http://vr-theworld.com/).
 * ```
 * const terrainProvider = new VRTheWorldTerrainProvider({
 *   url : 'https://www.vr-theworld.com/vr-theworld/tiles1.0.0/73/'
 * });
 * viewer.terrainProvider = terrainProvider;
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VRTheWorldTerrainProvider.html">Online Documentation</a>
 */
external class VRTheWorldTerrainProvider(options: ConstructorOptions) : TerrainProvider {
    /**
     * @property [url] The URL of the VR-TheWorld TileMap.
     * @property [ellipsoid] The ellipsoid.  If this parameter is not
     *   specified, the WGS84 ellipsoid is used.
     *   Default value - [Ellipsoid.WGS84]
     * @property [credit] A credit for the data source, which is displayed on the canvas.
     */
    interface ConstructorOptions {
        var url: Resource
        var ellipsoid: Ellipsoid?
        var credit: Credit?
    }

    /**
     * Gets an event that is raised when the terrain provider encounters an asynchronous error.  By subscribing
     * to the event, you will be notified of the error and can potentially recover from it.  Event listeners
     * are passed an instance of [TileProviderError].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VRTheWorldTerrainProvider.html#errorEvent">Online Documentation</a>
     */
    override val errorEvent: DefaultEvent

    /**
     * Gets the credit to display when this terrain provider is active.  Typically this is used to credit
     * the source of the terrain.  This function should not be called before [VRTheWorldTerrainProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VRTheWorldTerrainProvider.html#credit">Online Documentation</a>
     */
    override val credit: Credit

    /**
     * Gets the tiling scheme used by this provider.  This function should
     * not be called before [VRTheWorldTerrainProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VRTheWorldTerrainProvider.html#tilingScheme">Online Documentation</a>
     */
    override val tilingScheme: GeographicTilingScheme

    /**
     * Gets a value indicating whether or not the provider is ready for use.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VRTheWorldTerrainProvider.html#ready">Online Documentation</a>
     */
    override val ready: Boolean

    /**
     * Gets a promise that resolves to true when the provider is ready for use.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VRTheWorldTerrainProvider.html#readyPromise">Online Documentation</a>
     */
    override val readyPromise: Promise<Boolean>

    /**
     * Gets a value indicating whether or not the provider includes a water mask.  The water mask
     * indicates which areas of the globe are water rather than land, so they can be rendered
     * as a reflective surface with animated waves.  This function should not be
     * called before [VRTheWorldTerrainProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VRTheWorldTerrainProvider.html#hasWaterMask">Online Documentation</a>
     */
    override val hasWaterMask: Boolean

    /**
     * Gets a value indicating whether or not the requested tiles include vertex normals.
     * This function should not be called before [VRTheWorldTerrainProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VRTheWorldTerrainProvider.html#hasVertexNormals">Online Documentation</a>
     */
    override val hasVertexNormals: Boolean

    /**
     * Gets an object that can be used to determine availability of terrain from this provider, such as
     * at points and in rectangles.  This function should not be called before
     * [TerrainProvider.ready] returns true.  This property may be undefined if availability
     * information is not available.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VRTheWorldTerrainProvider.html#availability">Online Documentation</a>
     */
    override val availability: TileAvailability

    /**
     * Requests the geometry for a given tile.  This function should not be called before
     * [VRTheWorldTerrainProvider.ready] returns true.  The result includes terrain
     * data and indicates that all child tiles are available.
     * @param [x] The X coordinate of the tile for which to request geometry.
     * @param [y] The Y coordinate of the tile for which to request geometry.
     * @param [level] The level of the tile for which to request geometry.
     * @param [request] The request object. Intended for internal use only.
     * @return A promise for the requested geometry.  If this method
     *   returns undefined instead of a promise, it is an indication that too many requests are already
     *   pending and the request will be retried later.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VRTheWorldTerrainProvider.html#requestTileGeometry">Online Documentation</a>
     */
    override fun requestTileGeometry(
        x: Double,
        y: Double,
        level: Int,
        request: Request?,
    ): Promise<TerrainData>?

    /**
     * Gets the maximum geometric error allowed in a tile at a given level.
     * @param [level] The tile level for which to get the maximum geometric error.
     * @return The maximum geometric error.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VRTheWorldTerrainProvider.html#getLevelMaximumGeometricError">Online Documentation</a>
     */
    override fun getLevelMaximumGeometricError(level: Int): Double

    /**
     * Determines whether data for a tile is available to be loaded.
     * @param [x] The X coordinate of the tile for which to request geometry.
     * @param [y] The Y coordinate of the tile for which to request geometry.
     * @param [level] The level of the tile for which to request geometry.
     * @return Undefined if not supported, otherwise true or false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VRTheWorldTerrainProvider.html#getTileDataAvailable">Online Documentation</a>
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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VRTheWorldTerrainProvider.html#loadTileDataAvailability">Online Documentation</a>
     */
    override fun loadTileDataAvailability(
        x: Double,
        y: Double,
        level: Int,
    ): Promise<Void>?
}

inline fun VRTheWorldTerrainProvider(
    block: VRTheWorldTerrainProvider.ConstructorOptions.() -> Unit,
): VRTheWorldTerrainProvider =
    VRTheWorldTerrainProvider(options = jso(block))
