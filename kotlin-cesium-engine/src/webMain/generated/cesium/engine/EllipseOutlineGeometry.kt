// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray
import js.core.JsDouble
import js.objects.JsPlainObject

/**
 * A description of the outline of an ellipse on an ellipsoid.
 * ```
 * const ellipse = new EllipseOutlineGeometry({
 *   center : Cartesian3.fromDegrees(-75.59777, 40.03883),
 *   semiMajorAxis : 500000.0,
 *   semiMinorAxis : 300000.0,
 *   rotation : Math.toRadians(60.0)
 * });
 * const geometry = EllipseOutlineGeometry.createGeometry(ellipse);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseOutlineGeometry.html">Online Documentation</a>
 */
external class EllipseOutlineGeometry(
    options: ConstructorOptions,
) {
    /**
     * @property [center] The ellipse's center point in the fixed frame.
     * @property [semiMajorAxis] The length of the ellipse's semi-major axis in meters.
     * @property [semiMinorAxis] The length of the ellipse's semi-minor axis in meters.
     * @property [ellipsoid] The ellipsoid the ellipse will be on.
     *   Default value - [Ellipsoid.default]
     * @property [height] The distance in meters between the ellipse and the ellipsoid surface.
     *   Default value - `0.0`
     * @property [extrudedHeight] The distance in meters between the ellipse's extruded face and the ellipsoid surface.
     * @property [rotation] The angle from north (counter-clockwise) in radians.
     *   Default value - `0.0`
     * @property [granularity] The angular distance between points on the ellipse in radians.
     *   Default value - `0.02`
     * @property [numberOfVerticalLines] Number of lines to draw between the top and bottom surface of an extruded ellipse.
     *   Default value - `16`
     */
    @JsPlainObject
    interface ConstructorOptions {
        val center: Cartesian3
        val semiMajorAxis: Double
        val semiMinorAxis: Double
        val ellipsoid: Ellipsoid?
        val height: Double?
        val extrudedHeight: Double?
        val rotation: Double?
        val granularity: Double?
        val numberOfVerticalLines: Int?
    }

    companion object : Packable<EllipseOutlineGeometry> {
        /**
         * The number of elements used to pack the object into an array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseOutlineGeometry.html#.packedLength">Online Documentation</a>
         */
        override val packedLength: Int

        /**
         * Stores the provided instance into the provided array.
         * @param [value] The value to pack.
         * @param [array] The array to pack into.
         * @param [startingIndex] The index into the array at which to start packing the elements.
         *   Default value - `0`
         * @return The array that was packed into
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseOutlineGeometry.html#.pack">Online Documentation</a>
         */
        override fun pack(
            value: EllipseOutlineGeometry,
            array: ReadonlyArray<JsDouble>,
            startingIndex: Int?,
        ): ReadonlyArray<JsDouble>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new EllipseOutlineGeometry instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseOutlineGeometry.html#.unpack">Online Documentation</a>
         */
        override fun unpack(
            array: ReadonlyArray<JsDouble>,
            startingIndex: Int?,
            result: EllipseOutlineGeometry?,
        ): EllipseOutlineGeometry

        /**
         * Computes the geometric representation of an outline of an ellipse on an ellipsoid, including its vertices, indices, and a bounding sphere.
         * @param [ellipseGeometry] A description of the ellipse.
         * @return The computed vertices and indices.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseOutlineGeometry.html#.createGeometry">Online Documentation</a>
         */
        fun createGeometry(ellipseGeometry: EllipseOutlineGeometry): Geometry?
    }
}
