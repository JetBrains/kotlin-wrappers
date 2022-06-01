// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * A bounding sphere with a center and a radius.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingSphere.html">Online Documentation</a>
 *
 * @constructor
 * @property [center] The center of the bounding sphere.
 *   Default value - [Cartesian3.ZERO]
 * @property [radius] The radius of the bounding sphere.
 *   Default value - `0.0`
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingSphere.html">Online Documentation</a>
 */
external class BoundingSphere(
    var center: Cartesian3 = definedExternally,
    var radius: Double = definedExternally,
) {
    /**
     * Determines which side of a plane the sphere is located.
     * @param [plane] The plane to test against.
     * @return [Intersect.INSIDE] if the entire sphere is on the side of the plane
     *   the normal is pointing, [Intersect.OUTSIDE] if the entire sphere is
     *   on the opposite side, and [Intersect.INTERSECTING] if the sphere
     *   intersects the plane.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingSphere.html#intersectPlane">Online Documentation</a>
     */
    fun intersectPlane(plane: Plane): Intersect

    /**
     * Computes the estimated distance squared from the closest point on a bounding sphere to a point.
     * ```
     * // Sort bounding spheres from back to front
     * spheres.sort(function(a, b) {
     *     return b.distanceSquaredTo(camera.positionWC) - a.distanceSquaredTo(camera.positionWC);
     * });
     * ```
     * @param [cartesian] The point
     * @return The estimated distance squared from the bounding sphere to the point.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingSphere.html#distanceSquaredTo">Online Documentation</a>
     */
    fun distanceSquaredTo(cartesian: Cartesian3): Double

    /**
     * The distances calculated by the vector from the center of the bounding sphere to position projected onto direction
     * plus/minus the radius of the bounding sphere.
     *
     * If you imagine the infinite number of planes with normal direction, this computes the smallest distance to the
     * closest and farthest planes from position that intersect the bounding sphere.
     * @param [position] The position to calculate the distance from.
     * @param [direction] The direction from position.
     * @param [result] A Interval to store the nearest and farthest distances.
     * @return The nearest and farthest distances on the bounding sphere from position in direction.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingSphere.html#computePlaneDistances">Online Documentation</a>
     */
    fun computePlaneDistances(
        position: Cartesian3,
        direction: Cartesian3,
        result: Interval? = definedExternally,
    ): Interval

    /**
     * Determines whether or not a sphere is hidden from view by the occluder.
     * @param [occluder] The occluder.
     * @return `true` if the sphere is not visible; otherwise `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingSphere.html#isOccluded">Online Documentation</a>
     */
    fun isOccluded(occluder: Occluder): Boolean

    /**
     * Duplicates this BoundingSphere instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new BoundingSphere instance if none was provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingSphere.html#clone">Online Documentation</a>
     */
    fun clone(result: BoundingSphere? = definedExternally): BoundingSphere

    /**
     * Computes the radius of the BoundingSphere.
     * @return The radius of the BoundingSphere.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingSphere.html#volume">Online Documentation</a>
     */
    fun volume(): Double

    companion object : Packable<BoundingSphere> {
        /**
         * Computes a tight-fitting bounding sphere enclosing a list of 3D Cartesian points.
         * The bounding sphere is computed by running two algorithms, a naive algorithm and
         * Ritter's algorithm. The smaller of the two spheres is used to ensure a tight fit.
         * @param [positions] An array of points that the bounding sphere will enclose.  Each point must have `x`, `y`, and `z` properties.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new BoundingSphere instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingSphere.html#.fromPoints">Online Documentation</a>
         */
        fun fromPoints(
            positions: Array<out Cartesian3>? = definedExternally,
            result: BoundingSphere? = definedExternally,
        ): BoundingSphere

        /**
         * Computes a bounding sphere from a rectangle projected in 2D.
         * @param [rectangle] The rectangle around which to create a bounding sphere.
         * @param [projection] The projection used to project the rectangle into 2D.
         *   Default value - [GeographicProjection]
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new BoundingSphere instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingSphere.html#.fromRectangle2D">Online Documentation</a>
         */
        fun fromRectangle2D(
            rectangle: Rectangle? = definedExternally,
            projection: Any? = definedExternally,
            result: BoundingSphere? = definedExternally,
        ): BoundingSphere

        /**
         * Computes a bounding sphere from a rectangle projected in 2D.  The bounding sphere accounts for the
         * object's minimum and maximum heights over the rectangle.
         * @param [rectangle] The rectangle around which to create a bounding sphere.
         * @param [projection] The projection used to project the rectangle into 2D.
         *   Default value - [GeographicProjection]
         * @param [minimumHeight] The minimum height over the rectangle.
         *   Default value - `0.0`
         * @param [maximumHeight] The maximum height over the rectangle.
         *   Default value - `0.0`
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new BoundingSphere instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingSphere.html#.fromRectangleWithHeights2D">Online Documentation</a>
         */
        fun fromRectangleWithHeights2D(
            rectangle: Rectangle? = definedExternally,
            projection: Any? = definedExternally,
            minimumHeight: Double? = definedExternally,
            maximumHeight: Double? = definedExternally,
            result: BoundingSphere? = definedExternally,
        ): BoundingSphere

        /**
         * Computes a bounding sphere from a rectangle in 3D. The bounding sphere is created using a subsample of points
         * on the ellipsoid and contained in the rectangle. It may not be accurate for all rectangles on all types of ellipsoids.
         * @param [rectangle] The valid rectangle used to create a bounding sphere.
         * @param [ellipsoid] The ellipsoid used to determine positions of the rectangle.
         *   Default value - [Ellipsoid.WGS84]
         * @param [surfaceHeight] The height above the surface of the ellipsoid.
         *   Default value - `0.0`
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new BoundingSphere instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingSphere.html#.fromRectangle3D">Online Documentation</a>
         */
        fun fromRectangle3D(
            rectangle: Rectangle? = definedExternally,
            ellipsoid: Ellipsoid? = definedExternally,
            surfaceHeight: Double? = definedExternally,
            result: BoundingSphere? = definedExternally,
        ): BoundingSphere

        /**
         * Computes a tight-fitting bounding sphere enclosing a list of 3D points, where the points are
         * stored in a flat array in X, Y, Z, order.  The bounding sphere is computed by running two
         * algorithms, a naive algorithm and Ritter's algorithm. The smaller of the two spheres is used to
         * ensure a tight fit.
         * ```
         * // Compute the bounding sphere from 3 positions, each specified relative to a center.
         * // In addition to the X, Y, and Z coordinates, the points array contains two additional
         * // elements per point which are ignored for the purpose of computing the bounding sphere.
         * const center = new Cartesian3(1.0, 2.0, 3.0);
         * const points = [1.0, 2.0, 3.0, 0.1, 0.2,
         *               4.0, 5.0, 6.0, 0.1, 0.2,
         *               7.0, 8.0, 9.0, 0.1, 0.2];
         * const sphere = BoundingSphere.fromVertices(points, center, 5);
         * ```
         * @param [positions] An array of points that the bounding sphere will enclose.  Each point
         *   is formed from three elements in the array in the order X, Y, Z.
         * @param [center] The position to which the positions are relative, which need not be the
         *   origin of the coordinate system.  This is useful when the positions are to be used for
         *   relative-to-center (RTC) rendering.
         *   Default value - [Cartesian3.ZERO]
         * @param [stride] The number of array elements per vertex.  It must be at least 3, but it may
         *   be higher.  Regardless of the value of this parameter, the X coordinate of the first position
         *   is at array index 0, the Y coordinate is at array index 1, and the Z coordinate is at array index
         *   2.  When stride is 3, the X coordinate of the next position then begins at array index 3.  If
         *   the stride is 5, however, two array elements are skipped and the next position begins at array
         *   index 5.
         *   Default value - `3`
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new BoundingSphere instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingSphere.html#.fromVertices">Online Documentation</a>
         */
        fun fromVertices(
            positions: Array<out Double>? = definedExternally,
            center: Cartesian3? = definedExternally,
            stride: Int? = definedExternally,
            result: BoundingSphere? = definedExternally,
        ): BoundingSphere

        /**
         * Computes a tight-fitting bounding sphere enclosing a list of EncodedCartesian3s, where the points are
         * stored in parallel flat arrays in X, Y, Z, order.  The bounding sphere is computed by running two
         * algorithms, a naive algorithm and Ritter's algorithm. The smaller of the two spheres is used to
         * ensure a tight fit.
         * @param [positionsHigh] An array of high bits of the encoded cartesians that the bounding sphere will enclose.  Each point
         *   is formed from three elements in the array in the order X, Y, Z.
         * @param [positionsLow] An array of low bits of the encoded cartesians that the bounding sphere will enclose.  Each point
         *   is formed from three elements in the array in the order X, Y, Z.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new BoundingSphere instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingSphere.html#.fromEncodedCartesianVertices">Online Documentation</a>
         */
        fun fromEncodedCartesianVertices(
            positionsHigh: Array<out Double>? = definedExternally,
            positionsLow: Array<out Double>? = definedExternally,
            result: BoundingSphere? = definedExternally,
        ): BoundingSphere

        /**
         * Computes a bounding sphere from the corner points of an axis-aligned bounding box.  The sphere
         * tightly and fully encompasses the box.
         * ```
         * // Create a bounding sphere around the unit cube
         * const sphere = BoundingSphere.fromCornerPoints(new Cartesian3(-0.5, -0.5, -0.5), new Cartesian3(0.5, 0.5, 0.5));
         * ```
         * @param [corner] The minimum height over the rectangle.
         * @param [oppositeCorner] The maximum height over the rectangle.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new BoundingSphere instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingSphere.html#.fromCornerPoints">Online Documentation</a>
         */
        fun fromCornerPoints(
            corner: Cartesian3? = definedExternally,
            oppositeCorner: Cartesian3? = definedExternally,
            result: BoundingSphere? = definedExternally,
        ): BoundingSphere

        /**
         * Creates a bounding sphere encompassing an ellipsoid.
         * ```
         * const boundingSphere = BoundingSphere.fromEllipsoid(ellipsoid);
         * ```
         * @param [ellipsoid] The ellipsoid around which to create a bounding sphere.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new BoundingSphere instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingSphere.html#.fromEllipsoid">Online Documentation</a>
         */
        fun fromEllipsoid(
            ellipsoid: Ellipsoid,
            result: BoundingSphere? = definedExternally,
        ): BoundingSphere

        /**
         * Computes a tight-fitting bounding sphere enclosing the provided array of bounding spheres.
         * @param [boundingSpheres] The array of bounding spheres.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new BoundingSphere instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingSphere.html#.fromBoundingSpheres">Online Documentation</a>
         */
        fun fromBoundingSpheres(
            boundingSpheres: Array<out BoundingSphere>? = definedExternally,
            result: BoundingSphere? = definedExternally,
        ): BoundingSphere

        /**
         * Computes a tight-fitting bounding sphere enclosing the provided oriented bounding box.
         * @param [orientedBoundingBox] The oriented bounding box.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new BoundingSphere instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingSphere.html#.fromOrientedBoundingBox">Online Documentation</a>
         */
        fun fromOrientedBoundingBox(
            orientedBoundingBox: OrientedBoundingBox,
            result: BoundingSphere? = definedExternally,
        ): BoundingSphere

        /**
         * Computes a tight-fitting bounding sphere enclosing the provided affine transformation.
         * @param [transformation] The affine transformation.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new BoundingSphere instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingSphere.html#.fromTransformation">Online Documentation</a>
         */
        fun fromTransformation(
            transformation: Matrix4,
            result: BoundingSphere? = definedExternally,
        ): BoundingSphere

        /**
         * Duplicates a BoundingSphere instance.
         * @param [sphere] The bounding sphere to duplicate.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new BoundingSphere instance if none was provided. (Returns undefined if sphere is undefined)
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingSphere.html#.clone">Online Documentation</a>
         */
        fun clone(
            sphere: BoundingSphere,
            result: BoundingSphere? = definedExternally,
        ): BoundingSphere

        /**
         * The number of elements used to pack the object into an array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingSphere.html#.packedLength">Online Documentation</a>
         */
        override val packedLength: Int

        /**
         * Stores the provided instance into the provided array.
         * @param [value] The value to pack.
         * @param [array] The array to pack into.
         * @param [startingIndex] The index into the array at which to start packing the elements.
         *   Default value - `0`
         * @return The array that was packed into
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingSphere.html#.pack">Online Documentation</a>
         */
        override fun pack(
            value: BoundingSphere,
            array: Array<out Double>,
            startingIndex: Int?,
        ): Array<out Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new BoundingSphere instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingSphere.html#.unpack">Online Documentation</a>
         */
        override fun unpack(
            array: Array<out Double>,
            startingIndex: Int?,
            result: BoundingSphere?,
        ): BoundingSphere

        /**
         * Computes a bounding sphere that contains both the left and right bounding spheres.
         * @param [left] A sphere to enclose in a bounding sphere.
         * @param [right] A sphere to enclose in a bounding sphere.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new BoundingSphere instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingSphere.html#.union">Online Documentation</a>
         */
        fun union(
            left: BoundingSphere,
            right: BoundingSphere,
            result: BoundingSphere? = definedExternally,
        ): BoundingSphere

        /**
         * Computes a bounding sphere by enlarging the provided sphere to contain the provided point.
         * @param [sphere] A sphere to expand.
         * @param [point] A point to enclose in a bounding sphere.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new BoundingSphere instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingSphere.html#.expand">Online Documentation</a>
         */
        fun expand(
            sphere: BoundingSphere,
            point: Cartesian3,
            result: BoundingSphere? = definedExternally,
        ): BoundingSphere

        /**
         * Determines which side of a plane a sphere is located.
         * @param [sphere] The bounding sphere to test.
         * @param [plane] The plane to test against.
         * @return [Intersect.INSIDE] if the entire sphere is on the side of the plane
         *   the normal is pointing, [Intersect.OUTSIDE] if the entire sphere is
         *   on the opposite side, and [Intersect.INTERSECTING] if the sphere
         *   intersects the plane.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingSphere.html#.intersectPlane">Online Documentation</a>
         */
        fun intersectPlane(
            sphere: BoundingSphere,
            plane: Plane,
        ): Intersect

        /**
         * Applies a 4x4 affine transformation matrix to a bounding sphere.
         * @param [sphere] The bounding sphere to apply the transformation to.
         * @param [transform] The transformation matrix to apply to the bounding sphere.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new BoundingSphere instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingSphere.html#.transform">Online Documentation</a>
         */
        fun transform(
            sphere: BoundingSphere,
            transform: Matrix4,
            result: BoundingSphere? = definedExternally,
        ): BoundingSphere

        /**
         * Computes the estimated distance squared from the closest point on a bounding sphere to a point.
         * ```
         * // Sort bounding spheres from back to front
         * spheres.sort(function(a, b) {
         *     return BoundingSphere.distanceSquaredTo(b, camera.positionWC) - BoundingSphere.distanceSquaredTo(a, camera.positionWC);
         * });
         * ```
         * @param [sphere] The sphere.
         * @param [cartesian] The point
         * @return The distance squared from the bounding sphere to the point. Returns 0 if the point is inside the sphere.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingSphere.html#.distanceSquaredTo">Online Documentation</a>
         */
        fun distanceSquaredTo(
            sphere: BoundingSphere,
            cartesian: Cartesian3,
        ): Double

        /**
         * Applies a 4x4 affine transformation matrix to a bounding sphere where there is no scale
         * The transformation matrix is not verified to have a uniform scale of 1.
         * This method is faster than computing the general bounding sphere transform using [BoundingSphere.transform].
         * ```
         * const modelMatrix = Transforms.eastNorthUpToFixedFrame(positionOnEllipsoid);
         * const boundingSphere = new BoundingSphere();
         * const newBoundingSphere = BoundingSphere.transformWithoutScale(boundingSphere, modelMatrix);
         * ```
         * @param [sphere] The bounding sphere to apply the transformation to.
         * @param [transform] The transformation matrix to apply to the bounding sphere.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new BoundingSphere instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingSphere.html#.transformWithoutScale">Online Documentation</a>
         */
        fun transformWithoutScale(
            sphere: BoundingSphere,
            transform: Matrix4,
            result: BoundingSphere? = definedExternally,
        ): BoundingSphere

        /**
         * The distances calculated by the vector from the center of the bounding sphere to position projected onto direction
         * plus/minus the radius of the bounding sphere.
         *
         * If you imagine the infinite number of planes with normal direction, this computes the smallest distance to the
         * closest and farthest planes from position that intersect the bounding sphere.
         * @param [sphere] The bounding sphere to calculate the distance to.
         * @param [position] The position to calculate the distance from.
         * @param [direction] The direction from position.
         * @param [result] A Interval to store the nearest and farthest distances.
         * @return The nearest and farthest distances on the bounding sphere from position in direction.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingSphere.html#.computePlaneDistances">Online Documentation</a>
         */
        fun computePlaneDistances(
            sphere: BoundingSphere,
            position: Cartesian3,
            direction: Cartesian3,
            result: Interval? = definedExternally,
        ): Interval

        /**
         * Creates a bounding sphere in 2D from a bounding sphere in 3D world coordinates.
         * @param [sphere] The bounding sphere to transform to 2D.
         * @param [projection] The projection to 2D.
         *   Default value - [GeographicProjection]
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new BoundingSphere instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingSphere.html#.projectTo2D">Online Documentation</a>
         */
        fun projectTo2D(
            sphere: BoundingSphere,
            projection: Any? = definedExternally,
            result: BoundingSphere? = definedExternally,
        ): BoundingSphere

        /**
         * Determines whether or not a sphere is hidden from view by the occluder.
         * @param [sphere] The bounding sphere surrounding the occludee object.
         * @param [occluder] The occluder.
         * @return `true` if the sphere is not visible; otherwise `false`.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingSphere.html#.isOccluded">Online Documentation</a>
         */
        fun isOccluded(
            sphere: BoundingSphere,
            occluder: Occluder,
        ): Boolean

        /**
         * Compares the provided BoundingSphere componentwise and returns
         * `true` if they are equal, `false` otherwise.
         * @param [left] The first BoundingSphere.
         * @param [right] The second BoundingSphere.
         * @return `true` if left and right are equal, `false` otherwise.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingSphere.html#.equals">Online Documentation</a>
         */
        fun equals(
            left: BoundingSphere? = definedExternally,
            right: BoundingSphere? = definedExternally,
        ): Boolean
    }
}
