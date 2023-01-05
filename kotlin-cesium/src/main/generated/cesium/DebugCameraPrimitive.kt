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
 * Draws the outline of the camera's view frustum.
 * ```
 * primitives.add(new DebugCameraPrimitive({
 *   camera : camera,
 *   color : Color.YELLOW
 * }));
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DebugCameraPrimitive.html">Online Documentation</a>
 */
external class DebugCameraPrimitive(options: ConstructorOptions) {
    /**
     * @property [camera] The camera.
     * @property [frustumSplits] Distances to the near and far planes of the camera frustums. This overrides the camera's frustum near and far values.
     * @property [color] The color of the debug outline.
     *   Default value - [Color.CYAN]
     * @property [updateOnChange] Whether the primitive updates when the underlying camera changes.
     *   Default value - `true`
     * @property [show] Determines if this primitive will be shown.
     *   Default value - `true`
     * @property [id] A user-defined object to return when the instance is picked with [Scene.pick].
     */
    interface ConstructorOptions {
        var camera: Camera
        var frustumSplits: ReadonlyArray<Double>?
        var color: Color?
        var updateOnChange: Boolean?
        var show: Boolean?
        var id: Any?
    }

    /**
     * Determines if this primitive will be shown.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DebugCameraPrimitive.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * User-defined value returned when the primitive is picked.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DebugCameraPrimitive.html#id">Online Documentation</a>
     */
    var id: Any

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return `true` if this object was destroyed; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DebugCameraPrimitive.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
     * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
     *
     * Once an object is destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.  Therefore,
     * assign the return value (`undefined`) to the object as done in the example.
     * ```
     * p = p && p.destroy();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DebugCameraPrimitive.html#destroy">Online Documentation</a>
     */
    fun destroy()
}

inline fun DebugCameraPrimitive(
    block: DebugCameraPrimitive.ConstructorOptions.() -> Unit,
): DebugCameraPrimitive =
    DebugCameraPrimitive(options = jso(block))
