// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

import js.core.ReadonlyArray
import kotlin.js.Promise

/**
 * This class implements an I3S Node. In CesiumJS each I3SNode creates a Cesium3DTile.
 *
 * Do not construct this directly, instead access tiles through [I3SLayer].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SNode.html">Online Documentation</a>
 */
sealed external class I3SNode {
    /**
     * Gets the resource for the node.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SNode.html#resource">Online Documentation</a>
     */
    val resource: Resource

    /**
     * Gets the parent layer.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SNode.html#layer">Online Documentation</a>
     */
    val layer: I3SLayer

    /**
     * Gets the parent node.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SNode.html#parent">Online Documentation</a>
     */
    val parent: I3SNode?

    /**
     * Gets the children nodes.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SNode.html#children">Online Documentation</a>
     */
    val children: ReadonlyArray<I3SNode>

    /**
     * Gets the collection of geometries.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SNode.html#geometryData">Online Documentation</a>
     */
    val geometryData: ReadonlyArray<I3SGeometry>

    /**
     * Gets the collection of features.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SNode.html#featureData">Online Documentation</a>
     */
    val featureData: ReadonlyArray<I3SFeature>

    /**
     * Gets the collection of fields.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SNode.html#fields">Online Documentation</a>
     */
    val fields: ReadonlyArray<I3SField>

    /**
     * Gets the Cesium3DTile for this node.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SNode.html#tile">Online Documentation</a>
     */
    val tile: Cesium3DTile

    /**
     * Gets the I3S data for this object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SNode.html#data">Online Documentation</a>
     */
    val data: Any

    /**
     * Loads the node fields.
     * @return A promise that is resolved when the I3S Node fields are loaded
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SNode.html#loadFields">Online Documentation</a>
     */
    fun loadFields(): Promise<Unit>

    /**
     * Returns the fields for a given picked position
     * @param [pickedPosition] The picked position
     * @return Object containing field names and their values
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SNode.html#getFieldsForPickedPosition">Online Documentation</a>
     */
    fun getFieldsForPickedPosition(pickedPosition: Cartesian3): Any

    /**
     * Returns the fields for a given feature
     * @param [featureIndex] Index of the feature whose attributes we want to get
     * @return Object containing field names and their values
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SNode.html#getFieldsForFeature">Online Documentation</a>
     */
    fun getFieldsForFeature(featureIndex: Int): Any
}
