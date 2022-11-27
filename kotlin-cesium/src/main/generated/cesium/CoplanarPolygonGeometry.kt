// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.ReadonlyArray

/**
 * A description of a polygon composed of arbitrary coplanar positions.
 * ```
 * const polygonGeometry = new CoplanarPolygonGeometry({
 *  polygonHierarchy: new PolygonHierarchy(
 *     Cartesian3.fromDegreesArrayHeights([
 *      -90.0, 30.0, 0.0,
 *      -90.0, 30.0, 300000.0,
 *      -80.0, 30.0, 300000.0,
 *      -80.0, 30.0, 0.0
 *   ]))
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CoplanarPolygonGeometry.html">Online Documentation</a>
 */
external class CoplanarPolygonGeometry(options: ConstructorOptions) {
    /**
     * @property [polygonHierarchy] A polygon hierarchy that can include holes.
     * @property [stRotation] The rotation of the texture coordinates, in radians. A positive rotation is counter-clockwise.
     *   Default value - `0.0`
     * @property [vertexFormat] The vertex attributes to be computed.
     *   Default value - [VertexFormat.DEFAULT]
     * @property [ellipsoid] The ellipsoid to be used as a reference.
     *   Default value - [Ellipsoid.WGS84]
     * @property [textureCoordinates] Texture coordinates as a [PolygonHierarchy] of [Cartesian2] points.
     */
    interface ConstructorOptions {
        var polygonHierarchy: PolygonHierarchy
        var stRotation: Double?
        var vertexFormat: VertexFormat?
        var ellipsoid: Ellipsoid?
        var textureCoordinates: PolygonHierarchy?
    }

    /**
     * The number of elements used to pack the object into an array.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CoplanarPolygonGeometry.html#packedLength">Online Documentation</a>
     */
    val packedLength: Int

    companion object {
        /**
         * A description of a coplanar polygon from an array of positions.
         * ```
         * // create a polygon from points
         * const polygon = CoplanarPolygonGeometry.fromPositions({
         *   positions : Cartesian3.fromDegreesArray([
         *     -72.0, 40.0,
         *     -70.0, 35.0,
         *     -75.0, 30.0,
         *     -70.0, 30.0,
         *     -68.0, 40.0
         *   ])
         * });
         * const geometry = PolygonGeometry.createGeometry(polygon);
         * ```
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CoplanarPolygonGeometry.html#.fromPositions">Online Documentation</a>
         */
        fun fromPositions(options: FromPositionsOptions): CoplanarPolygonGeometry

        /**
         * @property [positions] An array of positions that defined the corner points of the polygon.
         * @property [vertexFormat] The vertex attributes to be computed.
         *   Default value - [VertexFormat.DEFAULT]
         * @property [stRotation] The rotation of the texture coordinates, in radians. A positive rotation is counter-clockwise.
         *   Default value - `0.0`
         * @property [ellipsoid] The ellipsoid to be used as a reference.
         *   Default value - [Ellipsoid.WGS84]
         * @property [textureCoordinates] Texture coordinates as a [PolygonHierarchy] of [Cartesian2] points.
         */
        interface FromPositionsOptions {
            var positions: ReadonlyArray<Cartesian3>
            var vertexFormat: VertexFormat?
            var stRotation: Double?
            var ellipsoid: Ellipsoid?
            var textureCoordinates: PolygonHierarchy?
        }

        /**
         * Stores the provided instance into the provided array.
         * @param [value] The value to pack.
         * @param [array] The array to pack into.
         * @param [startingIndex] The index into the array at which to start packing the elements.
         *   Default value - `0`
         * @return The array that was packed into
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CoplanarPolygonGeometry.html#.pack">Online Documentation</a>
         */
        fun pack(
            value: CoplanarPolygonGeometry,
            array: ReadonlyArray<Double>,
            startingIndex: Int? = definedExternally,
        ): ReadonlyArray<Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new CoplanarPolygonGeometry instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CoplanarPolygonGeometry.html#.unpack">Online Documentation</a>
         */
        fun unpack(
            array: ReadonlyArray<Double>,
            startingIndex: Int? = definedExternally,
            result: CoplanarPolygonGeometry? = definedExternally,
        ): CoplanarPolygonGeometry

        /**
         * Computes the geometric representation of an arbitrary coplanar polygon, including its vertices, indices, and a bounding sphere.
         * @param [polygonGeometry] A description of the polygon.
         * @return The computed vertices and indices.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CoplanarPolygonGeometry.html#.createGeometry">Online Documentation</a>
         */
        fun createGeometry(polygonGeometry: CoplanarPolygonGeometry): Geometry?
    }
}

inline fun CoplanarPolygonGeometry(
    block: CoplanarPolygonGeometry.ConstructorOptions.() -> Unit,
): CoplanarPolygonGeometry {
    val options: CoplanarPolygonGeometry.ConstructorOptions = js("({})")
    block(options)
    return CoplanarPolygonGeometry(options)
}
