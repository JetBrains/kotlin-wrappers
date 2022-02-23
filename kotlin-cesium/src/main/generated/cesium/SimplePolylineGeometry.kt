// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * A description of a polyline modeled as a line strip; the first two positions define a line segment,
 * and each additional position defines a line segment from the previous position.
 * ```
 * // A polyline with two connected line segments
 * const polyline = new SimplePolylineGeometry({
 *   positions : Cartesian3.fromDegreesArray([
 *     0.0, 0.0,
 *     5.0, 0.0,
 *     5.0, 5.0
 *   ])
 * });
 * const geometry = SimplePolylineGeometry.createGeometry(polyline);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SimplePolylineGeometry.html">Online Documentation</a>
 */
external class SimplePolylineGeometry(options: ConstructorOptions) {
    /**
     * @property [positions] An array of [Cartesian3] defining the positions in the polyline as a line strip.
     * @property [colors] An Array of [Color] defining the per vertex or per segment colors.
     * @property [colorsPerVertex] A boolean that determines whether the colors will be flat across each segment of the line or interpolated across the vertices.
     *   Default value - `false`
     * @property [arcType] The type of line the polyline segments must follow.
     *   Default value - [ArcType.GEODESIC]
     * @property [granularity] The distance, in radians, between each latitude and longitude if options.arcType is not ArcType.NONE. Determines the number of positions in the buffer.
     *   Default value - [Math.RADIANS_PER_DEGREE]
     * @property [ellipsoid] The ellipsoid to be used as a reference.
     *   Default value - [Ellipsoid.WGS84]
     */
    interface ConstructorOptions {
        var positions: Array<out Cartesian3>
        var colors: Array<out Color>?
        var colorsPerVertex: Boolean?
        var arcType: ArcType?
        var granularity: Double?
        var ellipsoid: Ellipsoid?
    }

    /**
     * The number of elements used to pack the object into an array.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SimplePolylineGeometry.html#packedLength">Online Documentation</a>
     */
    val packedLength: Int

    companion object {
        /**
         * Stores the provided instance into the provided array.
         * @param [value] The value to pack.
         * @param [array] The array to pack into.
         * @param [startingIndex] The index into the array at which to start packing the elements.
         *   Default value - `0`
         * @return The array that was packed into
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SimplePolylineGeometry.html#.pack">Online Documentation</a>
         */
        fun pack(
            value: SimplePolylineGeometry,
            array: Array<out Double>,
            startingIndex: Int? = definedExternally,
        ): Array<out Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new SimplePolylineGeometry instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SimplePolylineGeometry.html#.unpack">Online Documentation</a>
         */
        fun unpack(
            array: Array<out Double>,
            startingIndex: Int? = definedExternally,
            result: SimplePolylineGeometry? = definedExternally,
        ): SimplePolylineGeometry

        /**
         * Computes the geometric representation of a simple polyline, including its vertices, indices, and a bounding sphere.
         * @param [simplePolylineGeometry] A description of the polyline.
         * @return The computed vertices and indices.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SimplePolylineGeometry.html#.createGeometry">Online Documentation</a>
         */
        fun createGeometry(simplePolylineGeometry: SimplePolylineGeometry): Geometry?
    }
}

inline fun SimplePolylineGeometry(
    block: SimplePolylineGeometry.ConstructorOptions.() -> Unit,
): SimplePolylineGeometry {
    val options: SimplePolylineGeometry.ConstructorOptions = js("({})")
    block(options)
    return SimplePolylineGeometry(options)
}
