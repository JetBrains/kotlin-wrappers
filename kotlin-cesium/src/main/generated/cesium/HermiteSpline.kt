// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.ReadonlyArray

/**
 * A Hermite spline is a cubic interpolating spline. Points, incoming tangents, outgoing tangents, and times
 * must be defined for each control point. The outgoing tangents are defined for points [0, n - 2] and the incoming
 * tangents are defined for points [1, n - 1]. For example, when interpolating a segment of the curve between `points[i]` and
 * `points[i + 1]`, the tangents at the points will be `outTangents[i]` and `inTangents[i]`,
 * respectively.
 * ```
 * // Create a G<sup>1</sup> continuous Hermite spline
 * const times = [ 0.0, 1.5, 3.0, 4.5, 6.0 ];
 * const spline = new HermiteSpline({
 *     times : times,
 *     points : [
 *         new Cartesian3(1235398.0, -4810983.0, 4146266.0),
 *         new Cartesian3(1372574.0, -5345182.0, 4606657.0),
 *         new Cartesian3(-757983.0, -5542796.0, 4514323.0),
 *         new Cartesian3(-2821260.0, -5248423.0, 4021290.0),
 *         new Cartesian3(-2539788.0, -4724797.0, 3620093.0)
 *     ],
 *     outTangents : [
 *         new Cartesian3(1125196, -161816, 270551),
 *         new Cartesian3(-996690.5, -365906.5, 184028.5),
 *         new Cartesian3(-2096917, 48379.5, -292683.5),
 *         new Cartesian3(-890902.5, 408999.5, -447115)
 *     ],
 *     inTangents : [
 *         new Cartesian3(-1993381, -731813, 368057),
 *         new Cartesian3(-4193834, 96759, -585367),
 *         new Cartesian3(-1781805, 817999, -894230),
 *         new Cartesian3(1165345, 112641, 47281)
 *     ]
 * });
 *
 * const p0 = spline.evaluate(times[0]);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HermiteSpline.html">Online Documentation</a>
 */
external class HermiteSpline(options: ConstructorOptions) {
    /**
     * @property [times] An array of strictly increasing, unit-less, floating-point times at each point.
     *   The values are in no way connected to the clock time. They are the parameterization for the curve.
     * @property [points] The array of control points.
     * @property [inTangents] The array of incoming tangents at each control point.
     * @property [outTangents] The array of outgoing tangents at each control point.
     */
    interface ConstructorOptions {
        var times: ReadonlyArray<Double>
        var points: ReadonlyArray<Cartesian3>
        var inTangents: ReadonlyArray<Cartesian3>
        var outTangents: ReadonlyArray<Cartesian3>
    }

    /**
     * An array of times for the control points.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HermiteSpline.html#times">Online Documentation</a>
     */
    val times: ReadonlyArray<Double>

    /**
     * An array of control points.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HermiteSpline.html#points">Online Documentation</a>
     */
    val points: ReadonlyArray<Cartesian3>

    /**
     * An array of incoming tangents at each control point.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HermiteSpline.html#inTangents">Online Documentation</a>
     */
    val inTangents: ReadonlyArray<Cartesian3>

    /**
     * An array of outgoing tangents at each control point.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HermiteSpline.html#outTangents">Online Documentation</a>
     */
    val outTangents: ReadonlyArray<Cartesian3>

    /**
     * Finds an index `i` in `times` such that the parameter
     * `time` is in the interval `[times[i], times[i + 1]]`.
     * @param [time] The time.
     * @return The index for the element at the start of the interval.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HermiteSpline.html#findTimeInterval">Online Documentation</a>
     */
    fun findTimeInterval(time: Double): Int

    /**
     * Wraps the given time to the period covered by the spline.
     * @param [time] The time.
     * @return The time, wrapped around to the updated animation.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HermiteSpline.html#wrapTime">Online Documentation</a>
     */
    fun wrapTime(time: Double): Double

    /**
     * Clamps the given time to the period covered by the spline.
     * @param [time] The time.
     * @return The time, clamped to the animation period.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HermiteSpline.html#clampTime">Online Documentation</a>
     */
    fun clampTime(time: Double): Double

    /**
     * Evaluates the curve at a given time.
     * @param [time] The time at which to evaluate the curve.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new instance of the point on the curve at the given time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HermiteSpline.html#evaluate">Online Documentation</a>
     */
    fun evaluate(
        time: Double,
        result: Cartesian3? = definedExternally,
    ): Cartesian3

    companion object {
        /**
         * Creates a spline where the tangents at each control point are the same.
         * The curves are guaranteed to be at least in the class C<sup>1</sup>.
         * ```
         * const points = [
         *     new Cartesian3(1235398.0, -4810983.0, 4146266.0),
         *     new Cartesian3(1372574.0, -5345182.0, 4606657.0),
         *     new Cartesian3(-757983.0, -5542796.0, 4514323.0),
         *     new Cartesian3(-2821260.0, -5248423.0, 4021290.0),
         *     new Cartesian3(-2539788.0, -4724797.0, 3620093.0)
         * ];
         *
         * // Add tangents
         * const tangents = new Array(points.length);
         * tangents[0] = new Cartesian3(1125196, -161816, 270551);
         * const temp = new Cartesian3();
         * for (let i = 1; i < tangents.length - 1; ++i) {
         *     tangents[i] = Cartesian3.multiplyByScalar(Cartesian3.subtract(points[i + 1], points[i - 1], temp), 0.5, new Cartesian3());
         * }
         * tangents[tangents.length - 1] = new Cartesian3(1165345, 112641, 47281);
         *
         * const spline = HermiteSpline.createC1({
         *     times : times,
         *     points : points,
         *     tangents : tangents
         * });
         * ```
         * @return A hermite spline.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HermiteSpline.html#.createC1">Online Documentation</a>
         */
        fun createC1(options: CreateC1Options): HermiteSpline

        /**
         * @property [times] The array of control point times.
         * @property [points] The array of control points.
         * @property [tangents] The array of tangents at the control points.
         */
        interface CreateC1Options {
            var times: ReadonlyArray<Double>
            var points: ReadonlyArray<Cartesian3>
            var tangents: ReadonlyArray<Cartesian3>
        }

        /**
         * Creates a natural cubic spline. The tangents at the control points are generated
         * to create a curve in the class C<sup>2</sup>.
         * ```
         * // Create a natural cubic spline above the earth from Philadelphia to Los Angeles.
         * const spline = HermiteSpline.createNaturalCubic({
         *     times : [ 0.0, 1.5, 3.0, 4.5, 6.0 ],
         *     points : [
         *         new Cartesian3(1235398.0, -4810983.0, 4146266.0),
         *         new Cartesian3(1372574.0, -5345182.0, 4606657.0),
         *         new Cartesian3(-757983.0, -5542796.0, 4514323.0),
         *         new Cartesian3(-2821260.0, -5248423.0, 4021290.0),
         *         new Cartesian3(-2539788.0, -4724797.0, 3620093.0)
         *     ]
         * });
         * ```
         * @return A hermite spline, or a linear spline if less than 3 control points were given.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HermiteSpline.html#.createNaturalCubic">Online Documentation</a>
         */
        fun createNaturalCubic(options: CreateNaturalCubicOptions): dynamic

        /**
         * @property [times] The array of control point times.
         * @property [points] The array of control points.
         */
        interface CreateNaturalCubicOptions {
            var times: ReadonlyArray<Double>
            var points: ReadonlyArray<Cartesian3>
        }

        /**
         * Creates a clamped cubic spline. The tangents at the interior control points are generated
         * to create a curve in the class C<sup>2</sup>.
         * ```
         * // Create a clamped cubic spline above the earth from Philadelphia to Los Angeles.
         * const spline = HermiteSpline.createClampedCubic({
         *     times : [ 0.0, 1.5, 3.0, 4.5, 6.0 ],
         *     points : [
         *         new Cartesian3(1235398.0, -4810983.0, 4146266.0),
         *         new Cartesian3(1372574.0, -5345182.0, 4606657.0),
         *         new Cartesian3(-757983.0, -5542796.0, 4514323.0),
         *         new Cartesian3(-2821260.0, -5248423.0, 4021290.0),
         *         new Cartesian3(-2539788.0, -4724797.0, 3620093.0)
         *     ],
         *     firstTangent : new Cartesian3(1125196, -161816, 270551),
         *     lastTangent : new Cartesian3(1165345, 112641, 47281)
         * });
         * ```
         * @return A hermite spline, or a linear spline if less than 3 control points were given.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HermiteSpline.html#.createClampedCubic">Online Documentation</a>
         */
        fun createClampedCubic(options: CreateClampedCubicOptions): dynamic

        /**
         * @property [times] The array of control point times.
         * @property [points] The array of control points.
         * @property [firstTangent] The outgoing tangent of the first control point.
         * @property [lastTangent] The incoming tangent of the last control point.
         */
        interface CreateClampedCubicOptions {
            var times: ReadonlyArray<Double>
            var points: ReadonlyArray<Cartesian3 /* or number */>
            var firstTangent: Cartesian3
            var lastTangent: Cartesian3
        }
    }
}

inline fun HermiteSpline(
    block: HermiteSpline.ConstructorOptions.() -> Unit,
): HermiteSpline {
    val options: HermiteSpline.ConstructorOptions = js("({})")
    block(options)
    return HermiteSpline(options)
}
