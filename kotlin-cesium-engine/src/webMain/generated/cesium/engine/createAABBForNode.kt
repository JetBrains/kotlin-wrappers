// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Creates an axis-aligned bounding box for a quadtree node at the given tree-space coordinates and level.
 * This AABB is in the tree's local space (where the root node of the tree is a unit cube in its own local space).
 * @param [x] The x coordinate of the node.
 * @param [y] The y coordinate of the node.
 * @param [level] The level of the node.
 * @return The axis-aligned bounding box for the node.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#createAABBForNode">Online Documentation</a>
 */
external fun createAABBForNode(
    x: Double,
    y: Double,
    level: Int,
): AxisAlignedBoundingBox
