// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

import kotlinx.js.ReadonlyArray

/**
 * Uses the Tridiagonal Matrix Algorithm, also known as the Thomas Algorithm, to solve
 * a system of linear equations where the coefficient matrix is a tridiagonal matrix.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TridiagonalSystemSolver.html">Online Documentation</a>
 */
external object TridiagonalSystemSolver {
    /**
     * Solves a tridiagonal system of linear equations.
     * ```
     * const lowerDiagonal = [1.0, 1.0, 1.0, 1.0];
     * const diagonal = [2.0, 4.0, 4.0, 4.0, 2.0];
     * const upperDiagonal = [1.0, 1.0, 1.0, 1.0];
     * const rightHandSide = [
     *     new Cartesian3(410757.0, -1595711.0, 1375302.0),
     *     new Cartesian3(-5986705.0, -2190640.0, 1099600.0),
     *     new Cartesian3(-12593180.0, 288588.0, -1755549.0),
     *     new Cartesian3(-5349898.0, 2457005.0, -2685438.0),
     *     new Cartesian3(845820.0, 1573488.0, -1205591.0)
     * ];
     *
     * const solution = TridiagonalSystemSolver.solve(lowerDiagonal, diagonal, upperDiagonal, rightHandSide);
     * ```
     * @param [diagonal] An array with length `n` that contains the diagonal of the coefficient matrix.
     * @param [lower] An array with length `n - 1` that contains the lower diagonal of the coefficient matrix.
     * @param [upper] An array with length `n - 1` that contains the upper diagonal of the coefficient matrix.
     * @param [right] An array of Cartesians with length `n` that is the right side of the system of equations.
     * @return An array of Cartesians with length `n` that is the solution to the tridiagonal system of equations.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TridiagonalSystemSolver.html#.solve">Online Documentation</a>
     */
    fun solve(
        diagonal: ReadonlyArray<Double>,
        lower: ReadonlyArray<Double>,
        upper: ReadonlyArray<Double>,
        right: ReadonlyArray<Cartesian3>,
    ): ReadonlyArray<Cartesian3>
}
