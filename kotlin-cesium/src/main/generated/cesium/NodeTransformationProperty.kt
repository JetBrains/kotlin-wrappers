// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * A [Property] that produces [TranslationRotationScale] data.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/NodeTransformationProperty.html">Online Documentation</a>
 */
external class NodeTransformationProperty {
    /**
     * Gets a value indicating if this property is constant.  A property is considered
     * constant if getValue always returns the same result for the current definition.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/NodeTransformationProperty.html#isConstant">Online Documentation</a>
     */
    val isConstant: Boolean

    /**
     * Gets the event that is raised whenever the definition of this property changes.
     * The definition is considered to have changed if a call to getValue would return
     * a different result for the same time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/NodeTransformationProperty.html#definitionChanged">Online Documentation</a>
     */
    val definitionChanged: DefaultEvent

    /**
     * Gets or sets the [Cartesian3] Property specifying the (x, y, z) translation to apply to the node.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/NodeTransformationProperty.html#translation">Online Documentation</a>
     */
    var translation: Property?

    /**
     * Gets or sets the [Quaternion] Property specifying the (x, y, z, w) rotation to apply to the node.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/NodeTransformationProperty.html#rotation">Online Documentation</a>
     */
    var rotation: Property?

    /**
     * Gets or sets the [Cartesian3] Property specifying the (x, y, z) scaling to apply to the node.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/NodeTransformationProperty.html#scale">Online Documentation</a>
     */
    var scale: Property?

    /**
     * Gets the value of the property at the provided time.
     * @param [time] The time for which to retrieve the value.
     * @param [result] The object to store the value into, if omitted, a new instance is created and returned.
     * @return The modified result parameter or a new instance if the result parameter was not supplied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/NodeTransformationProperty.html#getValue">Online Documentation</a>
     */
    fun getValue(
        time: JulianDate,
        result: TranslationRotationScale? = definedExternally,
    ): TranslationRotationScale
}

inline fun NodeTransformationProperty(
    block: NodeTransformationProperty.() -> Unit,
): NodeTransformationProperty =
    NodeTransformationProperty().apply(block)
