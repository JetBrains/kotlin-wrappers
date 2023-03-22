// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package cesium

/**
 * An enum of voxel shapes. The shape controls how the voxel grid is mapped to 3D space.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#VoxelShapeType">Online Documentation</a>
 */
sealed external interface VoxelShapeType {
    companion object {

        /**
         * A box shape.
         */
        val BOX: VoxelShapeType

        /**
         * An ellipsoid shape.
         */
        val ELLIPSOID: VoxelShapeType

        /**
         * A cylinder shape.
         */
        val CYLINDER: VoxelShapeType
    }
}
