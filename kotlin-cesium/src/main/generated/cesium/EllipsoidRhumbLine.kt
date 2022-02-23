// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * Initializes a rhumb line on the ellipsoid connecting the two provided planetodetic points.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidRhumbLine.html">Online Documentation</a>
 *
 * @constructor
 * @property [start] The initial planetodetic point on the path.
 * @property [end] The final planetodetic point on the path.
 * @property [ellipsoid] The ellipsoid on which the rhumb line lies.
 *   Default value - [Ellipsoid.WGS84]
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidRhumbLine.html">Online Documentation</a>
 */
external class EllipsoidRhumbLine(
    val start: Cartographic = definedExternally,
    val end: Cartographic = definedExternally,
    val ellipsoid: Ellipsoid = definedExternally,
) {
    /**
     * Gets the surface distance between the start and end point
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidRhumbLine.html#surfaceDistance">Online Documentation</a>
     */
    val surfaceDistance: Double

    /**
     * Gets the heading from the start point to the end point.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidRhumbLine.html#heading">Online Documentation</a>
     */
    val heading: Double

    /**
     * Sets the start and end points of the rhumb line.
     * @param [start] The initial planetodetic point on the path.
     * @param [end] The final planetodetic point on the path.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidRhumbLine.html#setEndPoints">Online Documentation</a>
     */
    fun setEndPoints(
        start: Cartographic,
        end: Cartographic,
    )

    /**
     * Provides the location of a point at the indicated portion along the rhumb line.
     * @param [fraction] The portion of the distance between the initial and final points.
     * @param [result] The object in which to store the result.
     * @return The location of the point along the rhumb line.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidRhumbLine.html#interpolateUsingFraction">Online Documentation</a>
     */
    fun interpolateUsingFraction(
        fraction: Double,
        result: Cartographic? = definedExternally,
    ): Cartographic

    /**
     * Provides the location of a point at the indicated distance along the rhumb line.
     * @param [distance] The distance from the inital point to the point of interest along the rhumbLine.
     * @param [result] The object in which to store the result.
     * @return The location of the point along the rhumb line.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidRhumbLine.html#interpolateUsingSurfaceDistance">Online Documentation</a>
     */
    fun interpolateUsingSurfaceDistance(
        distance: Double,
        result: Cartographic? = definedExternally,
    ): Cartographic

    /**
     * Provides the location of a point at the indicated longitude along the rhumb line.
     * If the longitude is outside the range of start and end points, the first intersection with the longitude from the start point in the direction of the heading is returned. This follows the spiral property of a rhumb line.
     * @param [intersectionLongitude] The longitude, in radians, at which to find the intersection point from the starting point using the heading.
     * @param [result] The object in which to store the result.
     * @return The location of the intersection point along the rhumb line, undefined if there is no intersection or infinite intersections.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidRhumbLine.html#findIntersectionWithLongitude">Online Documentation</a>
     */
    fun findIntersectionWithLongitude(
        intersectionLongitude: Double,
        result: Cartographic? = definedExternally,
    ): Cartographic

    /**
     * Provides the location of a point at the indicated latitude along the rhumb line.
     * If the latitude is outside the range of start and end points, the first intersection with the latitude from that start point in the direction of the heading is returned. This follows the spiral property of a rhumb line.
     * @param [intersectionLatitude] The latitude, in radians, at which to find the intersection point from the starting point using the heading.
     * @param [result] The object in which to store the result.
     * @return The location of the intersection point along the rhumb line, undefined if there is no intersection or infinite intersections.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidRhumbLine.html#findIntersectionWithLatitude">Online Documentation</a>
     */
    fun findIntersectionWithLatitude(
        intersectionLatitude: Double,
        result: Cartographic? = definedExternally,
    ): Cartographic

    companion object {
        /**
         * Create a rhumb line using an initial position with a heading and distance.
         * @param [start] The initial planetodetic point on the path.
         * @param [heading] The heading in radians.
         * @param [distance] The rhumb line distance between the start and end point.
         * @param [ellipsoid] The ellipsoid on which the rhumb line lies.
         *   Default value - [Ellipsoid.WGS84]
         * @param [result] The object in which to store the result.
         * @return The EllipsoidRhumbLine object.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidRhumbLine.html#.fromStartHeadingDistance">Online Documentation</a>
         */
        fun fromStartHeadingDistance(
            start: Cartographic,
            heading: Double,
            distance: Double,
            ellipsoid: Ellipsoid? = definedExternally,
            result: EllipsoidRhumbLine? = definedExternally,
        ): EllipsoidRhumbLine
    }
}
