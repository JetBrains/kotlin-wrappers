// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.ReadonlyArray
import js.core.jso

/**
 * Describes a cube centered at the origin.
 * ```
 * const box = new BoxGeometry({
 *   vertexFormat : VertexFormat.POSITION_ONLY,
 *   maximum : new Cartesian3(250000.0, 250000.0, 250000.0),
 *   minimum : new Cartesian3(-250000.0, -250000.0, -250000.0)
 * });
 * const geometry = BoxGeometry.createGeometry(box);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoxGeometry.html">Online Documentation</a>
 */
external class BoxGeometry(options: ConstructorOptions) {
    /**
     * @property [minimum] The minimum x, y, and z coordinates of the box.
     * @property [maximum] The maximum x, y, and z coordinates of the box.
     * @property [vertexFormat] The vertex attributes to be computed.
     *   Default value - [VertexFormat.DEFAULT]
     */
    interface ConstructorOptions {
        var minimum: Cartesian3
        var maximum: Cartesian3
        var vertexFormat: VertexFormat?
    }

    companion object : Packable<BoxGeometry> {
        /**
         * Creates a cube centered at the origin given its dimensions.
         * ```
         * const box = BoxGeometry.fromDimensions({
         *   vertexFormat : VertexFormat.POSITION_ONLY,
         *   dimensions : new Cartesian3(500000.0, 500000.0, 500000.0)
         * });
         * const geometry = BoxGeometry.createGeometry(box);
         * ```
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoxGeometry.html#.fromDimensions">Online Documentation</a>
         */
        fun fromDimensions(options: FromDimensionsOptions): BoxGeometry

        /**
         * @property [dimensions] The width, depth, and height of the box stored in the x, y, and z coordinates of the `Cartesian3`, respectively.
         * @property [vertexFormat] The vertex attributes to be computed.
         *   Default value - [VertexFormat.DEFAULT]
         */
        interface FromDimensionsOptions {
            var dimensions: Cartesian3
            var vertexFormat: VertexFormat?
        }

        /**
         * Creates a cube from the dimensions of an AxisAlignedBoundingBox.
         * ```
         * const aabb = AxisAlignedBoundingBox.fromPoints(Cartesian3.fromDegreesArray([
         *      -72.0, 40.0,
         *      -70.0, 35.0,
         *      -75.0, 30.0,
         *      -70.0, 30.0,
         *      -68.0, 40.0
         * ]));
         * const box = BoxGeometry.fromAxisAlignedBoundingBox(aabb);
         * ```
         * @param [boundingBox] A description of the AxisAlignedBoundingBox.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoxGeometry.html#.fromAxisAlignedBoundingBox">Online Documentation</a>
         */
        fun fromAxisAlignedBoundingBox(boundingBox: AxisAlignedBoundingBox): BoxGeometry

        /**
         * The number of elements used to pack the object into an array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoxGeometry.html#.packedLength">Online Documentation</a>
         */
        override val packedLength: Int

        /**
         * Stores the provided instance into the provided array.
         * @param [value] The value to pack.
         * @param [array] The array to pack into.
         * @param [startingIndex] The index into the array at which to start packing the elements.
         *   Default value - `0`
         * @return The array that was packed into
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoxGeometry.html#.pack">Online Documentation</a>
         */
        override fun pack(
            value: BoxGeometry,
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
        ): ReadonlyArray<Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new BoxGeometry instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoxGeometry.html#.unpack">Online Documentation</a>
         */
        override fun unpack(
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
            result: BoxGeometry?,
        ): BoxGeometry

        /**
         * Computes the geometric representation of a box, including its vertices, indices, and a bounding sphere.
         * @param [boxGeometry] A description of the box.
         * @return The computed vertices and indices.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoxGeometry.html#.createGeometry">Online Documentation</a>
         */
        fun createGeometry(boxGeometry: BoxGeometry): Geometry?
    }
}

inline fun BoxGeometry(
    block: BoxGeometry.ConstructorOptions.() -> Unit,
): BoxGeometry =
    BoxGeometry(options = jso(block))
