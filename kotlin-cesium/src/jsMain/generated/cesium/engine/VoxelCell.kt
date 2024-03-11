// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray

/**
 * A cell from a [VoxelPrimitive].
 *
 * Provides access to properties associated with one cell of a voxel primitive.
 *
 * Do not construct this directly.  Access it through picking using [Scene.pickVoxel].
 * ```
 * // On left click, display all the properties for a voxel cell in the console log.
 * handler.setInputAction(function(movement) {
 *   const voxelCell = scene.pickVoxel(movement.position);
 *   if (voxelCell instanceof VoxelCell) {
 *     const propertyIds = voxelCell.getPropertyIds();
 *     const length = propertyIds.length;
 *     for (let i = 0; i < length; ++i) {
 *       const propertyId = propertyIds[i];
 *       console.log(`{propertyId}: ${voxelCell.getProperty(propertyId)}`);
 *     }
 *   }
 * }, ScreenSpaceEventType.LEFT_CLICK);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelCell.html">Online Documentation</a>
 *
 * @constructor
 * @param [primitive] The voxel primitive containing the cell
 * @param [tileIndex] The index of the tile
 * @param [sampleIndex] The index of the sample within the tile, containing metadata for this cell
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelCell.html">Online Documentation</a>
 */
sealed external class VoxelCell {
    /**
     * All objects returned by [Scene.pick] have a `primitive` property. This returns
     * the VoxelPrimitive containing the cell.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelCell.html#primitive">Online Documentation</a>
     */
    val primitive: VoxelPrimitive

    /**
     * Get the sample index of the cell.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelCell.html#sampleIndex">Online Documentation</a>
     */
    val sampleIndex: Int

    /**
     * Get the index of the tile containing the cell.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelCell.html#tileIndex">Online Documentation</a>
     */
    val tileIndex: Int

    /**
     * Get a copy of the oriented bounding box containing the cell.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelCell.html#orientedBoundingBox">Online Documentation</a>
     */
    val orientedBoundingBox: OrientedBoundingBox

    /**
     * Returns `true` if the feature contains this property.
     * @param [name] The case-sensitive name of the property.
     * @return Whether the feature contains this property.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelCell.html#hasProperty">Online Documentation</a>
     */
    fun hasProperty(name: String): Boolean

    /**
     * Returns an array of metadata property names for the feature.
     * @return The IDs of the feature's properties.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelCell.html#getNames">Online Documentation</a>
     */
    fun getNames(): ReadonlyArray<String>

    /**
     * Returns a copy of the value of the metadata in the cell with the given name.
     * ```
     * // Display all the properties for a voxel cell in the console log.
     * const names = voxelCell.getNames();
     * for (let i = 0; i < names.length; ++i) {
     *   const name = names[i];
     *   console.log(`{name}: ${voxelCell.getProperty(name)}`);
     * }
     * ```
     * @param [name] The case-sensitive name of the property.
     * @return The value of the property or `undefined` if the feature does not have this property.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelCell.html#getProperty">Online Documentation</a>
     */
    fun getProperty(name: String): Any
}
