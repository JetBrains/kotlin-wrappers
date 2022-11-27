// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.ReadonlyArray

/**
 * A description of the outline of a circle on the ellipsoid.
 * ```
 * // Create a circle.
 * const circle = new CircleOutlineGeometry({
 *   center : Cartesian3.fromDegrees(-75.59777, 40.03883),
 *   radius : 100000.0
 * });
 * const geometry = CircleOutlineGeometry.createGeometry(circle);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CircleOutlineGeometry.html">Online Documentation</a>
 */
external class CircleOutlineGeometry(options: ConstructorOptions) {
    /**
     * @property [center] The circle's center point in the fixed frame.
     * @property [radius] The radius in meters.
     * @property [ellipsoid] The ellipsoid the circle will be on.
     *   Default value - [Ellipsoid.WGS84]
     * @property [height] The distance in meters between the circle and the ellipsoid surface.
     *   Default value - `0.0`
     * @property [granularity] The angular distance between points on the circle in radians.
     *   Default value - `0.02`
     * @property [extrudedHeight] The distance in meters between the circle's extruded face and the ellipsoid surface.
     *   Default value - `0.0`
     * @property [numberOfVerticalLines] Number of lines to draw between the top and bottom of an extruded circle.
     *   Default value - `16`
     */
    interface ConstructorOptions {
        var center: Cartesian3
        var radius: Double
        var ellipsoid: Ellipsoid?
        var height: Double?
        var granularity: Double?
        var extrudedHeight: Double?
        var numberOfVerticalLines: Int?
    }

    companion object : Packable<CircleOutlineGeometry> {
        /**
         * The number of elements used to pack the object into an array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CircleOutlineGeometry.html#.packedLength">Online Documentation</a>
         */
        override val packedLength: Int

        /**
         * Stores the provided instance into the provided array.
         * @param [value] The value to pack.
         * @param [array] The array to pack into.
         * @param [startingIndex] The index into the array at which to start packing the elements.
         *   Default value - `0`
         * @return The array that was packed into
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CircleOutlineGeometry.html#.pack">Online Documentation</a>
         */
        override fun pack(
            value: CircleOutlineGeometry,
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
        ): ReadonlyArray<Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new CircleOutlineGeometry instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CircleOutlineGeometry.html#.unpack">Online Documentation</a>
         */
        override fun unpack(
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
            result: CircleOutlineGeometry?,
        ): CircleOutlineGeometry

        /**
         * Computes the geometric representation of an outline of a circle on an ellipsoid, including its vertices, indices, and a bounding sphere.
         * @param [circleGeometry] A description of the circle.
         * @return The computed vertices and indices.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CircleOutlineGeometry.html#.createGeometry">Online Documentation</a>
         */
        fun createGeometry(circleGeometry: CircleOutlineGeometry): Geometry?
    }
}

inline fun CircleOutlineGeometry(
    block: CircleOutlineGeometry.ConstructorOptions.() -> Unit,
): CircleOutlineGeometry {
    val options: CircleOutlineGeometry.ConstructorOptions = js("({})")
    block(options)
    return CircleOutlineGeometry(options)
}
