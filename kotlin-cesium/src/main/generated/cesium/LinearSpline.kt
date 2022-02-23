// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * A spline that uses piecewise linear interpolation to create a curve.
 * ```
 * const times = [ 0.0, 1.5, 3.0, 4.5, 6.0 ];
 * const spline = new LinearSpline({
 *     times : times,
 *     points : [
 *         new Cartesian3(1235398.0, -4810983.0, 4146266.0),
 *         new Cartesian3(1372574.0, -5345182.0, 4606657.0),
 *         new Cartesian3(-757983.0, -5542796.0, 4514323.0),
 *         new Cartesian3(-2821260.0, -5248423.0, 4021290.0),
 *         new Cartesian3(-2539788.0, -4724797.0, 3620093.0)
 *     ]
 * });
 *
 * const p0 = spline.evaluate(times[0]);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LinearSpline.html">Online Documentation</a>
 */
external class LinearSpline(options: ConstructorOptions) {
    /**
     * @property [times] An array of strictly increasing, unit-less, floating-point times at each point.
     *   The values are in no way connected to the clock time. They are the parameterization for the curve.
     * @property [points] The array of [Cartesian3] control points.
     */
    interface ConstructorOptions {
        var times: Array<out Double>
        var points: Array<out Cartesian3>
    }

    /**
     * An array of times for the control points.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LinearSpline.html#times">Online Documentation</a>
     */
    val times: Array<out Double>

    /**
     * An array of [Cartesian3] control points.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LinearSpline.html#points">Online Documentation</a>
     */
    val points: Array<out Cartesian3>

    /**
     * Finds an index `i` in `times` such that the parameter
     * `time` is in the interval `[times[i], times[i + 1]]`.
     * @param [time] The time.
     * @return The index for the element at the start of the interval.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LinearSpline.html#findTimeInterval">Online Documentation</a>
     */
    fun findTimeInterval(time: Double): Int

    /**
     * Wraps the given time to the period covered by the spline.
     * @param [time] The time.
     * @return The time, wrapped around to the updated animation.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LinearSpline.html#wrapTime">Online Documentation</a>
     */
    fun wrapTime(time: Double): Double

    /**
     * Clamps the given time to the period covered by the spline.
     * @param [time] The time.
     * @return The time, clamped to the animation period.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LinearSpline.html#clampTime">Online Documentation</a>
     */
    fun clampTime(time: Double): Double

    /**
     * Evaluates the curve at a given time.
     * @param [time] The time at which to evaluate the curve.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new instance of the point on the curve at the given time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LinearSpline.html#evaluate">Online Documentation</a>
     */
    fun evaluate(
        time: Double,
        result: Cartesian3? = definedExternally,
    ): Cartesian3
}

inline fun LinearSpline(
    block: LinearSpline.ConstructorOptions.() -> Unit,
): LinearSpline {
    val options: LinearSpline.ConstructorOptions = js("({})")
    block(options)
    return LinearSpline(options)
}
