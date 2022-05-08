// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * A [MaterialProperty] that maps to image [Material] uniforms.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageMaterialProperty.html">Online Documentation</a>
 */
external class ImageMaterialProperty : MaterialProperty {
    /**
     * Gets a value indicating if this property is constant.  A property is considered
     * constant if getValue always returns the same result for the current definition.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageMaterialProperty.html#isConstant">Online Documentation</a>
     */
    override val isConstant: Boolean

    /**
     * Gets the event that is raised whenever the definition of this property changes.
     * The definition is considered to have changed if a call to getValue would return
     * a different result for the same time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageMaterialProperty.html#definitionChanged">Online Documentation</a>
     */
    override val definitionChanged: Event<*>

    /**
     * Gets or sets the Property specifying Image, URL, Canvas, or Video to use.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageMaterialProperty.html#image">Online Documentation</a>
     */
    var image: Property?

    /**
     * Gets or sets the [Cartesian2] Property specifying the number of times the image repeats in each direction.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageMaterialProperty.html#repeat">Online Documentation</a>
     */
    var repeat: Property?

    /**
     * Gets or sets the Color Property specifying the desired color applied to the image.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageMaterialProperty.html#color">Online Documentation</a>
     */
    var color: Property?

    /**
     * Gets or sets the Boolean Property specifying whether the image has transparency
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageMaterialProperty.html#transparent">Online Documentation</a>
     */
    var transparent: Property?

    /**
     * Gets the [Material] type at the provided time.
     * @param [time] The time for which to retrieve the type.
     * @return The type of material.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageMaterialProperty.html#getType">Online Documentation</a>
     */
    override fun getType(time: JulianDate): String

    /**
     * Gets the value of the property at the provided time.
     * @param [time] The time for which to retrieve the value.
     * @param [result] The object to store the value into, if omitted, a new instance is created and returned.
     * @return The modified result parameter or a new instance if the result parameter was not supplied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageMaterialProperty.html#getValue">Online Documentation</a>
     */
    override fun getValue(
        time: JulianDate,
        result: Any?,
    ): Any
}

inline fun ImageMaterialProperty(
    block: ImageMaterialProperty.() -> Unit,
): ImageMaterialProperty =
    ImageMaterialProperty().apply(block)
