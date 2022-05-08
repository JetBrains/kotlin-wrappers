// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * A [MaterialProperty] that maps to polyline dash [Material] uniforms.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineDashMaterialProperty.html">Online Documentation</a>
 */
external class PolylineDashMaterialProperty : MaterialProperty {
    /**
     * Gets a value indicating if this property is constant.  A property is considered
     * constant if getValue always returns the same result for the current definition.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineDashMaterialProperty.html#isConstant">Online Documentation</a>
     */
    override val isConstant: Boolean

    /**
     * Gets the event that is raised whenever the definition of this property changes.
     * The definition is considered to have changed if a call to getValue would return
     * a different result for the same time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineDashMaterialProperty.html#definitionChanged">Online Documentation</a>
     */
    override val definitionChanged: Event<*>

    /**
     * Gets or sets the Property specifying the [Color] of the line.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineDashMaterialProperty.html#color">Online Documentation</a>
     */
    var color: Property?

    /**
     * Gets or sets the Property specifying the [Color] of the gaps in the line.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineDashMaterialProperty.html#gapColor">Online Documentation</a>
     */
    var gapColor: Property?

    /**
     * Gets or sets the numeric Property specifying the length of a dash cycle
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineDashMaterialProperty.html#dashLength">Online Documentation</a>
     */
    var dashLength: Property?

    /**
     * Gets or sets the numeric Property specifying a dash pattern
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineDashMaterialProperty.html#dashPattern">Online Documentation</a>
     */
    var dashPattern: Property?

    /**
     * Gets the [Material] type at the provided time.
     * @param [time] The time for which to retrieve the type.
     * @return The type of material.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineDashMaterialProperty.html#getType">Online Documentation</a>
     */
    override fun getType(time: JulianDate): String

    /**
     * Gets the value of the property at the provided time.
     * @param [time] The time for which to retrieve the value.
     * @param [result] The object to store the value into, if omitted, a new instance is created and returned.
     * @return The modified result parameter or a new instance if the result parameter was not supplied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineDashMaterialProperty.html#getValue">Online Documentation</a>
     */
    override fun getValue(
        time: JulianDate,
        result: Any?,
    ): Any
}

inline fun PolylineDashMaterialProperty(
    block: PolylineDashMaterialProperty.() -> Unit,
): PolylineDashMaterialProperty =
    PolylineDashMaterialProperty().apply(block)
