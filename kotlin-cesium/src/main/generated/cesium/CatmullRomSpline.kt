// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.ReadonlyArray
import js.core.jso

/**
 * A Catmull-Rom spline is a cubic spline where the tangent at control points,
 * except the first and last, are computed using the previous and next control points.
 * Catmull-Rom splines are in the class C<sup>1</sup>.
 * ```
 * // spline above the earth from Philadelphia to Los Angeles
 * const spline = new CatmullRomSpline({
 *     times : [ 0.0, 1.5, 3.0, 4.5, 6.0 ],
 *     points : [
 *         new Cartesian3(1235398.0, -4810983.0, 4146266.0),
 *         new Cartesian3(1372574.0, -5345182.0, 4606657.0),
 *         new Cartesian3(-757983.0, -5542796.0, 4514323.0),
 *         new Cartesian3(-2821260.0, -5248423.0, 4021290.0),
 *         new Cartesian3(-2539788.0, -4724797.0, 3620093.0)
 *     ]
 * });
 *
 * const p0 = spline.evaluate(times[i]);         // equal to positions[i]
 * const p1 = spline.evaluate(times[i] + delta); // interpolated value when delta < times[i + 1] - times[i]
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CatmullRomSpline.html">Online Documentation</a>
 */
external class CatmullRomSpline(options: ConstructorOptions) {
    /**
     * @property [times] An array of strictly increasing, unit-less, floating-point times at each point.
     *   The values are in no way connected to the clock time. They are the parameterization for the curve.
     * @property [points] The array of [Cartesian3] control points.
     * @property [firstTangent] The tangent of the curve at the first control point.
     *   If the tangent is not given, it will be estimated.
     * @property [lastTangent] The tangent of the curve at the last control point.
     *   If the tangent is not given, it will be estimated.
     */
    interface ConstructorOptions {
        var times: ReadonlyArray<Double>
        var points: ReadonlyArray<Cartesian3>
        var firstTangent: Cartesian3?
        var lastTangent: Cartesian3?
    }

    /**
     * An array of times for the control points.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CatmullRomSpline.html#times">Online Documentation</a>
     */
    val times: ReadonlyArray<Double>

    /**
     * An array of [Cartesian3] control points.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CatmullRomSpline.html#points">Online Documentation</a>
     */
    val points: ReadonlyArray<Cartesian3>

    /**
     * The tangent at the first control point.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CatmullRomSpline.html#firstTangent">Online Documentation</a>
     */
    val firstTangent: Cartesian3

    /**
     * The tangent at the last control point.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CatmullRomSpline.html#lastTangent">Online Documentation</a>
     */
    val lastTangent: Cartesian3

    /**
     * Finds an index `i` in `times` such that the parameter
     * `time` is in the interval `[times[i], times[i + 1]]`.
     * @param [time] The time.
     * @return The index for the element at the start of the interval.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CatmullRomSpline.html#findTimeInterval">Online Documentation</a>
     */
    fun findTimeInterval(time: Double): Int

    /**
     * Wraps the given time to the period covered by the spline.
     * @param [time] The time.
     * @return The time, wrapped around to the updated animation.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CatmullRomSpline.html#wrapTime">Online Documentation</a>
     */
    fun wrapTime(time: Double): Double

    /**
     * Clamps the given time to the period covered by the spline.
     * @param [time] The time.
     * @return The time, clamped to the animation period.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CatmullRomSpline.html#clampTime">Online Documentation</a>
     */
    fun clampTime(time: Double): Double

    /**
     * Evaluates the curve at a given time.
     * @param [time] The time at which to evaluate the curve.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new instance of the point on the curve at the given time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CatmullRomSpline.html#evaluate">Online Documentation</a>
     */
    fun evaluate(
        time: Double,
        result: Cartesian3? = definedExternally,
    ): Cartesian3
}

inline fun CatmullRomSpline(
    block: CatmullRomSpline.ConstructorOptions.() -> Unit,
): CatmullRomSpline =
    CatmullRomSpline(options = jso(block))
