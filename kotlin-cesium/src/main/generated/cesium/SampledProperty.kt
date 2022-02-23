// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * A [Property] whose value is interpolated for a given time from the
 * provided set of samples and specified interpolation algorithm and degree.
 * ```
 * //Create a linearly interpolated Cartesian2
 * const property = new SampledProperty(Cartesian2);
 *
 * //Populate it with data
 * property.addSample(JulianDate.fromIso8601('2012-08-01T00:00:00.00Z'), new Cartesian2(0, 0));
 * property.addSample(JulianDate.fromIso8601('2012-08-02T00:00:00.00Z'), new Cartesian2(4, 7));
 *
 * //Retrieve an interpolated value
 * const result = property.getValue(JulianDate.fromIso8601('2012-08-01T12:00:00.00Z'));
 * ```
 * ```
 * //Create a simple numeric SampledProperty that uses third degree Hermite Polynomial Approximation
 * const property = new SampledProperty(Number);
 * property.setInterpolationOptions({
 *     interpolationDegree : 3,
 *     interpolationAlgorithm : HermitePolynomialApproximation
 * });
 *
 * //Populate it with data
 * property.addSample(JulianDate.fromIso8601('2012-08-01T00:00:00.00Z'), 1.0);
 * property.addSample(JulianDate.fromIso8601('2012-08-01T00:01:00.00Z'), 6.0);
 * property.addSample(JulianDate.fromIso8601('2012-08-01T00:02:00.00Z'), 12.0);
 * property.addSample(JulianDate.fromIso8601('2012-08-01T00:03:30.00Z'), 5.0);
 * property.addSample(JulianDate.fromIso8601('2012-08-01T00:06:30.00Z'), 2.0);
 *
 * //Samples can be added in any order.
 * property.addSample(JulianDate.fromIso8601('2012-08-01T00:00:30.00Z'), 6.2);
 *
 * //Retrieve an interpolated value
 * const result = property.getValue(JulianDate.fromIso8601('2012-08-01T00:02:34.00Z'));
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SampledProperty.html">Online Documentation</a>
 *
 * @constructor
 * @param [type] The type of property.
 * @property [derivativeTypes] When supplied, indicates that samples will contain derivative information of the specified types.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SampledProperty.html">Online Documentation</a>
 */
external class SampledProperty(
    type: Double,
    var derivativeTypes: Array<out Packable<*>> = definedExternally,
) {
    constructor(
        type: Packable<*>,
        derivativeTypes: Array<out Packable<*>>? = definedExternally,
    )

    /**
     * Gets a value indicating if this property is constant.  A property is considered
     * constant if getValue always returns the same result for the current definition.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SampledProperty.html#isConstant">Online Documentation</a>
     */
    val isConstant: Boolean

    /**
     * Gets the event that is raised whenever the definition of this property changes.
     * The definition is considered to have changed if a call to getValue would return
     * a different result for the same time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SampledProperty.html#definitionChanged">Online Documentation</a>
     */
    val definitionChanged: Event

    /**
     * Gets the type of property.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SampledProperty.html#type">Online Documentation</a>
     */
    var type: Any

    /**
     * Gets the degree of interpolation to perform when retrieving a value.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SampledProperty.html#interpolationDegree">Online Documentation</a>
     */
    var interpolationDegree: Double

    /**
     * Gets the interpolation algorithm to use when retrieving a value.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SampledProperty.html#interpolationAlgorithm">Online Documentation</a>
     */
    var interpolationAlgorithm: InterpolationAlgorithm

    /**
     * Gets or sets the type of extrapolation to perform when a value
     * is requested at a time after any available samples.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SampledProperty.html#forwardExtrapolationType">Online Documentation</a>
     */
    var forwardExtrapolationType: ExtrapolationType

    /**
     * Gets or sets the amount of time to extrapolate forward before
     * the property becomes undefined.  A value of 0 will extrapolate forever.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SampledProperty.html#forwardExtrapolationDuration">Online Documentation</a>
     */
    var forwardExtrapolationDuration: Double

    /**
     * Gets or sets the type of extrapolation to perform when a value
     * is requested at a time before any available samples.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SampledProperty.html#backwardExtrapolationType">Online Documentation</a>
     */
    var backwardExtrapolationType: ExtrapolationType

    /**
     * Gets or sets the amount of time to extrapolate backward
     * before the property becomes undefined.  A value of 0 will extrapolate forever.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SampledProperty.html#backwardExtrapolationDuration">Online Documentation</a>
     */
    var backwardExtrapolationDuration: Double

    /**
     * Gets the value of the property at the provided time.
     * @param [time] The time for which to retrieve the value.
     * @param [result] The object to store the value into, if omitted, a new instance is created and returned.
     * @return The modified result parameter or a new instance if the result parameter was not supplied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SampledProperty.html#getValue">Online Documentation</a>
     */
    fun getValue(
        time: JulianDate,
        result: Any? = definedExternally,
    ): Any

    /**
     * Sets the algorithm and degree to use when interpolating a value.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SampledProperty.html#setInterpolationOptions">Online Documentation</a>
     */
    fun setInterpolationOptions(options: SetInterpolationOptionsOptions? = definedExternally)

    /**
     * @property [interpolationAlgorithm] The new interpolation algorithm.  If undefined, the existing property will be unchanged.
     * @property [interpolationDegree] The new interpolation degree.  If undefined, the existing property will be unchanged.
     */
    interface SetInterpolationOptionsOptions {
        var interpolationAlgorithm: InterpolationAlgorithm?
        var interpolationDegree: Double?
    }

    /**
     * Adds a new sample.
     * @param [time] The sample time.
     * @param [value] The value at the provided time.
     * @param [derivatives] The array of derivatives at the provided time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SampledProperty.html#addSample">Online Documentation</a>
     */
    fun addSample(
        time: JulianDate,
        value: Packable<*>,
        derivatives: Array<out Packable<*>>? = definedExternally,
    )

    /**
     * Adds an array of samples.
     * @param [times] An array of JulianDate instances where each index is a sample time.
     * @param [values] The array of values, where each value corresponds to the provided times index.
     * @param [derivativeValues] An array where each item is the array of derivatives at the equivalent time index.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SampledProperty.html#addSamples">Online Documentation</a>
     */
    fun addSamples(
        times: Array<out JulianDate>,
        values: Array<out Packable<*>>,
        derivativeValues: Array<out Array<out Any>>? = definedExternally,
    )

    /**
     * Adds samples as a single packed array where each new sample is represented as a date,
     * followed by the packed representation of the corresponding value and derivatives.
     * @param [packedSamples] The array of packed samples.
     * @param [epoch] If any of the dates in packedSamples are numbers, they are considered an offset from this epoch, in seconds.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SampledProperty.html#addSamplesPackedArray">Online Documentation</a>
     */
    fun addSamplesPackedArray(
        packedSamples: Array<out Double>,
        epoch: JulianDate? = definedExternally,
    )

    /**
     * Removes a sample at the given time, if present.
     * @param [time] The sample time.
     * @return `true` if a sample at time was removed, `false` otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SampledProperty.html#removeSample">Online Documentation</a>
     */
    fun removeSample(time: JulianDate): Boolean

    /**
     * Removes all samples for the given time interval.
     * @param [time] The time interval for which to remove all samples.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SampledProperty.html#removeSamples">Online Documentation</a>
     */
    fun removeSamples(time: TimeInterval)
}
