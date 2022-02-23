// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * A description of a wall, which is similar to a KML line string. A wall is defined by a series of points,
 * which extrude down to the ground. Optionally, they can extrude downwards to a specified height.
 * ```
 * // create a wall that spans from ground level to 10000 meters
 * const wall = new WallGeometry({
 *   positions : Cartesian3.fromDegreesArrayHeights([
 *     19.0, 47.0, 10000.0,
 *     19.0, 48.0, 10000.0,
 *     20.0, 48.0, 10000.0,
 *     20.0, 47.0, 10000.0,
 *     19.0, 47.0, 10000.0
 *   ])
 * });
 * const geometry = WallGeometry.createGeometry(wall);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WallGeometry.html">Online Documentation</a>
 */
external class WallGeometry(options: ConstructorOptions) {
    /**
     * @property [positions] An array of Cartesian objects, which are the points of the wall.
     * @property [granularity] The distance, in radians, between each latitude and longitude. Determines the number of positions in the buffer.
     *   Default value - [Math.RADIANS_PER_DEGREE]
     * @property [maximumHeights] An array parallel to `positions` that give the maximum height of the
     *   wall at `positions`. If undefined, the height of each position in used.
     * @property [minimumHeights] An array parallel to `positions` that give the minimum height of the
     *   wall at `positions`. If undefined, the height at each position is 0.0.
     * @property [ellipsoid] The ellipsoid for coordinate manipulation
     *   Default value - [Ellipsoid.WGS84]
     * @property [vertexFormat] The vertex attributes to be computed.
     *   Default value - [VertexFormat.DEFAULT]
     */
    interface ConstructorOptions {
        var positions: Array<out Cartesian3>
        var granularity: Double?
        var maximumHeights: Array<out Double>?
        var minimumHeights: Array<out Double>?
        var ellipsoid: Ellipsoid?
        var vertexFormat: VertexFormat?
    }

    /**
     * The number of elements used to pack the object into an array.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WallGeometry.html#packedLength">Online Documentation</a>
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
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WallGeometry.html#.pack">Online Documentation</a>
         */
        fun pack(
            value: WallGeometry,
            array: Array<out Double>,
            startingIndex: Int? = definedExternally,
        ): Array<out Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new WallGeometry instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WallGeometry.html#.unpack">Online Documentation</a>
         */
        fun unpack(
            array: Array<out Double>,
            startingIndex: Int? = definedExternally,
            result: WallGeometry? = definedExternally,
        ): WallGeometry

        /**
         * A description of a wall, which is similar to a KML line string. A wall is defined by a series of points,
         * which extrude down to the ground. Optionally, they can extrude downwards to a specified height.
         * ```
         * // create a wall that spans from 10000 meters to 20000 meters
         * const wall = WallGeometry.fromConstantHeights({
         *   positions : Cartesian3.fromDegreesArray([
         *     19.0, 47.0,
         *     19.0, 48.0,
         *     20.0, 48.0,
         *     20.0, 47.0,
         *     19.0, 47.0,
         *   ]),
         *   minimumHeight : 20000.0,
         *   maximumHeight : 10000.0
         * });
         * const geometry = WallGeometry.createGeometry(wall);
         * ```
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WallGeometry.html#.fromConstantHeights">Online Documentation</a>
         */
        fun fromConstantHeights(options: FromConstantHeightsOptions): WallGeometry

        /**
         * @property [positions] An array of Cartesian objects, which are the points of the wall.
         * @property [maximumHeight] A constant that defines the maximum height of the
         *   wall at `positions`. If undefined, the height of each position in used.
         * @property [minimumHeight] A constant that defines the minimum height of the
         *   wall at `positions`. If undefined, the height at each position is 0.0.
         * @property [ellipsoid] The ellipsoid for coordinate manipulation
         *   Default value - [Ellipsoid.WGS84]
         * @property [vertexFormat] The vertex attributes to be computed.
         *   Default value - [VertexFormat.DEFAULT]
         */
        interface FromConstantHeightsOptions {
            var positions: Array<out Cartesian3>
            var maximumHeight: Double?
            var minimumHeight: Double?
            var ellipsoid: Ellipsoid?
            var vertexFormat: VertexFormat?
        }

        /**
         * Computes the geometric representation of a wall, including its vertices, indices, and a bounding sphere.
         * @param [wallGeometry] A description of the wall.
         * @return The computed vertices and indices.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WallGeometry.html#.createGeometry">Online Documentation</a>
         */
        fun createGeometry(wallGeometry: WallGeometry): Geometry?
    }
}

inline fun WallGeometry(
    block: WallGeometry.ConstructorOptions.() -> Unit,
): WallGeometry {
    val options: WallGeometry.ConstructorOptions = js("({})")
    block(options)
    return WallGeometry(options)
}
