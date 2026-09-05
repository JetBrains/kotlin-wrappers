// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

/**
 * A geodesic polygon to be used with [ClippingPlaneCollection] for selectively hiding regions in a model, a 3D tileset, or the globe.
 * ```
 * const positions = Cartesian3.fromRadiansArray([
 *     -1.3194369277314022,
 *     0.6988062530900625,
 *     -1.31941,
 *     0.69879,
 *     -1.3193955980204217,
 *     0.6988091578771254,
 *     -1.3193931220959367,
 *     0.698743632490865,
 *     -1.3194358224045408,
 *     0.6987471965556998,
 * ]);
 *
 * const polygon = new ClippingPolygon({
 *     positions: positions
 * });
 * ```
 * ```
 * // A clipping polygon with two holes. Regions inside the holes are not clipped.
 * const outerRing = Cartesian3.fromDegreesArray([
 *     -100.0, 40.0,
 *     -90.0, 40.0,
 *     -90.0, 50.0,
 *     -100.0, 50.0,
 * ]);
 *
 * const firstHole = Cartesian3.fromDegreesArray([
 *     -98.0, 42.0,
 *     -96.0, 42.0,
 *     -96.0, 44.0,
 *     -98.0, 44.0,
 * ]);
 *
 * const secondHole = Cartesian3.fromDegreesArray([
 *     -94.0, 46.0,
 *     -92.0, 46.0,
 *     -92.0, 48.0,
 *     -94.0, 48.0,
 * ]);
 *
 * const polygonWithHoles = new ClippingPolygon({
 *     positions: outerRing,
 *     holes: [firstHole, secondHole],
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPolygon.html">Online Documentation</a>
 */
open external class ClippingPolygon(
    options: ConstructorOptions,
) {
    /**
     * @property [positions] A list of three or more Cartesian coordinates defining the outer ring of the clipping polygon.
     * @property [holes] An array of interior rings (holes), each a list of three or more Cartesian coordinates. Regions inside a hole are excluded from the polygon.
     */
    @JsPlainObject
    interface ConstructorOptions {
        val positions: ReadonlyArray<Cartesian3>
        val holes: ReadonlyArray<ReadonlyArray<Cartesian3>>?
        val ellipsoid: Ellipsoid?
    }

    /**
     * Returns the total number of positions in the polygon, including any holes.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPolygon.html#length">Online Documentation</a>
     */
    val length: Int

    /**
     * Returns the outer ring of positions. A ClippingPolygon's geometry is
     * immutable; the returned array and its coordinates are frozen.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPolygon.html#positions">Online Documentation</a>
     */
    val positions: ReadonlyArray<Cartesian3>

    /**
     * Returns the interior rings (holes) of the polygon, each a list of positions.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPolygon.html#holes">Online Documentation</a>
     */
    val holes: ReadonlyArray<ReadonlyArray<Cartesian3>>

    /**
     * Returns the ellipsoid used to project the polygon onto surfaces when clipping.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPolygon.html#ellipsoid">Online Documentation</a>
     */
    val ellipsoid: Ellipsoid

    /**
     * Returns the cartographic rectangle enclosing the polygon, computed once on
     * construction. Since a ClippingPolygon's geometry is immutable, this rectangle
     * never changes.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPolygon.html#rectangle">Online Documentation</a>
     */
    val rectangle: Rectangle

    /**
     * Computes a cartographic rectangle which encloses the polygon defined by the list of positions, including cases over the international date line and the poles.
     * @param [result] An object in which to store the result.
     * @return The result rectangle
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPolygon.html#computeRectangle">Online Documentation</a>
     */
    fun computeRectangle(result: Rectangle? = definedExternally): Rectangle

    companion object {
        /**
         * Clones the ClippingPolygon without setting its ownership.
         * @param [polygon] The ClippingPolygon to be cloned
         * @param [result] The object on which to store the cloned parameters.
         * @return a clone of the input ClippingPolygon
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPolygon.html#.clone">Online Documentation</a>
         */
        fun clone(
            polygon: ClippingPolygon,
            result: ClippingPolygon? = definedExternally,
        ): ClippingPolygon

        /**
         * Compares the provided ClippingPolygons and returns
         * `true` if they are equal, `false` otherwise.
         * @param [left] The first polygon.
         * @param [right] The second polygon.
         * @return `true` if left and right are equal, `false` otherwise.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPolygon.html#.equals">Online Documentation</a>
         */
        fun equals(
            left: ClippingPolygon,
            right: ClippingPolygon,
        ): Boolean
    }
}
