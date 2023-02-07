// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

/**
 * Defines how geodetic ellipsoid coordinates ([Cartographic]) project to a
 * flat map like Cesium's 2D and Columbus View modes.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MapProjection.html">Online Documentation</a>
 */
external class MapProjection {
    /**
     * Gets the [Ellipsoid].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MapProjection.html#ellipsoid">Online Documentation</a>
     */
    val ellipsoid: Ellipsoid

    /**
     * Projects [Cartographic] coordinates, in radians, to projection-specific map coordinates, in meters.
     * @param [cartographic] The coordinates to project.
     * @param [result] An instance into which to copy the result.  If this parameter is
     *   undefined, a new instance is created and returned.
     * @return The projected coordinates.  If the result parameter is not undefined, the
     *   coordinates are copied there and that instance is returned.  Otherwise, a new instance is
     *   created and returned.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MapProjection.html#project">Online Documentation</a>
     */
    fun project(
        cartographic: Cartographic,
        result: Cartesian3? = definedExternally,
    ): Cartesian3

    /**
     * Unprojects projection-specific map [Cartesian3] coordinates, in meters, to [Cartographic]
     * coordinates, in radians.
     * @param [cartesian] The Cartesian position to unproject with height (z) in meters.
     * @param [result] An instance into which to copy the result.  If this parameter is
     *   undefined, a new instance is created and returned.
     * @return The unprojected coordinates.  If the result parameter is not undefined, the
     *   coordinates are copied there and that instance is returned.  Otherwise, a new instance is
     *   created and returned.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MapProjection.html#unproject">Online Documentation</a>
     */
    fun unproject(
        cartesian: Cartesian3,
        result: Cartographic? = definedExternally,
    ): Cartographic
}
