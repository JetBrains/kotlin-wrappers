// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

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
}
