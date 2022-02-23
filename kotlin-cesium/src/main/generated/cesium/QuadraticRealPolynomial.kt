// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * Defines functions for 2nd order polynomial functions of one variable with only real coefficients.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/QuadraticRealPolynomial.html">Online Documentation</a>
 */
external object QuadraticRealPolynomial {
    /**
     * Provides the discriminant of the quadratic equation from the supplied coefficients.
     * @param [a] The coefficient of the 2nd order monomial.
     * @param [b] The coefficient of the 1st order monomial.
     * @param [c] The coefficient of the 0th order monomial.
     * @return The value of the discriminant.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/QuadraticRealPolynomial.html#.computeDiscriminant">Online Documentation</a>
     */
    fun computeDiscriminant(
        a: Double,
        b: Double,
        c: Double,
    ): Double

    /**
     * Provides the real valued roots of the quadratic polynomial with the provided coefficients.
     * @param [a] The coefficient of the 2nd order monomial.
     * @param [b] The coefficient of the 1st order monomial.
     * @param [c] The coefficient of the 0th order monomial.
     * @return The real valued roots.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/QuadraticRealPolynomial.html#.computeRealRoots">Online Documentation</a>
     */
    fun computeRealRoots(
        a: Double,
        b: Double,
        c: Double,
    ): Array<out Double>
}
