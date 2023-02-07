// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.ReadonlyArray
import js.core.jso

/**
 * A description of a polyline on terrain or 3D Tiles. Only to be used with [GroundPolylinePrimitive].
 * ```
 * const positions = Cartesian3.fromDegreesArray([
 *   -112.1340164450331, 36.05494287836128,
 *   -112.08821010582645, 36.097804071380715,
 *   -112.13296079730024, 36.168769146801104
 * ]);
 *
 * const geometry = new GroundPolylineGeometry({
 *   positions : positions
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPolylineGeometry.html">Online Documentation</a>
 *
 * @constructor
 * @param [options] Options with the following properties:
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPolylineGeometry.html">Online Documentation</a>
 */
external class GroundPolylineGeometry(options: ConstructorOptions) {
    /**
     * @property [positions] An array of [Cartesian3] defining the polyline's points. Heights above the ellipsoid will be ignored.
     * @property [width] The screen space width in pixels.
     *   Default value - `1.0`
     * @property [granularity] The distance interval in meters used for interpolating options.points. Defaults to 9999.0 meters. Zero indicates no interpolation.
     *   Default value - `9999.0`
     * @property [loop] Whether during geometry creation a line segment will be added between the last and first line positions to make this Polyline a loop.
     *   Default value - `false`
     * @property [arcType] The type of line the polyline segments must follow. Valid options are [ArcType.GEODESIC] and [ArcType.RHUMB].
     *   Default value - [ArcType.GEODESIC]
     */
    interface ConstructorOptions {
        var positions: ReadonlyArray<Cartesian3>
        var width: Double?
        var granularity: Double?
        var loop: Boolean?
        var arcType: ArcType?
    }

    /**
     * The screen space width in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPolylineGeometry.html#width">Online Documentation</a>
     */
    var width: Double

    /**
     * The distance interval used for interpolating options.points. Zero indicates no interpolation.
     * Default of 9999.0 allows centimeter accuracy with 32 bit floating point.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPolylineGeometry.html#granularity">Online Documentation</a>
     */
    var granularity: Boolean

    /**
     * Whether during geometry creation a line segment will be added between the last and first line positions to make this Polyline a loop.
     * If the geometry has two positions this parameter will be ignored.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPolylineGeometry.html#loop">Online Documentation</a>
     */
    var loop: Boolean

    /**
     * The type of path the polyline must follow. Valid options are [ArcType.GEODESIC] and [ArcType.RHUMB].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPolylineGeometry.html#arcType">Online Documentation</a>
     */
    var arcType: ArcType

    companion object {
        /**
         * Stores the provided instance into the provided array.
         * @param [value] The value to pack.
         * @param [array] The array to pack into.
         * @param [startingIndex] The index into the array at which to start packing the elements.
         *   Default value - `0`
         * @return The array that was packed into
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPolylineGeometry.html#.pack">Online Documentation</a>
         */
        fun pack(
            value: PolygonGeometry,
            array: ReadonlyArray<Double>,
            startingIndex: Int? = definedExternally,
        ): ReadonlyArray<Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundPolylineGeometry.html#.unpack">Online Documentation</a>
         */
        fun unpack(
            array: ReadonlyArray<Double>,
            startingIndex: Int? = definedExternally,
            result: PolygonGeometry? = definedExternally,
        )
    }
}

inline fun GroundPolylineGeometry(
    block: GroundPolylineGeometry.ConstructorOptions.() -> Unit,
): GroundPolylineGeometry =
    GroundPolylineGeometry(options = jso(block))
