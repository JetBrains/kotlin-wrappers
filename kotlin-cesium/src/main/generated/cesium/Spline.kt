// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

import js.core.ReadonlyArray

/**
 * Creates a curve parameterized and evaluated by time. This type describes an interface
 * and is not intended to be instantiated directly.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Spline.html">Online Documentation</a>
 */
abstract external class Spline {
    /**
     * An array of times for the control points.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Spline.html#times">Online Documentation</a>
     */
    abstract var times: ReadonlyArray<Double>

    /**
     * An array of control points.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Spline.html#points">Online Documentation</a>
     */
    abstract var points: dynamic

    /**
     * Evaluates the curve at a given time.
     * @param [time] The time at which to evaluate the curve.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new instance of the point on the curve at the given time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Spline.html#evaluate">Online Documentation</a>
     */
    abstract fun evaluate(
        time: Double,
        result: dynamic = definedExternally,
    ): dynamic

    /**
     * Finds an index `i` in `times` such that the parameter
     * `time` is in the interval `[times[i], times[i + 1]]`.
     * @param [time] The time.
     * @param [startIndex] The index from which to start the search.
     * @return The index for the element at the start of the interval.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Spline.html#findTimeInterval">Online Documentation</a>
     */
    abstract fun findTimeInterval(
        time: Double,
        startIndex: Int,
    ): Int

    /**
     * Wraps the given time to the period covered by the spline.
     * @param [time] The time.
     * @return The time, wrapped around the animation period.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Spline.html#wrapTime">Online Documentation</a>
     */
    abstract fun wrapTime(time: Double): Double

    /**
     * Clamps the given time to the period covered by the spline.
     * @param [time] The time.
     * @return The time, clamped to the animation period.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Spline.html#clampTime">Online Documentation</a>
     */
    abstract fun clampTime(time: Double): Double
}
