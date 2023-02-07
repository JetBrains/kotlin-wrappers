// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * A simple map projection where longitude and latitude are linearly mapped to X and Y by multiplying
 * them by the [Ellipsoid.maximumRadius].  This projection
 * is commonly known as geographic, equirectangular, equidistant cylindrical, or plate carrée.  It
 * is also known as EPSG:4326.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeographicProjection.html">Online Documentation</a>
 *
 * @constructor
 * @property [ellipsoid] The ellipsoid.
 *   Default value - [Ellipsoid.WGS84]
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeographicProjection.html">Online Documentation</a>
 */
external class GeographicProjection(val ellipsoid: Ellipsoid = definedExternally) {
    /**
     * Projects a set of [Cartographic] coordinates, in radians, to map coordinates, in meters.
     * X and Y are the longitude and latitude, respectively, multiplied by the maximum radius of the
     * ellipsoid.  Z is the unmodified height.
     * @param [cartographic] The coordinates to project.
     * @param [result] An instance into which to copy the result.  If this parameter is
     *   undefined, a new instance is created and returned.
     * @return The projected coordinates.  If the result parameter is not undefined, the
     *   coordinates are copied there and that instance is returned.  Otherwise, a new instance is
     *   created and returned.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeographicProjection.html#project">Online Documentation</a>
     */
    fun project(
        cartographic: Cartographic,
        result: Cartesian3? = definedExternally,
    ): Cartesian3

    /**
     * Unprojects a set of projected [Cartesian3] coordinates, in meters, to [Cartographic]
     * coordinates, in radians.  Longitude and Latitude are the X and Y coordinates, respectively,
     * divided by the maximum radius of the ellipsoid.  Height is the unmodified Z coordinate.
     * @param [cartesian] The Cartesian position to unproject with height (z) in meters.
     * @param [result] An instance into which to copy the result.  If this parameter is
     *   undefined, a new instance is created and returned.
     * @return The unprojected coordinates.  If the result parameter is not undefined, the
     *   coordinates are copied there and that instance is returned.  Otherwise, a new instance is
     *   created and returned.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeographicProjection.html#unproject">Online Documentation</a>
     */
    fun unproject(
        cartesian: Cartesian3,
        result: Cartographic? = definedExternally,
    ): Cartographic
}
