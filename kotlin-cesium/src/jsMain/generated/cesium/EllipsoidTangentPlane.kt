// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

import js.core.ReadonlyArray

/**
 * A plane tangent to the provided ellipsoid at the provided origin.
 * If origin is not on the surface of the ellipsoid, it's surface projection will be used.
 * If origin is at the center of the ellipsoid, an exception will be thrown.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidTangentPlane.html">Online Documentation</a>
 *
 * @constructor
 * @property [origin] The point on the surface of the ellipsoid where the tangent plane touches.
 * @property [ellipsoid] The ellipsoid to use.
 *   Default value - [Ellipsoid.WGS84]
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidTangentPlane.html">Online Documentation</a>
 */
external class EllipsoidTangentPlane(
    var origin: Cartesian3,
    var ellipsoid: Ellipsoid = definedExternally,
) {
    /**
     * Gets the plane which is tangent to the ellipsoid.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidTangentPlane.html#plane">Online Documentation</a>
     */
    val plane: Plane

    /**
     * Gets the local X-axis (east) of the tangent plane.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidTangentPlane.html#xAxis">Online Documentation</a>
     */
    val xAxis: Cartesian3

    /**
     * Gets the local Y-axis (north) of the tangent plane.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidTangentPlane.html#yAxis">Online Documentation</a>
     */
    val yAxis: Cartesian3

    /**
     * Gets the local Z-axis (up) of the tangent plane.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidTangentPlane.html#zAxis">Online Documentation</a>
     */
    val zAxis: Cartesian3

    /**
     * Computes the projection of the provided 3D position onto the 2D plane, radially outward from the [EllipsoidTangentPlane.ellipsoid] coordinate system origin.
     * @param [cartesian] The point to project.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new Cartesian2 instance if none was provided. Undefined if there is no intersection point
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidTangentPlane.html#projectPointOntoPlane">Online Documentation</a>
     */
    fun projectPointOntoPlane(
        cartesian: Cartesian3,
        result: Cartesian2? = definedExternally,
    ): Cartesian2

    /**
     * Computes the projection of the provided 3D positions onto the 2D plane (where possible), radially outward from the global origin.
     * The resulting array may be shorter than the input array - if a single projection is impossible it will not be included.
     * @param [cartesians] The array of points to project.
     * @param [result] The array of Cartesian2 instances onto which to store results.
     * @return The modified result parameter or a new array of Cartesian2 instances if none was provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidTangentPlane.html#projectPointsOntoPlane">Online Documentation</a>
     */
    fun projectPointsOntoPlane(
        cartesians: ReadonlyArray<Cartesian3>,
        result: ReadonlyArray<Cartesian2>? = definedExternally,
    ): ReadonlyArray<Cartesian2>

    /**
     * Computes the projection of the provided 3D position onto the 2D plane, along the plane normal.
     * @param [cartesian] The point to project.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new Cartesian2 instance if none was provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidTangentPlane.html#projectPointToNearestOnPlane">Online Documentation</a>
     */
    fun projectPointToNearestOnPlane(
        cartesian: Cartesian3,
        result: Cartesian2? = definedExternally,
    ): Cartesian2

    /**
     * Computes the projection of the provided 3D positions onto the 2D plane, along the plane normal.
     * @param [cartesians] The array of points to project.
     * @param [result] The array of Cartesian2 instances onto which to store results.
     * @return The modified result parameter or a new array of Cartesian2 instances if none was provided. This will have the same length as `cartesians`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidTangentPlane.html#projectPointsToNearestOnPlane">Online Documentation</a>
     */
    fun projectPointsToNearestOnPlane(
        cartesians: ReadonlyArray<Cartesian3>,
        result: ReadonlyArray<Cartesian2>? = definedExternally,
    ): ReadonlyArray<Cartesian2>

    /**
     * Computes the projection of the provided 2D position onto the 3D ellipsoid.
     * @param [cartesian] The points to project.
     * @param [result] The Cartesian3 instance to store result.
     * @return The modified result parameter or a new Cartesian3 instance if none was provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidTangentPlane.html#projectPointOntoEllipsoid">Online Documentation</a>
     */
    fun projectPointOntoEllipsoid(
        cartesian: Cartesian2,
        result: Cartesian3? = definedExternally,
    ): Cartesian3

    /**
     * Computes the projection of the provided 2D positions onto the 3D ellipsoid.
     * @param [cartesians] The array of points to project.
     * @param [result] The array of Cartesian3 instances onto which to store results.
     * @return The modified result parameter or a new array of Cartesian3 instances if none was provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidTangentPlane.html#projectPointsOntoEllipsoid">Online Documentation</a>
     */
    fun projectPointsOntoEllipsoid(
        cartesians: ReadonlyArray<Cartesian2>,
        result: ReadonlyArray<Cartesian3>? = definedExternally,
    ): ReadonlyArray<Cartesian3>

    companion object {
        /**
         * Creates a new instance from the provided ellipsoid and the center
         * point of the provided Cartesians.
         * @param [cartesians] The list of positions surrounding the center point.
         * @param [ellipsoid] The ellipsoid to use.
         *   Default value - [Ellipsoid.WGS84]
         * @return The new instance of EllipsoidTangentPlane.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidTangentPlane.html#.fromPoints">Online Documentation</a>
         */
        fun fromPoints(
            cartesians: ReadonlyArray<Cartesian3>,
            ellipsoid: Ellipsoid? = definedExternally,
        ): EllipsoidTangentPlane
    }
}
