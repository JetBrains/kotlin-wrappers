// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

import js.core.ReadonlyArray

/**
 * A [SampledProperty] which is also a [PositionProperty].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SampledPositionProperty.html">Online Documentation</a>
 *
 * @constructor
 * @property [referenceFrame] The reference frame in which the position is defined.
 *   Default value - [ReferenceFrame.FIXED]
 * @property [numberOfDerivatives] The number of derivatives that accompany each position; i.e. velocity, acceleration, etc...
 *   Default value - `0`
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SampledPositionProperty.html">Online Documentation</a>
 */
external class SampledPositionProperty(
    var referenceFrame: ReferenceFrame = definedExternally,
    var numberOfDerivatives: Int = definedExternally,
) {
    /**
     * Gets a value indicating if this property is constant.  A property is considered
     * constant if getValue always returns the same result for the current definition.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SampledPositionProperty.html#isConstant">Online Documentation</a>
     */
    val isConstant: Boolean

    /**
     * Gets the event that is raised whenever the definition of this property changes.
     * The definition is considered to have changed if a call to getValue would return
     * a different result for the same time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SampledPositionProperty.html#definitionChanged">Online Documentation</a>
     */
    val definitionChanged: DefaultEvent

    /**
     * Gets the degree of interpolation to perform when retrieving a value. Call `setInterpolationOptions` to set this.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SampledPositionProperty.html#interpolationDegree">Online Documentation</a>
     */
    val interpolationDegree: Double

    /**
     * Gets the interpolation algorithm to use when retrieving a value. Call `setInterpolationOptions` to set this.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SampledPositionProperty.html#interpolationAlgorithm">Online Documentation</a>
     */
    val interpolationAlgorithm: InterpolationAlgorithm

    /**
     * Gets or sets the type of extrapolation to perform when a value
     * is requested at a time after any available samples.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SampledPositionProperty.html#forwardExtrapolationType">Online Documentation</a>
     */
    var forwardExtrapolationType: ExtrapolationType

    /**
     * Gets or sets the amount of time to extrapolate forward before
     * the property becomes undefined.  A value of 0 will extrapolate forever.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SampledPositionProperty.html#forwardExtrapolationDuration">Online Documentation</a>
     */
    var forwardExtrapolationDuration: Double

    /**
     * Gets or sets the type of extrapolation to perform when a value
     * is requested at a time before any available samples.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SampledPositionProperty.html#backwardExtrapolationType">Online Documentation</a>
     */
    var backwardExtrapolationType: ExtrapolationType

    /**
     * Gets or sets the amount of time to extrapolate backward
     * before the property becomes undefined.  A value of 0 will extrapolate forever.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SampledPositionProperty.html#backwardExtrapolationDuration">Online Documentation</a>
     */
    var backwardExtrapolationDuration: Double

    /**
     * Gets the position at the provided time.
     * @param [time] The time for which to retrieve the value.
     * @param [result] The object to store the value into, if omitted, a new instance is created and returned.
     * @return The modified result parameter or a new instance if the result parameter was not supplied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SampledPositionProperty.html#getValue">Online Documentation</a>
     */
    fun getValue(
        time: JulianDate,
        result: Cartesian3? = definedExternally,
    ): Cartesian3?

    /**
     * Gets the position at the provided time and in the provided reference frame.
     * @param [time] The time for which to retrieve the value.
     * @param [referenceFrame] The desired referenceFrame of the result.
     * @param [result] The object to store the value into, if omitted, a new instance is created and returned.
     * @return The modified result parameter or a new instance if the result parameter was not supplied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SampledPositionProperty.html#getValueInReferenceFrame">Online Documentation</a>
     */
    fun getValueInReferenceFrame(
        time: JulianDate,
        referenceFrame: ReferenceFrame,
        result: Cartesian3? = definedExternally,
    ): Cartesian3?

    /**
     * Sets the algorithm and degree to use when interpolating a position.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SampledPositionProperty.html#setInterpolationOptions">Online Documentation</a>
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
     * @param [position] The position at the provided time.
     * @param [derivatives] The array of derivative values at the provided time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SampledPositionProperty.html#addSample">Online Documentation</a>
     */
    fun addSample(
        time: JulianDate,
        position: Cartesian3,
        derivatives: ReadonlyArray<Cartesian3>? = definedExternally,
    )

    /**
     * Adds multiple samples via parallel arrays.
     * @param [times] An array of JulianDate instances where each index is a sample time.
     * @param [positions] An array of Cartesian3 position instances, where each value corresponds to the provided time index.
     * @param [derivatives] An array where each value is another array containing derivatives for the corresponding time index.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SampledPositionProperty.html#addSamples">Online Documentation</a>
     */
    fun addSamples(
        times: ReadonlyArray<JulianDate>,
        positions: ReadonlyArray<Cartesian3>,
        derivatives: ReadonlyArray<ReadonlyArray<Any>>? = definedExternally,
    )

    /**
     * Adds samples as a single packed array where each new sample is represented as a date,
     * followed by the packed representation of the corresponding value and derivatives.
     * @param [packedSamples] The array of packed samples.
     * @param [epoch] If any of the dates in packedSamples are numbers, they are considered an offset from this epoch, in seconds.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SampledPositionProperty.html#addSamplesPackedArray">Online Documentation</a>
     */
    fun addSamplesPackedArray(
        packedSamples: ReadonlyArray<Double>,
        epoch: JulianDate? = definedExternally,
    )

    /**
     * Removes a sample at the given time, if present.
     * @param [time] The sample time.
     * @return `true` if a sample at time was removed, `false` otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SampledPositionProperty.html#removeSample">Online Documentation</a>
     */
    fun removeSample(time: JulianDate): Boolean

    /**
     * Removes all samples for the given time interval.
     * @param [time] The time interval for which to remove all samples.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SampledPositionProperty.html#removeSamples">Online Documentation</a>
     */
    fun removeSamples(time: TimeInterval)
}
