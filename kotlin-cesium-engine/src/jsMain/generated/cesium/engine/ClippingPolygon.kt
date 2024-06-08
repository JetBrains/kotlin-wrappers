// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray
import js.objects.JsPlainObject

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
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPolygon.html">Online Documentation</a>
 */
external class ClippingPolygon(
    options: ConstructorOptions,
) {
    /**
     * @property [positions] A list of three or more Cartesian coordinates defining the outer ring of the clipping polygon.
     */
    @JsPlainObject
    sealed interface ConstructorOptions {
        var positions: ReadonlyArray<Cartesian3>
        var ellipsoid: Ellipsoid?
    }

    /**
     * Returns the total number of positions in the polygon, include any holes.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPolygon.html#length">Online Documentation</a>
     */
    val length: Int

    /**
     * Returns the outer ring of positions.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPolygon.html#positions">Online Documentation</a>
     */
    val positions: ReadonlyArray<Cartesian3>

    /**
     * Returns the ellipsoid used to project the polygon onto surfaces when clipping.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPolygon.html#ellipsoid">Online Documentation</a>
     */
    val ellipsoid: Ellipsoid

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
            left: Plane,
            right: Plane,
        ): Boolean
    }
}
