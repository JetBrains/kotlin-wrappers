// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * <div class="notice">
 * Use [Model.getNode] to get a node from a loaded model. Do not call the constructor directly.
 * </div>
 *
 * A model node with a modifiable transform to allow users to define their
 * own animations. While a model's asset can contain animations that target
 * a node's transform, this class allows users to change a node's transform
 * externally. In this way, animation can be driven by another source, not
 * just by the model's asset.
 * ```
 * const node = model.getNode("Hand");
 * node.matrix = Matrix4.fromScale(new Cartesian3(5.0, 1.0, 1.0), node.matrix);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelNode.html">Online Documentation</a>
 */
sealed external class ModelNode {
    /**
     * The value of the `name` property of this node.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelNode.html#name">Online Documentation</a>
     */
    val name: String

    /**
     * The index of the node in the glTF.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelNode.html#id">Online Documentation</a>
     */
    val id: Double

    /**
     * Determines if this node and its children will be shown.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelNode.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * The node's 4x4 matrix transform from its local coordinates to
     * its parent's. Setting the matrix to undefined will restore the
     * node's original transform, and allow the node to be animated by
     * any animations in the model again.
     *
     * For changes to take effect, this property must be assigned to;
     * setting individual elements of the matrix will not work.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelNode.html#matrix">Online Documentation</a>
     */
    var matrix: Matrix4

    /**
     * Gets the node's original 4x4 matrix transform from its local
     * coordinates to its parent's, without any node transformations
     * or articulations applied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelNode.html#originalMatrix">Online Documentation</a>
     */
    var originalMatrix: Matrix4
}
