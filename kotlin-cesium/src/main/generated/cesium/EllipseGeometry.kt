// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * A description of an ellipse on an ellipsoid. Ellipse geometry can be rendered with both [Primitive] and [GroundPrimitive].
 * ```
 * // Create an ellipse.
 * const ellipse = new EllipseGeometry({
 *   center : Cartesian3.fromDegrees(-75.59777, 40.03883),
 *   semiMajorAxis : 500000.0,
 *   semiMinorAxis : 300000.0,
 *   rotation : Math.toRadians(60.0)
 * });
 * const geometry = EllipseGeometry.createGeometry(ellipse);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseGeometry.html">Online Documentation</a>
 */
external class EllipseGeometry(options: ConstructorOptions) {
    /**
     * @property [center] The ellipse's center point in the fixed frame.
     * @property [semiMajorAxis] The length of the ellipse's semi-major axis in meters.
     * @property [semiMinorAxis] The length of the ellipse's semi-minor axis in meters.
     * @property [ellipsoid] The ellipsoid the ellipse will be on.
     *   Default value - [Ellipsoid.WGS84]
     * @property [height] The distance in meters between the ellipse and the ellipsoid surface.
     *   Default value - `0.0`
     * @property [extrudedHeight] The distance in meters between the ellipse's extruded face and the ellipsoid surface.
     * @property [rotation] The angle of rotation counter-clockwise from north.
     *   Default value - `0.0`
     * @property [stRotation] The rotation of the texture coordinates counter-clockwise from north.
     *   Default value - `0.0`
     * @property [granularity] The angular distance between points on the ellipse in radians.
     *   Default value - [Math.RADIANS_PER_DEGREE]
     * @property [vertexFormat] The vertex attributes to be computed.
     *   Default value - [VertexFormat.DEFAULT]
     */
    interface ConstructorOptions {
        var center: Cartesian3
        var semiMajorAxis: Double
        var semiMinorAxis: Double
        var ellipsoid: Ellipsoid?
        var height: Double?
        var extrudedHeight: Double?
        var rotation: Double?
        var stRotation: Double?
        var granularity: Double?
        var vertexFormat: VertexFormat?
    }

    companion object : Packable<EllipseGeometry> {
        /**
         * The number of elements used to pack the object into an array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseGeometry.html#.packedLength">Online Documentation</a>
         */
        override val packedLength: Int

        /**
         * Stores the provided instance into the provided array.
         * @param [value] The value to pack.
         * @param [array] The array to pack into.
         * @param [startingIndex] The index into the array at which to start packing the elements.
         *   Default value - `0`
         * @return The array that was packed into
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseGeometry.html#.pack">Online Documentation</a>
         */
        override fun pack(
            value: EllipseGeometry,
            array: Array<out Double>,
            startingIndex: Int?,
        ): Array<out Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new EllipseGeometry instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseGeometry.html#.unpack">Online Documentation</a>
         */
        override fun unpack(
            array: Array<out Double>,
            startingIndex: Int?,
            result: EllipseGeometry?,
        ): EllipseGeometry

        /**
         * Computes the bounding rectangle based on the provided options
         * @param [result] An object in which to store the result
         * @return The result rectangle
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseGeometry.html#.computeRectangle">Online Documentation</a>
         */
        fun computeRectangle(
            options: ComputeRectangleOptions,
            result: Rectangle? = definedExternally,
        ): Rectangle

        /**
         * @property [center] The ellipse's center point in the fixed frame.
         * @property [semiMajorAxis] The length of the ellipse's semi-major axis in meters.
         * @property [semiMinorAxis] The length of the ellipse's semi-minor axis in meters.
         * @property [ellipsoid] The ellipsoid the ellipse will be on.
         *   Default value - [Ellipsoid.WGS84]
         * @property [rotation] The angle of rotation counter-clockwise from north.
         *   Default value - `0.0`
         * @property [granularity] The angular distance between points on the ellipse in radians.
         *   Default value - [Math.RADIANS_PER_DEGREE]
         */
        interface ComputeRectangleOptions {
            var center: Cartesian3
            var semiMajorAxis: Double
            var semiMinorAxis: Double
            var ellipsoid: Ellipsoid?
            var rotation: Double?
            var granularity: Double?
        }

        /**
         * Computes the geometric representation of a ellipse on an ellipsoid, including its vertices, indices, and a bounding sphere.
         * @param [ellipseGeometry] A description of the ellipse.
         * @return The computed vertices and indices.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseGeometry.html#.createGeometry">Online Documentation</a>
         */
        fun createGeometry(ellipseGeometry: EllipseGeometry): Geometry?
    }
}

inline fun EllipseGeometry(
    block: EllipseGeometry.ConstructorOptions.() -> Unit,
): EllipseGeometry {
    val options: EllipseGeometry.ConstructorOptions = js("({})")
    block(options)
    return EllipseGeometry(options)
}
