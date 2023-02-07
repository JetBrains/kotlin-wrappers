// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.ReadonlyArray
import js.core.jso

/**
 * A description of the outline of a polygon composed of arbitrary coplanar positions.
 * ```
 * const polygonOutline = new CoplanarPolygonOutlineGeometry({
 *   positions : Cartesian3.fromDegreesArrayHeights([
 *      -90.0, 30.0, 0.0,
 *      -90.0, 30.0, 1000.0,
 *      -80.0, 30.0, 1000.0,
 *      -80.0, 30.0, 0.0
 *   ])
 * });
 * const geometry = CoplanarPolygonOutlineGeometry.createGeometry(polygonOutline);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CoplanarPolygonOutlineGeometry.html">Online Documentation</a>
 */
external class CoplanarPolygonOutlineGeometry(options: ConstructorOptions) {
    /**
     * @property [polygonHierarchy] A polygon hierarchy that can include holes.
     */
    interface ConstructorOptions {
        var polygonHierarchy: PolygonHierarchy
    }

    /**
     * The number of elements used to pack the object into an array.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CoplanarPolygonOutlineGeometry.html#packedLength">Online Documentation</a>
     */
    val packedLength: Int

    companion object {
        /**
         * A description of a coplanar polygon outline from an array of positions.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CoplanarPolygonOutlineGeometry.html#.fromPositions">Online Documentation</a>
         */
        fun fromPositions(options: FromPositionsOptions): CoplanarPolygonOutlineGeometry

        /**
         * @property [positions] An array of positions that defined the corner points of the polygon.
         */
        interface FromPositionsOptions {
            var positions: ReadonlyArray<Cartesian3>
        }

        /**
         * Stores the provided instance into the provided array.
         * @param [value] The value to pack.
         * @param [array] The array to pack into.
         * @param [startingIndex] The index into the array at which to start packing the elements.
         *   Default value - `0`
         * @return The array that was packed into
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CoplanarPolygonOutlineGeometry.html#.pack">Online Documentation</a>
         */
        fun pack(
            value: CoplanarPolygonOutlineGeometry,
            array: ReadonlyArray<Double>,
            startingIndex: Int? = definedExternally,
        ): ReadonlyArray<Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new CoplanarPolygonOutlineGeometry instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CoplanarPolygonOutlineGeometry.html#.unpack">Online Documentation</a>
         */
        fun unpack(
            array: ReadonlyArray<Double>,
            startingIndex: Int? = definedExternally,
            result: CoplanarPolygonOutlineGeometry? = definedExternally,
        ): CoplanarPolygonOutlineGeometry

        /**
         * Computes the geometric representation of an arbitrary coplanar polygon, including its vertices, indices, and a bounding sphere.
         * @param [polygonGeometry] A description of the polygon.
         * @return The computed vertices and indices.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CoplanarPolygonOutlineGeometry.html#.createGeometry">Online Documentation</a>
         */
        fun createGeometry(polygonGeometry: CoplanarPolygonOutlineGeometry): Geometry?
    }
}

inline fun CoplanarPolygonOutlineGeometry(
    block: CoplanarPolygonOutlineGeometry.ConstructorOptions.() -> Unit,
): CoplanarPolygonOutlineGeometry =
    CoplanarPolygonOutlineGeometry(options = jso(block))
