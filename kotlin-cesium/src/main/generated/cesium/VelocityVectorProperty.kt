// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * A [Property] which evaluates to a [Cartesian3] vector
 * based on the velocity of the provided [PositionProperty].
 * ```
 * //Create an entity with a billboard rotated to match its velocity.
 * const position = new SampledProperty();
 * position.addSamples(...);
 * const entity = viewer.entities.add({
 *   position : position,
 *   billboard : {
 *     image : 'image.png',
 *     alignedAxis : new VelocityVectorProperty(position, true) // alignedAxis must be a unit vector
 *   }
 * }));
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VelocityVectorProperty.html">Online Documentation</a>
 *
 * @constructor
 * @param [position] The position property used to compute the velocity.
 * @property [normalize] Whether to normalize the computed velocity vector.
 *   Default value - `true`
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VelocityVectorProperty.html">Online Documentation</a>
 */
external class VelocityVectorProperty(
    position: PositionProperty? = definedExternally,
    var normalize: Boolean = definedExternally,
) {
    /**
     * Gets a value indicating if this property is constant.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VelocityVectorProperty.html#isConstant">Online Documentation</a>
     */
    val isConstant: Boolean

    /**
     * Gets the event that is raised whenever the definition of this property changes.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VelocityVectorProperty.html#definitionChanged">Online Documentation</a>
     */
    val definitionChanged: Event

    /**
     * Gets or sets the position property used to compute the velocity vector.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VelocityVectorProperty.html#position">Online Documentation</a>
     */
    var position: Property?

    /**
     * Gets the value of the property at the provided time.
     * @param [time] The time for which to retrieve the value.
     * @param [result] The object to store the value into, if omitted, a new instance is created and returned.
     * @return The modified result parameter or a new instance if the result parameter was not supplied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VelocityVectorProperty.html#getValue">Online Documentation</a>
     */
    fun getValue(
        time: JulianDate? = definedExternally,
        result: Cartesian3? = definedExternally,
    ): Cartesian3
}
