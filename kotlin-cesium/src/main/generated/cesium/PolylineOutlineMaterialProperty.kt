// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * A [MaterialProperty] that maps to polyline outline [Material] uniforms.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineOutlineMaterialProperty.html">Online Documentation</a>
 */
external class PolylineOutlineMaterialProperty : MaterialProperty {
    /**
     * Gets a value indicating if this property is constant.  A property is considered
     * constant if getValue always returns the same result for the current definition.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineOutlineMaterialProperty.html#isConstant">Online Documentation</a>
     */
    override val isConstant: Boolean

    /**
     * Gets the event that is raised whenever the definition of this property changes.
     * The definition is considered to have changed if a call to getValue would return
     * a different result for the same time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineOutlineMaterialProperty.html#definitionChanged">Online Documentation</a>
     */
    override val definitionChanged: DefaultEvent

    /**
     * Gets or sets the Property specifying the [Color] of the line.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineOutlineMaterialProperty.html#color">Online Documentation</a>
     */
    var color: Property?

    /**
     * Gets or sets the Property specifying the [Color] of the outline.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineOutlineMaterialProperty.html#outlineColor">Online Documentation</a>
     */
    var outlineColor: Property?

    /**
     * Gets or sets the numeric Property specifying the width of the outline.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineOutlineMaterialProperty.html#outlineWidth">Online Documentation</a>
     */
    var outlineWidth: Property?

    /**
     * Gets the [Material] type at the provided time.
     * @param [time] The time for which to retrieve the type.
     * @return The type of material.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineOutlineMaterialProperty.html#getType">Online Documentation</a>
     */
    override fun getType(time: JulianDate): String

    /**
     * Gets the value of the property at the provided time.
     * @param [time] The time for which to retrieve the value.
     * @param [result] The object to store the value into, if omitted, a new instance is created and returned.
     * @return The modified result parameter or a new instance if the result parameter was not supplied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineOutlineMaterialProperty.html#getValue">Online Documentation</a>
     */
    override fun getValue(
        time: JulianDate,
        result: Any?,
    ): Any
}

inline fun PolylineOutlineMaterialProperty(
    block: PolylineOutlineMaterialProperty.() -> Unit,
): PolylineOutlineMaterialProperty =
    PolylineOutlineMaterialProperty().apply(block)
