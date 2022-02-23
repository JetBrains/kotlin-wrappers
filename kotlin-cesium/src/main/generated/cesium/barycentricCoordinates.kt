// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * Computes the barycentric coordinates for a point with respect to a triangle.
 * ```
 * // Returns Cartesian3.UNIT_X
 * const p = new Cartesian3(-1.0, 0.0, 0.0);
 * const b = barycentricCoordinates(p,
 *   new Cartesian3(-1.0, 0.0, 0.0),
 *   new Cartesian3( 1.0, 0.0, 0.0),
 *   new Cartesian3( 0.0, 1.0, 1.0));
 * ```
 * @param [point] The point to test.
 * @param [p0] The first point of the triangle, corresponding to the barycentric x-axis.
 * @param [p1] The second point of the triangle, corresponding to the barycentric y-axis.
 * @param [p2] The third point of the triangle, corresponding to the barycentric z-axis.
 * @param [result] The object onto which to store the result.
 * @return The modified result parameter or a new Cartesian3 instance if one was not provided. If the triangle is degenerate the function will return undefined.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/barycentricCoordinates.html">Online Documentation</a>
 */
external fun barycentricCoordinates(
    point: Cartesian3,
    p0: Cartesian3,
    p1: Cartesian3,
    p2: Cartesian3,
    result: Cartesian3? = definedExternally,
): Cartesian3?
