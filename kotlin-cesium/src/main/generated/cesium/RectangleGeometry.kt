// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * A description of a cartographic rectangle on an ellipsoid centered at the origin. Rectangle geometry can be rendered with both [Primitive] and [GroundPrimitive].
 * ```
 * // 1. create a rectangle
 * const rectangle = new RectangleGeometry({
 *   ellipsoid : Ellipsoid.WGS84,
 *   rectangle : Rectangle.fromDegrees(-80.0, 39.0, -74.0, 42.0),
 *   height : 10000.0
 * });
 * const geometry = RectangleGeometry.createGeometry(rectangle);
 *
 * // 2. create an extruded rectangle without a top
 * const rectangle = new RectangleGeometry({
 *   ellipsoid : Ellipsoid.WGS84,
 *   rectangle : Rectangle.fromDegrees(-80.0, 39.0, -74.0, 42.0),
 *   height : 10000.0,
 *   extrudedHeight: 300000
 * });
 * const geometry = RectangleGeometry.createGeometry(rectangle);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/RectangleGeometry.html">Online Documentation</a>
 */
external class RectangleGeometry(options: ConstructorOptions) {
    /**
     * @property [rectangle] A cartographic rectangle with north, south, east and west properties in radians.
     * @property [vertexFormat] The vertex attributes to be computed.
     *   Default value - [VertexFormat.DEFAULT]
     * @property [ellipsoid] The ellipsoid on which the rectangle lies.
     *   Default value - [Ellipsoid.WGS84]
     * @property [granularity] The distance, in radians, between each latitude and longitude. Determines the number of positions in the buffer.
     *   Default value - [Math.RADIANS_PER_DEGREE]
     * @property [height] The distance in meters between the rectangle and the ellipsoid surface.
     *   Default value - `0.0`
     * @property [rotation] The rotation of the rectangle, in radians. A positive rotation is counter-clockwise.
     *   Default value - `0.0`
     * @property [stRotation] The rotation of the texture coordinates, in radians. A positive rotation is counter-clockwise.
     *   Default value - `0.0`
     * @property [extrudedHeight] The distance in meters between the rectangle's extruded face and the ellipsoid surface.
     */
    interface ConstructorOptions {
        var rectangle: Rectangle
        var vertexFormat: VertexFormat?
        var ellipsoid: Ellipsoid?
        var granularity: Double?
        var height: Double?
        var rotation: Double?
        var stRotation: Double?
        var extrudedHeight: Double?
    }

    companion object : Packable<RectangleGeometry> {
        /**
         * The number of elements used to pack the object into an array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/RectangleGeometry.html#.packedLength">Online Documentation</a>
         */
        override val packedLength: Int

        /**
         * Stores the provided instance into the provided array.
         * @param [value] The value to pack.
         * @param [array] The array to pack into.
         * @param [startingIndex] The index into the array at which to start packing the elements.
         *   Default value - `0`
         * @return The array that was packed into
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/RectangleGeometry.html#.pack">Online Documentation</a>
         */
        override fun pack(
            value: RectangleGeometry,
            array: Array<out Double>,
            startingIndex: Int?,
        ): Array<out Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new RectangleGeometry instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/RectangleGeometry.html#.unpack">Online Documentation</a>
         */
        override fun unpack(
            array: Array<out Double>,
            startingIndex: Int?,
            result: RectangleGeometry?,
        ): RectangleGeometry

        /**
         * Computes the bounding rectangle based on the provided options
         * @param [result] An object in which to store the result.
         * @return The result rectangle
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/RectangleGeometry.html#.computeRectangle">Online Documentation</a>
         */
        fun computeRectangle(
            options: ComputeRectangleOptions,
            result: Rectangle? = definedExternally,
        ): Rectangle

        /**
         * @property [rectangle] A cartographic rectangle with north, south, east and west properties in radians.
         * @property [ellipsoid] The ellipsoid on which the rectangle lies.
         *   Default value - [Ellipsoid.WGS84]
         * @property [granularity] The distance, in radians, between each latitude and longitude. Determines the number of positions in the buffer.
         *   Default value - [Math.RADIANS_PER_DEGREE]
         * @property [rotation] The rotation of the rectangle, in radians. A positive rotation is counter-clockwise.
         *   Default value - `0.0`
         */
        interface ComputeRectangleOptions {
            var rectangle: Rectangle
            var ellipsoid: Ellipsoid?
            var granularity: Double?
            var rotation: Double?
        }

        /**
         * Computes the geometric representation of a rectangle, including its vertices, indices, and a bounding sphere.
         * @param [rectangleGeometry] A description of the rectangle.
         * @return The computed vertices and indices.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/RectangleGeometry.html#.createGeometry">Online Documentation</a>
         */
        fun createGeometry(rectangleGeometry: RectangleGeometry): Geometry?
    }
}

inline fun RectangleGeometry(
    block: RectangleGeometry.ConstructorOptions.() -> Unit,
): RectangleGeometry {
    val options: RectangleGeometry.ConstructorOptions = js("({})")
    block(options)
    return RectangleGeometry(options)
}
