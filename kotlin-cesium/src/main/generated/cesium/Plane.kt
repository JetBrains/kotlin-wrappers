// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * A plane in Hessian Normal Form defined by
 * ```
 * ax + by + cz + d = 0
 * ```
 * where (a, b, c) is the plane's `normal`, d is the signed
 * `distance` to the plane, and (x, y, z) is any point on
 * the plane.
 * ```
 * // The plane x=0
 * const plane = new Plane(Cartesian3.UNIT_X, 0.0);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Plane.html">Online Documentation</a>
 *
 * @constructor
 * @property [normal] The plane's normal (normalized).
 * @property [distance] The shortest distance from the origin to the plane.  The sign of
 *   `distance` determines which side of the plane the origin
 *   is on.  If `distance` is positive, the origin is in the half-space
 *   in the direction of the normal; if negative, the origin is in the half-space
 *   opposite to the normal; if zero, the plane passes through the origin.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Plane.html">Online Documentation</a>
 */
external class Plane(
    var normal: Cartesian3,
    var distance: Double,
) {


    companion object {
        /**
         * Creates a plane from a normal and a point on the plane.
         * ```
         * const point = Cartesian3.fromDegrees(-72.0, 40.0);
         * const normal = ellipsoid.geodeticSurfaceNormal(point);
         * const tangentPlane = Plane.fromPointNormal(point, normal);
         * ```
         * @param [point] The point on the plane.
         * @param [normal] The plane's normal (normalized).
         * @param [result] The object onto which to store the result.
         * @return A new plane instance or the modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Plane.html#.fromPointNormal">Online Documentation</a>
         */
        fun fromPointNormal(
            point: Cartesian3,
            normal: Cartesian3,
            result: Plane? = definedExternally,
        ): Plane

        /**
         * Creates a plane from the general equation
         * @param [coefficients] The plane's normal (normalized).
         * @param [result] The object onto which to store the result.
         * @return A new plane instance or the modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Plane.html#.fromCartesian4">Online Documentation</a>
         */
        fun fromCartesian4(
            coefficients: Cartesian4,
            result: Plane? = definedExternally,
        ): Plane

        /**
         * Computes the signed shortest distance of a point to a plane.
         * The sign of the distance determines which side of the plane the point
         * is on.  If the distance is positive, the point is in the half-space
         * in the direction of the normal; if negative, the point is in the half-space
         * opposite to the normal; if zero, the plane passes through the point.
         * @param [plane] The plane.
         * @param [point] The point.
         * @return The signed shortest distance of the point to the plane.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Plane.html#.getPointDistance">Online Documentation</a>
         */
        fun getPointDistance(
            plane: Plane,
            point: Cartesian3,
        ): Double

        /**
         * Projects a point onto the plane.
         * @param [plane] The plane to project the point onto
         * @param [point] The point to project onto the plane
         * @param [result] The result point.  If undefined, a new Cartesian3 will be created.
         * @return The modified result parameter or a new Cartesian3 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Plane.html#.projectPointOntoPlane">Online Documentation</a>
         */
        fun projectPointOntoPlane(
            plane: Plane,
            point: Cartesian3,
            result: Cartesian3? = definedExternally,
        ): Cartesian3

        /**
         * Transforms the plane by the given transformation matrix.
         * @param [plane] The plane.
         * @param [transform] The transformation matrix.
         * @param [result] The object into which to store the result.
         * @return The plane transformed by the given transformation matrix.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Plane.html#.transform">Online Documentation</a>
         */
        fun transform(
            plane: Plane,
            transform: Matrix4,
            result: Plane? = definedExternally,
        ): Plane

        /**
         * Duplicates a Plane instance.
         * @param [plane] The plane to duplicate.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Plane instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Plane.html#.clone">Online Documentation</a>
         */
        fun clone(
            plane: Plane,
            result: Plane? = definedExternally,
        ): Plane

        /**
         * Compares the provided Planes by normal and distance and returns
         * `true` if they are equal, `false` otherwise.
         * @param [left] The first plane.
         * @param [right] The second plane.
         * @return `true` if left and right are equal, `false` otherwise.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Plane.html#.equals">Online Documentation</a>
         */
        fun equals(
            left: Plane,
            right: Plane,
        ): Boolean

        /**
         * A constant initialized to the XY plane passing through the origin, with normal in positive Z.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Plane.html#.ORIGIN_XY_PLANE">Online Documentation</a>
         */
        val ORIGIN_XY_PLANE: Plane

        /**
         * A constant initialized to the YZ plane passing through the origin, with normal in positive X.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Plane.html#.ORIGIN_YZ_PLANE">Online Documentation</a>
         */
        val ORIGIN_YZ_PLANE: Plane

        /**
         * A constant initialized to the ZX plane passing through the origin, with normal in positive Y.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Plane.html#.ORIGIN_ZX_PLANE">Online Documentation</a>
         */
        val ORIGIN_ZX_PLANE: Plane
    }
}
