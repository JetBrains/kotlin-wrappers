// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * A [MaterialProperty] that maps to checkerboard [Material] uniforms.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CheckerboardMaterialProperty.html">Online Documentation</a>
 */
external class CheckerboardMaterialProperty : MaterialProperty {
    /**
     * Gets a value indicating if this property is constant.  A property is considered
     * constant if getValue always returns the same result for the current definition.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CheckerboardMaterialProperty.html#isConstant">Online Documentation</a>
     */
    override val isConstant: Boolean

    /**
     * Gets the event that is raised whenever the definition of this property changes.
     * The definition is considered to have changed if a call to getValue would return
     * a different result for the same time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CheckerboardMaterialProperty.html#definitionChanged">Online Documentation</a>
     */
    override val definitionChanged: DefaultEvent

    /**
     * Gets or sets the Property specifying the first [Color].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CheckerboardMaterialProperty.html#evenColor">Online Documentation</a>
     */
    var evenColor: Property?

    /**
     * Gets or sets the Property specifying the second [Color].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CheckerboardMaterialProperty.html#oddColor">Online Documentation</a>
     */
    var oddColor: Property?

    /**
     * Gets or sets the [Cartesian2] Property specifying how many times the tiles repeat in each direction.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CheckerboardMaterialProperty.html#repeat">Online Documentation</a>
     */
    var repeat: Property?

    /**
     * Gets the [Material] type at the provided time.
     * @param [time] The time for which to retrieve the type.
     * @return The type of material.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CheckerboardMaterialProperty.html#getType">Online Documentation</a>
     */
    override fun getType(time: JulianDate): String

    /**
     * Gets the value of the property at the provided time.
     * @param [time] The time for which to retrieve the value.
     * @param [result] The object to store the value into, if omitted, a new instance is created and returned.
     * @return The modified result parameter or a new instance if the result parameter was not supplied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CheckerboardMaterialProperty.html#getValue">Online Documentation</a>
     */
    override fun getValue(
        time: JulianDate,
        result: Any?,
    ): Any
}

inline fun CheckerboardMaterialProperty(
    block: CheckerboardMaterialProperty.() -> Unit,
): CheckerboardMaterialProperty =
    CheckerboardMaterialProperty().apply(block)
