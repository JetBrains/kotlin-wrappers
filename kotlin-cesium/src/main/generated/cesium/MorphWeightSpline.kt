// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.ReadonlyArray
import js.core.jso

/**
 * A spline that linearly interpolates over an array of weight values used by morph targets.
 * ```
 * const times = [ 0.0, 1.5, 3.0, 4.5, 6.0 ];
 * const weights = [0.0, 1.0, 0.25, 0.75, 0.5, 0.5, 0.75, 0.25, 1.0, 0.0]; //Two targets
 * const spline = new WeightSpline({
 *     times : times,
 *     weights : weights
 * });
 *
 * const p0 = spline.evaluate(times[0]);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MorphWeightSpline.html">Online Documentation</a>
 */
external class MorphWeightSpline(options: ConstructorOptions) {
    /**
     * @property [times] An array of strictly increasing, unit-less, floating-point times at each point.
     *   The values are in no way connected to the clock time. They are the parameterization for the curve.
     * @property [weights] The array of floating-point control weights given. The weights are ordered such
     *   that all weights for the targets are given in chronological order and order in which they appear in
     *   the glTF from which the morph targets come. This means for 2 targets, weights = [w(0,0), w(0,1), w(1,0), w(1,1) ...]
     *   where i and j in w(i,j) are the time indices and target indices, respectively.
     */
    interface ConstructorOptions {
        var times: ReadonlyArray<Double>
        var weights: ReadonlyArray<Double>
    }

    /**
     * Finds an index `i` in `times` such that the parameter
     * `time` is in the interval `[times[i], times[i + 1]]`.
     * @param [time] The time.
     * @return The index for the element at the start of the interval.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MorphWeightSpline.html#findTimeInterval">Online Documentation</a>
     */
    fun findTimeInterval(time: Double): Int

    /**
     * Wraps the given time to the period covered by the spline.
     * @param [time] The time.
     * @return The time, wrapped around to the updated animation.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MorphWeightSpline.html#wrapTime">Online Documentation</a>
     */
    fun wrapTime(time: Double): Double

    /**
     * Clamps the given time to the period covered by the spline.
     * @param [time] The time.
     * @return The time, clamped to the animation period.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MorphWeightSpline.html#clampTime">Online Documentation</a>
     */
    fun clampTime(time: Double): Double

    /**
     * Evaluates the curve at a given time.
     * @param [time] The time at which to evaluate the curve.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new instance of the point on the curve at the given time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MorphWeightSpline.html#evaluate">Online Documentation</a>
     */
    fun evaluate(
        time: Double,
        result: ReadonlyArray<Double>? = definedExternally,
    ): ReadonlyArray<Double>
}

inline fun MorphWeightSpline(
    block: MorphWeightSpline.ConstructorOptions.() -> Unit,
): MorphWeightSpline =
    MorphWeightSpline(options = jso(block))
