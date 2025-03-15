// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Metadata ordering for voxel content.
 * In all cases, x data is contiguous in strides along the y axis,
 * and each group of y strides represents a z slice.
 * However, the orientation of the axes follows different conventions.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#VoxelMetadataOrder">Online Documentation</a>
 */
sealed external interface VoxelMetadataOrder {
    companion object {

        val XYZ: VoxelMetadataOrder

        val GLTF: VoxelMetadataOrder
    }
}
