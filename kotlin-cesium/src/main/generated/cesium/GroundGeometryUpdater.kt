// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * An abstract class for updating ground geometry entities.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundGeometryUpdater.html">Online Documentation</a>
 */
external class GroundGeometryUpdater(options: ConstructorOptions) {
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
        var observedPropertyNames: Array<out String>
    }

    /**
     * Gets the zindex
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundGeometryUpdater.html#zIndex">Online Documentation</a>
     */
    val zIndex: Int

    /**
     * Destroys and resources used by the object.  Once an object is destroyed, it should not be used.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GroundGeometryUpdater.html#destroy">Online Documentation</a>
     */
    fun destroy()
}

inline fun GroundGeometryUpdater(
    block: GroundGeometryUpdater.ConstructorOptions.() -> Unit,
): GroundGeometryUpdater {
    val options: GroundGeometryUpdater.ConstructorOptions = js("({})")
    block(options)
    return GroundGeometryUpdater(options)
}
