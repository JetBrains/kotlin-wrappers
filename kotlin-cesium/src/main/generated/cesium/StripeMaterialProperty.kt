// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * A [MaterialProperty] that maps to stripe [Material] uniforms.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/StripeMaterialProperty.html">Online Documentation</a>
 */
external class StripeMaterialProperty : MaterialProperty {
    /**
     * Gets a value indicating if this property is constant.  A property is considered
     * constant if getValue always returns the same result for the current definition.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/StripeMaterialProperty.html#isConstant">Online Documentation</a>
     */
    override val isConstant: Boolean

    /**
     * Gets the event that is raised whenever the definition of this property changes.
     * The definition is considered to have changed if a call to getValue would return
     * a different result for the same time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/StripeMaterialProperty.html#definitionChanged">Online Documentation</a>
     */
    override val definitionChanged: Event<*>

    /**
     * Gets or sets the Property specifying the [StripeOrientation]/
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/StripeMaterialProperty.html#orientation">Online Documentation</a>
     */
    var orientation: Property?

    /**
     * Gets or sets the Property specifying the first [Color].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/StripeMaterialProperty.html#evenColor">Online Documentation</a>
     */
    var evenColor: Property?

    /**
     * Gets or sets the Property specifying the second [Color].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/StripeMaterialProperty.html#oddColor">Online Documentation</a>
     */
    var oddColor: Property?

    /**
     * Gets or sets the numeric Property specifying the point into the pattern
     * to begin drawing; with 0.0 being the beginning of the even color, 1.0 the beginning
     * of the odd color, 2.0 being the even color again, and any multiple or fractional values
     * being in between.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/StripeMaterialProperty.html#offset">Online Documentation</a>
     */
    var offset: Property?

    /**
     * Gets or sets the numeric Property specifying how many times the stripes repeat.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/StripeMaterialProperty.html#repeat">Online Documentation</a>
     */
    var repeat: Property?

    /**
     * Gets the [Material] type at the provided time.
     * @param [time] The time for which to retrieve the type.
     * @return The type of material.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/StripeMaterialProperty.html#getType">Online Documentation</a>
     */
    override fun getType(time: JulianDate): String

    /**
     * Gets the value of the property at the provided time.
     * @param [time] The time for which to retrieve the value.
     * @param [result] The object to store the value into, if omitted, a new instance is created and returned.
     * @return The modified result parameter or a new instance if the result parameter was not supplied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/StripeMaterialProperty.html#getValue">Online Documentation</a>
     */
    override fun getValue(
        time: JulianDate,
        result: Any?,
    ): Any
}

inline fun StripeMaterialProperty(
    block: StripeMaterialProperty.() -> Unit,
): StripeMaterialProperty =
    StripeMaterialProperty().apply(block)
