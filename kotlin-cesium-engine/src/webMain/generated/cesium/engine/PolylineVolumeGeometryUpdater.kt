// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * A [GeometryUpdater] for polyline volumes.
 * Clients do not normally create this class directly, but instead rely on [DataSourceDisplay].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineVolumeGeometryUpdater.html">Online Documentation</a>
 *
 * @constructor
 * @param [entity] The entity containing the geometry to be visualized.
 * @param [scene] The scene where visualization is taking place.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineVolumeGeometryUpdater.html">Online Documentation</a>
 */
external class PolylineVolumeGeometryUpdater(
    entity: Entity,
    scene: Scene,
) {
    /**
     * Creates the geometry instance which represents the fill of the geometry.
     * @param [time] The time to use when retrieving initial attribute values.
     * @return The geometry instance representing the filled portion of the geometry.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineVolumeGeometryUpdater.html#createFillGeometryInstance">Online Documentation</a>
     */
    fun createFillGeometryInstance(time: JulianDate): GeometryInstance

    /**
     * Creates the geometry instance which represents the outline of the geometry.
     * @param [time] The time to use when retrieving initial attribute values.
     * @return The geometry instance representing the outline portion of the geometry.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineVolumeGeometryUpdater.html#createOutlineGeometryInstance">Online Documentation</a>
     */
    fun createOutlineGeometryInstance(time: JulianDate): GeometryInstance
}
