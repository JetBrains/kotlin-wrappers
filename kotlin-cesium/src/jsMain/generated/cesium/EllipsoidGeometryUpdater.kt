// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

/**
 * A [GeometryUpdater] for ellipsoids.
 * Clients do not normally create this class directly, but instead rely on [DataSourceDisplay].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidGeometryUpdater.html">Online Documentation</a>
 *
 * @constructor
 * @param [entity] The entity containing the geometry to be visualized.
 * @param [scene] The scene where visualization is taking place.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidGeometryUpdater.html">Online Documentation</a>
 */
external class EllipsoidGeometryUpdater(
    entity: Entity,
    scene: Scene,
) {
    /**
     * Creates the geometry instance which represents the fill of the geometry.
     * @param [time] The time to use when retrieving initial attribute values.
     * @param [skipModelMatrix] Whether to compute a model matrix for the geometry instance
     *   Default value - `false`
     * @param [modelMatrixResult] Used to store the result of the model matrix calculation
     * @return The geometry instance representing the filled portion of the geometry.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidGeometryUpdater.html#createFillGeometryInstance">Online Documentation</a>
     */
    fun createFillGeometryInstance(
        time: JulianDate,
        skipModelMatrix: Boolean? = definedExternally,
        modelMatrixResult: Matrix4? = definedExternally,
    ): GeometryInstance

    /**
     * Creates the geometry instance which represents the outline of the geometry.
     * @param [time] The time to use when retrieving initial attribute values.
     * @param [skipModelMatrix] Whether to compute a model matrix for the geometry instance
     *   Default value - `false`
     * @param [modelMatrixResult] Used to store the result of the model matrix calculation
     * @return The geometry instance representing the outline portion of the geometry.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EllipsoidGeometryUpdater.html#createOutlineGeometryInstance">Online Documentation</a>
     */
    fun createOutlineGeometryInstance(
        time: JulianDate,
        skipModelMatrix: Boolean? = definedExternally,
        modelMatrixResult: Matrix4? = definedExternally,
    ): GeometryInstance
}
