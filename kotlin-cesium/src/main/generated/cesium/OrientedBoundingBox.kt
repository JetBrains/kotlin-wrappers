// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

import js.core.ReadonlyArray

/**
 * Creates an instance of an OrientedBoundingBox.
 * An OrientedBoundingBox of some object is a closed and convex cuboid. It can provide a tighter bounding volume than [BoundingSphere] or [AxisAlignedBoundingBox] in many cases.
 * ```
 * // Create an OrientedBoundingBox using a transformation matrix, a position where the box will be translated, and a scale.
 * const center = new Cartesian3(1.0, 0.0, 0.0);
 * const halfAxes = Matrix3.fromScale(new Cartesian3(1.0, 3.0, 2.0), new Matrix3());
 *
 * const obb = new OrientedBoundingBox(center, halfAxes);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrientedBoundingBox.html">Online Documentation</a>
 *
 * @constructor
 * @property [center] The center of the box.
 *   Default value - [Cartesian3.ZERO]
 * @property [halfAxes] The three orthogonal half-axes of the bounding box.
 *   Equivalently, the transformation matrix, to rotate and scale a 0x0x0
 *   cube centered at the origin.
 *   Default value - [Matrix3.ZERO]
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrientedBoundingBox.html">Online Documentation</a>
 */
external class OrientedBoundingBox(
    var center: Cartesian3 = definedExternally,
    var halfAxes: Matrix3 = definedExternally,
) {
    /**
     * Determines which side of a plane the oriented bounding box is located.
     * @param [plane] The plane to test against.
     * @return [Intersect.INSIDE] if the entire box is on the side of the plane
     *   the normal is pointing, [Intersect.OUTSIDE] if the entire box is
     *   on the opposite side, and [Intersect.INTERSECTING] if the box
     *   intersects the plane.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrientedBoundingBox.html#intersectPlane">Online Documentation</a>
     */
    fun intersectPlane(plane: Plane): Intersect

    /**
     * Computes the estimated distance squared from the closest point on a bounding box to a point.
     * ```
     * // Sort bounding boxes from back to front
     * boxes.sort(function(a, b) {
     *     return b.distanceSquaredTo(camera.positionWC) - a.distanceSquaredTo(camera.positionWC);
     * });
     * ```
     * @param [cartesian] The point
     * @return The estimated distance squared from the bounding sphere to the point.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrientedBoundingBox.html#distanceSquaredTo">Online Documentation</a>
     */
    fun distanceSquaredTo(cartesian: Cartesian3): Double

    /**
     * The distances calculated by the vector from the center of the bounding box to position projected onto direction.
     *
     * If you imagine the infinite number of planes with normal direction, this computes the smallest distance to the
     * closest and farthest planes from position that intersect the bounding box.
     * @param [position] The position to calculate the distance from.
     * @param [direction] The direction from position.
     * @param [result] A Interval to store the nearest and farthest distances.
     * @return The nearest and farthest distances on the bounding box from position in direction.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrientedBoundingBox.html#computePlaneDistances">Online Documentation</a>
     */
    fun computePlaneDistances(
        position: Cartesian3,
        direction: Cartesian3,
        result: Interval? = definedExternally,
    ): Interval

    /**
     * Computes the eight corners of an oriented bounding box. The corners are ordered by (-X, -Y, -Z), (-X, -Y, +Z), (-X, +Y, -Z), (-X, +Y, +Z), (+X, -Y, -Z), (+X, -Y, +Z), (+X, +Y, -Z), (+X, +Y, +Z).
     * @param [result] An array of eight [Cartesian3] instances onto which to store the corners.
     * @return The modified result parameter or a new array if none was provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrientedBoundingBox.html#computeCorners">Online Documentation</a>
     */
    fun computeCorners(result: ReadonlyArray<Cartesian3>? = definedExternally): ReadonlyArray<Cartesian3>

    /**
     * Computes a transformation matrix from an oriented bounding box.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new [Matrix4] instance if none was provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrientedBoundingBox.html#computeTransformation">Online Documentation</a>
     */
    fun computeTransformation(result: Matrix4): Matrix4

    /**
     * Determines whether or not a bounding box is hidden from view by the occluder.
     * @param [occluder] The occluder.
     * @return `true` if the sphere is not visible; otherwise `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrientedBoundingBox.html#isOccluded">Online Documentation</a>
     */
    fun isOccluded(occluder: Occluder): Boolean

    /**
     * Duplicates this OrientedBoundingBox instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new OrientedBoundingBox instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrientedBoundingBox.html#clone">Online Documentation</a>
     */
    fun clone(result: OrientedBoundingBox? = definedExternally): OrientedBoundingBox

    companion object : Packable<OrientedBoundingBox> {
        /**
         * The number of elements used to pack the object into an array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrientedBoundingBox.html#.packedLength">Online Documentation</a>
         */
        override val packedLength: Int

        /**
         * Stores the provided instance into the provided array.
         * @param [value] The value to pack.
         * @param [array] The array to pack into.
         * @param [startingIndex] The index into the array at which to start packing the elements.
         *   Default value - `0`
         * @return The array that was packed into
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrientedBoundingBox.html#.pack">Online Documentation</a>
         */
        override fun pack(
            value: OrientedBoundingBox,
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
        ): ReadonlyArray<Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new OrientedBoundingBox instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrientedBoundingBox.html#.unpack">Online Documentation</a>
         */
        override fun unpack(
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
            result: OrientedBoundingBox?,
        ): OrientedBoundingBox

        /**
         * Computes an instance of an OrientedBoundingBox of the given positions.
         * This is an implementation of Stefan Gottschalk's Collision Queries using Oriented Bounding Boxes solution (PHD thesis).
         * Reference: http://gamma.cs.unc.edu/users/gottschalk/main.pdf
         * ```
         * // Compute an object oriented bounding box enclosing two points.
         * const box = OrientedBoundingBox.fromPoints([new Cartesian3(2, 0, 0), new Cartesian3(-2, 0, 0)]);
         * ```
         * @param [positions] List of [Cartesian3] points that the bounding box will enclose.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new OrientedBoundingBox instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrientedBoundingBox.html#.fromPoints">Online Documentation</a>
         */
        fun fromPoints(
            positions: ReadonlyArray<Cartesian3>? = definedExternally,
            result: OrientedBoundingBox? = definedExternally,
        ): OrientedBoundingBox

        /**
         * Computes an OrientedBoundingBox that bounds a [Rectangle] on the surface of an [Ellipsoid].
         * There are no guarantees about the orientation of the bounding box.
         * @param [rectangle] The cartographic rectangle on the surface of the ellipsoid.
         * @param [minimumHeight] The minimum height (elevation) within the tile.
         *   Default value - `0.0`
         * @param [maximumHeight] The maximum height (elevation) within the tile.
         *   Default value - `0.0`
         * @param [ellipsoid] The ellipsoid on which the rectangle is defined.
         *   Default value - [Ellipsoid.WGS84]
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new OrientedBoundingBox instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrientedBoundingBox.html#.fromRectangle">Online Documentation</a>
         */
        fun fromRectangle(
            rectangle: Rectangle,
            minimumHeight: Double? = definedExternally,
            maximumHeight: Double? = definedExternally,
            ellipsoid: Ellipsoid? = definedExternally,
            result: OrientedBoundingBox? = definedExternally,
        ): OrientedBoundingBox

        /**
         * Computes an OrientedBoundingBox that bounds an affine transformation.
         * @param [transformation] The affine transformation.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new OrientedBoundingBox instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrientedBoundingBox.html#.fromTransformation">Online Documentation</a>
         */
        fun fromTransformation(
            transformation: Matrix4,
            result: OrientedBoundingBox? = definedExternally,
        ): OrientedBoundingBox

        /**
         * Duplicates a OrientedBoundingBox instance.
         * @param [box] The bounding box to duplicate.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new OrientedBoundingBox instance if none was provided. (Returns undefined if box is undefined)
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrientedBoundingBox.html#.clone">Online Documentation</a>
         */
        fun clone(
            box: OrientedBoundingBox,
            result: OrientedBoundingBox? = definedExternally,
        ): OrientedBoundingBox

        /**
         * Determines which side of a plane the oriented bounding box is located.
         * @param [box] The oriented bounding box to test.
         * @param [plane] The plane to test against.
         * @return [Intersect.INSIDE] if the entire box is on the side of the plane
         *   the normal is pointing, [Intersect.OUTSIDE] if the entire box is
         *   on the opposite side, and [Intersect.INTERSECTING] if the box
         *   intersects the plane.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrientedBoundingBox.html#.intersectPlane">Online Documentation</a>
         */
        fun intersectPlane(
            box: OrientedBoundingBox,
            plane: Plane,
        ): Intersect

        /**
         * Computes the estimated distance squared from the closest point on a bounding box to a point.
         * ```
         * // Sort bounding boxes from back to front
         * boxes.sort(function(a, b) {
         *     return OrientedBoundingBox.distanceSquaredTo(b, camera.positionWC) - OrientedBoundingBox.distanceSquaredTo(a, camera.positionWC);
         * });
         * ```
         * @param [box] The box.
         * @param [cartesian] The point
         * @return The distance squared from the oriented bounding box to the point. Returns 0 if the point is inside the box.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrientedBoundingBox.html#.distanceSquaredTo">Online Documentation</a>
         */
        fun distanceSquaredTo(
            box: OrientedBoundingBox,
            cartesian: Cartesian3,
        ): Double

        /**
         * The distances calculated by the vector from the center of the bounding box to position projected onto direction.
         *
         * If you imagine the infinite number of planes with normal direction, this computes the smallest distance to the
         * closest and farthest planes from position that intersect the bounding box.
         * @param [box] The bounding box to calculate the distance to.
         * @param [position] The position to calculate the distance from.
         * @param [direction] The direction from position.
         * @param [result] A Interval to store the nearest and farthest distances.
         * @return The nearest and farthest distances on the bounding box from position in direction.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrientedBoundingBox.html#.computePlaneDistances">Online Documentation</a>
         */
        fun computePlaneDistances(
            box: OrientedBoundingBox,
            position: Cartesian3,
            direction: Cartesian3,
            result: Interval? = definedExternally,
        ): Interval

        /**
         * Computes the eight corners of an oriented bounding box. The corners are ordered by (-X, -Y, -Z), (-X, -Y, +Z), (-X, +Y, -Z), (-X, +Y, +Z), (+X, -Y, -Z), (+X, -Y, +Z), (+X, +Y, -Z), (+X, +Y, +Z).
         * @param [box] The oriented bounding box.
         * @param [result] An array of eight [Cartesian3] instances onto which to store the corners.
         * @return The modified result parameter or a new array if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrientedBoundingBox.html#.computeCorners">Online Documentation</a>
         */
        fun computeCorners(
            box: OrientedBoundingBox,
            result: ReadonlyArray<Cartesian3>? = definedExternally,
        ): ReadonlyArray<Cartesian3>

        /**
         * Computes a transformation matrix from an oriented bounding box.
         * @param [box] The oriented bounding box.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new [Matrix4] instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrientedBoundingBox.html#.computeTransformation">Online Documentation</a>
         */
        fun computeTransformation(
            box: OrientedBoundingBox,
            result: Matrix4,
        ): Matrix4

        /**
         * Determines whether or not a bounding box is hidden from view by the occluder.
         * @param [box] The bounding box surrounding the occludee object.
         * @param [occluder] The occluder.
         * @return `true` if the box is not visible; otherwise `false`.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrientedBoundingBox.html#.isOccluded">Online Documentation</a>
         */
        fun isOccluded(
            box: OrientedBoundingBox,
            occluder: Occluder,
        ): Boolean

        /**
         * Compares the provided OrientedBoundingBox componentwise and returns
         * `true` if they are equal, `false` otherwise.
         * @param [left] The first OrientedBoundingBox.
         * @param [right] The second OrientedBoundingBox.
         * @return `true` if left and right are equal, `false` otherwise.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/OrientedBoundingBox.html#.equals">Online Documentation</a>
         */
        fun equals(
            left: OrientedBoundingBox,
            right: OrientedBoundingBox,
        ): Boolean
    }
}
