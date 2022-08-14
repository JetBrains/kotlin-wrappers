// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import kotlinx.js.ReadonlyArray

/**
 * A description of the outline of an ellipsoid centered at the origin.
 * ```
 * const ellipsoid = new EllipsoidOutlineGeometry({
 *   radii : new Cartesian3(1000000.0, 500000.0, 500000.0),
 *   stackPartitions: 6,
 *   slicePartitions: 5
 * });
 * const geometry = EllipsoidOutlineGeometry.createGeometry(ellipsoid);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidOutlineGeometry.html">Online Documentation</a>
 */
external class EllipsoidOutlineGeometry(options: ConstructorOptions? = definedExternally) {
    /**
     * @property [radii] The radii of the ellipsoid in the x, y, and z directions.
     *   Default value - [Cartesian3(1.0, 1.0, 1.0)][Cartesian3]
     * @property [innerRadii] The inner radii of the ellipsoid in the x, y, and z directions.
     *   Default value - `options.radii`
     * @property [minimumClock] The minimum angle lying in the xy-plane measured from the positive x-axis and toward the positive y-axis.
     *   Default value - `0.0`
     * @property [maximumClock] The maximum angle lying in the xy-plane measured from the positive x-axis and toward the positive y-axis.
     *   Default value - `2*PI`
     * @property [minimumCone] The minimum angle measured from the positive z-axis and toward the negative z-axis.
     *   Default value - `0.0`
     * @property [maximumCone] The maximum angle measured from the positive z-axis and toward the negative z-axis.
     *   Default value - `PI`
     * @property [stackPartitions] The count of stacks for the ellipsoid (1 greater than the number of parallel lines).
     *   Default value - `10`
     * @property [slicePartitions] The count of slices for the ellipsoid (Equal to the number of radial lines).
     *   Default value - `8`
     * @property [subdivisions] The number of points per line, determining the granularity of the curvature.
     *   Default value - `128`
     */
    interface ConstructorOptions {
        var radii: Cartesian3?
        var innerRadii: Cartesian3?
        var minimumClock: Double?
        var maximumClock: Double?
        var minimumCone: Double?
        var maximumCone: Double?
        var stackPartitions: Int?
        var slicePartitions: Int?
        var subdivisions: Double?
    }

    companion object : Packable<EllipsoidOutlineGeometry> {
        /**
         * The number of elements used to pack the object into an array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidOutlineGeometry.html#.packedLength">Online Documentation</a>
         */
        override val packedLength: Int

        /**
         * Stores the provided instance into the provided array.
         * @param [value] The value to pack.
         * @param [array] The array to pack into.
         * @param [startingIndex] The index into the array at which to start packing the elements.
         *   Default value - `0`
         * @return The array that was packed into
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidOutlineGeometry.html#.pack">Online Documentation</a>
         */
        override fun pack(
            value: EllipsoidOutlineGeometry,
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
        ): ReadonlyArray<Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new EllipsoidOutlineGeometry instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidOutlineGeometry.html#.unpack">Online Documentation</a>
         */
        override fun unpack(
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
            result: EllipsoidOutlineGeometry?,
        ): EllipsoidOutlineGeometry

        /**
         * Computes the geometric representation of an outline of an ellipsoid, including its vertices, indices, and a bounding sphere.
         * @param [ellipsoidGeometry] A description of the ellipsoid outline.
         * @return The computed vertices and indices.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidOutlineGeometry.html#.createGeometry">Online Documentation</a>
         */
        fun createGeometry(ellipsoidGeometry: EllipsoidOutlineGeometry): Geometry?
    }
}

inline fun EllipsoidOutlineGeometry(
    block: EllipsoidOutlineGeometry.ConstructorOptions.() -> Unit,
): EllipsoidOutlineGeometry {
    val options: EllipsoidOutlineGeometry.ConstructorOptions = js("({})")
    block(options)
    return EllipsoidOutlineGeometry(options)
}
