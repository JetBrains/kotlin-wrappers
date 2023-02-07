// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * Initializes a geodesic on the ellipsoid connecting the two provided planetodetic points.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidGeodesic.html">Online Documentation</a>
 *
 * @constructor
 * @property [start] The initial planetodetic point on the path.
 * @property [end] The final planetodetic point on the path.
 * @property [ellipsoid] The ellipsoid on which the geodesic lies.
 *   Default value - [Ellipsoid.WGS84]
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidGeodesic.html">Online Documentation</a>
 */
external class EllipsoidGeodesic(
    val start: Cartographic = definedExternally,
    val end: Cartographic = definedExternally,
    val ellipsoid: Ellipsoid = definedExternally,
) {
    /**
     * Gets the surface distance between the start and end point
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidGeodesic.html#surfaceDistance">Online Documentation</a>
     */
    val surfaceDistance: Double

    /**
     * Gets the heading at the initial point.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidGeodesic.html#startHeading">Online Documentation</a>
     */
    val startHeading: Double

    /**
     * Gets the heading at the final point.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidGeodesic.html#endHeading">Online Documentation</a>
     */
    val endHeading: Double

    /**
     * Sets the start and end points of the geodesic
     * @param [start] The initial planetodetic point on the path.
     * @param [end] The final planetodetic point on the path.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidGeodesic.html#setEndPoints">Online Documentation</a>
     */
    fun setEndPoints(
        start: Cartographic,
        end: Cartographic,
    )

    /**
     * Provides the location of a point at the indicated portion along the geodesic.
     * @param [fraction] The portion of the distance between the initial and final points.
     * @param [result] The object in which to store the result.
     * @return The location of the point along the geodesic.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidGeodesic.html#interpolateUsingFraction">Online Documentation</a>
     */
    fun interpolateUsingFraction(
        fraction: Double,
        result: Cartographic? = definedExternally,
    ): Cartographic

    /**
     * Provides the location of a point at the indicated distance along the geodesic.
     * @param [distance] The distance from the inital point to the point of interest along the geodesic
     * @param [result] The object in which to store the result.
     * @return The location of the point along the geodesic.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidGeodesic.html#interpolateUsingSurfaceDistance">Online Documentation</a>
     */
    fun interpolateUsingSurfaceDistance(
        distance: Double,
        result: Cartographic? = definedExternally,
    ): Cartographic
}
