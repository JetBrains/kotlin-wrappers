// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * A [MaterialProperty] that maps to polyline glow [Material] uniforms.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGlowMaterialProperty.html">Online Documentation</a>
 */
external class PolylineGlowMaterialProperty : MaterialProperty {
    /**
     * Gets a value indicating if this property is constant.  A property is considered
     * constant if getValue always returns the same result for the current definition.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGlowMaterialProperty.html#isConstant">Online Documentation</a>
     */
    override val isConstant: Boolean

    /**
     * Gets the event that is raised whenever the definition of this property changes.
     * The definition is considered to have changed if a call to getValue would return
     * a different result for the same time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGlowMaterialProperty.html#definitionChanged">Online Documentation</a>
     */
    override val definitionChanged: DefaultEvent

    /**
     * Gets or sets the Property specifying the [Color] of the line.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGlowMaterialProperty.html#color">Online Documentation</a>
     */
    var color: Property?

    /**
     * Gets or sets the numeric Property specifying the strength of the glow, as a percentage of the total line width (less than 1.0).
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGlowMaterialProperty.html#glowPower">Online Documentation</a>
     */
    var glowPower: Property?

    /**
     * Gets or sets the numeric Property specifying the strength of the tapering effect, as a percentage of the total line length.  If 1.0 or higher, no taper effect is used.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGlowMaterialProperty.html#taperPower">Online Documentation</a>
     */
    var taperPower: Property?

    /**
     * Gets the [Material] type at the provided time.
     * @param [time] The time for which to retrieve the type.
     * @return The type of material.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGlowMaterialProperty.html#getType">Online Documentation</a>
     */
    override fun getType(time: JulianDate): String

    /**
     * Gets the value of the property at the provided time.
     * @param [time] The time for which to retrieve the value.
     * @param [result] The object to store the value into, if omitted, a new instance is created and returned.
     * @return The modified result parameter or a new instance if the result parameter was not supplied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGlowMaterialProperty.html#getValue">Online Documentation</a>
     */
    override fun getValue(
        time: JulianDate,
        result: Any?,
    ): Any
}

inline fun PolylineGlowMaterialProperty(
    block: PolylineGlowMaterialProperty.() -> Unit,
): PolylineGlowMaterialProperty =
    PolylineGlowMaterialProperty().apply(block)
