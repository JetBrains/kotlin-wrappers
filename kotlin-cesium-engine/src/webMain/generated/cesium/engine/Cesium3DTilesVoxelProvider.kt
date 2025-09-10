// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray
import js.core.JsDouble
import js.objects.JsPlainObject
import js.promise.Promise
import seskar.js.JsAsync

/**
 * A [VoxelProvider] that fetches voxel data from a 3D Tiles tileset.
 *
 * Implements the [VoxelProvider] interface.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html">Online Documentation</a>
 *
 * @constructor
 * @param [options] An object describing initialization options
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html">Online Documentation</a>
 */
external class Cesium3DTilesVoxelProvider(
    options: ConstructorOptions,
) {
    /**
     * A transform from local space to global space.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html#globalTransform">Online Documentation</a>
     */
    val globalTransform: Matrix4

    /**
     * A transform from shape space to local space.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html#shapeTransform">Online Documentation</a>
     */
    val shapeTransform: Matrix4

    /**
     * Gets the [VoxelShapeType]
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html#shape">Online Documentation</a>
     */
    val shape: VoxelShapeType

    /**
     * Gets the minimum bounds.
     * If undefined, the shape's default minimum bounds will be used instead.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html#minBounds">Online Documentation</a>
     */
    val minBounds: Cartesian3?

    /**
     * Gets the maximum bounds.
     * If undefined, the shape's default maximum bounds will be used instead.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html#maxBounds">Online Documentation</a>
     */
    val maxBounds: Cartesian3?

    /**
     * Gets the number of voxels per dimension of a tile. This is the same for all tiles in the dataset.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html#dimensions">Online Documentation</a>
     */
    val dimensions: Cartesian3

    /**
     * Gets the number of padding voxels before the tile. This improves rendering quality when sampling the edge of a tile, but it increases memory usage.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html#paddingBefore">Online Documentation</a>
     */
    val paddingBefore: Cartesian3

    /**
     * Gets the number of padding voxels after the tile. This improves rendering quality when sampling the edge of a tile, but it increases memory usage.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html#paddingAfter">Online Documentation</a>
     */
    val paddingAfter: Cartesian3

    /**
     * The metadata class for this tileset.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html#className">Online Documentation</a>
     */
    val className: String

    /**
     * Gets the metadata names.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html#names">Online Documentation</a>
     */
    val names: ReadonlyArray<JsString>

    /**
     * Gets the metadata types.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html#types">Online Documentation</a>
     */
    val types: ReadonlyArray<MetadataType>

    /**
     * Gets the metadata component types.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html#componentTypes">Online Documentation</a>
     */
    val componentTypes: ReadonlyArray<MetadataComponentType>

    /**
     * Gets the metadata minimum values.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html#minimumValues">Online Documentation</a>
     */
    val minimumValues: ReadonlyArray<ReadonlyArray<JsDouble>>?

    /**
     * Gets the metadata maximum values.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html#maximumValues">Online Documentation</a>
     */
    val maximumValues: ReadonlyArray<ReadonlyArray<JsDouble>>?

    /**
     * The maximum number of tiles that exist for this provider.
     * This value is used as a hint to the voxel renderer to allocate an appropriate amount of GPU memory.
     * If this value is not known it can be undefined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html#maximumTileCount">Online Documentation</a>
     */
    val maximumTileCount: Double?

    /**
     * The number of levels of detail containing available tiles in the tileset.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html#availableLevels">Online Documentation</a>
     */
    val availableLevels: Double?

    /**
     * Requests the data for a given tile.
     * @return A promise resolving to a VoxelContent containing the data for the tile, or undefined if the request could not be scheduled this frame.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html#requestData">Online Documentation</a>
     */
    @JsAsync(optional = true)
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun requestData(options: RequestDataOptions? = definedExternally): VoxelContent?

    @JsName("requestData")
    fun requestDataAsync(options: RequestDataOptions? = definedExternally): Promise<VoxelContent>?

    /**
     * @property [tileLevel] The tile's level.
     *   Default value - `0`
     * @property [tileX] The tile's X coordinate.
     *   Default value - `0`
     * @property [tileY] The tile's Y coordinate.
     *   Default value - `0`
     * @property [tileZ] The tile's Z coordinate.
     *   Default value - `0`
     */
    @JsPlainObject
    interface RequestDataOptions {
        val tileLevel: Int?
        val tileX: Double?
        val tileY: Double?
        val tileZ: Double?
    }

    /**
     * Initialization options for the Cesium3DTilesVoxelProvider constructor
     * @property [className] The class in the tileset schema describing voxel metadata.
     * @property [names] The metadata names.
     * @property [types] The metadata types.
     * @property [componentTypes] The metadata component types.
     * @property [shape] The [VoxelShapeType].
     * @property [dimensions] The number of voxels per dimension of a tile. This is the same for all tiles in the dataset.
     * @property [paddingBefore] The number of padding voxels before the tile. This improves rendering quality when sampling the edge of a tile, but it increases memory usage.
     *   Default value - [Cartesian3.ZERO]
     * @property [paddingAfter] The number of padding voxels after the tile. This improves rendering quality when sampling the edge of a tile, but it increases memory usage.
     *   Default value - [Cartesian3.ZERO]
     * @property [globalTransform] A transform from local space to global space.
     *   Default value - [Matrix4.IDENTITY]
     * @property [shapeTransform] A transform from shape space to local space.
     *   Default value - [Matrix4.IDENTITY]
     * @property [minBounds] The minimum bounds.
     * @property [maxBounds] The maximum bounds.
     * @property [minimumValues] The metadata minimum values.
     * @property [maximumValues] The metadata maximum values.
     * @property [maximumTileCount] The maximum number of tiles that exist for this provider. This value is used as a hint to the voxel renderer to allocate an appropriate amount of GPU memory. If this value is not known it can be undefined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html#.ConstructorOptions">Online Documentation</a>
     */
    @JsPlainObject
    interface ConstructorOptions {
        val className: String
        val names: ReadonlyArray<JsString>
        val types: ReadonlyArray<MetadataType>
        val componentTypes: ReadonlyArray<MetadataComponentType>
        val shape: VoxelShapeType
        val dimensions: Cartesian3
        val paddingBefore: Cartesian3?
        val paddingAfter: Cartesian3?
        val globalTransform: Matrix4?
        val shapeTransform: Matrix4?
        val minBounds: Cartesian3?
        val maxBounds: Cartesian3?
        val minimumValues: ReadonlyArray<ReadonlyArray<JsDouble>>?
        val maximumValues: ReadonlyArray<ReadonlyArray<JsDouble>>?
        val maximumTileCount: Double?
    }

    companion object {
        /**
         * Creates a [Cesium3DTilesVoxelProvider] that fetches voxel data from a 3D Tiles tileset.
         * ```
         * try {
         *   const voxelProvider = await Cesium3DTilesVoxelProvider.fromUrl(
         *     "http://localhost:8002/tilesets/voxel/tileset.json"
         *   );
         *   const voxelPrimitive = new VoxelPrimitive({
         *     provider: voxelProvider,
         *     customShader: customShader,
         *   });
         *   scene.primitives.add(voxelPrimitive);
         * } catch (error) {
         *   console.error(`Error creating voxel primitive: ${error}`);
         * }
         * ```
         * @param [url] The URL to a tileset JSON file
         * @return The created provider
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html#.fromUrl">Online Documentation</a>
         */
        @JsAsync
        @Suppress("WRONG_EXTERNAL_DECLARATION")
        suspend fun fromUrl(url: Resource): Cesium3DTilesVoxelProvider

        @JsName("fromUrl")
        fun fromUrlAsync(url: Resource): Promise<Cesium3DTilesVoxelProvider>

        @JsAsync
        @Suppress("WRONG_EXTERNAL_DECLARATION")
        suspend fun fromUrl(url: String): Cesium3DTilesVoxelProvider

        @JsName("fromUrl")
        fun fromUrlAsync(url: String): Promise<Cesium3DTilesVoxelProvider>
    }
}
