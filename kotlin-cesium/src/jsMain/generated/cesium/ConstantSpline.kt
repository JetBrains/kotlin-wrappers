// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * A spline that evaluates to a constant value. Although this follows the [Spline] interface,
 * it does not maintain an internal array of times since its value never changes.
 * ```
 * const position = new Cartesian3(1.0, 2.0, 3.0);
 * const spline = new ConstantSpline(position);
 *
 * const p0 = spline.evaluate(0.0);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ConstantSpline.html">Online Documentation</a>
 *
 * @constructor
 * @property [value] The constant value that the spline evaluates to.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ConstantSpline.html">Online Documentation</a>
 */
external class ConstantSpline(val value: dynamic) {
    /**
     * Finds an index `i` in `times` such that the parameter
     * `time` is in the interval `[times[i], times[i + 1]]`.
     *
     * Since a constant spline has no internal times array, this will throw an error.
     * @param [time] The time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ConstantSpline.html#findTimeInterval">Online Documentation</a>
     */
    fun findTimeInterval(time: Double)

    /**
     * Wraps the given time to the period covered by the spline.
     * @param [time] The time.
     * @return The time, wrapped around to the updated animation.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ConstantSpline.html#wrapTime">Online Documentation</a>
     */
    fun wrapTime(time: Double): Double

    /**
     * Clamps the given time to the period covered by the spline.
     * @param [time] The time.
     * @return The time, clamped to the animation period.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ConstantSpline.html#clampTime">Online Documentation</a>
     */
    fun clampTime(time: Double): Double

    /**
     * Evaluates the curve at a given time.
     * @param [time] The time at which to evaluate the curve.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or the value that the constant spline represents.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ConstantSpline.html#evaluate">Online Documentation</a>
     */
    fun evaluate(
        time: Double,
        result: dynamic = definedExternally,
    ): dynamic
}
