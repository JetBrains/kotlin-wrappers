// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * A [CompositeProperty] which is also a [PositionProperty].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositePositionProperty.html">Online Documentation</a>
 *
 * @constructor
 * @property [referenceFrame] The reference frame in which the position is defined.
 *   Default value - [ReferenceFrame.FIXED]
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositePositionProperty.html">Online Documentation</a>
 */
external class CompositePositionProperty(var referenceFrame: ReferenceFrame = definedExternally) {
    /**
     * Gets a value indicating if this property is constant.  A property is considered
     * constant if getValue always returns the same result for the current definition.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositePositionProperty.html#isConstant">Online Documentation</a>
     */
    val isConstant: Boolean

    /**
     * Gets the event that is raised whenever the definition of this property changes.
     * The definition is changed whenever setValue is called with data different
     * than the current value.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositePositionProperty.html#definitionChanged">Online Documentation</a>
     */
    val definitionChanged: DefaultEvent

    /**
     * Gets the interval collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositePositionProperty.html#intervals">Online Documentation</a>
     */
    var intervals: TimeIntervalCollection

    /**
     * Gets the value of the property at the provided time in the fixed frame.
     * @param [time] The time for which to retrieve the value.
     * @param [result] The object to store the value into, if omitted, a new instance is created and returned.
     * @return The modified result parameter or a new instance if the result parameter was not supplied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositePositionProperty.html#getValue">Online Documentation</a>
     */
    fun getValue(
        time: JulianDate,
        result: Cartesian3? = definedExternally,
    ): Cartesian3?

    /**
     * Gets the value of the property at the provided time and in the provided reference frame.
     * @param [time] The time for which to retrieve the value.
     * @param [referenceFrame] The desired referenceFrame of the result.
     * @param [result] The object to store the value into, if omitted, a new instance is created and returned.
     * @return The modified result parameter or a new instance if the result parameter was not supplied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositePositionProperty.html#getValueInReferenceFrame">Online Documentation</a>
     */
    fun getValueInReferenceFrame(
        time: JulianDate,
        referenceFrame: ReferenceFrame,
        result: Cartesian3? = definedExternally,
    ): Cartesian3?
}
