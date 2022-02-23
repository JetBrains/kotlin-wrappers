// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * A [GeometryUpdater] for polylines.
 * Clients do not normally create this class directly, but instead rely on [DataSourceDisplay].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGeometryUpdater.html">Online Documentation</a>
 *
 * @constructor
 * @property [entity] The entity containing the geometry to be visualized.
 * @param [scene] The scene where visualization is taking place.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGeometryUpdater.html">Online Documentation</a>
 */
external class PolylineGeometryUpdater(
    val entity: Entity,
    scene: Scene,
) {
    /**
     * Gets the unique ID associated with this updater
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGeometryUpdater.html#id">Online Documentation</a>
     */
    val id: String

    /**
     * Gets a value indicating if the geometry has a fill component.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGeometryUpdater.html#fillEnabled">Online Documentation</a>
     */
    val fillEnabled: Boolean

    /**
     * Gets a value indicating if fill visibility varies with simulation time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGeometryUpdater.html#hasConstantFill">Online Documentation</a>
     */
    val hasConstantFill: Boolean

    /**
     * Gets the material property used to fill the geometry.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGeometryUpdater.html#fillMaterialProperty">Online Documentation</a>
     */
    val fillMaterialProperty: MaterialProperty

    /**
     * Gets the material property used to fill the geometry when it fails the depth test.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGeometryUpdater.html#depthFailMaterialProperty">Online Documentation</a>
     */
    val depthFailMaterialProperty: MaterialProperty

    /**
     * Gets a value indicating if the geometry has an outline component.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGeometryUpdater.html#outlineEnabled">Online Documentation</a>
     */
    val outlineEnabled: Boolean

    /**
     * Gets a value indicating if outline visibility varies with simulation time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGeometryUpdater.html#hasConstantOutline">Online Documentation</a>
     */
    val hasConstantOutline: Boolean

    /**
     * Gets the [Color] property for the geometry outline.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGeometryUpdater.html#outlineColorProperty">Online Documentation</a>
     */
    val outlineColorProperty: Property

    /**
     * Gets the property specifying whether the geometry
     * casts or receives shadows from light sources.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGeometryUpdater.html#shadowsProperty">Online Documentation</a>
     */
    val shadowsProperty: Property

    /**
     * Gets or sets the [DistanceDisplayCondition] Property specifying at what distance from the camera that this geometry will be displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGeometryUpdater.html#distanceDisplayConditionProperty">Online Documentation</a>
     */
    val distanceDisplayConditionProperty: Property

    /**
     * Gets or sets the [ClassificationType] Property specifying if this geometry will classify terrain, 3D Tiles, or both when on the ground.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGeometryUpdater.html#classificationTypeProperty">Online Documentation</a>
     */
    val classificationTypeProperty: Property

    /**
     * Gets a value indicating if the geometry is time-varying.
     * If true, all visualization is delegated to the [DynamicGeometryUpdater]
     * returned by GeometryUpdater#createDynamicUpdater.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGeometryUpdater.html#isDynamic">Online Documentation</a>
     */
    val isDynamic: Boolean

    /**
     * Gets a value indicating if the geometry is closed.
     * This property is only valid for static geometry.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGeometryUpdater.html#isClosed">Online Documentation</a>
     */
    val isClosed: Boolean

    /**
     * Gets an event that is raised whenever the public properties
     * of this updater change.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGeometryUpdater.html#geometryChanged">Online Documentation</a>
     */
    val geometryChanged: Boolean

    /**
     * Gets a value indicating if the path of the line.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGeometryUpdater.html#arcType">Online Documentation</a>
     */
    val arcType: ArcType

    /**
     * Gets a value indicating if the geometry is clamped to the ground.
     * Returns false if polylines on terrain is not supported.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGeometryUpdater.html#clampToGround">Online Documentation</a>
     */
    val clampToGround: Boolean

    /**
     * Gets the zindex
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGeometryUpdater.html#zIndex">Online Documentation</a>
     */
    val zIndex: Int

    /**
     * Checks if the geometry is outlined at the provided time.
     * @param [time] The time for which to retrieve visibility.
     * @return true if geometry is outlined at the provided time, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGeometryUpdater.html#isOutlineVisible">Online Documentation</a>
     */
    fun isOutlineVisible(time: JulianDate): Boolean

    /**
     * Checks if the geometry is filled at the provided time.
     * @param [time] The time for which to retrieve visibility.
     * @return true if geometry is filled at the provided time, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGeometryUpdater.html#isFilled">Online Documentation</a>
     */
    fun isFilled(time: JulianDate): Boolean

    /**
     * Creates the geometry instance which represents the fill of the geometry.
     * @param [time] The time to use when retrieving initial attribute values.
     * @return The geometry instance representing the filled portion of the geometry.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGeometryUpdater.html#createFillGeometryInstance">Online Documentation</a>
     */
    fun createFillGeometryInstance(time: JulianDate): GeometryInstance

    /**
     * Creates the geometry instance which represents the outline of the geometry.
     * @param [time] The time to use when retrieving initial attribute values.
     * @return The geometry instance representing the outline portion of the geometry.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGeometryUpdater.html#createOutlineGeometryInstance">Online Documentation</a>
     */
    fun createOutlineGeometryInstance(time: JulianDate): GeometryInstance

    /**
     * Returns true if this object was destroyed; otherwise, false.
     * @return True if this object was destroyed; otherwise, false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGeometryUpdater.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys and resources used by the object.  Once an object is destroyed, it should not be used.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineGeometryUpdater.html#destroy">Online Documentation</a>
     */
    fun destroy()
}
