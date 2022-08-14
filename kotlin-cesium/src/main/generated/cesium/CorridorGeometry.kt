// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import kotlinx.js.ReadonlyArray

/**
 * A description of a corridor. Corridor geometry can be rendered with both [Primitive] and [GroundPrimitive].
 * ```
 * const corridor = new CorridorGeometry({
 *   vertexFormat : VertexFormat.POSITION_ONLY,
 *   positions : Cartesian3.fromDegreesArray([-72.0, 40.0, -70.0, 35.0]),
 *   width : 100000
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorridorGeometry.html">Online Documentation</a>
 */
external class CorridorGeometry(options: ConstructorOptions) {
    /**
     * @property [positions] An array of positions that define the center of the corridor.
     * @property [width] The distance between the edges of the corridor in meters.
     * @property [ellipsoid] The ellipsoid to be used as a reference.
     *   Default value - [Ellipsoid.WGS84]
     * @property [granularity] The distance, in radians, between each latitude and longitude. Determines the number of positions in the buffer.
     *   Default value - [Math.RADIANS_PER_DEGREE]
     * @property [height] The distance in meters between the ellipsoid surface and the positions.
     *   Default value - `0`
     * @property [extrudedHeight] The distance in meters between the ellipsoid surface and the extruded face.
     * @property [vertexFormat] The vertex attributes to be computed.
     *   Default value - [VertexFormat.DEFAULT]
     * @property [cornerType] Determines the style of the corners.
     *   Default value - [CornerType.ROUNDED]
     */
    interface ConstructorOptions {
        var positions: ReadonlyArray<Cartesian3>
        var width: Double
        var ellipsoid: Ellipsoid?
        var granularity: Double?
        var height: Double?
        var extrudedHeight: Double?
        var vertexFormat: VertexFormat?
        var cornerType: CornerType?
    }

    /**
     * The number of elements used to pack the object into an array.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorridorGeometry.html#packedLength">Online Documentation</a>
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
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorridorGeometry.html#.pack">Online Documentation</a>
         */
        fun pack(
            value: CorridorGeometry,
            array: ReadonlyArray<Double>,
            startingIndex: Int? = definedExternally,
        ): ReadonlyArray<Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new CorridorGeometry instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorridorGeometry.html#.unpack">Online Documentation</a>
         */
        fun unpack(
            array: ReadonlyArray<Double>,
            startingIndex: Int? = definedExternally,
            result: CorridorGeometry? = definedExternally,
        ): CorridorGeometry

        /**
         * Computes the bounding rectangle given the provided options
         * @param [result] An object in which to store the result.
         * @return The result rectangle.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorridorGeometry.html#.computeRectangle">Online Documentation</a>
         */
        fun computeRectangle(
            options: ComputeRectangleOptions,
            result: Rectangle? = definedExternally,
        ): Rectangle

        /**
         * @property [positions] An array of positions that define the center of the corridor.
         * @property [width] The distance between the edges of the corridor in meters.
         * @property [ellipsoid] The ellipsoid to be used as a reference.
         *   Default value - [Ellipsoid.WGS84]
         * @property [cornerType] Determines the style of the corners.
         *   Default value - [CornerType.ROUNDED]
         */
        interface ComputeRectangleOptions {
            var positions: ReadonlyArray<Cartesian3>
            var width: Double
            var ellipsoid: Ellipsoid?
            var cornerType: CornerType?
        }

        /**
         * Computes the geometric representation of a corridor, including its vertices, indices, and a bounding sphere.
         * @param [corridorGeometry] A description of the corridor.
         * @return The computed vertices and indices.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorridorGeometry.html#.createGeometry">Online Documentation</a>
         */
        fun createGeometry(corridorGeometry: CorridorGeometry): Geometry?
    }
}

inline fun CorridorGeometry(
    block: CorridorGeometry.ConstructorOptions.() -> Unit,
): CorridorGeometry {
    val options: CorridorGeometry.ConstructorOptions = js("({})")
    block(options)
    return CorridorGeometry(options)
}
