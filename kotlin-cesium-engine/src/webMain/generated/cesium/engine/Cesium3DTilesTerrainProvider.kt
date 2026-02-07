// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.core.Void
import js.promise.Promise
import kotlinx.js.JsPlainObject
import seskar.js.JsAsync

/**
 * <div class="notice">
 * To construct a Cesium3DTilesTerrainProvider, call [Cesium3DTilesTerrainProvider.fromIonAssetId] or [Cesium3DTilesTerrainProvider.fromUrl]. Do not call the constructor directly.
 * </div>
 *
 * A [TerrainProvider] that accesses terrain data in a 3D Tiles format.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesTerrainProvider.html">Online Documentation</a>
 *
 * @constructor
 * @param [options] An object describing initialization options
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesTerrainProvider.html">Online Documentation</a>
 */
external class Cesium3DTilesTerrainProvider
private constructor() :
    TerrainProvider {
    /**
     * Requests the geometry for a given tile. This function should not be called before
     * [Cesium3DTilesTerrainProvider.ready] returns true. The result must include terrain data and
     * may optionally include a water mask and an indication of which child tiles are available.
     * @param [x] The X coordinate of the tile for which to request geometry.
     * @param [y] The Y coordinate of the tile for which to request geometry.
     * @param [level] The level of the tile for which to request geometry.
     * @param [request] The request object. Intended for internal use only.
     * @return A promise for the requested geometry. If this method
     *   returns undefined instead of a promise, it is an indication that too many requests are already
     *   pending and the request will be retried later.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesTerrainProvider.html#requestTileGeometry">Online Documentation</a>
     */
    override fun requestTileGeometryAsync(
        x: Double,
        y: Double,
        level: Int,
        request: Request?,
    ): Promise<Cesium3DTilesTerrainData>?

    /**
     * Determines whether data for a tile is available to be loaded.
     * @param [x] The X coordinate of the tile for which to request geometry.
     * @param [y] The Y coordinate of the tile for which to request geometry.
     * @param [level] The level of the tile for which to request geometry.
     * @return Undefined if not supported or availability is unknown, otherwise true or false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesTerrainProvider.html#getTileDataAvailable">Online Documentation</a>
     */
    override fun getTileDataAvailable(
        x: Double,
        y: Double,
        level: Int,
    ): Boolean?

    /**
     * Make sure we load availability data for a tile
     * @param [_x] The X coordinate of the tile for which to request geometry.
     * @param [_y] The Y coordinate of the tile for which to request geometry.
     * @param [_level] The level of the tile for which to request geometry.
     * @return Undefined if nothing need to be loaded or a Promise that resolves when all required tiles are loaded
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesTerrainProvider.html#loadTileDataAvailability">Online Documentation</a>
     */
    override fun loadTileDataAvailabilityAsync(
        x: Double,
        y: Double,
        level: Int,
    ): Promise<Void>?

    /**
     * Get the maximum geometric error allowed in a tile at a given level.
     * @param [level] The tile level for which to get the maximum geometric error.
     * @return The maximum geometric error.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesTerrainProvider.html#getLevelMaximumGeometricError">Online Documentation</a>
     */
    override fun getLevelMaximumGeometricError(level: Int): Double

    /**
     * Gets an event that is raised when the terrain provider encounters an asynchronous error. By subscribing
     * to the event, you will be notified of the error and can potentially recover from it. Event listeners
     * are passed an instance of [TileProviderError].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesTerrainProvider.html#errorEvent">Online Documentation</a>
     */
    override var errorEvent: DefaultEvent

    /**
     * Gets the credit to display when this terrain provider is active. Typically this is used to credit
     * the source of the terrain.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesTerrainProvider.html#credit">Online Documentation</a>
     */
    override var credit: Credit

    /**
     * Gets the tiling scheme used by the provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesTerrainProvider.html#tilingScheme">Online Documentation</a>
     */
    override var tilingScheme: TilingScheme

    /**
     * Gets a value indicating whether or not the provider includes a water mask. The water mask
     * indicates which areas of the globe are water rather than land, so they can be rendered
     * as a reflective surface with animated waves.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesTerrainProvider.html#hasWaterMask">Online Documentation</a>
     */
    override var hasWaterMask: Boolean

    /**
     * Gets a value indicating whether or not the requested tiles include vertex normals.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesTerrainProvider.html#hasVertexNormals">Online Documentation</a>
     */
    override var hasVertexNormals: Boolean

    /**
     * Gets an object that can be used to determine availability of terrain from this provider, such as
     * at points and in rectangles.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesTerrainProvider.html#availability">Online Documentation</a>
     */
    override var availability: TileAvailability?

    /**
     * Initialization options for the Cesium3DTilesTerrainProvider constructor
     * @property [requestVertexNormals] Flag that indicates if the client should request additional lighting information from the server, in the form of per vertex normals if available.
     *   Default value - `false`
     * @property [requestWaterMask] Flag that indicates if the client should request per tile water masks from the server, if available.
     *   Default value - `false`
     * @property [ellipsoid] The ellipsoid.  If not specified, the WGS84 ellipsoid is used.
     *   Default value - [Ellipsoid.default]
     * @property [credit] A credit for the data source, which is displayed on the canvas.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesTerrainProvider.html#.ConstructorOptions">Online Documentation</a>
     */
    @JsPlainObject
    interface ConstructorOptions {
        val requestVertexNormals: Boolean?
        val requestWaterMask: Boolean?
        val ellipsoid: Ellipsoid?
        val credit: Credit?
    }

    companion object {
        /**
         * Creates a [TerrainProvider] that accesses terrain data in a Cesium 3D Tiles format.
         * ```
         * // Create terrain with normals.
         * try {
         *   const viewer = new Viewer("cesiumContainer", {
         *     terrainProvider: await Cesium3DTilesTerrainProvider.fromUrl(
         *       IonResource.fromAssetId(3956), {
         *         requestVertexNormals: true
         *     })
         *   });
         * } catch (error) {
         *   console.log(error);
         * }
         * ```
         * @param [url] The URL of the Cesium terrain server.
         * @param [options] An object describing initialization options.
         * @return A promise that resolves to the terrain provider.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesTerrainProvider.html#.fromUrl">Online Documentation</a>
         */
        @JsAsync
        @Suppress("WRONG_EXTERNAL_DECLARATION")
        suspend fun fromUrl(
            url: JsAny, /* Resource | string | Promise<Resource> | Promise<string> */
            options: ConstructorOptions? = definedExternally,
        ): Cesium3DTilesTerrainProvider

        @JsName("fromUrl")
        fun fromUrlAsync(
            url: JsAny, /* Resource | string | Promise<Resource> | Promise<string> */
            options: ConstructorOptions? = definedExternally,
        ): Promise<Cesium3DTilesTerrainProvider>

        /**
         * Creates a [TerrainProvider] from a Cesium ion asset ID that accesses terrain data in a Cesium 3D Tiles format
         * ```
         * // Create GTOPO30 with vertex normals
         * try {
         *   const viewer = new Viewer("cesiumContainer", {
         *     terrainProvider: await Cesium3DTilesTerrainProvider.fromIonAssetId(2732686, {
         *         requestVertexNormals: true
         *     })
         *   });
         * } catch (error) {
         *   console.log(error);
         * }
         * ```
         * @param [assetId] The Cesium ion asset id.
         * @param [options] An object describing initialization options.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesTerrainProvider.html#.fromIonAssetId">Online Documentation</a>
         */
        @JsAsync
        @Suppress("WRONG_EXTERNAL_DECLARATION")
        suspend fun fromIonAssetId(
            assetId: Int,
            options: CesiumTerrainProvider.ConstructorOptions? = definedExternally,
        ): CesiumTerrainProvider

        @JsName("fromIonAssetId")
        fun fromIonAssetIdAsync(
            assetId: Int,
            options: CesiumTerrainProvider.ConstructorOptions? = definedExternally,
        ): Promise<CesiumTerrainProvider>
    }
}
