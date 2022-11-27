// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package cesium

import js.core.ReadonlyArray

/**
 * The interface for interpolation algorithms.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/InterpolationAlgorithm.html">Online Documentation</a>
 */
external interface InterpolationAlgorithm {


    companion object {
        /**
         * Gets the name of this interpolation algorithm.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/InterpolationAlgorithm.html#.type">Online Documentation</a>
         */
        var type: String

        /**
         * Given the desired degree, returns the number of data points required for interpolation.
         * @param [degree] The desired degree of interpolation.
         * @return The number of required data points needed for the desired degree of interpolation.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/InterpolationAlgorithm.html#.getRequiredDataPoints">Online Documentation</a>
         */
        fun getRequiredDataPoints(degree: Double): Int

        /**
         * Performs zero order interpolation.
         * @param [x] The independent variable for which the dependent variables will be interpolated.
         * @param [xTable] The array of independent variables to use to interpolate.  The values
         *   in this array must be in increasing order and the same value must not occur twice in the array.
         * @param [yTable] The array of dependent variables to use to interpolate.  For a set of three
         *   dependent values (p,q,w) at time 1 and time 2 this should be as follows: {p1, q1, w1, p2, q2, w2}.
         * @param [yStride] The number of dependent variable values in yTable corresponding to
         *   each independent variable value in xTable.
         * @param [result] An existing array into which to store the result.
         * @return The array of interpolated values, or the result parameter if one was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/InterpolationAlgorithm.html#.interpolateOrderZero">Online Documentation</a>
         */
        fun interpolateOrderZero(
            x: Double,
            xTable: ReadonlyArray<Double>,
            yTable: ReadonlyArray<Double>,
            yStride: Double,
            result: ReadonlyArray<Double>? = definedExternally,
        ): ReadonlyArray<Double>

        /**
         * Performs higher order interpolation.  Not all interpolators need to support high-order interpolation,
         * if this function remains undefined on implementing objects, interpolateOrderZero will be used instead.
         * @param [x] The independent variable for which the dependent variables will be interpolated.
         * @param [xTable] The array of independent variables to use to interpolate.  The values
         *   in this array must be in increasing order and the same value must not occur twice in the array.
         * @param [yTable] The array of dependent variables to use to interpolate.  For a set of three
         *   dependent values (p,q,w) at time 1 and time 2 this should be as follows: {p1, q1, w1, p2, q2, w2}.
         * @param [yStride] The number of dependent variable values in yTable corresponding to
         *   each independent variable value in xTable.
         * @param [inputOrder] The number of derivatives supplied for input.
         * @param [outputOrder] The number of derivatives desired for output.
         * @param [result] An existing array into which to store the result.
         * @return The array of interpolated values, or the result parameter if one was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/InterpolationAlgorithm.html#.interpolate">Online Documentation</a>
         */
        fun interpolate(
            x: Double,
            xTable: ReadonlyArray<Double>,
            yTable: ReadonlyArray<Double>,
            yStride: Double,
            inputOrder: Int,
            outputOrder: Int,
            result: ReadonlyArray<Double>? = definedExternally,
        ): ReadonlyArray<Double>
    }
}
