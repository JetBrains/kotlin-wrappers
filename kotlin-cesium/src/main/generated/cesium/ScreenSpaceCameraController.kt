// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * Modifies the camera position and orientation based on mouse input to a canvas.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceCameraController.html">Online Documentation</a>
 *
 * @constructor
 * @param [scene] The scene.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceCameraController.html">Online Documentation</a>
 */
external class ScreenSpaceCameraController(scene: Scene) {
    /**
     * If true, inputs are allowed conditionally with the flags enableTranslate, enableZoom,
     * enableRotate, enableTilt, and enableLook.  If false, all inputs are disabled.
     *
     * NOTE: This setting is for temporary use cases, such as camera flights and
     * drag-selection of regions (see Picking demo).  It is typically set to false at the
     * start of such events, and set true on completion.  To keep inputs disabled
     * past the end of camera flights, you must use the other booleans (enableTranslate,
     * enableZoom, enableRotate, enableTilt, and enableLook).
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceCameraController.html#enableInputs">Online Documentation</a>
     */
    var enableInputs: Boolean

    /**
     * If true, allows the user to pan around the map.  If false, the camera stays locked at the current position.
     * This flag only applies in 2D and Columbus view modes.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceCameraController.html#enableTranslate">Online Documentation</a>
     */
    var enableTranslate: Boolean

    /**
     * If true, allows the user to zoom in and out.  If false, the camera is locked to the current distance from the ellipsoid.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceCameraController.html#enableZoom">Online Documentation</a>
     */
    var enableZoom: Boolean

    /**
     * If true, allows the user to rotate the world which translates the user's position.
     * This flag only applies in 2D and 3D.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceCameraController.html#enableRotate">Online Documentation</a>
     */
    var enableRotate: Boolean

    /**
     * If true, allows the user to tilt the camera.  If false, the camera is locked to the current heading.
     * This flag only applies in 3D and Columbus view.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceCameraController.html#enableTilt">Online Documentation</a>
     */
    var enableTilt: Boolean

    /**
     * If true, allows the user to use free-look. If false, the camera view direction can only be changed through translating
     * or rotating. This flag only applies in 3D and Columbus view modes.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceCameraController.html#enableLook">Online Documentation</a>
     */
    var enableLook: Boolean

    /**
     * A parameter in the range `[0, 1)` used to determine how long
     * the camera will continue to spin because of inertia.
     * With value of zero, the camera will have no inertia.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceCameraController.html#inertiaSpin">Online Documentation</a>
     */
    var inertiaSpin: Double

    /**
     * A parameter in the range `[0, 1)` used to determine how long
     * the camera will continue to translate because of inertia.
     * With value of zero, the camera will have no inertia.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceCameraController.html#inertiaTranslate">Online Documentation</a>
     */
    var inertiaTranslate: Double

    /**
     * A parameter in the range `[0, 1)` used to determine how long
     * the camera will continue to zoom because of inertia.
     * With value of zero, the camera will have no inertia.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceCameraController.html#inertiaZoom">Online Documentation</a>
     */
    var inertiaZoom: Double

    /**
     * A parameter in the range `[0, 1)` used to limit the range
     * of various user inputs to a percentage of the window width/height per animation frame.
     * This helps keep the camera under control in low-frame-rate situations.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceCameraController.html#maximumMovementRatio">Online Documentation</a>
     */
    var maximumMovementRatio: Double

    /**
     * Sets the duration, in seconds, of the bounce back animations in 2D and Columbus view.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceCameraController.html#bounceAnimationTime">Online Documentation</a>
     */
    var bounceAnimationTime: Double

    /**
     * The minimum magnitude, in meters, of the camera position when zooming. Defaults to 1.0.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceCameraController.html#minimumZoomDistance">Online Documentation</a>
     */
    var minimumZoomDistance: Double

    /**
     * The maximum magnitude, in meters, of the camera position when zooming. Defaults to positive infinity.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceCameraController.html#maximumZoomDistance">Online Documentation</a>
     */
    var maximumZoomDistance: Double

    /**
     * The input that allows the user to pan around the map. This only applies in 2D and Columbus view modes.
     *
     * The type came be a [CameraEventType], `undefined`, an object with `eventType`
     * and `modifier` properties with types `CameraEventType` and [KeyboardEventModifier],
     * or an array of any of the preceding.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceCameraController.html#translateEventTypes">Online Documentation</a>
     */
    var translateEventTypes: CameraEventType?

    /**
     * The input that allows the user to zoom in/out.
     *
     * The type came be a [CameraEventType], `undefined`, an object with `eventType`
     * and `modifier` properties with types `CameraEventType` and [KeyboardEventModifier],
     * or an array of any of the preceding.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceCameraController.html#zoomEventTypes">Online Documentation</a>
     */
    var zoomEventTypes: CameraEventType?

    /**
     * The input that allows the user to rotate around the globe or another object. This only applies in 3D and Columbus view modes.
     *
     * The type came be a [CameraEventType], `undefined`, an object with `eventType`
     * and `modifier` properties with types `CameraEventType` and [KeyboardEventModifier],
     * or an array of any of the preceding.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceCameraController.html#rotateEventTypes">Online Documentation</a>
     */
    var rotateEventTypes: CameraEventType?

    /**
     * The input that allows the user to tilt in 3D and Columbus view or twist in 2D.
     *
     * The type came be a [CameraEventType], `undefined`, an object with `eventType`
     * and `modifier` properties with types `CameraEventType` and [KeyboardEventModifier],
     * or an array of any of the preceding.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceCameraController.html#tiltEventTypes">Online Documentation</a>
     */
    var tiltEventTypes: CameraEventType?

    /**
     * The input that allows the user to change the direction the camera is viewing. This only applies in 3D and Columbus view modes.
     *
     * The type came be a [CameraEventType], `undefined`, an object with `eventType`
     * and `modifier` properties with types `CameraEventType` and [KeyboardEventModifier],
     * or an array of any of the preceding.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceCameraController.html#lookEventTypes">Online Documentation</a>
     */
    var lookEventTypes: CameraEventType?

    /**
     * The minimum height the camera must be before picking the terrain instead of the ellipsoid.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceCameraController.html#minimumPickingTerrainHeight">Online Documentation</a>
     */
    var minimumPickingTerrainHeight: Double

    /**
     * The minimum height the camera must be before testing for collision with terrain.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceCameraController.html#minimumCollisionTerrainHeight">Online Documentation</a>
     */
    var minimumCollisionTerrainHeight: Double

    /**
     * The minimum height the camera must be before switching from rotating a track ball to
     * free look when clicks originate on the sky or in space.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceCameraController.html#minimumTrackBallHeight">Online Documentation</a>
     */
    var minimumTrackBallHeight: Double

    /**
     * Enables or disables camera collision detection with terrain.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceCameraController.html#enableCollisionDetection">Online Documentation</a>
     */
    var enableCollisionDetection: Boolean

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return `true` if this object was destroyed; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceCameraController.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Removes mouse listeners held by this object.
     *
     * Once an object is destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.  Therefore,
     * assign the return value (`undefined`) to the object as done in the example.
     * ```
     * controller = controller && controller.destroy();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceCameraController.html#destroy">Online Documentation</a>
     */
    fun destroy()
}
