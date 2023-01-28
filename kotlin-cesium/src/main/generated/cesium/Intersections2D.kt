// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

import js.core.ReadonlyArray

/**
 * Contains functions for operating on 2D triangles.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Intersections2D.html">Online Documentation</a>
 */
external object Intersections2D {
    /**
     * Splits a 2D triangle at given axis-aligned threshold value and returns the resulting
     * polygon on a given side of the threshold.  The resulting polygon may have 0, 1, 2,
     * 3, or 4 vertices.
     * ```
     * const result = Intersections2D.clipTriangleAtAxisAlignedThreshold(0.5, false, 0.2, 0.6, 0.4);
     * // result === [2, 0, -1, 1, 0, 0.25, -1, 1, 2, 0.5]
     * ```
     * @param [threshold] The threshold coordinate value at which to clip the triangle.
     * @param [keepAbove] true to keep the portion of the triangle above the threshold, or false
     *   to keep the portion below.
     * @param [u0] The coordinate of the first vertex in the triangle, in counter-clockwise order.
     * @param [u1] The coordinate of the second vertex in the triangle, in counter-clockwise order.
     * @param [u2] The coordinate of the third vertex in the triangle, in counter-clockwise order.
     * @param [result] The array into which to copy the result.  If this parameter is not supplied,
     *   a new array is constructed and returned.
     * @return The polygon that results after the clip, specified as a list of
     *   vertices.  The vertices are specified in counter-clockwise order.
     *   Each vertex is either an index from the existing list (identified as
     *   a 0, 1, or 2) or -1 indicating a new vertex not in the original triangle.
     *   For new vertices, the -1 is followed by three additional numbers: the
     *   index of each of the two original vertices forming the line segment that
     *   the new vertex lies on, and the fraction of the distance from the first
     *   vertex to the second one.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Intersections2D.html#.clipTriangleAtAxisAlignedThreshold">Online Documentation</a>
     */
    fun clipTriangleAtAxisAlignedThreshold(
        threshold: Double,
        keepAbove: Boolean,
        u0: Double,
        u1: Double,
        u2: Double,
        result: ReadonlyArray<Double>? = definedExternally,
    ): ReadonlyArray<Double>

    /**
     * Compute the barycentric coordinates of a 2D position within a 2D triangle.
     * ```
     * const result = Intersections2D.computeBarycentricCoordinates(0.0, 0.0, 0.0, 1.0, -1, -0.5, 1, -0.5);
     * // result === new Cartesian3(1.0 / 3.0, 1.0 / 3.0, 1.0 / 3.0);
     * ```
     * @param [x] The x coordinate of the position for which to find the barycentric coordinates.
     * @param [y] The y coordinate of the position for which to find the barycentric coordinates.
     * @param [x1] The x coordinate of the triangle's first vertex.
     * @param [y1] The y coordinate of the triangle's first vertex.
     * @param [x2] The x coordinate of the triangle's second vertex.
     * @param [y2] The y coordinate of the triangle's second vertex.
     * @param [x3] The x coordinate of the triangle's third vertex.
     * @param [y3] The y coordinate of the triangle's third vertex.
     * @param [result] The instance into to which to copy the result.  If this parameter
     *   is undefined, a new instance is created and returned.
     * @return The barycentric coordinates of the position within the triangle.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Intersections2D.html#.computeBarycentricCoordinates">Online Documentation</a>
     */
    fun computeBarycentricCoordinates(
        x: Double,
        y: Double,
        x1: Double,
        y1: Double,
        x2: Double,
        y2: Double,
        x3: Double,
        y3: Double,
        result: Cartesian3? = definedExternally,
    ): Cartesian3

    /**
     * Compute the intersection between 2 line segments
     * ```
     * const result = Intersections2D.computeLineSegmentLineSegmentIntersection(0.0, 0.0, 0.0, 2.0, -1, 1, 1, 1);
     * // result === new Cartesian2(0.0, 1.0);
     * ```
     * @param [x00] The x coordinate of the first line's first vertex.
     * @param [y00] The y coordinate of the first line's first vertex.
     * @param [x01] The x coordinate of the first line's second vertex.
     * @param [y01] The y coordinate of the first line's second vertex.
     * @param [x10] The x coordinate of the second line's first vertex.
     * @param [y10] The y coordinate of the second line's first vertex.
     * @param [x11] The x coordinate of the second line's second vertex.
     * @param [y11] The y coordinate of the second line's second vertex.
     * @param [result] The instance into to which to copy the result. If this parameter
     *   is undefined, a new instance is created and returned.
     * @return The intersection point, undefined if there is no intersection point or lines are coincident.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Intersections2D.html#.computeLineSegmentLineSegmentIntersection">Online Documentation</a>
     */
    fun computeLineSegmentLineSegmentIntersection(
        x00: Double,
        y00: Double,
        x01: Double,
        y01: Double,
        x10: Double,
        y10: Double,
        x11: Double,
        y11: Double,
        result: Cartesian2? = definedExternally,
    ): Cartesian2
}
