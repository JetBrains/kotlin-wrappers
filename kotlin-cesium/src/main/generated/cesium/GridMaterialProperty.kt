// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * A [MaterialProperty] that maps to grid [Material] uniforms.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GridMaterialProperty.html">Online Documentation</a>
 */
external class GridMaterialProperty : MaterialProperty {
    /**
     * Gets a value indicating if this property is constant.  A property is considered
     * constant if getValue always returns the same result for the current definition.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GridMaterialProperty.html#isConstant">Online Documentation</a>
     */
    override val isConstant: Boolean

    /**
     * Gets the event that is raised whenever the definition of this property changes.
     * The definition is considered to have changed if a call to getValue would return
     * a different result for the same time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GridMaterialProperty.html#definitionChanged">Online Documentation</a>
     */
    override val definitionChanged: DefaultEvent

    /**
     * Gets or sets the Property specifying the grid [Color].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GridMaterialProperty.html#color">Online Documentation</a>
     */
    var color: Property?

    /**
     * Gets or sets the numeric Property specifying cell alpha values.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GridMaterialProperty.html#cellAlpha">Online Documentation</a>
     */
    var cellAlpha: Property?

    /**
     * Gets or sets the [Cartesian2] Property specifying the number of grid lines along each axis.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GridMaterialProperty.html#lineCount">Online Documentation</a>
     */
    var lineCount: Property?

    /**
     * Gets or sets the [Cartesian2] Property specifying the thickness of grid lines along each axis.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GridMaterialProperty.html#lineThickness">Online Documentation</a>
     */
    var lineThickness: Property?

    /**
     * Gets or sets the [Cartesian2] Property specifying the starting offset of grid lines along each axis.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GridMaterialProperty.html#lineOffset">Online Documentation</a>
     */
    var lineOffset: Property?

    /**
     * Gets the [Material] type at the provided time.
     * @param [time] The time for which to retrieve the type.
     * @return The type of material.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GridMaterialProperty.html#getType">Online Documentation</a>
     */
    override fun getType(time: JulianDate): String

    /**
     * Gets the value of the property at the provided time.
     * @param [time] The time for which to retrieve the value.
     * @param [result] The object to store the value into, if omitted, a new instance is created and returned.
     * @return The modified result parameter or a new instance if the result parameter was not supplied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GridMaterialProperty.html#getValue">Online Documentation</a>
     */
    override fun getValue(
        time: JulianDate,
        result: Any?,
    ): Any
}

inline fun GridMaterialProperty(
    block: GridMaterialProperty.() -> Unit,
): GridMaterialProperty =
    GridMaterialProperty().apply(block)
