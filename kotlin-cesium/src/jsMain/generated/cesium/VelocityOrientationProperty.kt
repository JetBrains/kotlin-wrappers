// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

/**
 * A [Property] which evaluates to a [Quaternion] rotation
 * based on the velocity of the provided [PositionProperty].
 * ```
 * //Create an entity with position and orientation.
 * const position = new SampledProperty();
 * position.addSamples(...);
 * const entity = viewer.entities.add({
 *   position : position,
 *   orientation : new VelocityOrientationProperty(position)
 * }));
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VelocityOrientationProperty.html">Online Documentation</a>
 *
 * @constructor
 * @param [position] The position property used to compute the orientation.
 * @param [ellipsoid] The ellipsoid used to determine which way is up.
 *   Default value - [Ellipsoid.WGS84]
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VelocityOrientationProperty.html">Online Documentation</a>
 */
external class VelocityOrientationProperty(
    position: PositionProperty? = definedExternally,
    ellipsoid: Ellipsoid? = definedExternally,
) {
    /**
     * Gets a value indicating if this property is constant.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VelocityOrientationProperty.html#isConstant">Online Documentation</a>
     */
    val isConstant: Boolean

    /**
     * Gets the event that is raised whenever the definition of this property changes.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VelocityOrientationProperty.html#definitionChanged">Online Documentation</a>
     */
    val definitionChanged: DefaultEvent

    /**
     * Gets or sets the position property used to compute orientation.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VelocityOrientationProperty.html#position">Online Documentation</a>
     */
    var position: Property?

    /**
     * Gets or sets the ellipsoid used to determine which way is up.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VelocityOrientationProperty.html#ellipsoid">Online Documentation</a>
     */
    var ellipsoid: Property?

    /**
     * Gets the value of the property at the provided time.
     * @param [time] The time for which to retrieve the value.
     * @param [result] The object to store the value into, if omitted, a new instance is created and returned.
     * @return The modified result parameter or a new instance if the result parameter was not supplied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VelocityOrientationProperty.html#getValue">Online Documentation</a>
     */
    fun getValue(
        time: JulianDate? = definedExternally,
        result: Quaternion? = definedExternally,
    ): Quaternion
}
