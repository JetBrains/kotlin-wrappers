// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * A [Property] which is defined by a [TimeIntervalCollection], where the
 * data property of each [TimeInterval] is another Property instance which is
 * evaluated at the provided time.
 * ```
 * const constantProperty = ...;
 * const sampledProperty = ...;
 *
 * //Create a composite property from two previously defined properties
 * //where the property is valid on August 1st, 2012 and uses a constant
 * //property for the first half of the day and a sampled property for the
 * //remaining half.
 * const composite = new CompositeProperty();
 * composite.intervals.addInterval(TimeInterval.fromIso8601({
 *     iso8601 : '2012-08-01T00:00:00.00Z/2012-08-01T12:00:00.00Z',
 *     data : constantProperty
 * }));
 * composite.intervals.addInterval(TimeInterval.fromIso8601({
 *     iso8601 : '2012-08-01T12:00:00.00Z/2012-08-02T00:00:00.00Z',
 *     isStartIncluded : false,
 *     isStopIncluded : false,
 *     data : sampledProperty
 * }));
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositeProperty.html">Online Documentation</a>
 */
external class CompositeProperty {
    /**
     * Gets a value indicating if this property is constant.  A property is considered
     * constant if getValue always returns the same result for the current definition.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositeProperty.html#isConstant">Online Documentation</a>
     */
    val isConstant: Boolean

    /**
     * Gets the event that is raised whenever the definition of this property changes.
     * The definition is changed whenever setValue is called with data different
     * than the current value.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositeProperty.html#definitionChanged">Online Documentation</a>
     */
    val definitionChanged: DefaultEvent

    /**
     * Gets the interval collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositeProperty.html#intervals">Online Documentation</a>
     */
    var intervals: TimeIntervalCollection

    /**
     * Gets the value of the property at the provided time.
     * @param [time] The time for which to retrieve the value.
     * @param [result] The object to store the value into, if omitted, a new instance is created and returned.
     * @return The modified result parameter or a new instance if the result parameter was not supplied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositeProperty.html#getValue">Online Documentation</a>
     */
    fun getValue(
        time: JulianDate,
        result: Any? = definedExternally,
    ): Any
}
