// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

import js.core.ReadonlyArray

/**
 * An [InterpolationAlgorithm] for performing linear interpolation.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LinearApproximation.html">Online Documentation</a>
 */
external object LinearApproximation {
    /**
     * Given the desired degree, returns the number of data points required for interpolation.
     * Since linear interpolation can only generate a first degree polynomial, this function
     * always returns 2.
     * @param [degree] The desired degree of interpolation.
     * @return This function always returns 2.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LinearApproximation.html#.getRequiredDataPoints">Online Documentation</a>
     */
    fun getRequiredDataPoints(degree: Double): Int

    /**
     * Interpolates values using linear approximation.
     * @param [x] The independent variable for which the dependent variables will be interpolated.
     * @param [xTable] The array of independent variables to use to interpolate.  The values
     *   in this array must be in increasing order and the same value must not occur twice in the array.
     * @param [yTable] The array of dependent variables to use to interpolate.  For a set of three
     *   dependent values (p,q,w) at time 1 and time 2 this should be as follows: {p1, q1, w1, p2, q2, w2}.
     * @param [yStride] The number of dependent variable values in yTable corresponding to
     *   each independent variable value in xTable.
     * @param [result] An existing array into which to store the result.
     * @return The array of interpolated values, or the result parameter if one was provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LinearApproximation.html#.interpolateOrderZero">Online Documentation</a>
     */
    fun interpolateOrderZero(
        x: Double,
        xTable: ReadonlyArray<Double>,
        yTable: ReadonlyArray<Double>,
        yStride: Double,
        result: ReadonlyArray<Double>? = definedExternally,
    ): ReadonlyArray<Double>
}
