// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

/**
 * Determines if a point is inside a triangle.
 * ```
 * // Returns true
 * const p = new Cartesian2(0.25, 0.25);
 * const b = pointInsideTriangle(p,
 *   new Cartesian2(0.0, 0.0),
 *   new Cartesian2(1.0, 0.0),
 *   new Cartesian2(0.0, 1.0));
 * ```
 * @param [point] The point to test.
 * @param [p0] The first point of the triangle.
 * @param [p1] The second point of the triangle.
 * @param [p2] The third point of the triangle.
 * @return `true` if the point is inside the triangle; otherwise, `false`.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#pointInsideTriangle">Online Documentation</a>
 */
external fun pointInsideTriangle(
    point: Cartesian3,
    p0: Cartesian3,
    p1: Cartesian3,
    p2: Cartesian3,
): Boolean
