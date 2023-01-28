// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.ReadonlyArray
import js.core.jso

/**
 * A description of a polyline with a volume (a 2D shape extruded along a polyline).
 * ```
 * function computeCircle(radius) {
 *   const positions = [];
 *   for (let i = 0; i < 360; i++) {
 *     const radians = Math.toRadians(i);
 *     positions.push(new Cartesian2(radius * Math.cos(radians), radius * Math.sin(radians)));
 *   }
 *   return positions;
 * }
 *
 * const volume = new PolylineVolumeGeometry({
 *   vertexFormat : VertexFormat.POSITION_ONLY,
 *   polylinePositions : Cartesian3.fromDegreesArray([
 *     -72.0, 40.0,
 *     -70.0, 35.0
 *   ]),
 *   shapePositions : computeCircle(100000.0)
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineVolumeGeometry.html">Online Documentation</a>
 */
external class PolylineVolumeGeometry(options: ConstructorOptions) {
    /**
     * @property [polylinePositions] An array of [Cartesian3] positions that define the center of the polyline volume.
     * @property [shapePositions] An array of [Cartesian2] positions that define the shape to be extruded along the polyline
     * @property [ellipsoid] The ellipsoid to be used as a reference.
     *   Default value - [Ellipsoid.WGS84]
     * @property [granularity] The distance, in radians, between each latitude and longitude. Determines the number of positions in the buffer.
     *   Default value - [Math.RADIANS_PER_DEGREE]
     * @property [vertexFormat] The vertex attributes to be computed.
     *   Default value - [VertexFormat.DEFAULT]
     * @property [cornerType] Determines the style of the corners.
     *   Default value - [CornerType.ROUNDED]
     */
    interface ConstructorOptions {
        var polylinePositions: ReadonlyArray<Cartesian3>
        var shapePositions: ReadonlyArray<Cartesian2>
        var ellipsoid: Ellipsoid?
        var granularity: Double?
        var vertexFormat: VertexFormat?
        var cornerType: CornerType?
    }

    /**
     * The number of elements used to pack the object into an array.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineVolumeGeometry.html#packedLength">Online Documentation</a>
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
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineVolumeGeometry.html#.pack">Online Documentation</a>
         */
        fun pack(
            value: PolylineVolumeGeometry,
            array: ReadonlyArray<Double>,
            startingIndex: Int? = definedExternally,
        ): ReadonlyArray<Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new PolylineVolumeGeometry instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineVolumeGeometry.html#.unpack">Online Documentation</a>
         */
        fun unpack(
            array: ReadonlyArray<Double>,
            startingIndex: Int? = definedExternally,
            result: PolylineVolumeGeometry? = definedExternally,
        ): PolylineVolumeGeometry

        /**
         * Computes the geometric representation of a polyline with a volume, including its vertices, indices, and a bounding sphere.
         * @param [polylineVolumeGeometry] A description of the polyline volume.
         * @return The computed vertices and indices.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineVolumeGeometry.html#.createGeometry">Online Documentation</a>
         */
        fun createGeometry(polylineVolumeGeometry: PolylineVolumeGeometry): Geometry?
    }
}

inline fun PolylineVolumeGeometry(
    block: PolylineVolumeGeometry.ConstructorOptions.() -> Unit,
): PolylineVolumeGeometry =
    PolylineVolumeGeometry(options = jso(block))
