// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

@file:Suppress(
    "VAR_OVERRIDDEN_BY_VAL",
    "VAR_TYPE_MISMATCH_ON_OVERRIDE",
)

package cesium.engine

import js.core.Void
import js.objects.JsPlainObject
import js.promise.Promise
import seskar.js.JsAsync

/**
 * <div class="notice">
 * To construct a CesiumTerrainProvider, call [ArcGISTiledElevationTerrainProvider.fromUrl]. Do not call the constructor directly.
 * </div>
 *
 * A [TerrainProvider] that produces terrain geometry by tessellating height maps
 * retrieved from Elevation Tiles of an an ArcGIS ImageService.
 * ```
 * const terrainProvider = await ArcGISTiledElevationTerrainProvider.fromUrl("https://elevation3d.arcgis.com/arcgis/rest/services/WorldElevation3D/Terrain3D/ImageServer", {
 *   token: "KED1aF_I4UzXOHy3BnhwyBHU4l5oY6rO6walkmHoYqGp4XyIWUd5YZUC1ZrLAzvV40pR6gBXQayh0eFA8m6vPg.."
 * });
 * viewer.terrainProvider = terrainProvider;
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGISTiledElevationTerrainProvider.html">Online Documentation</a>
 *
 * @constructor
 * @param [options] A url or an object describing initialization options
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGISTiledElevationTerrainProvider.html">Online Documentation</a>
 */
external class ArcGISTiledElevationTerrainProvider
private constructor() :
    TerrainProvider {
    /**
     * Gets an event that is raised when the terrain provider encounters an asynchronous error.  By subscribing
     * to the event, you will be notified of the error and can potentially recover from it.  Event listeners
     * are passed an instance of [TileProviderError].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGISTiledElevationTerrainProvider.html#errorEvent">Online Documentation</a>
     */
    override val errorEvent: DefaultEvent

    /**
     * Gets the credit to display when this terrain provider is active.  Typically this is used to credit
     * the source of the terrain.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGISTiledElevationTerrainProvider.html#credit">Online Documentation</a>
     */
    override val credit: Credit

    /**
     * Gets the tiling scheme used by this provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGISTiledElevationTerrainProvider.html#tilingScheme">Online Documentation</a>
     */
    override val tilingScheme: GeographicTilingScheme

    /**
     * Gets a value indicating whether or not the provider includes a water mask.  The water mask
     * indicates which areas of the globe are water rather than land, so they can be rendered
     * as a reflective surface with animated waves.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGISTiledElevationTerrainProvider.html#hasWaterMask">Online Documentation</a>
     */
    override val hasWaterMask: Boolean

    /**
     * Gets a value indicating whether or not the requested tiles include vertex normals.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGISTiledElevationTerrainProvider.html#hasVertexNormals">Online Documentation</a>
     */
    override val hasVertexNormals: Boolean

    /**
     * Gets an object that can be used to determine availability of terrain from this provider, such as
     * at points and in rectangles. This property may be undefined if availability
     * information is not available.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGISTiledElevationTerrainProvider.html#availability">Online Documentation</a>
     */
    override val availability: TileAvailability

    /**
     * Requests the geometry for a given tile. The result includes terrain
     * data and indicates that all child tiles are available.
     * @param [x] The X coordinate of the tile for which to request geometry.
     * @param [y] The Y coordinate of the tile for which to request geometry.
     * @param [level] The level of the tile for which to request geometry.
     * @param [request] The request object. Intended for internal use only.
     * @return A promise for the requested geometry.  If this method
     *   returns undefined instead of a promise, it is an indication that too many requests are already
     *   pending and the request will be retried later.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGISTiledElevationTerrainProvider.html#requestTileGeometry">Online Documentation</a>
     */
    override fun requestTileGeometryAsync(
        x: Double,
        y: Double,
        level: Int,
        request: Request?,
    ): Promise<TerrainData>?

    /**
     * Gets the maximum geometric error allowed in a tile at a given level.
     * @param [level] The tile level for which to get the maximum geometric error.
     * @return The maximum geometric error.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGISTiledElevationTerrainProvider.html#getLevelMaximumGeometricError">Online Documentation</a>
     */
    override fun getLevelMaximumGeometricError(level: Int): Double

    /**
     * Determines whether data for a tile is available to be loaded.
     * @param [x] The X coordinate of the tile for which to request geometry.
     * @param [y] The Y coordinate of the tile for which to request geometry.
     * @param [level] The level of the tile for which to request geometry.
     * @return Undefined if not supported, otherwise true or false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGISTiledElevationTerrainProvider.html#getTileDataAvailable">Online Documentation</a>
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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGISTiledElevationTerrainProvider.html#loadTileDataAvailability">Online Documentation</a>
     */
    override fun loadTileDataAvailabilityAsync(
        x: Double,
        y: Double,
        level: Int,
    ): Void

    /**
     * Initialization options for the ArcGISTiledElevationTerrainProvider constructor
     * @property [token] The authorization token to use to connect to the service.
     * @property [ellipsoid] The ellipsoid.  If the tilingScheme is specified,
     *   this parameter is ignored and the tiling scheme's ellipsoid is used instead.
     *   If neither parameter is specified, the WGS84 ellipsoid is used.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGISTiledElevationTerrainProvider.html#.ConstructorOptions">Online Documentation</a>
     */
    @JsPlainObject
    sealed interface ConstructorOptions {
        var token: String?
        var ellipsoid: Ellipsoid?
    }

    companion object {
        /**
         * Creates a [TerrainProvider] that produces terrain geometry by tessellating height maps
         * retrieved from Elevation Tiles of an an ArcGIS ImageService.
         * ```
         * const terrainProvider = await ArcGISTiledElevationTerrainProvider.fromUrl("https://elevation3d.arcgis.com/arcgis/rest/services/WorldElevation3D/Terrain3D/ImageServer", {
         *   token: "KED1aF_I4UzXOHy3BnhwyBHU4l5oY6rO6walkmHoYqGp4XyIWUd5YZUC1ZrLAzvV40pR6gBXQayh0eFA8m6vPg.."
         * });
         * viewer.terrainProvider = terrainProvider;
         * ```
         * @param [url] The URL of the ArcGIS ImageServer service.
         * @param [options] A url or an object describing initialization options.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGISTiledElevationTerrainProvider.html#.fromUrl">Online Documentation</a>
         */
        @JsAsync
        suspend fun fromUrl(
            url: dynamic,
            options: ConstructorOptions? = definedExternally,
        ): ArcGISTiledElevationTerrainProvider

        @JsName("fromUrl")
        fun fromUrlAsync(
            url: dynamic,
            options: ConstructorOptions? = definedExternally,
        ): Promise<ArcGISTiledElevationTerrainProvider>
    }
}
