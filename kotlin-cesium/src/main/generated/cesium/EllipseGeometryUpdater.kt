// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

/**
 * A [GeometryUpdater] for ellipses.
 * Clients do not normally create this class directly, but instead rely on [DataSourceDisplay].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseGeometryUpdater.html">Online Documentation</a>
 *
 * @constructor
 * @param [entity] The entity containing the geometry to be visualized.
 * @param [scene] The scene where visualization is taking place.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseGeometryUpdater.html">Online Documentation</a>
 */
external class EllipseGeometryUpdater(
    entity: Entity,
    scene: Scene,
) {
    /**
     * Creates the geometry instance which represents the fill of the geometry.
     * @param [time] The time to use when retrieving initial attribute values.
     * @return The geometry instance representing the filled portion of the geometry.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseGeometryUpdater.html#createFillGeometryInstance">Online Documentation</a>
     */
    fun createFillGeometryInstance(time: JulianDate): GeometryInstance

    /**
     * Creates the geometry instance which represents the outline of the geometry.
     * @param [time] The time to use when retrieving initial attribute values.
     * @return The geometry instance representing the outline portion of the geometry.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseGeometryUpdater.html#createOutlineGeometryInstance">Online Documentation</a>
     */
    fun createOutlineGeometryInstance(time: JulianDate): GeometryInstance

    /**
     * Gets a value indicating if the geometry should be drawn on terrain.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipseGeometryUpdater.html#onTerrain">Online Documentation</a>
     */
    val onTerrain: Boolean
}
