// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * A model node with a transform for user-defined animations.  A glTF asset can
 * contain animations that target a node's transform.  This class allows
 * changing a node's transform externally so animation can be driven by another
 * source, not just an animation in the glTF asset.
 *
 * Use [Model.getNode] to create an instance.
 * ```
 * const node = model.getNode('LOD3sp');
 * node.matrix = Matrix4.fromScale(new Cartesian3(5.0, 1.0, 1.0), node.matrix);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelNode.html">Online Documentation</a>
 */
external class ModelNode {
    /**
     * The value of the `name` property of this node.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelNode.html#name">Online Documentation</a>
     */
    val name: String

    /**
     * The index of the node.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelNode.html#id">Online Documentation</a>
     */
    val id: String

    /**
     * Determines if this node and its children will be shown.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelNode.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * The node's 4x4 matrix transform from its local coordinates to
     * its parent's.
     *
     * For changes to take effect, this property must be assigned to;
     * setting individual elements of the matrix will not work.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelNode.html#matrix">Online Documentation</a>
     */
    var matrix: Matrix4

    /**
     * Gets the node's original 4x4 matrix transform from its local coordinates to
     * its parent's, without any node transformations or articulations applied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelNode.html#originalMatrix">Online Documentation</a>
     */
    var originalMatrix: Matrix4
}
