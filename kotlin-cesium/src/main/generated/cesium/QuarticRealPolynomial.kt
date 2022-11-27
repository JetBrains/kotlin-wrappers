// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

import js.core.ReadonlyArray

/**
 * Defines functions for 4th order polynomial functions of one variable with only real coefficients.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/QuarticRealPolynomial.html">Online Documentation</a>
 */
external object QuarticRealPolynomial {
    /**
     * Provides the discriminant of the quartic equation from the supplied coefficients.
     * @param [a] The coefficient of the 4th order monomial.
     * @param [b] The coefficient of the 3rd order monomial.
     * @param [c] The coefficient of the 2nd order monomial.
     * @param [d] The coefficient of the 1st order monomial.
     * @param [e] The coefficient of the 0th order monomial.
     * @return The value of the discriminant.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/QuarticRealPolynomial.html#.computeDiscriminant">Online Documentation</a>
     */
    fun computeDiscriminant(
        a: Double,
        b: Double,
        c: Double,
        d: Double,
        e: Double,
    ): Double

    /**
     * Provides the real valued roots of the quartic polynomial with the provided coefficients.
     * @param [a] The coefficient of the 4th order monomial.
     * @param [b] The coefficient of the 3rd order monomial.
     * @param [c] The coefficient of the 2nd order monomial.
     * @param [d] The coefficient of the 1st order monomial.
     * @param [e] The coefficient of the 0th order monomial.
     * @return The real valued roots.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/QuarticRealPolynomial.html#.computeRealRoots">Online Documentation</a>
     */
    fun computeRealRoots(
        a: Double,
        b: Double,
        c: Double,
        d: Double,
        e: Double,
    ): ReadonlyArray<Double>
}
