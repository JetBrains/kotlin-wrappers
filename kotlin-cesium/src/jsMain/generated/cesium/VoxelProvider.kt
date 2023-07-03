// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

import js.core.ReadonlyArray
import js.promise.Promise

/**
 * Provides voxel data. Intended to be used with [VoxelPrimitive].
 * This type describes an interface and is not intended to be instantiated directly.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelProvider.html">Online Documentation</a>
 */
abstract external class VoxelProvider {
    /**
     * A transform from local space to global space. If undefined, the identity matrix will be used instead.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelProvider.html#globalTransform">Online Documentation</a>
     */
    abstract val globalTransform: Matrix4?

    /**
     * A transform from shape space to local space. If undefined, the identity matrix will be used instead.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelProvider.html#shapeTransform">Online Documentation</a>
     */
    abstract val shapeTransform: Matrix4?

    /**
     * Gets the [VoxelShapeType]
     * This should not be called before [VoxelProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelProvider.html#shape">Online Documentation</a>
     */
    abstract val shape: VoxelShapeType

    /**
     * Gets the minimum bounds.
     * If undefined, the shape's default minimum bounds will be used instead.
     * This should not be called before [VoxelProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelProvider.html#minBounds">Online Documentation</a>
     */
    abstract val minBounds: Cartesian3?

    /**
     * Gets the maximum bounds.
     * If undefined, the shape's default maximum bounds will be used instead.
     * This should not be called before [VoxelProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelProvider.html#maxBounds">Online Documentation</a>
     */
    abstract val maxBounds: Cartesian3?

    /**
     * Gets the number of voxels per dimension of a tile. This is the same for all tiles in the dataset.
     * This should not be called before [VoxelProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelProvider.html#dimensions">Online Documentation</a>
     */
    abstract val dimensions: Cartesian3

    /**
     * Gets the number of padding voxels before the tile. This improves rendering quality when sampling the edge of a tile, but it increases memory usage.
     * This should not be called before [VoxelProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelProvider.html#paddingBefore">Online Documentation</a>
     */
    abstract val paddingBefore: Cartesian3?

    /**
     * Gets the number of padding voxels after the tile. This improves rendering quality when sampling the edge of a tile, but it increases memory usage.
     * This should not be called before [VoxelProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelProvider.html#paddingAfter">Online Documentation</a>
     */
    abstract val paddingAfter: Cartesian3?

    /**
     * Gets the metadata names.
     * This should not be called before [VoxelProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelProvider.html#names">Online Documentation</a>
     */
    abstract val names: ReadonlyArray<String>

    /**
     * Gets the metadata types.
     * This should not be called before [VoxelProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelProvider.html#types">Online Documentation</a>
     */
    abstract val types: ReadonlyArray<MetadataType>

    /**
     * Gets the metadata component types.
     * This should not be called before [VoxelProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelProvider.html#componentTypes">Online Documentation</a>
     */
    abstract val componentTypes: ReadonlyArray<MetadataComponentType>

    /**
     * Gets the metadata minimum values.
     * This should not be called before [VoxelProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelProvider.html#minimumValues">Online Documentation</a>
     */
    abstract val minimumValues: ReadonlyArray<ReadonlyArray<Double>>?

    /**
     * Gets the metadata maximum values.
     * This should not be called before [VoxelProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelProvider.html#maximumValues">Online Documentation</a>
     */
    abstract val maximumValues: ReadonlyArray<ReadonlyArray<Double>>?

    /**
     * The maximum number of tiles that exist for this provider. This value is used as a hint to the voxel renderer to allocate an appropriate amount of GPU memory. If this value is not known it can be undefined.
     * This should not be called before [VoxelProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelProvider.html#maximumTileCount">Online Documentation</a>
     */
    abstract val maximumTileCount: Double?

    /**
     * Requests the data for a given tile. The data is a flattened 3D array ordered by X, then Y, then Z.
     * This function should not be called before [VoxelProvider.ready] returns true.
     * @return A promise to an array of typed arrays containing the requested voxel data or undefined if there was a problem loading the data.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelProvider.html#requestData">Online Documentation</a>
     */
    abstract fun requestData(options: RequestDataOptions? = definedExternally): Promise<ReadonlyArray<ReadonlyArray<Any>>>?

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
    interface RequestDataOptions {
        var tileLevel: Int?
        var tileX: Double?
        var tileY: Double?
        var tileZ: Double?
    }
}
