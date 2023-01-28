// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.ReadonlyArray
import js.core.jso

/**
 * A description of a sphere centered at the origin.
 * ```
 * const sphere = new SphereGeometry({
 *   radius : 100.0,
 *   vertexFormat : VertexFormat.POSITION_ONLY
 * });
 * const geometry = SphereGeometry.createGeometry(sphere);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SphereGeometry.html">Online Documentation</a>
 */
external class SphereGeometry(options: ConstructorOptions? = definedExternally) {
    /**
     * @property [radius] The radius of the sphere.
     *   Default value - `1.0`
     * @property [stackPartitions] The number of times to partition the ellipsoid into stacks.
     *   Default value - `64`
     * @property [slicePartitions] The number of times to partition the ellipsoid into radial slices.
     *   Default value - `64`
     * @property [vertexFormat] The vertex attributes to be computed.
     *   Default value - [VertexFormat.DEFAULT]
     */
    interface ConstructorOptions {
        var radius: Double?
        var stackPartitions: Int?
        var slicePartitions: Int?
        var vertexFormat: VertexFormat?
    }

    companion object : Packable<SphereGeometry> {
        /**
         * The number of elements used to pack the object into an array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SphereGeometry.html#.packedLength">Online Documentation</a>
         */
        override val packedLength: Int

        /**
         * Stores the provided instance into the provided array.
         * @param [value] The value to pack.
         * @param [array] The array to pack into.
         * @param [startingIndex] The index into the array at which to start packing the elements.
         *   Default value - `0`
         * @return The array that was packed into
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SphereGeometry.html#.pack">Online Documentation</a>
         */
        override fun pack(
            value: SphereGeometry,
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
        ): ReadonlyArray<Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new SphereGeometry instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SphereGeometry.html#.unpack">Online Documentation</a>
         */
        override fun unpack(
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
            result: SphereGeometry?,
        ): SphereGeometry

        /**
         * Computes the geometric representation of a sphere, including its vertices, indices, and a bounding sphere.
         * @param [sphereGeometry] A description of the sphere.
         * @return The computed vertices and indices.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SphereGeometry.html#.createGeometry">Online Documentation</a>
         */
        fun createGeometry(sphereGeometry: SphereGeometry): Geometry?
    }
}

inline fun SphereGeometry(
    block: SphereGeometry.ConstructorOptions.() -> Unit,
): SphereGeometry =
    SphereGeometry(options = jso(block))
