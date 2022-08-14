// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import kotlinx.js.ReadonlyArray

/**
 * A description of a polyline modeled as a line strip; the first two positions define a line segment,
 * and each additional position defines a line segment from the previous position. The polyline is capable of
 * displaying with a material.
 * ```
 * // A polyline with two connected line segments
 * const polyline = new PolylineGeometry({
 *   positions : Cartesian3.fromDegreesArray([
 *     0.0, 0.0,
 *     5.0, 0.0,
 *     5.0, 5.0
 *   ]),
 *   width : 10.0
 * });
 * const geometry = PolylineGeometry.createGeometry(polyline);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGeometry.html">Online Documentation</a>
 */
external class PolylineGeometry(options: ConstructorOptions) {
    /**
     * @property [positions] An array of [Cartesian3] defining the positions in the polyline as a line strip.
     * @property [width] The width in pixels.
     *   Default value - `1.0`
     * @property [colors] An Array of [Color] defining the per vertex or per segment colors.
     * @property [colorsPerVertex] A boolean that determines whether the colors will be flat across each segment of the line or interpolated across the vertices.
     *   Default value - `false`
     * @property [arcType] The type of line the polyline segments must follow.
     *   Default value - [ArcType.GEODESIC]
     * @property [granularity] The distance, in radians, between each latitude and longitude if options.arcType is not ArcType.NONE. Determines the number of positions in the buffer.
     *   Default value - [Math.RADIANS_PER_DEGREE]
     * @property [vertexFormat] The vertex attributes to be computed.
     *   Default value - [VertexFormat.DEFAULT]
     * @property [ellipsoid] The ellipsoid to be used as a reference.
     *   Default value - [Ellipsoid.WGS84]
     */
    interface ConstructorOptions {
        var positions: ReadonlyArray<Cartesian3>
        var width: Double?
        var colors: ReadonlyArray<Color>?
        var colorsPerVertex: Boolean?
        var arcType: ArcType?
        var granularity: Double?
        var vertexFormat: VertexFormat?
        var ellipsoid: Ellipsoid?
    }

    /**
     * The number of elements used to pack the object into an array.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGeometry.html#packedLength">Online Documentation</a>
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
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGeometry.html#.pack">Online Documentation</a>
         */
        fun pack(
            value: PolylineGeometry,
            array: ReadonlyArray<Double>,
            startingIndex: Int? = definedExternally,
        ): ReadonlyArray<Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new PolylineGeometry instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGeometry.html#.unpack">Online Documentation</a>
         */
        fun unpack(
            array: ReadonlyArray<Double>,
            startingIndex: Int? = definedExternally,
            result: PolylineGeometry? = definedExternally,
        ): PolylineGeometry

        /**
         * Computes the geometric representation of a polyline, including its vertices, indices, and a bounding sphere.
         * @param [polylineGeometry] A description of the polyline.
         * @return The computed vertices and indices.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGeometry.html#.createGeometry">Online Documentation</a>
         */
        fun createGeometry(polylineGeometry: PolylineGeometry): Geometry?
    }
}

inline fun PolylineGeometry(
    block: PolylineGeometry.ConstructorOptions.() -> Unit,
): PolylineGeometry {
    val options: PolylineGeometry.ConstructorOptions = js("({})")
    block(options)
    return PolylineGeometry(options)
}
