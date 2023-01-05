// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.ReadonlyArray
import js.core.jso

/**
 * An abstract class for updating geometry entities.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryUpdater.html">Online Documentation</a>
 */
external class GeometryUpdater(options: ConstructorOptions) {
    /**
     * @property [entity] The entity containing the geometry to be visualized.
     * @property [scene] The scene where visualization is taking place.
     * @property [geometryOptions] Options for the geometry
     * @property [geometryPropertyName] The geometry property name
     * @property [observedPropertyNames] The entity properties this geometry cares about
     */
    interface ConstructorOptions {
        var entity: Entity
        var scene: Scene
        var geometryOptions: Any
        var geometryPropertyName: String
        var observedPropertyNames: ReadonlyArray<String>
    }

    /**
     * Gets the unique ID associated with this updater
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryUpdater.html#id">Online Documentation</a>
     */
    val id: String

    /**
     * Gets the entity associated with this geometry.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryUpdater.html#entity">Online Documentation</a>
     */
    val entity: Entity

    /**
     * Gets a value indicating if the geometry has a fill component.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryUpdater.html#fillEnabled">Online Documentation</a>
     */
    val fillEnabled: Boolean

    /**
     * Gets a value indicating if fill visibility varies with simulation time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryUpdater.html#hasConstantFill">Online Documentation</a>
     */
    val hasConstantFill: Boolean

    /**
     * Gets the material property used to fill the geometry.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryUpdater.html#fillMaterialProperty">Online Documentation</a>
     */
    val fillMaterialProperty: MaterialProperty

    /**
     * Gets a value indicating if the geometry has an outline component.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryUpdater.html#outlineEnabled">Online Documentation</a>
     */
    val outlineEnabled: Boolean

    /**
     * Gets a value indicating if the geometry has an outline component.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryUpdater.html#hasConstantOutline">Online Documentation</a>
     */
    val hasConstantOutline: Boolean

    /**
     * Gets the [Color] property for the geometry outline.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryUpdater.html#outlineColorProperty">Online Documentation</a>
     */
    val outlineColorProperty: Property

    /**
     * Gets the constant with of the geometry outline, in pixels.
     * This value is only valid if isDynamic is false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryUpdater.html#outlineWidth">Online Documentation</a>
     */
    val outlineWidth: Double

    /**
     * Gets the property specifying whether the geometry
     * casts or receives shadows from light sources.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryUpdater.html#shadowsProperty">Online Documentation</a>
     */
    val shadowsProperty: Property

    /**
     * Gets or sets the [DistanceDisplayCondition] Property specifying at what distance from the camera that this geometry will be displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryUpdater.html#distanceDisplayConditionProperty">Online Documentation</a>
     */
    val distanceDisplayConditionProperty: Property

    /**
     * Gets or sets the [ClassificationType] Property specifying if this geometry will classify terrain, 3D Tiles, or both when on the ground.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryUpdater.html#classificationTypeProperty">Online Documentation</a>
     */
    val classificationTypeProperty: Property

    /**
     * Gets a value indicating if the geometry is time-varying.
     * If true, all visualization is delegated to a DynamicGeometryUpdater
     * returned by GeometryUpdater#createDynamicUpdater.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryUpdater.html#isDynamic">Online Documentation</a>
     */
    val isDynamic: Boolean

    /**
     * Gets a value indicating if the geometry is closed.
     * This property is only valid for static geometry.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryUpdater.html#isClosed">Online Documentation</a>
     */
    val isClosed: Boolean

    /**
     * Gets an event that is raised whenever the public properties
     * of this updater change.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryUpdater.html#geometryChanged">Online Documentation</a>
     */
    val geometryChanged: Boolean

    /**
     * Checks if the geometry is outlined at the provided time.
     * @param [time] The time for which to retrieve visibility.
     * @return true if geometry is outlined at the provided time, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryUpdater.html#isOutlineVisible">Online Documentation</a>
     */
    fun isOutlineVisible(time: JulianDate): Boolean

    /**
     * Checks if the geometry is filled at the provided time.
     * @param [time] The time for which to retrieve visibility.
     * @return true if geometry is filled at the provided time, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryUpdater.html#isFilled">Online Documentation</a>
     */
    fun isFilled(time: JulianDate): Boolean

    /**
     * Creates the geometry instance which represents the fill of the geometry.
     * @param [time] The time to use when retrieving initial attribute values.
     * @return The geometry instance representing the filled portion of the geometry.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryUpdater.html#createFillGeometryInstance">Online Documentation</a>
     */
    fun createFillGeometryInstance(time: JulianDate): GeometryInstance

    /**
     * Creates the geometry instance which represents the outline of the geometry.
     * @param [time] The time to use when retrieving initial attribute values.
     * @return The geometry instance representing the outline portion of the geometry.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryUpdater.html#createOutlineGeometryInstance">Online Documentation</a>
     */
    fun createOutlineGeometryInstance(time: JulianDate): GeometryInstance

    /**
     * Returns true if this object was destroyed; otherwise, false.
     * @return True if this object was destroyed; otherwise, false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryUpdater.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys and resources used by the object.  Once an object is destroyed, it should not be used.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryUpdater.html#destroy">Online Documentation</a>
     */
    fun destroy()
}

inline fun GeometryUpdater(
    block: GeometryUpdater.ConstructorOptions.() -> Unit,
): GeometryUpdater =
    GeometryUpdater(options = jso(block))
