// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "VAR_OVERRIDDEN_BY_VAL",
    "VAR_TYPE_MISMATCH_ON_OVERRIDE",
)

package cesium

import js.core.Void
import js.promise.Promise

/**
 * <div class="notice">
 * To construct a GoogleEarthEnterpriseTerrainProvider, call {@link  GoogleEarthEnterpriseTerrainProvider.fromMetadata}. Do not call the constructor directly.
 * </div>
 *
 * Provides tiled terrain using the Google Earth Enterprise REST API.
 * ```
 * const geeMetadata = await GoogleEarthEnterpriseMetadata.fromUrl("http://www.example.com");
 * const gee = GoogleEarthEnterpriseTerrainProvider.fromMetadata(geeMetadata);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseTerrainProvider.html">Online Documentation</a>
 *
 * @constructor
 * @param [options] An object describing initialization options
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseTerrainProvider.html">Online Documentation</a>
 */
sealed external class GoogleEarthEnterpriseTerrainProvider : TerrainProvider {
    /**
     * Gets the name of the Google Earth Enterprise server url hosting the imagery.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseTerrainProvider.html#url">Online Documentation</a>
     */
    val url: String

    /**
     * Gets the proxy used by this provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseTerrainProvider.html#proxy">Online Documentation</a>
     */
    val proxy: Proxy

    /**
     * Gets the tiling scheme used by this provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseTerrainProvider.html#tilingScheme">Online Documentation</a>
     */
    override val tilingScheme: TilingScheme

    /**
     * Gets an event that is raised when the imagery provider encounters an asynchronous error.  By subscribing
     * to the event, you will be notified of the error and can potentially recover from it.  Event listeners
     * are passed an instance of [TileProviderError].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseTerrainProvider.html#errorEvent">Online Documentation</a>
     */
    override val errorEvent: DefaultEvent

    /**
     * Gets a value indicating whether or not the provider is ready for use.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseTerrainProvider.html#ready">Online Documentation</a>
     */
    override val ready: Boolean

    /**
     * Gets a promise that resolves to true when the provider is ready for use.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseTerrainProvider.html#readyPromise">Online Documentation</a>
     */
    override val readyPromise: Promise<Boolean>

    /**
     * Gets the credit to display when this terrain provider is active.  Typically this is used to credit
     * the source of the terrain.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseTerrainProvider.html#credit">Online Documentation</a>
     */
    override val credit: Credit

    /**
     * Gets a value indicating whether or not the provider includes a water mask.  The water mask
     * indicates which areas of the globe are water rather than land, so they can be rendered
     * as a reflective surface with animated waves.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseTerrainProvider.html#hasWaterMask">Online Documentation</a>
     */
    override val hasWaterMask: Boolean

    /**
     * Gets a value indicating whether or not the requested tiles include vertex normals.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseTerrainProvider.html#hasVertexNormals">Online Documentation</a>
     */
    override val hasVertexNormals: Boolean

    /**
     * Gets an object that can be used to determine availability of terrain from this provider, such as
     * at points and in rectangles. This property may be undefined if availability
     * information is not available.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseTerrainProvider.html#availability">Online Documentation</a>
     */
    override val availability: TileAvailability

    /**
     * Requests the geometry for a given tile.   The result must include terrain data and
     * may optionally include a water mask and an indication of which child tiles are available.
     * @param [x] The X coordinate of the tile for which to request geometry.
     * @param [y] The Y coordinate of the tile for which to request geometry.
     * @param [level] The level of the tile for which to request geometry.
     * @param [request] The request object. Intended for internal use only.
     * @return A promise for the requested geometry.  If this method
     *   returns undefined instead of a promise, it is an indication that too many requests are already
     *   pending and the request will be retried later.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseTerrainProvider.html#requestTileGeometry">Online Documentation</a>
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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseTerrainProvider.html#getLevelMaximumGeometricError">Online Documentation</a>
     */
    override fun getLevelMaximumGeometricError(level: Int): Double

    /**
     * Determines whether data for a tile is available to be loaded.
     * @param [x] The X coordinate of the tile for which to request geometry.
     * @param [y] The Y coordinate of the tile for which to request geometry.
     * @param [level] The level of the tile for which to request geometry.
     * @return Undefined if not supported, otherwise true or false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseTerrainProvider.html#getTileDataAvailable">Online Documentation</a>
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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseTerrainProvider.html#loadTileDataAvailability">Online Documentation</a>
     */
    override fun loadTileDataAvailability(
        x: Double,
        y: Double,
        level: Int,
    ): Void

    /**
     * Initialization options for GoogleEarthEnterpriseTerrainProvider constructor
     * @property [ellipsoid] The ellipsoid.  If not specified, the WGS84 ellipsoid is used.
     * @property [credit] A credit for the data source, which is displayed on the canvas.
     * @property [url] The url of the Google Earth Enterprise server hosting the imagery. Deprecated.
     * @property [metadata] A metadata object that can be used to share metadata requests with a GoogleEarthEnterpriseImageryProvider. Deprecated.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseTerrainProvider.html#.ConstructorOptions">Online Documentation</a>
     */
    interface ConstructorOptions {
        var ellipsoid: Ellipsoid?
        var credit: Credit?
        var url: Resource?
        var metadata: GoogleEarthEnterpriseMetadata?
    }

    companion object {
        /**
         * Creates a GoogleEarthTerrainProvider from GoogleEarthEnterpriseMetadata
         * ```
         * const geeMetadata = await GoogleEarthEnterpriseMetadata.fromUrl("http://www.example.com");
         * const gee = GoogleEarthEnterpriseTerrainProvider.fromMetadata(geeMetadata);
         * ```
         * @param [metadata] A metadata object that can be used to share metadata requests with a GoogleEarthEnterpriseImageryProvider.
         * @param [options] An object describing initialization options
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseTerrainProvider.html#.fromMetadata">Online Documentation</a>
         */
        fun fromMetadata(
            metadata: GoogleEarthEnterpriseMetadata,
            options: ConstructorOptions,
        ): GoogleEarthEnterpriseTerrainProvider
    }
}
