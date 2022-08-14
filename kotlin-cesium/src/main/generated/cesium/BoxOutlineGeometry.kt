// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import kotlinx.js.ReadonlyArray

/**
 * A description of the outline of a cube centered at the origin.
 * ```
 * const box = new BoxOutlineGeometry({
 *   maximum : new Cartesian3(250000.0, 250000.0, 250000.0),
 *   minimum : new Cartesian3(-250000.0, -250000.0, -250000.0)
 * });
 * const geometry = BoxOutlineGeometry.createGeometry(box);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoxOutlineGeometry.html">Online Documentation</a>
 */
external class BoxOutlineGeometry(options: ConstructorOptions) {
    /**
     * @property [minimum] The minimum x, y, and z coordinates of the box.
     * @property [maximum] The maximum x, y, and z coordinates of the box.
     */
    interface ConstructorOptions {
        var minimum: Cartesian3
        var maximum: Cartesian3
    }

    companion object : Packable<BoxOutlineGeometry> {
        /**
         * Creates an outline of a cube centered at the origin given its dimensions.
         * ```
         * const box = BoxOutlineGeometry.fromDimensions({
         *   dimensions : new Cartesian3(500000.0, 500000.0, 500000.0)
         * });
         * const geometry = BoxOutlineGeometry.createGeometry(box);
         * ```
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoxOutlineGeometry.html#.fromDimensions">Online Documentation</a>
         */
        fun fromDimensions(options: FromDimensionsOptions): BoxOutlineGeometry

        /**
         * @property [dimensions] The width, depth, and height of the box stored in the x, y, and z coordinates of the `Cartesian3`, respectively.
         */
        interface FromDimensionsOptions {
            var dimensions: Cartesian3
        }

        /**
         * Creates an outline of a cube from the dimensions of an AxisAlignedBoundingBox.
         * ```
         * const aabb = AxisAlignedBoundingBox.fromPoints(Cartesian3.fromDegreesArray([
         *      -72.0, 40.0,
         *      -70.0, 35.0,
         *      -75.0, 30.0,
         *      -70.0, 30.0,
         *      -68.0, 40.0
         * ]));
         * const box = BoxOutlineGeometry.fromAxisAlignedBoundingBox(aabb);
         * ```
         * @param [boundingBox] A description of the AxisAlignedBoundingBox.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoxOutlineGeometry.html#.fromAxisAlignedBoundingBox">Online Documentation</a>
         */
        fun fromAxisAlignedBoundingBox(boundingBox: AxisAlignedBoundingBox): BoxOutlineGeometry

        /**
         * The number of elements used to pack the object into an array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoxOutlineGeometry.html#.packedLength">Online Documentation</a>
         */
        override val packedLength: Int

        /**
         * Stores the provided instance into the provided array.
         * @param [value] The value to pack.
         * @param [array] The array to pack into.
         * @param [startingIndex] The index into the array at which to start packing the elements.
         *   Default value - `0`
         * @return The array that was packed into
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoxOutlineGeometry.html#.pack">Online Documentation</a>
         */
        override fun pack(
            value: BoxOutlineGeometry,
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
        ): ReadonlyArray<Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new BoxOutlineGeometry instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoxOutlineGeometry.html#.unpack">Online Documentation</a>
         */
        override fun unpack(
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
            result: BoxOutlineGeometry?,
        ): BoxOutlineGeometry

        /**
         * Computes the geometric representation of an outline of a box, including its vertices, indices, and a bounding sphere.
         * @param [boxGeometry] A description of the box outline.
         * @return The computed vertices and indices.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BoxOutlineGeometry.html#.createGeometry">Online Documentation</a>
         */
        fun createGeometry(boxGeometry: BoxOutlineGeometry): Geometry?
    }
}

inline fun BoxOutlineGeometry(
    block: BoxOutlineGeometry.ConstructorOptions.() -> Unit,
): BoxOutlineGeometry {
    val options: BoxOutlineGeometry.ConstructorOptions = js("({})")
    block(options)
    return BoxOutlineGeometry(options)
}
