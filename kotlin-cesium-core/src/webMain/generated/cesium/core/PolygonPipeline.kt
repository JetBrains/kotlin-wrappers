// Automatically generated - do not modify!

@file:JsModule("@cesium/core")

package cesium.core

import js.array.ReadonlyArray
import js.numbers.JsDouble

/**
 * Polygon geometry processing functions, including triangulation and subdivision.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonPipeline.html">Online Documentation</a>
 */
external object PolygonPipeline {
    fun computeArea2D()

    /**
     * @return The winding order.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonPipeline.html#.computeWindingOrder2D">Online Documentation</a>
     */
    fun computeWindingOrder2D(): WindingOrder

    /**
     * Triangulate a polygon.
     * @param [positions] Cartesian2 array containing the vertices of the polygon
     * @param [holes] An array of the staring indices of the holes.
     * @return Index array representing triangles that fill the polygon
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonPipeline.html#.triangulate">Online Documentation</a>
     */
    fun triangulate(
        positions: ReadonlyArray<Cartesian2>,
        holes: ReadonlyArray<JsDouble>? = definedExternally,
    ): ReadonlyArray<JsDouble>

    /**
     * Subdivides positions and raises points to the surface of the ellipsoid.
     * @param [ellipsoid] The ellipsoid the polygon in on.
     * @param [positions] An array of [Cartesian3] positions of the polygon.
     * @param [indices] An array of indices that determines the triangles in the polygon.
     * @param [texcoords] An optional array of [Cartesian2] texture coordinates of the polygon.
     * @param [granularity] The distance, in radians, between each latitude and longitude. Determines the number of positions in the buffer.
     *   Default value - [Math.RADIANS_PER_DEGREE]
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonPipeline.html#.computeSubdivision">Online Documentation</a>
     */
    fun computeSubdivision(
        ellipsoid: Ellipsoid,
        positions: ReadonlyArray<Cartesian3>,
        indices: ReadonlyArray<JsDouble>,
        texcoords: ReadonlyArray<Cartesian2>,
        granularity: Double? = definedExternally,
    )

    /**
     * Subdivides positions on rhumb lines and raises points to the surface of the ellipsoid.
     * @param [ellipsoid] The ellipsoid the polygon in on.
     * @param [positions] An array of [Cartesian3] positions of the polygon.
     * @param [indices] An array of indices that determines the triangles in the polygon.
     * @param [texcoords] An optional array of [Cartesian2] texture coordinates of the polygon.
     * @param [granularity] The distance, in radians, between each latitude and longitude. Determines the number of positions in the buffer.
     *   Default value - [Math.RADIANS_PER_DEGREE]
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonPipeline.html#.computeRhumbLineSubdivision">Online Documentation</a>
     */
    fun computeRhumbLineSubdivision(
        ellipsoid: Ellipsoid,
        positions: ReadonlyArray<Cartesian3>,
        indices: ReadonlyArray<JsDouble>,
        texcoords: ReadonlyArray<Cartesian2>,
        granularity: Double? = definedExternally,
    )

    /**
     * Scales each position of a geometry's position attribute to a height, in place.
     * @param [positions] The array of numbers representing the positions to be scaled
     * @param [height] The desired height to add to the positions
     *   Default value - `0.0`
     * @param [ellipsoid] The ellipsoid on which the positions lie.
     *   Default value - [Ellipsoid.default]
     * @param [scaleToSurface] `true` if the positions need to be scaled to the surface before the height is added.
     *   Default value - `true`
     * @return The input array of positions, scaled to height
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonPipeline.html#.scaleToGeodeticHeight">Online Documentation</a>
     */
    fun scaleToGeodeticHeight(
        positions: ReadonlyArray<JsDouble>,
        height: Double? = definedExternally,
        ellipsoid: Ellipsoid? = definedExternally,
        scaleToSurface: Boolean? = definedExternally,
    ): ReadonlyArray<JsDouble>
}
