// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray
import js.core.JsDouble
import js.objects.JsPlainObject
import js.promise.Promise
import seskar.js.JsAsync

/**
 * Provides voxel data. Intended to be used with [VoxelPrimitive].
 * This type describes an interface and is not intended to be instantiated directly.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelProvider.html">Online Documentation</a>
 */
abstract external class VoxelProvider() {
    /**
     * A transform from local space to global space.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelProvider.html#globalTransform">Online Documentation</a>
     */
    abstract val globalTransform: Matrix4

    /**
     * A transform from shape space to local space.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelProvider.html#shapeTransform">Online Documentation</a>
     */
    abstract val shapeTransform: Matrix4

    /**
     * Gets the [VoxelShapeType]
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelProvider.html#shape">Online Documentation</a>
     */
    abstract val shape: VoxelShapeType

    /**
     * Gets the minimum bounds.
     * If undefined, the shape's default minimum bounds will be used instead.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelProvider.html#minBounds">Online Documentation</a>
     */
    abstract val minBounds: Cartesian3?

    /**
     * Gets the maximum bounds.
     * If undefined, the shape's default maximum bounds will be used instead.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelProvider.html#maxBounds">Online Documentation</a>
     */
    abstract val maxBounds: Cartesian3?

    /**
     * Gets the number of voxels per dimension of a tile. This is the same for all tiles in the dataset.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelProvider.html#dimensions">Online Documentation</a>
     */
    abstract val dimensions: Cartesian3

    /**
     * Gets the number of padding voxels before the tile. This improves rendering quality when sampling the edge of a tile, but it increases memory usage.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelProvider.html#paddingBefore">Online Documentation</a>
     */
    abstract val paddingBefore: Cartesian3

    /**
     * Gets the number of padding voxels after the tile. This improves rendering quality when sampling the edge of a tile, but it increases memory usage.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelProvider.html#paddingAfter">Online Documentation</a>
     */
    abstract val paddingAfter: Cartesian3

    /**
     * Gets the metadata names.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelProvider.html#names">Online Documentation</a>
     */
    abstract val names: ReadonlyArray<JsString>

    /**
     * Gets the metadata types.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelProvider.html#types">Online Documentation</a>
     */
    abstract val types: ReadonlyArray<MetadataType>

    /**
     * Gets the metadata component types.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelProvider.html#componentTypes">Online Documentation</a>
     */
    abstract val componentTypes: ReadonlyArray<MetadataComponentType>

    /**
     * Gets the metadata minimum values.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelProvider.html#minimumValues">Online Documentation</a>
     */
    abstract val minimumValues: ReadonlyArray<ReadonlyArray<JsDouble>>?

    /**
     * Gets the metadata maximum values.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelProvider.html#maximumValues">Online Documentation</a>
     */
    abstract val maximumValues: ReadonlyArray<ReadonlyArray<JsDouble>>?

    /**
     * The maximum number of tiles that exist for this provider.
     * This value is used as a hint to the voxel renderer to allocate an appropriate amount of GPU memory.
     * If this value is not known it can be undefined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelProvider.html#maximumTileCount">Online Documentation</a>
     */
    abstract val maximumTileCount: Double?

    /**
     * Requests the data for a given tile.
     * @return A promise resolving to a VoxelContent containing the data for the tile, or undefined if the request could not be scheduled this frame.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelProvider.html#requestData">Online Documentation</a>
     */
    @JsAsync(optional = true)
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun requestData(options: RequestDataOptions? = definedExternally): VoxelContent?

    @JsName("requestData")
    abstract fun requestDataAsync(options: RequestDataOptions? = definedExternally): Promise<VoxelContent>?

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
}
