// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * A two dimensional region specified as longitude and latitude coordinates.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rectangle.html">Online Documentation</a>
 *
 * @constructor
 * @property [west] The westernmost longitude, in radians, in the range [-Pi, Pi].
 *   Default value - `0.0`
 * @property [south] The southernmost latitude, in radians, in the range [-Pi/2, Pi/2].
 *   Default value - `0.0`
 * @property [east] The easternmost longitude, in radians, in the range [-Pi, Pi].
 *   Default value - `0.0`
 * @property [north] The northernmost latitude, in radians, in the range [-Pi/2, Pi/2].
 *   Default value - `0.0`
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rectangle.html">Online Documentation</a>
 */
external class Rectangle(
    var west: Double = definedExternally,
    var south: Double = definedExternally,
    var east: Double = definedExternally,
    var north: Double = definedExternally,
) {
    /**
     * Gets the width of the rectangle in radians.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rectangle.html#width">Online Documentation</a>
     */
    val width: Double

    /**
     * Gets the height of the rectangle in radians.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rectangle.html#height">Online Documentation</a>
     */
    val height: Double

    /**
     * Duplicates this Rectangle.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new Rectangle instance if none was provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rectangle.html#clone">Online Documentation</a>
     */
    fun clone(result: Rectangle? = definedExternally): Rectangle

    /**
     * Compares the provided Rectangle with this Rectangle componentwise and returns
     * `true` if they are within the provided epsilon,
     * `false` otherwise.
     * @param [other] The Rectangle to compare.
     * @param [epsilon] The epsilon to use for equality testing.
     *   Default value - `0`
     * @return `true` if the Rectangles are within the provided epsilon, `false` otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rectangle.html#equalsEpsilon">Online Documentation</a>
     */
    fun equalsEpsilon(
        other: Rectangle? = definedExternally,
        epsilon: Double? = definedExternally,
    ): Boolean

    companion object : Packable<Rectangle> {
        /**
         * The number of elements used to pack the object into an array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rectangle.html#.packedLength">Online Documentation</a>
         */
        override val packedLength: Int

        /**
         * Stores the provided instance into the provided array.
         * @param [value] The value to pack.
         * @param [array] The array to pack into.
         * @param [startingIndex] The index into the array at which to start packing the elements.
         *   Default value - `0`
         * @return The array that was packed into
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rectangle.html#.pack">Online Documentation</a>
         */
        override fun pack(
            value: Rectangle,
            array: Array<out Double>,
            startingIndex: Int?,
        ): Array<out Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new Rectangle instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rectangle.html#.unpack">Online Documentation</a>
         */
        override fun unpack(
            array: Array<out Double>,
            startingIndex: Int?,
            result: Rectangle?,
        ): Rectangle

        /**
         * Computes the width of a rectangle in radians.
         * @param [rectangle] The rectangle to compute the width of.
         * @return The width.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rectangle.html#.computeWidth">Online Documentation</a>
         */
        fun computeWidth(rectangle: Rectangle): Double

        /**
         * Computes the height of a rectangle in radians.
         * @param [rectangle] The rectangle to compute the height of.
         * @return The height.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rectangle.html#.computeHeight">Online Documentation</a>
         */
        fun computeHeight(rectangle: Rectangle): Double

        /**
         * Creates a rectangle given the boundary longitude and latitude in degrees.
         * ```
         * const rectangle = Rectangle.fromDegrees(0.0, 20.0, 10.0, 30.0);
         * ```
         * @param [west] The westernmost longitude in degrees in the range [-180.0, 180.0].
         *   Default value - `0.0`
         * @param [south] The southernmost latitude in degrees in the range [-90.0, 90.0].
         *   Default value - `0.0`
         * @param [east] The easternmost longitude in degrees in the range [-180.0, 180.0].
         *   Default value - `0.0`
         * @param [north] The northernmost latitude in degrees in the range [-90.0, 90.0].
         *   Default value - `0.0`
         * @param [result] The object onto which to store the result, or undefined if a new instance should be created.
         * @return The modified result parameter or a new Rectangle instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rectangle.html#.fromDegrees">Online Documentation</a>
         */
        fun fromDegrees(
            west: Double? = definedExternally,
            south: Double? = definedExternally,
            east: Double? = definedExternally,
            north: Double? = definedExternally,
            result: Rectangle? = definedExternally,
        ): Rectangle

        /**
         * Creates a rectangle given the boundary longitude and latitude in radians.
         * ```
         * const rectangle = Rectangle.fromRadians(0.0, Math.PI/4, Math.PI/8, 3*Math.PI/4);
         * ```
         * @param [west] The westernmost longitude in radians in the range [-Math.PI, Math.PI].
         *   Default value - `0.0`
         * @param [south] The southernmost latitude in radians in the range [-Math.PI/2, Math.PI/2].
         *   Default value - `0.0`
         * @param [east] The easternmost longitude in radians in the range [-Math.PI, Math.PI].
         *   Default value - `0.0`
         * @param [north] The northernmost latitude in radians in the range [-Math.PI/2, Math.PI/2].
         *   Default value - `0.0`
         * @param [result] The object onto which to store the result, or undefined if a new instance should be created.
         * @return The modified result parameter or a new Rectangle instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rectangle.html#.fromRadians">Online Documentation</a>
         */
        fun fromRadians(
            west: Double? = definedExternally,
            south: Double? = definedExternally,
            east: Double? = definedExternally,
            north: Double? = definedExternally,
            result: Rectangle? = definedExternally,
        ): Rectangle

        /**
         * Creates the smallest possible Rectangle that encloses all positions in the provided array.
         * @param [cartographics] The list of Cartographic instances.
         * @param [result] The object onto which to store the result, or undefined if a new instance should be created.
         * @return The modified result parameter or a new Rectangle instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rectangle.html#.fromCartographicArray">Online Documentation</a>
         */
        fun fromCartographicArray(
            cartographics: Array<out Cartographic>,
            result: Rectangle? = definedExternally,
        ): Rectangle

        /**
         * Creates the smallest possible Rectangle that encloses all positions in the provided array.
         * @param [cartesians] The list of Cartesian instances.
         * @param [ellipsoid] The ellipsoid the cartesians are on.
         *   Default value - [Ellipsoid.WGS84]
         * @param [result] The object onto which to store the result, or undefined if a new instance should be created.
         * @return The modified result parameter or a new Rectangle instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rectangle.html#.fromCartesianArray">Online Documentation</a>
         */
        fun fromCartesianArray(
            cartesians: Array<out Cartesian3>,
            ellipsoid: Ellipsoid? = definedExternally,
            result: Rectangle? = definedExternally,
        ): Rectangle

        /**
         * Duplicates a Rectangle.
         * @param [rectangle] The rectangle to clone.
         * @param [result] The object onto which to store the result, or undefined if a new instance should be created.
         * @return The modified result parameter or a new Rectangle instance if none was provided. (Returns undefined if rectangle is undefined)
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rectangle.html#.clone">Online Documentation</a>
         */
        fun clone(
            rectangle: Rectangle,
            result: Rectangle? = definedExternally,
        ): Rectangle

        /**
         * Compares the provided Rectangles componentwise and returns
         * `true` if they pass an absolute or relative tolerance test,
         * `false` otherwise.
         * @param [left] The first Rectangle.
         * @param [right] The second Rectangle.
         * @param [absoluteEpsilon] The absolute epsilon tolerance to use for equality testing.
         *   Default value - `0`
         * @return `true` if left and right are within the provided epsilon, `false` otherwise.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rectangle.html#.equalsEpsilon">Online Documentation</a>
         */
        fun equalsEpsilon(
            left: Rectangle? = definedExternally,
            right: Rectangle? = definedExternally,
            absoluteEpsilon: Double? = definedExternally,
        ): Boolean

        /**
         * Compares the provided rectangles and returns `true` if they are equal,
         * `false` otherwise.
         * @param [left] The first Rectangle.
         * @param [right] The second Rectangle.
         * @return `true` if left and right are equal; otherwise `false`.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rectangle.html#.equals">Online Documentation</a>
         */
        fun equals(
            left: Rectangle? = definedExternally,
            right: Rectangle? = definedExternally,
        ): Boolean

        /**
         * Checks a Rectangle's properties and throws if they are not in valid ranges.
         * @param [rectangle] The rectangle to validate
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rectangle.html#.validate">Online Documentation</a>
         */
        fun validate(rectangle: Rectangle)

        /**
         * Computes the southwest corner of a rectangle.
         * @param [rectangle] The rectangle for which to find the corner
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Cartographic instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rectangle.html#.southwest">Online Documentation</a>
         */
        fun southwest(
            rectangle: Rectangle,
            result: Cartographic? = definedExternally,
        ): Cartographic

        /**
         * Computes the northwest corner of a rectangle.
         * @param [rectangle] The rectangle for which to find the corner
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Cartographic instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rectangle.html#.northwest">Online Documentation</a>
         */
        fun northwest(
            rectangle: Rectangle,
            result: Cartographic? = definedExternally,
        ): Cartographic

        /**
         * Computes the northeast corner of a rectangle.
         * @param [rectangle] The rectangle for which to find the corner
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Cartographic instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rectangle.html#.northeast">Online Documentation</a>
         */
        fun northeast(
            rectangle: Rectangle,
            result: Cartographic? = definedExternally,
        ): Cartographic

        /**
         * Computes the southeast corner of a rectangle.
         * @param [rectangle] The rectangle for which to find the corner
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Cartographic instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rectangle.html#.southeast">Online Documentation</a>
         */
        fun southeast(
            rectangle: Rectangle,
            result: Cartographic? = definedExternally,
        ): Cartographic

        /**
         * Computes the center of a rectangle.
         * @param [rectangle] The rectangle for which to find the center
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Cartographic instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rectangle.html#.center">Online Documentation</a>
         */
        fun center(
            rectangle: Rectangle,
            result: Cartographic? = definedExternally,
        ): Cartographic

        /**
         * Computes the intersection of two rectangles.  This function assumes that the rectangle's coordinates are
         * latitude and longitude in radians and produces a correct intersection, taking into account the fact that
         * the same angle can be represented with multiple values as well as the wrapping of longitude at the
         * anti-meridian.  For a simple intersection that ignores these factors and can be used with projected
         * coordinates, see [Rectangle.simpleIntersection].
         * @param [rectangle] On rectangle to find an intersection
         * @param [otherRectangle] Another rectangle to find an intersection
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter, a new Rectangle instance if none was provided or undefined if there is no intersection.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rectangle.html#.intersection">Online Documentation</a>
         */
        fun intersection(
            rectangle: Rectangle,
            otherRectangle: Rectangle,
            result: Rectangle? = definedExternally,
        ): Rectangle?

        /**
         * Computes a simple intersection of two rectangles.  Unlike [Rectangle.intersection], this function
         * does not attempt to put the angular coordinates into a consistent range or to account for crossing the
         * anti-meridian.  As such, it can be used for rectangles where the coordinates are not simply latitude
         * and longitude (i.e. projected coordinates).
         * @param [rectangle] On rectangle to find an intersection
         * @param [otherRectangle] Another rectangle to find an intersection
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter, a new Rectangle instance if none was provided or undefined if there is no intersection.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rectangle.html#.simpleIntersection">Online Documentation</a>
         */
        fun simpleIntersection(
            rectangle: Rectangle,
            otherRectangle: Rectangle,
            result: Rectangle? = definedExternally,
        ): Rectangle?

        /**
         * Computes a rectangle that is the union of two rectangles.
         * @param [rectangle] A rectangle to enclose in rectangle.
         * @param [otherRectangle] A rectangle to enclose in a rectangle.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Rectangle instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rectangle.html#.union">Online Documentation</a>
         */
        fun union(
            rectangle: Rectangle,
            otherRectangle: Rectangle,
            result: Rectangle? = definedExternally,
        ): Rectangle

        /**
         * Computes a rectangle by enlarging the provided rectangle until it contains the provided cartographic.
         * @param [rectangle] A rectangle to expand.
         * @param [cartographic] A cartographic to enclose in a rectangle.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Rectangle instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rectangle.html#.expand">Online Documentation</a>
         */
        fun expand(
            rectangle: Rectangle,
            cartographic: Cartographic,
            result: Rectangle? = definedExternally,
        ): Rectangle

        /**
         * Returns true if the cartographic is on or inside the rectangle, false otherwise.
         * @param [rectangle] The rectangle
         * @param [cartographic] The cartographic to test.
         * @return true if the provided cartographic is inside the rectangle, false otherwise.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rectangle.html#.contains">Online Documentation</a>
         */
        fun contains(
            rectangle: Rectangle,
            cartographic: Cartographic,
        ): Boolean

        /**
         * Samples a rectangle so that it includes a list of Cartesian points suitable for passing to
         * [BoundingSphere.fromPoints].  Sampling is necessary to account
         * for rectangles that cover the poles or cross the equator.
         * @param [rectangle] The rectangle to subsample.
         * @param [ellipsoid] The ellipsoid to use.
         *   Default value - [Ellipsoid.WGS84]
         * @param [surfaceHeight] The height of the rectangle above the ellipsoid.
         *   Default value - `0.0`
         * @param [result] The array of Cartesians onto which to store the result.
         * @return The modified result parameter or a new Array of Cartesians instances if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rectangle.html#.subsample">Online Documentation</a>
         */
        fun subsample(
            rectangle: Rectangle,
            ellipsoid: Ellipsoid? = definedExternally,
            surfaceHeight: Double? = definedExternally,
            result: Array<out Cartesian3>? = definedExternally,
        ): Array<out Cartesian3>

        /**
         * Computes a subsection of a rectangle from normalized coordinates in the range [0.0, 1.0].
         * @param [rectangle] The rectangle to subsection.
         * @param [westLerp] The west interpolation factor in the range [0.0, 1.0]. Must be less than or equal to eastLerp.
         * @param [southLerp] The south interpolation factor in the range [0.0, 1.0]. Must be less than or equal to northLerp.
         * @param [eastLerp] The east interpolation factor in the range [0.0, 1.0]. Must be greater than or equal to westLerp.
         * @param [northLerp] The north interpolation factor in the range [0.0, 1.0]. Must be greater than or equal to southLerp.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Rectangle instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rectangle.html#.subsection">Online Documentation</a>
         */
        fun subsection(
            rectangle: Rectangle,
            westLerp: Double,
            southLerp: Double,
            eastLerp: Double,
            northLerp: Double,
            result: Rectangle? = definedExternally,
        ): Rectangle

        /**
         * The largest possible rectangle.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rectangle.html#.MAX_VALUE">Online Documentation</a>
         */
        val MAX_VALUE: Rectangle
    }
}
