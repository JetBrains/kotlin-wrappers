// Automatically generated - do not modify!

@file:JsModule("@cesium/core")

package cesium.core

import js.array.ReadonlyArray
import js.numbers.JsDouble
import kotlinx.js.JsPlainObject

/**
 * Polyline geometry processing functions, including arc generation and subdivision.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylinePipeline.html">Online Documentation</a>
 */
external object PolylinePipeline {
    /**
     * Breaks a [Polyline] into segments such that it does not cross the &plusmn;180 degree meridian of an ellipsoid.
     * ```
     * const polylines = new PolylineCollection();
     * const polyline = polylines.add(...);
     * const positions = polyline.positions;
     * const modelMatrix = polylines.modelMatrix;
     * const segments = PolylinePipeline.wrapLongitude(positions, modelMatrix);
     * ```
     * @param [positions] The polyline's Cartesian positions.
     * @param [modelMatrix] The polyline's model matrix. Assumed to be an affine
     *   transformation matrix, where the upper left 3x3 elements are a rotation matrix, and
     *   the upper three elements in the fourth column are the translation.  The bottom row is assumed to be [0, 0, 0, 1].
     *   The matrix is not verified to be in the proper form.
     *   Default value - [Matrix4.IDENTITY]
     * @return An object with a `positions` property that is an array of positions and a
     *   `segments` property.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylinePipeline.html#.wrapLongitude">Online Documentation</a>
     */
    fun wrapLongitude(
        positions: ReadonlyArray<Cartesian3>,
        modelMatrix: Matrix4? = definedExternally,
    ): JsAny

    /**
     * Subdivides polyline and raises all points to the specified height.  Returns an array of numbers to represent the positions.
     * ```
     * const positions = Cartesian3.fromDegreesArray([
     *   -105.0, 40.0,
     *   -100.0, 38.0,
     *   -105.0, 35.0,
     *   -100.0, 32.0
     * ]);
     * const surfacePositions = PolylinePipeline.generateArc({
     *   positons: positions
     * });
     * ```
     * @return A new array of positions of type {number} that have been subdivided and raised to the surface of the ellipsoid.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylinePipeline.html#.generateArc">Online Documentation</a>
     */
    fun generateArc(options: GenerateArcOptions): ReadonlyArray<JsDouble>

    /**
     * @property [positions] The array of type {Cartesian3} representing positions.
     * @property [height] A number or array of numbers representing the heights of each position.
     *   Default value - `0.0`
     * @property [granularity] The distance, in radians, between each latitude and longitude. Determines the number of positions in the buffer.
     *   Default value - [Math.RADIANS_PER_DEGREE]
     * @property [ellipsoid] The ellipsoid on which the positions lie.
     *   Default value - [Ellipsoid.default]
     */
    @JsPlainObject
    interface GenerateArcOptions {
        val positions: ReadonlyArray<Cartesian3>
        val height: JsAny /* number | number[] */?
        val granularity: Double?
        val ellipsoid: Ellipsoid?
    }

    /**
     * Subdivides polyline and raises all points to the specified height using Rhumb lines.  Returns an array of numbers to represent the positions.
     * ```
     * const positions = Cartesian3.fromDegreesArray([
     *   -105.0, 40.0,
     *   -100.0, 38.0,
     *   -105.0, 35.0,
     *   -100.0, 32.0
     * ]);
     * const surfacePositions = PolylinePipeline.generateRhumbArc({
     *   positons: positions
     * });
     * ```
     * @return A new array of positions of type {number} that have been subdivided and raised to the surface of the ellipsoid.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylinePipeline.html#.generateRhumbArc">Online Documentation</a>
     */
    fun generateRhumbArc(options: GenerateRhumbArcOptions): ReadonlyArray<JsDouble>

    /**
     * @property [positions] The array of type {Cartesian3} representing positions.
     * @property [height] A number or array of numbers representing the heights of each position.
     *   Default value - `0.0`
     * @property [granularity] The distance, in radians, between each latitude and longitude. Determines the number of positions in the buffer.
     *   Default value - [Math.RADIANS_PER_DEGREE]
     * @property [ellipsoid] The ellipsoid on which the positions lie.
     *   Default value - [Ellipsoid.default]
     */
    @JsPlainObject
    interface GenerateRhumbArcOptions {
        val positions: ReadonlyArray<Cartesian3>
        val height: JsAny /* number | number[] */?
        val granularity: Double?
        val ellipsoid: Ellipsoid?
    }

    /**
     * Subdivides polyline and raises all points to the specified height. Returns an array of new {Cartesian3} positions.
     * ```
     * const positions = Cartesian3.fromDegreesArray([
     *   -105.0, 40.0,
     *   -100.0, 38.0,
     *   -105.0, 35.0,
     *   -100.0, 32.0
     * ]);
     * const surfacePositions = PolylinePipeline.generateCartesianArc({
     *   positons: positions
     * });
     * ```
     * @return A new array of cartesian3 positions that have been subdivided and raised to the surface of the ellipsoid.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylinePipeline.html#.generateCartesianArc">Online Documentation</a>
     */
    fun generateCartesianArc(options: GenerateCartesianArcOptions): ReadonlyArray<Cartesian3>

    /**
     * @property [positions] The array of type {Cartesian3} representing positions.
     * @property [height] A number or array of numbers representing the heights of each position.
     *   Default value - `0.0`
     * @property [granularity] The distance, in radians, between each latitude and longitude. Determines the number of positions in the buffer.
     *   Default value - [Math.RADIANS_PER_DEGREE]
     * @property [ellipsoid] The ellipsoid on which the positions lie.
     *   Default value - [Ellipsoid.default]
     */
    @JsPlainObject
    interface GenerateCartesianArcOptions {
        val positions: ReadonlyArray<Cartesian3>
        val height: JsAny /* number | number[] */?
        val granularity: Double?
        val ellipsoid: Ellipsoid?
    }

    /**
     * Subdivides polyline and raises all points to the specified height using Rhumb Lines. Returns an array of new {Cartesian3} positions.
     * ```
     * const positions = Cartesian3.fromDegreesArray([
     *   -105.0, 40.0,
     *   -100.0, 38.0,
     *   -105.0, 35.0,
     *   -100.0, 32.0
     * ]);
     * const surfacePositions = PolylinePipeline.generateCartesianRhumbArc({
     *   positons: positions
     * });
     * ```
     * @return A new array of cartesian3 positions that have been subdivided and raised to the surface of the ellipsoid.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylinePipeline.html#.generateCartesianRhumbArc">Online Documentation</a>
     */
    fun generateCartesianRhumbArc(options: GenerateCartesianRhumbArcOptions): ReadonlyArray<Cartesian3>

    /**
     * @property [positions] The array of type {Cartesian3} representing positions.
     * @property [height] A number or array of numbers representing the heights of each position.
     *   Default value - `0.0`
     * @property [granularity] The distance, in radians, between each latitude and longitude. Determines the number of positions in the buffer.
     *   Default value - [Math.RADIANS_PER_DEGREE]
     * @property [ellipsoid] The ellipsoid on which the positions lie.
     *   Default value - [Ellipsoid.default]
     */
    @JsPlainObject
    interface GenerateCartesianRhumbArcOptions {
        val positions: ReadonlyArray<Cartesian3>
        val height: JsAny /* number | number[] */?
        val granularity: Double?
        val ellipsoid: Ellipsoid?
    }
}
