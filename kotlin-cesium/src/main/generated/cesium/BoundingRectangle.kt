// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

import kotlinx.js.ReadonlyArray

/**
 * A bounding rectangle given by a corner, width and height.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingRectangle.html">Online Documentation</a>
 *
 * @constructor
 * @property [x] The x coordinate of the rectangle.
 *   Default value - `0.0`
 * @property [y] The y coordinate of the rectangle.
 *   Default value - `0.0`
 * @property [width] The width of the rectangle.
 *   Default value - `0.0`
 * @property [height] The height of the rectangle.
 *   Default value - `0.0`
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingRectangle.html">Online Documentation</a>
 */
external class BoundingRectangle(
    var x: Double = definedExternally,
    var y: Double = definedExternally,
    var width: Double = definedExternally,
    var height: Double = definedExternally,
) {
    /**
     * Duplicates this BoundingRectangle instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new BoundingRectangle instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingRectangle.html#clone">Online Documentation</a>
     */
    fun clone(result: BoundingRectangle? = definedExternally): BoundingRectangle

    /**
     * Determines if this rectangle intersects with another.
     * @param [right] A rectangle to check for intersection.
     * @return `Intersect.INTERSECTING` if the rectangles intersect, `Intersect.OUTSIDE` otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingRectangle.html#intersect">Online Documentation</a>
     */
    fun intersect(right: BoundingRectangle): Intersect

    companion object : Packable<BoundingRectangle> {
        /**
         * The number of elements used to pack the object into an array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingRectangle.html#.packedLength">Online Documentation</a>
         */
        override val packedLength: Int

        /**
         * Stores the provided instance into the provided array.
         * @param [value] The value to pack.
         * @param [array] The array to pack into.
         * @param [startingIndex] The index into the array at which to start packing the elements.
         *   Default value - `0`
         * @return The array that was packed into
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingRectangle.html#.pack">Online Documentation</a>
         */
        override fun pack(
            value: BoundingRectangle,
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
        ): ReadonlyArray<Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new BoundingRectangle instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingRectangle.html#.unpack">Online Documentation</a>
         */
        override fun unpack(
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
            result: BoundingRectangle?,
        ): BoundingRectangle

        /**
         * Computes a bounding rectangle enclosing the list of 2D points.
         * The rectangle is oriented with the corner at the bottom left.
         * @param [positions] List of points that the bounding rectangle will enclose.  Each point must have `x` and `y` properties.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new BoundingRectangle instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingRectangle.html#.fromPoints">Online Documentation</a>
         */
        fun fromPoints(
            positions: ReadonlyArray<Cartesian2>,
            result: BoundingRectangle? = definedExternally,
        ): BoundingRectangle

        /**
         * Computes a bounding rectangle from a rectangle.
         * @param [rectangle] The valid rectangle used to create a bounding rectangle.
         * @param [projection] The projection used to project the rectangle into 2D.
         *   Default value - [GeographicProjection]
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new BoundingRectangle instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingRectangle.html#.fromRectangle">Online Documentation</a>
         */
        fun fromRectangle(
            rectangle: Rectangle,
            projection: Any? = definedExternally,
            result: BoundingRectangle? = definedExternally,
        ): BoundingRectangle

        /**
         * Duplicates a BoundingRectangle instance.
         * @param [rectangle] The bounding rectangle to duplicate.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new BoundingRectangle instance if one was not provided. (Returns undefined if rectangle is undefined)
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingRectangle.html#.clone">Online Documentation</a>
         */
        fun clone(
            rectangle: BoundingRectangle,
            result: BoundingRectangle? = definedExternally,
        ): BoundingRectangle

        /**
         * Computes a bounding rectangle that is the union of the left and right bounding rectangles.
         * @param [left] A rectangle to enclose in bounding rectangle.
         * @param [right] A rectangle to enclose in a bounding rectangle.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new BoundingRectangle instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingRectangle.html#.union">Online Documentation</a>
         */
        fun union(
            left: BoundingRectangle,
            right: BoundingRectangle,
            result: BoundingRectangle? = definedExternally,
        ): BoundingRectangle

        /**
         * Computes a bounding rectangle by enlarging the provided rectangle until it contains the provided point.
         * @param [rectangle] A rectangle to expand.
         * @param [point] A point to enclose in a bounding rectangle.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new BoundingRectangle instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingRectangle.html#.expand">Online Documentation</a>
         */
        fun expand(
            rectangle: BoundingRectangle,
            point: Cartesian2,
            result: BoundingRectangle? = definedExternally,
        ): BoundingRectangle

        /**
         * Determines if two rectangles intersect.
         * @param [left] A rectangle to check for intersection.
         * @param [right] The other rectangle to check for intersection.
         * @return `Intersect.INTERSECTING` if the rectangles intersect, `Intersect.OUTSIDE` otherwise.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingRectangle.html#.intersect">Online Documentation</a>
         */
        fun intersect(
            left: BoundingRectangle,
            right: BoundingRectangle,
        ): Intersect

        /**
         * Compares the provided BoundingRectangles componentwise and returns
         * `true` if they are equal, `false` otherwise.
         * @param [left] The first BoundingRectangle.
         * @param [right] The second BoundingRectangle.
         * @return `true` if left and right are equal, `false` otherwise.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoundingRectangle.html#.equals">Online Documentation</a>
         */
        fun equals(
            left: BoundingRectangle? = definedExternally,
            right: BoundingRectangle? = definedExternally,
        ): Boolean
    }
}
