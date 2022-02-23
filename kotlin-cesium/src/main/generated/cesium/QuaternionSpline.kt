// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * A spline that uses spherical linear (slerp) interpolation to create a quaternion curve.
 * The generated curve is in the class C<sup>1</sup>.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/QuaternionSpline.html">Online Documentation</a>
 */
external class QuaternionSpline(options: ConstructorOptions) {
    /**
     * @property [times] An array of strictly increasing, unit-less, floating-point times at each point.
     *   The values are in no way connected to the clock time. They are the parameterization for the curve.
     * @property [points] The array of [Quaternion] control points.
     */
    interface ConstructorOptions {
        var times: Array<out Double>
        var points: Array<out Quaternion>
    }

    /**
     * An array of times for the control points.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/QuaternionSpline.html#times">Online Documentation</a>
     */
    val times: Array<out Double>

    /**
     * An array of [Quaternion] control points.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/QuaternionSpline.html#points">Online Documentation</a>
     */
    val points: Array<out Quaternion>

    /**
     * Finds an index `i` in `times` such that the parameter
     * `time` is in the interval `[times[i], times[i + 1]]`.
     * @param [time] The time.
     * @return The index for the element at the start of the interval.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/QuaternionSpline.html#findTimeInterval">Online Documentation</a>
     */
    fun findTimeInterval(time: Double): Int

    /**
     * Wraps the given time to the period covered by the spline.
     * @param [time] The time.
     * @return The time, wrapped around to the updated animation.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/QuaternionSpline.html#wrapTime">Online Documentation</a>
     */
    fun wrapTime(time: Double): Double

    /**
     * Clamps the given time to the period covered by the spline.
     * @param [time] The time.
     * @return The time, clamped to the animation period.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/QuaternionSpline.html#clampTime">Online Documentation</a>
     */
    fun clampTime(time: Double): Double

    /**
     * Evaluates the curve at a given time.
     * @param [time] The time at which to evaluate the curve.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new instance of the point on the curve at the given time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/QuaternionSpline.html#evaluate">Online Documentation</a>
     */
    fun evaluate(
        time: Double,
        result: Quaternion? = definedExternally,
    ): Quaternion
}

inline fun QuaternionSpline(
    block: QuaternionSpline.ConstructorOptions.() -> Unit,
): QuaternionSpline {
    val options: QuaternionSpline.ConstructorOptions = js("({})")
    block(options)
    return QuaternionSpline(options)
}
