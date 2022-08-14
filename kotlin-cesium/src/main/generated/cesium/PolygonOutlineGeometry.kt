// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import kotlinx.js.ReadonlyArray

/**
 * A description of the outline of a polygon on the ellipsoid. The polygon is defined by a polygon hierarchy.
 * ```
 * // 1. create a polygon outline from points
 * const polygon = new PolygonOutlineGeometry({
 *   polygonHierarchy : new PolygonHierarchy(
 *     Cartesian3.fromDegreesArray([
 *       -72.0, 40.0,
 *       -70.0, 35.0,
 *       -75.0, 30.0,
 *       -70.0, 30.0,
 *       -68.0, 40.0
 *     ])
 *   )
 * });
 * const geometry = PolygonOutlineGeometry.createGeometry(polygon);
 *
 * // 2. create a nested polygon with holes outline
 * const polygonWithHole = new PolygonOutlineGeometry({
 *   polygonHierarchy : new PolygonHierarchy(
 *     Cartesian3.fromDegreesArray([
 *       -109.0, 30.0,
 *       -95.0, 30.0,
 *       -95.0, 40.0,
 *       -109.0, 40.0
 *     ]),
 *     [new PolygonHierarchy(
 *       Cartesian3.fromDegreesArray([
 *         -107.0, 31.0,
 *         -107.0, 39.0,
 *         -97.0, 39.0,
 *         -97.0, 31.0
 *       ]),
 *       [new PolygonHierarchy(
 *         Cartesian3.fromDegreesArray([
 *           -105.0, 33.0,
 *           -99.0, 33.0,
 *           -99.0, 37.0,
 *           -105.0, 37.0
 *         ]),
 *         [new PolygonHierarchy(
 *           Cartesian3.fromDegreesArray([
 *             -103.0, 34.0,
 *             -101.0, 34.0,
 *             -101.0, 36.0,
 *             -103.0, 36.0
 *           ])
 *         )]
 *       )]
 *     )]
 *   )
 * });
 * const geometry = PolygonOutlineGeometry.createGeometry(polygonWithHole);
 *
 * // 3. create extruded polygon outline
 * const extrudedPolygon = new PolygonOutlineGeometry({
 *   polygonHierarchy : new PolygonHierarchy(
 *     Cartesian3.fromDegreesArray([
 *       -72.0, 40.0,
 *       -70.0, 35.0,
 *       -75.0, 30.0,
 *       -70.0, 30.0,
 *       -68.0, 40.0
 *     ])
 *   ),
 *   extrudedHeight: 300000
 * });
 * const geometry = PolygonOutlineGeometry.createGeometry(extrudedPolygon);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonOutlineGeometry.html">Online Documentation</a>
 */
external class PolygonOutlineGeometry(options: ConstructorOptions) {
    /**
     * @property [polygonHierarchy] A polygon hierarchy that can include holes.
     * @property [height] The distance in meters between the polygon and the ellipsoid surface.
     *   Default value - `0.0`
     * @property [extrudedHeight] The distance in meters between the polygon's extruded face and the ellipsoid surface.
     * @property [vertexFormat] The vertex attributes to be computed.
     *   Default value - [VertexFormat.DEFAULT]
     * @property [ellipsoid] The ellipsoid to be used as a reference.
     *   Default value - [Ellipsoid.WGS84]
     * @property [granularity] The distance, in radians, between each latitude and longitude. Determines the number of positions in the buffer.
     *   Default value - [Math.RADIANS_PER_DEGREE]
     * @property [perPositionHeight] Use the height of options.positions for each position instead of using options.height to determine the height.
     *   Default value - `false`
     * @property [arcType] The type of path the outline must follow. Valid options are [ArcType.GEODESIC] and [ArcType.RHUMB].
     *   Default value - [ArcType.GEODESIC]
     */
    interface ConstructorOptions {
        var polygonHierarchy: PolygonHierarchy
        var height: Double?
        var extrudedHeight: Double?
        var vertexFormat: VertexFormat?
        var ellipsoid: Ellipsoid?
        var granularity: Double?
        var perPositionHeight: Boolean?
        var arcType: ArcType?
    }

    /**
     * The number of elements used to pack the object into an array.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonOutlineGeometry.html#packedLength">Online Documentation</a>
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
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonOutlineGeometry.html#.pack">Online Documentation</a>
         */
        fun pack(
            value: PolygonOutlineGeometry,
            array: ReadonlyArray<Double>,
            startingIndex: Int? = definedExternally,
        ): ReadonlyArray<Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new PolygonOutlineGeometry instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonOutlineGeometry.html#.unpack">Online Documentation</a>
         */
        fun unpack(
            array: ReadonlyArray<Double>,
            startingIndex: Int? = definedExternally,
            result: PolygonOutlineGeometry? = definedExternally,
        ): PolygonOutlineGeometry

        /**
         * A description of a polygon outline from an array of positions.
         * ```
         * // create a polygon from points
         * const polygon = PolygonOutlineGeometry.fromPositions({
         *   positions : Cartesian3.fromDegreesArray([
         *     -72.0, 40.0,
         *     -70.0, 35.0,
         *     -75.0, 30.0,
         *     -70.0, 30.0,
         *     -68.0, 40.0
         *   ])
         * });
         * const geometry = PolygonOutlineGeometry.createGeometry(polygon);
         * ```
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonOutlineGeometry.html#.fromPositions">Online Documentation</a>
         */
        fun fromPositions(options: FromPositionsOptions): PolygonOutlineGeometry

        /**
         * @property [positions] An array of positions that defined the corner points of the polygon.
         * @property [height] The height of the polygon.
         *   Default value - `0.0`
         * @property [extrudedHeight] The height of the polygon extrusion.
         * @property [ellipsoid] The ellipsoid to be used as a reference.
         *   Default value - [Ellipsoid.WGS84]
         * @property [granularity] The distance, in radians, between each latitude and longitude. Determines the number of positions in the buffer.
         *   Default value - [Math.RADIANS_PER_DEGREE]
         * @property [perPositionHeight] Use the height of options.positions for each position instead of using options.height to determine the height.
         *   Default value - `false`
         * @property [arcType] The type of path the outline must follow. Valid options are [LinkType.GEODESIC] and [ArcType.RHUMB].
         *   Default value - [ArcType.GEODESIC]
         */
        interface FromPositionsOptions {
            var positions: ReadonlyArray<Cartesian3>
            var height: Double?
            var extrudedHeight: Double?
            var ellipsoid: Ellipsoid?
            var granularity: Double?
            var perPositionHeight: Boolean?
            var arcType: ArcType?
        }

        /**
         * Computes the geometric representation of a polygon outline, including its vertices, indices, and a bounding sphere.
         * @param [polygonGeometry] A description of the polygon outline.
         * @return The computed vertices and indices.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonOutlineGeometry.html#.createGeometry">Online Documentation</a>
         */
        fun createGeometry(polygonGeometry: PolygonOutlineGeometry): Geometry?
    }
}

inline fun PolygonOutlineGeometry(
    block: PolygonOutlineGeometry.ConstructorOptions.() -> Unit,
): PolygonOutlineGeometry {
    val options: PolygonOutlineGeometry.ConstructorOptions = js("({})")
    block(options)
    return PolygonOutlineGeometry(options)
}
