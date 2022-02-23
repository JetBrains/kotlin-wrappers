// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * Functions for computing the intersection between geometries such as rays, planes, triangles, and ellipsoids.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IntersectionTests.html">Online Documentation</a>
 */
external object IntersectionTests {
    /**
     * Computes the intersection of a ray and a plane.
     * @param [ray] The ray.
     * @param [plane] The plane.
     * @param [result] The object onto which to store the result.
     * @return The intersection point or undefined if there is no intersections.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IntersectionTests.html#.rayPlane">Online Documentation</a>
     */
    fun rayPlane(
        ray: Ray,
        plane: Plane,
        result: Cartesian3? = definedExternally,
    ): Cartesian3

    /**
     * Computes the intersection of a ray and a triangle as a parametric distance along the input ray. The result is negative when the triangle is behind the ray.
     *
     * Implements [Fast Minimum Storage Ray/Triangle Intersection](https://cadxfem.org/inf/Fast%20MinimumStorage%20RayTriangle%20Intersection.pdf) by Tomas Moller and Ben Trumbore.
     * @param [ray] The ray.
     * @param [p0] The first vertex of the triangle.
     * @param [p1] The second vertex of the triangle.
     * @param [p2] The third vertex of the triangle.
     * @param [cullBackFaces] If `true`, will only compute an intersection with the front face of the triangle
     *   and return undefined for intersections with the back face.
     *   Default value - `false`
     * @return The intersection as a parametric distance along the ray, or undefined if there is no intersection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IntersectionTests.html#.rayTriangleParametric">Online Documentation</a>
     */
    fun rayTriangleParametric(
        ray: Ray,
        p0: Cartesian3,
        p1: Cartesian3,
        p2: Cartesian3,
        cullBackFaces: Boolean? = definedExternally,
    ): Double

    /**
     * Computes the intersection of a ray and a triangle as a Cartesian3 coordinate.
     *
     * Implements [Fast Minimum Storage Ray/Triangle Intersection](https://cadxfem.org/inf/Fast%20MinimumStorage%20RayTriangle%20Intersection.pdf) by Tomas Moller and Ben Trumbore.
     * @param [ray] The ray.
     * @param [p0] The first vertex of the triangle.
     * @param [p1] The second vertex of the triangle.
     * @param [p2] The third vertex of the triangle.
     * @param [cullBackFaces] If `true`, will only compute an intersection with the front face of the triangle
     *   and return undefined for intersections with the back face.
     *   Default value - `false`
     * @param [result] The `Cartesian3` onto which to store the result.
     * @return The intersection point or undefined if there is no intersections.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IntersectionTests.html#.rayTriangle">Online Documentation</a>
     */
    fun rayTriangle(
        ray: Ray,
        p0: Cartesian3,
        p1: Cartesian3,
        p2: Cartesian3,
        cullBackFaces: Boolean? = definedExternally,
        result: Cartesian3? = definedExternally,
    ): Cartesian3

    /**
     * Computes the intersection of a line segment and a triangle.
     * @param [v0] The an end point of the line segment.
     * @param [v1] The other end point of the line segment.
     * @param [p0] The first vertex of the triangle.
     * @param [p1] The second vertex of the triangle.
     * @param [p2] The third vertex of the triangle.
     * @param [cullBackFaces] If `true`, will only compute an intersection with the front face of the triangle
     *   and return undefined for intersections with the back face.
     *   Default value - `false`
     * @param [result] The `Cartesian3` onto which to store the result.
     * @return The intersection point or undefined if there is no intersections.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IntersectionTests.html#.lineSegmentTriangle">Online Documentation</a>
     */
    fun lineSegmentTriangle(
        v0: Cartesian3,
        v1: Cartesian3,
        p0: Cartesian3,
        p1: Cartesian3,
        p2: Cartesian3,
        cullBackFaces: Boolean? = definedExternally,
        result: Cartesian3? = definedExternally,
    ): Cartesian3

    /**
     * Computes the intersection points of a ray with a sphere.
     * @param [ray] The ray.
     * @param [sphere] The sphere.
     * @param [result] The result onto which to store the result.
     * @return The interval containing scalar points along the ray or undefined if there are no intersections.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IntersectionTests.html#.raySphere">Online Documentation</a>
     */
    fun raySphere(
        ray: Ray,
        sphere: BoundingSphere,
        result: Interval? = definedExternally,
    ): Interval

    /**
     * Computes the intersection points of a line segment with a sphere.
     * @param [p0] An end point of the line segment.
     * @param [p1] The other end point of the line segment.
     * @param [sphere] The sphere.
     * @param [result] The result onto which to store the result.
     * @return The interval containing scalar points along the ray or undefined if there are no intersections.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IntersectionTests.html#.lineSegmentSphere">Online Documentation</a>
     */
    fun lineSegmentSphere(
        p0: Cartesian3,
        p1: Cartesian3,
        sphere: BoundingSphere,
        result: Interval? = definedExternally,
    ): Interval

    /**
     * Computes the intersection points of a ray with an ellipsoid.
     * @param [ray] The ray.
     * @param [ellipsoid] The ellipsoid.
     * @return The interval containing scalar points along the ray or undefined if there are no intersections.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IntersectionTests.html#.rayEllipsoid">Online Documentation</a>
     */
    fun rayEllipsoid(
        ray: Ray,
        ellipsoid: Ellipsoid,
    ): Interval

    /**
     * Provides the point along the ray which is nearest to the ellipsoid.
     * @param [ray] The ray.
     * @param [ellipsoid] The ellipsoid.
     * @return The nearest planetodetic point on the ray.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IntersectionTests.html#.grazingAltitudeLocation">Online Documentation</a>
     */
    fun grazingAltitudeLocation(
        ray: Ray,
        ellipsoid: Ellipsoid,
    ): Cartesian3

    /**
     * Computes the intersection of a line segment and a plane.
     * ```
     * const origin = Cartesian3.fromDegrees(-75.59777, 40.03883);
     * const normal = ellipsoid.geodeticSurfaceNormal(origin);
     * const plane = Plane.fromPointNormal(origin, normal);
     *
     * const p0 = new Cartesian3(...);
     * const p1 = new Cartesian3(...);
     *
     * // find the intersection of the line segment from p0 to p1 and the tangent plane at origin.
     * const intersection = IntersectionTests.lineSegmentPlane(p0, p1, plane);
     * ```
     * @param [endPoint0] An end point of the line segment.
     * @param [endPoint1] The other end point of the line segment.
     * @param [plane] The plane.
     * @param [result] The object onto which to store the result.
     * @return The intersection point or undefined if there is no intersection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IntersectionTests.html#.lineSegmentPlane">Online Documentation</a>
     */
    fun lineSegmentPlane(
        endPoint0: Cartesian3,
        endPoint1: Cartesian3,
        plane: Plane,
        result: Cartesian3? = definedExternally,
    ): Cartesian3

    /**
     * Computes the intersection of a triangle and a plane
     * ```
     * const origin = Cartesian3.fromDegrees(-75.59777, 40.03883);
     * const normal = ellipsoid.geodeticSurfaceNormal(origin);
     * const plane = Plane.fromPointNormal(origin, normal);
     *
     * const p0 = new Cartesian3(...);
     * const p1 = new Cartesian3(...);
     * const p2 = new Cartesian3(...);
     *
     * // convert the triangle composed of points (p0, p1, p2) to three triangles that don't cross the plane
     * const triangles = IntersectionTests.trianglePlaneIntersection(p0, p1, p2, plane);
     * ```
     * @param [p0] First point of the triangle
     * @param [p1] Second point of the triangle
     * @param [p2] Third point of the triangle
     * @param [plane] Intersection plane
     * @return An object with properties `positions` and `indices`, which are arrays that represent three triangles that do not cross the plane. (Undefined if no intersection exists)
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IntersectionTests.html#.trianglePlaneIntersection">Online Documentation</a>
     */
    fun trianglePlaneIntersection(
        p0: Cartesian3,
        p1: Cartesian3,
        p2: Cartesian3,
        plane: Plane,
    ): Any
}
