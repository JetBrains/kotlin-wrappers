// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.ReadonlyArray
import js.core.jso

/**
 * A description of a cylinder.
 * ```
 * // create cylinder geometry
 * const cylinder = new CylinderGeometry({
 *     length: 200000,
 *     topRadius: 80000,
 *     bottomRadius: 200000,
 * });
 * const geometry = CylinderGeometry.createGeometry(cylinder);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CylinderGeometry.html">Online Documentation</a>
 */
external class CylinderGeometry(options: ConstructorOptions) {
    /**
     * @property [length] The length of the cylinder.
     * @property [topRadius] The radius of the top of the cylinder.
     * @property [bottomRadius] The radius of the bottom of the cylinder.
     * @property [slices] The number of edges around the perimeter of the cylinder.
     *   Default value - `128`
     * @property [vertexFormat] The vertex attributes to be computed.
     *   Default value - [VertexFormat.DEFAULT]
     */
    interface ConstructorOptions {
        var length: Int
        var topRadius: Double
        var bottomRadius: Double
        var slices: Int?
        var vertexFormat: VertexFormat?
    }

    companion object : Packable<CylinderGeometry> {
        /**
         * The number of elements used to pack the object into an array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CylinderGeometry.html#.packedLength">Online Documentation</a>
         */
        override val packedLength: Int

        /**
         * Stores the provided instance into the provided array.
         * @param [value] The value to pack.
         * @param [array] The array to pack into.
         * @param [startingIndex] The index into the array at which to start packing the elements.
         *   Default value - `0`
         * @return The array that was packed into
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CylinderGeometry.html#.pack">Online Documentation</a>
         */
        override fun pack(
            value: CylinderGeometry,
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
        ): ReadonlyArray<Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new CylinderGeometry instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CylinderGeometry.html#.unpack">Online Documentation</a>
         */
        override fun unpack(
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
            result: CylinderGeometry?,
        ): CylinderGeometry

        /**
         * Computes the geometric representation of a cylinder, including its vertices, indices, and a bounding sphere.
         * @param [cylinderGeometry] A description of the cylinder.
         * @return The computed vertices and indices.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CylinderGeometry.html#.createGeometry">Online Documentation</a>
         */
        fun createGeometry(cylinderGeometry: CylinderGeometry): Geometry?
    }
}

inline fun CylinderGeometry(
    block: CylinderGeometry.ConstructorOptions.() -> Unit,
): CylinderGeometry =
    CylinderGeometry(options = jso(block))
