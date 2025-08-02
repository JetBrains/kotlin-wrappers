// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.core.JsAny
import js.objects.JsPlainObject
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
     *
     * See the [iTwin Platform Mesh Export API documentation](https://developer.bentley.com/apis/mesh-export/overview/) for more information on request parameters
     * ```
     * const tileset = await ITwinData.createTilesetFromIModelId({ iModelId });
     * if (defined(tileset)) {
     *   viewer.scene.primitives.add(tileset);
     * }
     * ```
     * @return A promise that will resolve to the created 3D tileset or `undefined` if there is no completed export for the given iModel id
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ITwinData.html#.createTilesetFromIModelId">Online Documentation</a>
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun createTilesetFromIModelId(options: CreateTilesetFromIModelIdOptions): Cesium3DTileset?

    @JsName("createTilesetFromIModelId")
    fun createTilesetFromIModelIdAsync(options: CreateTilesetFromIModelIdOptions): Promise<Cesium3DTileset?>

    /**
     * @property [iModelId] The id of the iModel to load
     * @property [tilesetOptions] Object containing options to pass to the internally created [Cesium3DTileset].
     * @property [changesetId] The id of the changeset to load, if not provided the latest changesets will be used
     */
    @JsPlainObject
    interface CreateTilesetFromIModelIdOptions {
        val iModelId: String
        val tilesetOptions: Cesium3DTileset.ConstructorOptions?
        val changesetId: String?
    }

    /**
     * Create a tileset for the specified reality data id. This function only works
     * with 3D Tiles meshes and point clouds.
     *
     * If the `type` or `rootDocument` are not provided this function
     * will first request the full metadata for the specified reality data to fill these values.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ITwinData.html#.createTilesetForRealityDataId">Online Documentation</a>
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun createTilesetForRealityDataId(options: CreateTilesetForRealityDataIdOptions): Cesium3DTileset

    @JsName("createTilesetForRealityDataId")
    fun createTilesetForRealityDataIdAsync(options: CreateTilesetForRealityDataIdOptions): Promise<Cesium3DTileset>

    /**
     * @property [iTwinId] The id of the iTwin to load data from
     * @property [realityDataId] The id of the reality data to load
     * @property [type] The type of this reality data
     * @property [rootDocument] The path of the root document for this reality data
     */
    @JsPlainObject
    interface CreateTilesetForRealityDataIdOptions {
        val iTwinId: String
        val realityDataId: String
        val type: ITwinPlatform.RealityDataType?
        val rootDocument: String?
    }

    /**
     * Create a data source of the correct type for the specified reality data id.
     * This function only works for KML and GeoJSON type data.
     *
     * If the `type` or `rootDocument` are not provided this function
     * will first request the full metadata for the specified reality data to fill these values.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ITwinData.html#.createDataSourceForRealityDataId">Online Documentation</a>
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun createDataSourceForRealityDataId(options: CreateDataSourceForRealityDataIdOptions): JsAny /* GeoJsonDataSource | KmlDataSource */

    @JsName("createDataSourceForRealityDataId")
    fun createDataSourceForRealityDataIdAsync(options: CreateDataSourceForRealityDataIdOptions): Promise<JsAny /* GeoJsonDataSource | KmlDataSource */>

    /**
     * @property [iTwinId] The id of the iTwin to load data from
     * @property [realityDataId] The id of the reality data to load
     * @property [type] The type of this reality data
     * @property [rootDocument] The path of the root document for this reality data
     */
    @JsPlainObject
    interface CreateDataSourceForRealityDataIdOptions {
        val iTwinId: String
        val realityDataId: String
        val type: ITwinPlatform.RealityDataType?
        val rootDocument: String?
    }

    /**
     * Load data from the Geospatial Features API as GeoJSON.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ITwinData.html#.loadGeospatialFeatures">Online Documentation</a>
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun loadGeospatialFeatures(options: LoadGeospatialFeaturesOptions): GeoJsonDataSource

    @JsName("loadGeospatialFeatures")
    fun loadGeospatialFeaturesAsync(options: LoadGeospatialFeaturesOptions): Promise<GeoJsonDataSource>

    /**
     * @property [iTwinId] The id of the iTwin to load data from
     * @property [collectionId] The id of the data collection to load
     * @property [limit] number of items per page, must be between 1 and 10,000 inclusive
     *   Default value - `10000`
     */
    @JsPlainObject
    interface LoadGeospatialFeaturesOptions {
        val iTwinId: String
        val collectionId: String
        val limit: Double?
    }
}
