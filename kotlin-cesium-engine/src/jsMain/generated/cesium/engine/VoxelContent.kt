// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray
import js.typedarrays.TypedArray

/**
 * <div class="notice">
 * To construct a VoxelContent, call [VoxelContent.fromMetadataArray] or [VoxelContent.fromGltf]. Do not call the constructor directly.
 * </div>
 * An object representing voxel content for a [Cesium3DTilesVoxelProvider].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelContent.html">Online Documentation</a>
 */
external class VoxelContent
private constructor() {


    companion object {
        /**
         * Constructs a VoxelContent from an array of metadata.
         * @param [metadata] The metadata to use for this voxel content.
         * @return A VoxelContent containing the specified metadata.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelContent.html#.fromMetadataArray">Online Documentation</a>
         */
        fun fromMetadataArray(metadata: ReadonlyArray<TypedArray<*, *, *, *>> /* Int8Array[] | Uint8Array[] | Int16Array[] | Uint16Array[] | Int32Array[] | Uint32Array[] | Float32Array[] | Float64Array[] */): VoxelContent
    }
}
