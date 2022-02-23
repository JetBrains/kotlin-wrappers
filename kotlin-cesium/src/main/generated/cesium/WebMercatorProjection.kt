// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * The map projection used by Google Maps, Bing Maps, and most of ArcGIS Online, EPSG:3857.  This
 * projection use longitude and latitude expressed with the WGS84 and transforms them to Mercator using
 * the spherical (rather than ellipsoidal) equations.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMercatorProjection.html">Online Documentation</a>
 *
 * @constructor
 * @property [ellipsoid] The ellipsoid.
 *   Default value - [Ellipsoid.WGS84]
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMercatorProjection.html">Online Documentation</a>
 */
external class WebMercatorProjection(val ellipsoid: Ellipsoid = definedExternally) {
    /**
     * Converts geodetic ellipsoid coordinates, in radians, to the equivalent Web Mercator
     * X, Y, Z coordinates expressed in meters and returned in a [Cartesian3].  The height
     * is copied unmodified to the Z coordinate.
     * @param [cartographic] The cartographic coordinates in radians.
     * @param [result] The instance to which to copy the result, or undefined if a
     *   new instance should be created.
     * @return The equivalent web mercator X, Y, Z coordinates, in meters.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMercatorProjection.html#project">Online Documentation</a>
     */
    fun project(
        cartographic: Cartographic,
        result: Cartesian3? = definedExternally,
    ): Cartesian3

    /**
     * Converts Web Mercator X, Y coordinates, expressed in meters, to a [Cartographic]
     * containing geodetic ellipsoid coordinates.  The Z coordinate is copied unmodified to the
     * height.
     * @param [cartesian] The web mercator Cartesian position to unrproject with height (z) in meters.
     * @param [result] The instance to which to copy the result, or undefined if a
     *   new instance should be created.
     * @return The equivalent cartographic coordinates.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMercatorProjection.html#unproject">Online Documentation</a>
     */
    fun unproject(
        cartesian: Cartesian3,
        result: Cartographic? = definedExternally,
    ): Cartographic

    companion object {
        /**
         * Converts a Mercator angle, in the range -PI to PI, to a geodetic latitude
         * in the range -PI/2 to PI/2.
         * @param [mercatorAngle] The angle to convert.
         * @return The geodetic latitude in radians.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMercatorProjection.html#.mercatorAngleToGeodeticLatitude">Online Documentation</a>
         */
        fun mercatorAngleToGeodeticLatitude(mercatorAngle: Double): Double

        /**
         * Converts a geodetic latitude in radians, in the range -PI/2 to PI/2, to a Mercator
         * angle in the range -PI to PI.
         * @param [latitude] The geodetic latitude in radians.
         * @return The Mercator angle.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMercatorProjection.html#.geodeticLatitudeToMercatorAngle">Online Documentation</a>
         */
        fun geodeticLatitudeToMercatorAngle(latitude: Double): Double

        /**
         * The maximum latitude (both North and South) supported by a Web Mercator
         * (EPSG:3857) projection.  Technically, the Mercator projection is defined
         * for any latitude up to (but not including) 90 degrees, but it makes sense
         * to cut it off sooner because it grows exponentially with increasing latitude.
         * The logic behind this particular cutoff value, which is the one used by
         * Google Maps, Bing Maps, and Esri, is that it makes the projection
         * square.  That is, the rectangle is equal in the X and Y directions.
         *
         * The constant value is computed by calling:
         *    WebMercatorProjection.mercatorAngleToGeodeticLatitude(Math.PI)
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/WebMercatorProjection.html#.MaximumLatitude">Online Documentation</a>
         */
        var MaximumLatitude: Double
    }
}
