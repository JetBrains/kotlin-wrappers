// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.core.JsAny
import js.promise.Promise
import seskar.js.JsAsync

/**
 * Methods for loading iTwin platform data into CesiumJS
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ITwinData.html">Online Documentation</a>
 */
external object ITwinData {
    /**
     * Create a [Cesium3DTileset] for the given iModel id using iTwin's Mesh Export API.
     *
     * If there is not a completed export available for the given iModel id, the returned promise will resolve to `undefined`.
     * We recommend waiting 10-20 seconds and trying to load the tileset again.
     * If all exports are Invalid this will throw an error.
     * ```
     * const tileset = await ITwinData.createTilesetFromIModelId(iModelId);
     * if (defined(tileset)) {
     *   viewer.scene.primitives.add(tileset);
     * }
     * ```
     * @param [iModelId] The id of the iModel to load
     * @param [options] Object containing options to pass to the internally created [Cesium3DTileset].
     * @return A promise that will resolve to the created 3D tileset or `undefined` if there is no completed export for the given iModel id
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ITwinData.html#.createTilesetFromIModelId">Online Documentation</a>
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun createTilesetFromIModelId(
        iModelId: String,
        options: Cesium3DTileset.ConstructorOptions? = definedExternally,
    ): Cesium3DTileset?

    @JsName("createTilesetFromIModelId")
    fun createTilesetFromIModelIdAsync(
        iModelId: String,
        options: Cesium3DTileset.ConstructorOptions? = definedExternally,
    ): Promise<Cesium3DTileset?>

    /**
     * Create a tileset for the specified reality data id. This function only works
     * with 3D Tiles meshes and point clouds.
     *
     * If the `type` or `rootDocument` are not provided this function
     * will first request the full metadata for the specified reality data to fill these values.
     * @param [iTwinId] The id of the iTwin to load data from
     * @param [realityDataId] The id of the reality data to load
     * @param [type] The type of this reality data
     * @param [rootDocument] The path of the root document for this reality data
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ITwinData.html#.createTilesetForRealityDataId">Online Documentation</a>
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun createTilesetForRealityDataId(
        iTwinId: String,
        realityDataId: String,
        type: ITwinPlatform.RealityDataType? = definedExternally,
        rootDocument: String? = definedExternally,
    ): Cesium3DTileset

    @JsName("createTilesetForRealityDataId")
    fun createTilesetForRealityDataIdAsync(
        iTwinId: String,
        realityDataId: String,
        type: ITwinPlatform.RealityDataType? = definedExternally,
        rootDocument: String? = definedExternally,
    ): Promise<Cesium3DTileset>

    /**
     * Create a data source of the correct type for the specified reality data id.
     * This function only works for KML and GeoJSON type data.
     *
     * If the `type` or `rootDocument` are not provided this function
     * will first request the full metadata for the specified reality data to fill these values.
     * @param [iTwinId] The id of the iTwin to load data from
     * @param [realityDataId] The id of the reality data to load
     * @param [type] The type of this reality data
     * @param [rootDocument] The path of the root document for this reality data
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ITwinData.html#.createDataSourceForRealityDataId">Online Documentation</a>
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun createDataSourceForRealityDataId(
        iTwinId: String,
        realityDataId: String,
        type: ITwinPlatform.RealityDataType? = definedExternally,
        rootDocument: String? = definedExternally,
    ): JsAny /* GeoJsonDataSource | KmlDataSource */

    @JsName("createDataSourceForRealityDataId")
    fun createDataSourceForRealityDataIdAsync(
        iTwinId: String,
        realityDataId: String,
        type: ITwinPlatform.RealityDataType? = definedExternally,
        rootDocument: String? = definedExternally,
    ): Promise<JsAny /* GeoJsonDataSource | KmlDataSource */>

    /**
     * Load data from the Geospatial Features API as GeoJSON.
     * @param [iTwinId] The id of the iTwin to load data from
     * @param [collectionId] The id of the data collection to load
     * @param [limit] number of items per page, must be between 1 and 10,000 inclusive
     *   Default value - `10000`
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ITwinData.html#.loadGeospatialFeatures">Online Documentation</a>
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun loadGeospatialFeatures(
        iTwinId: String,
        collectionId: String,
        limit: Double? = definedExternally,
    ): GeoJsonDataSource

    @JsName("loadGeospatialFeatures")
    fun loadGeospatialFeaturesAsync(
        iTwinId: String,
        collectionId: String,
        limit: Double? = definedExternally,
    ): Promise<GeoJsonDataSource>
}
