// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * A [Property] which is defined by a [TimeIntervalCollection], where the
 * data property of each [TimeInterval] represents the value at time.
 * ```
 * //Create a Cartesian2 interval property which contains data on August 1st, 2012
 * //and uses a different value every 6 hours.
 * const composite = new TimeIntervalCollectionProperty();
 * composite.intervals.addInterval(TimeInterval.fromIso8601({
 *     iso8601 : '2012-08-01T00:00:00.00Z/2012-08-01T06:00:00.00Z',
 *     isStartIncluded : true,
 *     isStopIncluded : false,
 *     data : new Cartesian2(2.0, 3.4)
 * }));
 * composite.intervals.addInterval(TimeInterval.fromIso8601({
 *     iso8601 : '2012-08-01T06:00:00.00Z/2012-08-01T12:00:00.00Z',
 *     isStartIncluded : true,
 *     isStopIncluded : false,
 *     data : new Cartesian2(12.0, 2.7)
 * }));
 * composite.intervals.addInterval(TimeInterval.fromIso8601({
 *     iso8601 : '2012-08-01T12:00:00.00Z/2012-08-01T18:00:00.00Z',
 *     isStartIncluded : true,
 *     isStopIncluded : false,
 *     data : new Cartesian2(5.0, 12.4)
 * }));
 * composite.intervals.addInterval(TimeInterval.fromIso8601({
 *     iso8601 : '2012-08-01T18:00:00.00Z/2012-08-02T00:00:00.00Z',
 *     isStartIncluded : true,
 *     isStopIncluded : true,
 *     data : new Cartesian2(85.0, 4.1)
 * }));
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeIntervalCollectionProperty.html">Online Documentation</a>
 */
external class TimeIntervalCollectionProperty {
    /**
     * Gets a value indicating if this property is constant.  A property is considered
     * constant if getValue always returns the same result for the current definition.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeIntervalCollectionProperty.html#isConstant">Online Documentation</a>
     */
    val isConstant: Boolean

    /**
     * Gets the event that is raised whenever the definition of this property changes.
     * The definition is changed whenever setValue is called with data different
     * than the current value.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeIntervalCollectionProperty.html#definitionChanged">Online Documentation</a>
     */
    val definitionChanged: DefaultEvent

    /**
     * Gets the interval collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeIntervalCollectionProperty.html#intervals">Online Documentation</a>
     */
    val intervals: TimeIntervalCollection

    /**
     * Gets the value of the property at the provided time.
     * @param [time] The time for which to retrieve the value.
     * @param [result] The object to store the value into, if omitted, a new instance is created and returned.
     * @return The modified result parameter or a new instance if the result parameter was not supplied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeIntervalCollectionProperty.html#getValue">Online Documentation</a>
     */
    fun getValue(
        time: JulianDate,
        result: Any? = definedExternally,
    ): Any
}
