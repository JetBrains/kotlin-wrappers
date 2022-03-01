// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * Creates an instance of an AxisAlignedBoundingBox from the minimum and maximum points along the x, y, and z axes.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AxisAlignedBoundingBox.html">Online Documentation</a>
 *
 * @constructor
 * @property [minimum] The minimum point along the x, y, and z axes.
 *   Default value - [Cartesian3.ZERO]
 * @property [maximum] The maximum point along the x, y, and z axes.
 *   Default value - [Cartesian3.ZERO]
 * @property [center] The center of the box; automatically computed if not supplied.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AxisAlignedBoundingBox.html">Online Documentation</a>
 */
external class AxisAlignedBoundingBox(
    var minimum: Cartesian3 = definedExternally,
    var maximum: Cartesian3 = definedExternally,
    var center: Cartesian3 = definedExternally,
) {
    /**
     * Duplicates this AxisAlignedBoundingBox instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new AxisAlignedBoundingBox instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AxisAlignedBoundingBox.html#clone">Online Documentation</a>
     */
    fun clone(result: AxisAlignedBoundingBox? = definedExternally): AxisAlignedBoundingBox

    /**
     * Determines which side of a plane this box is located.
     * @param [plane] The plane to test against.
     * @return [Intersect.INSIDE] if the entire box is on the side of the plane
     *   the normal is pointing, [Intersect.OUTSIDE] if the entire box is
     *   on the opposite side, and [Intersect.INTERSECTING] if the box
     *   intersects the plane.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AxisAlignedBoundingBox.html#intersectPlane">Online Documentation</a>
     */
    fun intersectPlane(plane: Plane): Intersect

    companion object {
        /**
         * Creates an instance of an AxisAlignedBoundingBox from its corners.
         * ```
         * // Compute an axis aligned bounding box from the two corners.
         * const box = AxisAlignedBoundingBox.fromCorners(new Cartesian3(-1, -1, -1), new Cartesian3(1, 1, 1));
         * ```
         * @param [minimum] The minimum point along the x, y, and z axes.
         * @param [maximum] The maximum point along the x, y, and z axes.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new AxisAlignedBoundingBox instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AxisAlignedBoundingBox.html#.fromCorners">Online Documentation</a>
         */
        fun fromCorners(
            minimum: Cartesian3,
            maximum: Cartesian3,
            result: AxisAlignedBoundingBox? = definedExternally,
        ): AxisAlignedBoundingBox

        /**
         * Computes an instance of an AxisAlignedBoundingBox. The box is determined by
         * finding the points spaced the farthest apart on the x, y, and z axes.
         * ```
         * // Compute an axis aligned bounding box enclosing two points.
         * const box = AxisAlignedBoundingBox.fromPoints([new Cartesian3(2, 0, 0), new Cartesian3(-2, 0, 0)]);
         * ```
         * @param [positions] List of points that the bounding box will enclose.  Each point must have a `x`, `y`, and `z` properties.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new AxisAlignedBoundingBox instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AxisAlignedBoundingBox.html#.fromPoints">Online Documentation</a>
         */
        fun fromPoints(
            positions: Array<out Cartesian3>,
            result: AxisAlignedBoundingBox? = definedExternally,
        ): AxisAlignedBoundingBox

        /**
         * Duplicates a AxisAlignedBoundingBox instance.
         * @param [box] The bounding box to duplicate.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new AxisAlignedBoundingBox instance if none was provided. (Returns undefined if box is undefined)
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AxisAlignedBoundingBox.html#.clone">Online Documentation</a>
         */
        fun clone(
            box: AxisAlignedBoundingBox,
            result: AxisAlignedBoundingBox? = definedExternally,
        ): AxisAlignedBoundingBox

        /**
         * Compares the provided AxisAlignedBoundingBox componentwise and returns
         * `true` if they are equal, `false` otherwise.
         * @param [left] The first AxisAlignedBoundingBox.
         * @param [right] The second AxisAlignedBoundingBox.
         * @return `true` if left and right are equal, `false` otherwise.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AxisAlignedBoundingBox.html#.equals">Online Documentation</a>
         */
        fun equals(
            left: AxisAlignedBoundingBox? = definedExternally,
            right: AxisAlignedBoundingBox? = definedExternally,
        ): Boolean

        /**
         * Determines which side of a plane a box is located.
         * @param [box] The bounding box to test.
         * @param [plane] The plane to test against.
         * @return [Intersect.INSIDE] if the entire box is on the side of the plane
         *   the normal is pointing, [Intersect.OUTSIDE] if the entire box is
         *   on the opposite side, and [Intersect.INTERSECTING] if the box
         *   intersects the plane.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AxisAlignedBoundingBox.html#.intersectPlane">Online Documentation</a>
         */
        fun intersectPlane(
            box: AxisAlignedBoundingBox,
            plane: Plane,
        ): Intersect
    }
}
