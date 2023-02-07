// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.ReadonlyArray
import js.core.jso

/**
 * Describes geometry representing a plane centered at the origin, with a unit width and length.
 * ```
 * const planeGeometry = new PlaneGeometry({
 *   vertexFormat : VertexFormat.POSITION_ONLY
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PlaneGeometry.html">Online Documentation</a>
 */
external class PlaneGeometry(options: ConstructorOptions? = definedExternally) {
    /**
     * @property [vertexFormat] The vertex attributes to be computed.
     *   Default value - [VertexFormat.DEFAULT]
     */
    interface ConstructorOptions {
        var vertexFormat: VertexFormat?
    }

    companion object : Packable<PlaneGeometry> {
        /**
         * The number of elements used to pack the object into an array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PlaneGeometry.html#.packedLength">Online Documentation</a>
         */
        override val packedLength: Int

        /**
         * Stores the provided instance into the provided array.
         * @param [value] The value to pack.
         * @param [array] The array to pack into.
         * @param [startingIndex] The index into the array at which to start packing the elements.
         *   Default value - `0`
         * @return The array that was packed into
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PlaneGeometry.html#.pack">Online Documentation</a>
         */
        override fun pack(
            value: PlaneGeometry,
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
        ): ReadonlyArray<Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new PlaneGeometry instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PlaneGeometry.html#.unpack">Online Documentation</a>
         */
        override fun unpack(
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
            result: PlaneGeometry?,
        ): PlaneGeometry

        /**
         * Computes the geometric representation of a plane, including its vertices, indices, and a bounding sphere.
         * @param [planeGeometry] A description of the plane.
         * @return The computed vertices and indices.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PlaneGeometry.html#.createGeometry">Online Documentation</a>
         */
        fun createGeometry(planeGeometry: PlaneGeometry): Geometry?
    }
}

inline fun PlaneGeometry(
    block: PlaneGeometry.ConstructorOptions.() -> Unit,
): PlaneGeometry =
    PlaneGeometry(options = jso(block))
