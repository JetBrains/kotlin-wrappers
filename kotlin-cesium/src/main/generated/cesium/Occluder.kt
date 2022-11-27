// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

import js.core.ReadonlyArray

/**
 * Creates an Occluder derived from an object's position and radius, as well as the camera position.
 * The occluder can be used to determine whether or not other objects are visible or hidden behind the
 * visible horizon defined by the occluder and camera position.
 * ```
 * // Construct an occluder one unit away from the origin with a radius of one.
 * const cameraPosition = Cartesian3.ZERO;
 * const occluderBoundingSphere = new BoundingSphere(new Cartesian3(0, 0, -1), 1);
 * const occluder = new Occluder(occluderBoundingSphere, cameraPosition);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Occluder.html">Online Documentation</a>
 *
 * @constructor
 * @param [occluderBoundingSphere] The bounding sphere surrounding the occluder.
 * @property [cameraPosition] The coordinate of the viewer/camera.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Occluder.html">Online Documentation</a>
 */
external class Occluder(
    occluderBoundingSphere: BoundingSphere,
    var cameraPosition: Cartesian3,
) {
    /**
     * The position of the occluder.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Occluder.html#position">Online Documentation</a>
     */
    var position: Cartesian3

    /**
     * The radius of the occluder.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Occluder.html#radius">Online Documentation</a>
     */
    var radius: Double

    /**
     * Determines whether or not a point, the `occludee`, is hidden from view by the occluder.
     * ```
     * const cameraPosition = new Cartesian3(0, 0, 0);
     * const littleSphere = new BoundingSphere(new Cartesian3(0, 0, -1), 0.25);
     * const occluder = new Occluder(littleSphere, cameraPosition);
     * const point = new Cartesian3(0, 0, -3);
     * occluder.isPointVisible(point); //returns true
     * ```
     * @param [occludee] The point surrounding the occludee object.
     * @return `true` if the occludee is visible; otherwise `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Occluder.html#isPointVisible">Online Documentation</a>
     */
    fun isPointVisible(occludee: Cartesian3): Boolean

    /**
     * Determines whether or not a sphere, the `occludee`, is hidden from view by the occluder.
     * ```
     * const cameraPosition = new Cartesian3(0, 0, 0);
     * const littleSphere = new BoundingSphere(new Cartesian3(0, 0, -1), 0.25);
     * const occluder = new Occluder(littleSphere, cameraPosition);
     * const bigSphere = new BoundingSphere(new Cartesian3(0, 0, -3), 1);
     * occluder.isBoundingSphereVisible(bigSphere); //returns true
     * ```
     * @param [occludee] The bounding sphere surrounding the occludee object.
     * @return `true` if the occludee is visible; otherwise `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Occluder.html#isBoundingSphereVisible">Online Documentation</a>
     */
    fun isBoundingSphereVisible(occludee: BoundingSphere): Boolean

    /**
     * Determine to what extent an occludee is visible (not visible, partially visible,  or fully visible).
     * ```
     * const sphere1 = new BoundingSphere(new Cartesian3(0, 0, -1.5), 0.5);
     * const sphere2 = new BoundingSphere(new Cartesian3(0, 0, -2.5), 0.5);
     * const cameraPosition = new Cartesian3(0, 0, 0);
     * const occluder = new Occluder(sphere1, cameraPosition);
     * occluder.computeVisibility(sphere2); //returns Visibility.NONE
     * ```
     * @param [occludeeBS] The bounding sphere of the occludee.
     * @return Visibility.NONE if the occludee is not visible,
     *   Visibility.PARTIAL if the occludee is partially visible, or
     *   Visibility.FULL if the occludee is fully visible.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Occluder.html#computeVisibility">Online Documentation</a>
     */
    fun computeVisibility(occludeeBS: BoundingSphere): Visibility

    companion object {
        /**
         * Creates an occluder from a bounding sphere and the camera position.
         * @param [occluderBoundingSphere] The bounding sphere surrounding the occluder.
         * @param [cameraPosition] The coordinate of the viewer/camera.
         * @param [result] The object onto which to store the result.
         * @return The occluder derived from an object's position and radius, as well as the camera position.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Occluder.html#.fromBoundingSphere">Online Documentation</a>
         */
        fun fromBoundingSphere(
            occluderBoundingSphere: BoundingSphere,
            cameraPosition: Cartesian3,
            result: Occluder? = definedExternally,
        ): Occluder

        /**
         * Computes a point that can be used as the occludee position to the visibility functions.
         * Use a radius of zero for the occludee radius.  Typically, a user computes a bounding sphere around
         * an object that is used for visibility; however it is also possible to compute a point that if
         * seen/not seen would also indicate if an object is visible/not visible.  This function is better
         * called for objects that do not move relative to the occluder and is large, such as a chunk of
         * terrain.  You are better off not calling this and using the object's bounding sphere for objects
         * such as a satellite or ground vehicle.
         * ```
         * const cameraPosition = new Cartesian3(0, 0, 0);
         * const occluderBoundingSphere = new BoundingSphere(new Cartesian3(0, 0, -8), 2);
         * const occluder = new Occluder(occluderBoundingSphere, cameraPosition);
         * const positions = [new Cartesian3(-0.25, 0, -5.3), new Cartesian3(0.25, 0, -5.3)];
         * const tileOccluderSphere = BoundingSphere.fromPoints(positions);
         * const occludeePosition = tileOccluderSphere.center;
         * const occludeePt = Occluder.computeOccludeePoint(occluderBoundingSphere, occludeePosition, positions);
         * ```
         * @param [occluderBoundingSphere] The bounding sphere surrounding the occluder.
         * @param [occludeePosition] The point where the occludee (bounding sphere of radius 0) is located.
         * @param [positions] List of altitude points on the horizon near the surface of the occluder.
         * @return An object containing two attributes: `occludeePoint` and `valid`
         *   which is a boolean value.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Occluder.html#.computeOccludeePoint">Online Documentation</a>
         */
        fun computeOccludeePoint(
            occluderBoundingSphere: BoundingSphere,
            occludeePosition: Cartesian3,
            positions: ReadonlyArray<Cartesian3>,
        ): Any

        /**
         * Computes a point that can be used as the occludee position to the visibility functions from a rectangle.
         * @param [rectangle] The rectangle used to create a bounding sphere.
         * @param [ellipsoid] The ellipsoid used to determine positions of the rectangle.
         *   Default value - [Ellipsoid.WGS84]
         * @return An object containing two attributes: `occludeePoint` and `valid`
         *   which is a boolean value.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Occluder.html#.computeOccludeePointFromRectangle">Online Documentation</a>
         */
        fun computeOccludeePointFromRectangle(
            rectangle: Rectangle,
            ellipsoid: Ellipsoid? = definedExternally,
        ): Any
    }
}
